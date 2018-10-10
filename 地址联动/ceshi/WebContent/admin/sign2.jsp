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
	<script src="${pageContext.request.contextPath}/static/js/jquery.validate.min.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/static/js/messages_zh.js" type="text/javascript"></script>
	


<!-- 验证码 -->
<style type="text/css">
        .code   
        {   
            background-image:url(code.jpg);   
            font-family:Arial;   
            font-style:italic;   
            color:Red;   
            border:0;   
            padding:2px 3px;   
            letter-spacing:3px;   
            font-weight:bolder;   
        }   
        .unchanged   
        {   
            border:0;   
        }   
    </style>
<script type="text/javascript">

var code ; //在全局 定义验证码   
function createCode()   
{    
  code = "";   
  var codeLength = 6;//验证码的长度   
  var checkCode = document.getElementById("checkCode");   
  var selectChar = new Array(0,1,2,3,4,5,6,7,8,9,'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z');//所有候选组成验证码的字符，当然也可以用中文的   
      
  for(var i=0;i<codeLength;i++)   
  {   
    
      
  var charIndex = Math.floor(Math.random()*36);   
  code +=selectChar[charIndex];   
     
     
  }   
//  alert(code);   
  if(checkCode)   
  {   
    checkCode.className="code";   
    checkCode.value = code;   
  }   
     
}
</script>

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


<!-- 验证 -->
<script type="text/javascript">
	$().ready(
			function(){
				$("#form").validate({
					rules:{
						codeCheck:{
							required:true,
							equalTo:"#checkCode"
						},
						username:{
							required:true,
							maxlength:20,
							minlength:6
						},
						password:{
							required:true,
							minlength:6
						},
						password2:{
							required:true,
							equalTo:"#password"
						},
						name:{
							required:true
						},
						cid:{
							rangelength:[18,18]
						},
						JGQC:{
							required:true
						},
						telephone:{
							rangelength:[11,11]
						},
						phone:{
							rangelength:[7,7]
						}
					},
					messages : {
						codeCheck:{
							required:"请输入验证码",
							equalTo :"验证码不正确"
						},
						username:{
							required : "用户姓名不能为空",
							maxlength:"最大长度不超过20",
							minlength:"最小长度不小于6"
						},
						password:{
							required:"密码不能为空",
							minlength:"最小长度不小于6"
						},
						password2:{
							required:"重复密码不能为空",
							equalTo:"重复密码需要和密码相同"
						},
						name:{
							required:"姓名不能为空"
						},
						cid:{
							rangelength:"身份证长度为18位"
						},
						JGQC:{
							required:"机构全称不能为空"
						},
						telephone:{
							rangelength:"长度为11位号码"
						},
						phone:{
							rangelength:"长度为7位号码"
						}
					}
				});
			});
			
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
<form action="${pageContext.request.contextPath}/servlet/userServlet?method=sign" onsubmit="return button_sure()" method="post" id="form" name="form">

<table  align="center" style=" width:667px;border-collapse:separate; border-spacing:0px 10px; "  cellspacing="1" cellpadding="1"  >
      <tr>
        <th scope="col" colspan="12"><center><h1>欢迎新用户</h1></center></th>
      </tr>
      <tr >
        <td style=" width:108px;padding-right:5px;" colspan="1"  ><div align="right"><span id="username">*</span>用户名</div></td>
        <td style=" width:168px; " colspan="1"  ><input class="form-control"  type="text" id="username1" name="username" ></td>
        <td style=" width:70px; " colspan="1"  ></td>
        <td style=" width:306px; " colspan="1" id="username"  >用户名应该大于6位 小于12位</td>
      </tr>
      <tr>
        <td style=" width:108px;padding-right:5px;"  colspan="1"  ><div align="right"><span id="username">*</span>用户密码</div></td>
        <td style=" width:168px; "  colspan="1"  ><input class="form-control" type="password" id="password" name="password" ></td>
        <td style=" width:70px; "  colspan="1"  ></td>
        <td style=" width:306px; "  colspan="1" id="username"  >密码不能为空</td>
      </tr>
      <tr>
        <td style=" width:108px;padding-right:5px;" colspan="1"  ><div align="right"><span id="username">*</span>确定密码</div></td>
        <td style=" width:168px; " colspan="1"  ><input class="form-control" type="password" id="password2" name="password2" ></td>
        <td style=" width:70px; " colspan="1"  ></td>
        <td style=" width:306px; " colspan="1"  ></td>
      </tr>
      <tr>
        <td style=" width:108px;padding-right:5px;"  colspan="1"  ><div align="right"><span id="username">*</span>姓名</div></td>
        <td style=" width:168px; "  colspan="1"  ><input class="form-control" type="text" id="name" name="name" ></td>
        <td style=" width:70px; "  colspan="1"  ></td>
        <td style=" width:306px; "  colspan="1" id="username"  >请用户输入真实姓名，以便与您取得联系</td>
      </tr>
      <tr>
        <td style=" width:108px;padding-right:5px;"  colspan="1"  ><div align="right"><span id="username">*</span>身份证号码</div></td>
        <td style=" width:168px; " colspan="1"  ><input class="form-control" type="text" id="cid" name="cid" ></td>
        <td style=" width:70px; "  colspan="1"  ></td>
        <td style=" width:306px; " colspan="1" ></td>
      </tr>
      <tr>
        <td style=" width:108px;padding-right:5px;"  colspan="1"  > <div align="right">性别</div></td>
        <td style=" width:168px; " >
       <label>
          <input  type="radio" name="sex" value="0">男</label>
       <label>
          <input type="radio" name="sex" value="1">女</label></td>
        <td style=" width:70px; " colspan="1"  ></td>
        <td style=" width:306px; " colspan="1"  ></td>
      </tr>
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
      <tr>
        <td style=" width:108px;padding-right:5px;"  colspan="1"  ><div align="right"><span id="username">*</span>机构全称</div></td>
        <td style=" width:168px; "  colspan="1"  ><input class="form-control" type="text" name="JGQC" id="JGQC" ></td>
        <td style=" width:70px; " colspan="1"  ></td>
          <td style=" width:306px; " colspan="1" id="username"  >请用户输入机构全称</td>
      </tr>
      <tr>
        <td style=" width:108px;padding-right:5px;"  colspan="1"  ><div align="right">专业方向</div></td>
        <td style=" width:168px; "  colspan="1"  ><input class="form-control" type ="text" name="zhuanye" id="zhuanye "></td>
        <td style=" width:70px; " colspan="1"  ></td>
        <td style=" width:306px; " colspan="1"  ></td>
      </tr>
      <tr>
        <td style=" width:108px;padding-right:5px;"  colspan="1"  ><div align="right">所在行业</div></td>
        <td style=" width:168px; "  colspan="1"  ><input class="form-control" type="text" name="hangye" id="hangye"></td>
        <td style=" width:70px; " colspan="1"  ></td>
        <td style=" width:306px; " colspan="1"  ></td>
      </tr>
      <tr>
        <td style=" width:108px;padding-right:5px;"  colspan="1"  ><div align="right">教育程度</div></td>
        <td style=" width:168px; "  colspan="1"  ><input class="form-control" type="text" name="jiaoyu" id="jiaoyu"></td>
        <td style=" width:70px; " colspan="1"  ></td>
        <td style=" width:306px; " colspan="1"  > </td>
      </tr>
      <tr>
        <td style=" width:108px;padding-right:5px;"  colspan="1"  ><div align="right">职称</div></td>
        <td style=" width:168px; "  colspan="1"  ><input class="form-control" type="text"  name="zhichen" id="zhichen"></td>
        <td style=" width:70px; " colspan="1"  ></td>
        <td style=" width:306px; " colspan="1"  > </td>
      </tr>
      <tr>
        <td style=" width:108px;padding-right:5px;"  colspan="1"  ><div align="right">通讯地址</div></td>
        <td style=" width:168px; " colspan="1"  ><input class="form-control" type="text" name="tongxun" id="tongxun" ></td>
        <td style=" width:70px; " colspan="1"  ></td>
        <td style=" width:306px; " colspan="1" id="username"  >请用户填写详细，以便与您取得联系</td>
      </tr>
      <tr>
        <td style=" width:108px;padding-right:5px;" colspan="1"  ><div align="right">邮政编码</div></td>
        <td style=" width:168px; " colspan="1"  ><input class="form-control" type="text" name="youbian" id="youbian"></td>
        <td style=" width:70px; " colspan="1"  ></td>
        <td style=" width:306px; " colspan="1"  > </td>
      </tr>
      <tr>
        <td style=" width:108px;padding-right:5px;"  colspan="1"  ><div align="right">手机</div></td>
        <td style=" width:168px; " colspan="1"  ><input class="form-control" type="text" name="telephone" id="telephone"></td>
        <td style=" width:70px; " colspan="1"  ></td>
        <td style=" width:306px; " colspan="1"  ></td>
      </tr>
      <tr>
        <td style=" width:108px;padding-right:5px;"  colspan="1"  ><div align="right">固定电话</div></td>
        <td style=" width:168px; " colspan="1"  ><input class="form-control" type="text" name="phone" id="phone"></td>
        <td style=" width:70px; " colspan="1"  ></td>
        <td style=" width:306px; " colspan="1"  > </td>
      </tr>
      <tr>
        <td style=" width:108px;padding-right:5px;" colspan="1"  ><div align="right">邮箱</div></td>
        <td style=" width:168px; " colspan="1"  ><input class="form-control" type="text" name="email" id="email"></td>
        <td style=" width:70px; " colspan="1"  ></td>
        <td style=" width:306px; " colspan="1"  > </td>
      </tr>
      <tr>
        <td style=" width:108px;padding-right:5px;" colspan="1"  ><div align="right">QQ</div></td>
        <td style=" width:168px; "  colspan="1"  ><input class="form-control" type="text" name="QQ" id="QQ"></td>
        <td style=" width:70px; " colspan="1"  ></td>
        <td style=" width:306px; " colspan="1"  > </td>
      </tr>
      <tr>
        <td style=" width:108px;padding-right:5px;"  colspan="1"  ><div align="right">MSN</div></td>
        <td style=" width:168px; "  colspan="1"  ><input class="form-control" type="text" name="MSN" id="MSN"></td>
        <td style=" width:70px; " colspan="1"  ></td>
        <td style=" width:306px; " colspan="1"  > </td>
      </tr>
       
      <tr>
        <td style=" width:108px;padding-right:5px;"  colspan="1"  ><div align="right">验证码</div></td>
        <td style=" width:168px; "  colspan="1"  >
        <lable>
          <input  type="text" name="codeCheck" class="form-control" id="codeCheck" placeholder="Code">
        </lable></td>
        <td style=" width:70px; " colspan="1"  ><input class="form-control" class="unchanged"  type="text" onClick="createCode()" readonly id="checkCode" style="width: 80px"  /></td>
        <td style=" width:306px; " colspan="1"  ></td>
      </tr>
      
  </table>


<!-- <center><button type="submit">注册</button></center> -->
<center>
<input  class="btn btn-primary" type="submit" value="注册" /></center>

<c:if test="${param.status.equals('1')}">
注册成功
</c:if>

<c:if test="${param.status.equals('2')}">
注册失败
</c:if>

<c:if test="${param.status.equals('3')}">
用户名重复 请重新注册
</c:if>


</form>


</body>
</html>
