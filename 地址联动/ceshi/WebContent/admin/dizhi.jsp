<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/bootstrap-3.3.5-dist/css/bootstrap.css" />

<title>注册界面</title>

<script src="${pageContext.request.contextPath}/static/js/jquery-1.12.1.js" type="text/javascript"></script>
	
<!-- 地址的多级联动 -->
<script type="text/javascript">
function chCity(obj) {
	$(obj).parent().nextAll().remove();
	var id = obj.value;
	if (id > 0 && id!=1 && id!=2 && id!=9 && id!=22) {
		$.post(
					"addressServlet01",
						{
							method : "getCity",
							id : id
						},
						function(data,status) {
							if (data != null && data.length > 0) {
								var content = "<div> <select name='CityId' id='city0' > <option value='0'>-- 请选择市 --</option>";
								for ( var city in data) {  //第一个参数表示数组的下标，第二个参数表示数组
									content += "<option value='"+data[city].id+"'>"
											+ data[city].name + "</option>";
								}
								content += "</select></div>";
								$("#types").append(content);
							}
						}, "json");
	}

}
</script>


<!-- comfirm应用 确认提交弹框  -->
<script type="text/javascript">
function button_sure(){  
	var gnl=confirm("确定要提交?");  
	if (gnl==true){  
	return true;  
	}else{  
	return false;  
	}  
  }
</script>

</head>
<body onload="createCode()" bgcolor="#FFFFFF">
<form action="" onsubmit="return button_sure()" method="post" id="form" name="form">

<table  align="center" style=" width:667px;border-collapse:separate; border-spacing:0px 10px; "  cellspacing="1" cellpadding="1"  >
      
      <tr>
        <td style=" width:108px;padding-right:5px;" colspan="1"  ><div align="right">国家/省市</div></td>
        <td style=" width:168px; " >
        <div id="types">
        <div>
        	<select name="province" 
				onchange="chCity(this)" id="province">
				<option value="0">-- 请选择省 --</option>
				<c:forEach items="${provinces }" var="item">
					<option value="${item.id}">${item.name}</option>
				</c:forEach>
			</select>
		  </div>
        </div>	
        </td>
        <td style=" width:70px; " colspan="1"  ></td>
        <td style=" width:306px; " colspan="1"  ></td>
      </tr>
     
  </table>

<center>
<input  class="btn btn-primary" type="submit" value="注册" /></center>

</form>


</body>
</html>
