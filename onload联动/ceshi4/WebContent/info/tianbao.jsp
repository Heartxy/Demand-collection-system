<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/bootstrap-3.3.5-dist/css/bootstrap.css" />

<title>需求填报</title>


	<script src="${pageContext.request.contextPath}/static/js/jquery-1.12.1.js" type="text/javascript"></script>
	
 <style type="text/css">

.myTb{border-top:1px solid #999;border-left:1px solid #999;border-spacing:0;}

.myTb td{border-bottom:1px solid #999;border-right:1px solid #999;padding:10px 30px;}

</style>

<!-- XQJSYYHY三级菜单 -->
<script type="text/javascript">
/*	页面加载事件，一级菜单加载完毕*/
function pre() {
	//页面加载事件
	$
			.post(
					"../servlet/XQJSYYHYservlet",
					{
						method : "preType"
					},
					function(data,status) {
						var content = "";
						if (data != null && data.length > 0) {
							var content = "<div style='float:left;'> <select name='XQJSYYHY1' id='XQJSYYHY1' onclick='Type2(this)'> <option value='0'>-- 请选择一级菜单选项 --</option>";
							for ( var XQJSYYHY1 in data) {  //第一个参数表示数组的下标，第二个参数表示数组
								content += "<option value='"+data[XQJSYYHY1].xid+"'>"
										+ data[XQJSYYHY1].xname + "</option>";
							}
							content += "</select></div>";
							$("#typesyyhy").append(content);
						}
					},"json");
}

/**
*	二级菜单加载	
*/
function Type2(objj) {
	$(objj).parent().nextAll().remove();
	var T1id=objj.value;
	
	if(T1id!=0){
		$.post(
					"../servlet/XQJSYYHYservlet",
					{
						method:"Type2",
						T1id:T1id
					},
					function(data,status) {
						if (data != null && data.length > 0) {
							var content = "<div style='float:left;'> <select name='XQJSYYHY2' id='XQJSYYHY2' onclick='Type3(this)'> <option value='0'>-- 请选择二级菜单选项 --</option>";
							for ( var XQJSYYHY2 in data) {  //第一个参数表示数组的下标，第二个参数表示数组
								content += "<option value='"+data[XQJSYYHY2].xid+"'>"
										+ data[XQJSYYHY2].xname + "</option>";
							}
							content += "</select></div>";
							$("#typesyyhy").append(content);
						}
					},"json");
	}
	}
	
/**
*三级菜单加载	
*/
function Type3(objj) {
	$(objj).parent().nextAll().remove();
	var T2id=objj.value;
	
	if(T2id!=0){
		$.post(
					"../servlet/XQJSYYHYservlet",
					{
						method:"Type3",
						T2id:T2id
					},
					function(data,status) {
						if (data != null && data.length > 0) {
							var content = "<div> <select name='XQJSYYHY3' id='XQJSYYHY3'> <option value='0'>-- 请选择三级菜单选项 --</option>";
							for ( var XQJSYYHY3 in data) {  //第一个参数表示数组的下标，第二个参数表示数组
								content += "<option value='"+data[XQJSYYHY3].xid+"'>"
										+ data[XQJSYYHY3].xname + "</option>";
							}
							content += "</select></div>";
							$("#typesyyhy").append(content);
						}
					},"json");
	}
	}
	
</script>

</head>
<body onload="pre()">
<form class="form-horizontal" action="#"  method="post" id="form" name="form">

<table  align="center"  style=" width:765px;" class="table table-bordered" border="1" cellspacing="1" cellpadding="1">
  <tr>
    <td   colspan="2" ><p align="center" ><strong>需求技术</strong>
    <br><strong>应用行业</strong></p></td>
    <td   colspan="9">
    <div id="typesyyhy">
   	</div>
   </td>
    </tr>
    
</table>


<!-- <center><button type="submit" >保存并提交</button></center>-->
<center>
<input  type="submit" class="btn btn-large btn-primary" value="保存并提交" /></center>
</form>

</body>
</html>