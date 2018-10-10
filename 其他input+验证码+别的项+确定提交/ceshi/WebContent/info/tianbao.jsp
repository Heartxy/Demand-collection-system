<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/bootstrap-3.3.5-dist/css/bootstrap.css" />

<title>点击出现</title>

	<script src="${pageContext.request.contextPath}/static/js/jquery-1.12.1.js" type="text/javascript"></script>

<!-- 其他text框出现 -->
<script>
 function qaq(chk,t){
	 var t=document.getElementById(t);
	 if(chk.checked){
		 t.style.display='block';
	 }else{
		 t.style.display='none';
	 }
 }
 
</script>

<!--  点击出现别的tr项  -->
<script>
function aba(a,c){
	 var c=document.getElementById(c);
	 if(a.checked){
		 if(c==b){
			 document.getElementById("b").style.display="";
			 document.getElementById("b1").style.display="none";
			 document.getElementById("b2").style.display="none";
		 }
		 else{
			 document.getElementById("b1").style.display="";
			 document.getElementById("b2").style.display="";
			 document.getElementById("b").style.display="none";
		 }
	 }
}
</script>

<!-- comfirm应用 确认提交弹框   -->
<script type="text/javascript">
function submit_sure(){  
	var gnl=confirm("确定要提交?");  
	if (gnl==true){  
	return true;  
	}else{  
	return false;  
	}  
  } 
 </script>
 
 <!-- 验证码 -->
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
}
</style>
<!--  验证码 -->
<script type="text/javascript">
	$().ready(
			function(){
				$("#form").validate({
					rules:{
						codeCheck:{
							required:true,
							equalTo:"#checkCode"
						}
					},
					messages : {
						codeCheck:{
							required:"请输入验证码",
							equalTo :"验证码不正确"
						}
					}
				});
			});
			
</script> 
 
 
 
</head>
<body onsubmit="return submit_sure()"  onload="createCode()">
<form class="form-horizontal"  action=""  method="post" id="form" name="form">

<table  align="center"  style=" width:765px;" class="table table-bordered" border="1" cellspacing="1" cellpadding="1">

<!-- 其他项 -->
  <tr>
    <td colspan="12">
    	<input id="JGSX" name="JGSX" onclick="qaq(this,'t1');" type="radio" style="float:left;" />其他
       	<input style="display:none;" name="JGSX"  type="text" id="t1" style="float:left;" />
    </td>
    </tr>
    
    <!-- 点击出现别的tr项 -->
  <tr>
    <td style=" width:150px;vertical-align:middle;"  colspan="2"><p align="center"><strong>科技活动类型</strong></p></td>
    <td style=" vertical-align:middle;"  colspan="10">
<p>
    <input  type="radio" value="基础研究" name="KJHDLX"  id="KJHDLX" onclick="aba(this,'b');"/>基础研究 &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;  
    <input  type="radio" value="应用研究"  name="KJHDLX"  id="KJHDLX" onclick="aba(this,'b1');"/>应用研究 &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;
    <input type="radio" value="试验发展"  name="KJHDLX"  id="KJHDLX" onclick="aba(this,'b1');" />试验发展  </p>
<p>  <input  type="radio" value="研究与试验发展成果应用"  name="KJHDLX"  id="KJHDLX" onclick="aba(this,'b1');" />研究与试验发展成果应用  &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;
    <input  type="radio" value="技术推广与科技服务"  name="KJHDLX"  id="KJHDLX" onclick="aba(this,'b1');" />技术推广与科技服务 &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;
    <input  type="radio" value="生产性活动"  name="KJHDLX"  id="KJHDLX" onclick="aba(this,'b1');" />生产性活动 </p>
   	</td>
    </tr>
    
  <tr id="b"  style="display:none" >
    <td   colspan="2"><p  align="center"> <strong>学科分类</strong></p></td>
    <td   colspan="9" >
    <input type="text" name="XKFL" id="XKFL">
   	</div>
   	</td>
   	</tr>
    
  <tr id="b1" style="display:none" >
    <td   colspan="2"><p align="center" ><strong>需求技术所属领域 </strong></p></td>
    <td   colspan="9" >
     <p >
     <input type="checkbox" name="XQJSSSLY" value="电子信息技术," />电子信息技术 &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;
     <input type="checkbox" name="XQJSSSLY" value="光机电一体化," />光机电一体化 &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;
     <input type="checkbox" name="XQJSSSLY" value="软件," />软件 </p>
   <p>  <input type="checkbox" name="XQJSSSLY" value="生物制药技术," />生物制药技术 &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;
     <input type="checkbox" name="XQJSSSLY" value="新材料及应用技术," />新材料及应用技术 &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;
     <input type="checkbox" name="XQJSSSLY" value="先进制造技术," />先进制造技术 </p>
   <p>  <input type="checkbox" name="XQJSSSLY" value="现代农业," /> 现代农业 &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;
     <input type="checkbox" name="XQJSSSLY" value="新能源与高效节能技术," />新能源与高效节能技术 &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;
     <input type="checkbox" name="XQJSSSLY" value="资源与环境保护新技术 ," />资源与环境保护新技术  </p>
  <p>   <input type="checkbox"  name="XQJSSSLY"  value="其他技术（注明),"  onclick="qaq(this,'t2');" />其他技术（注明）  &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;
 				<input class="form-control" style="display:none;" name="XQJSSSLY"  id="t2" type="text">
   </p>
    </td>
    </tr>
    
  <tr id="b2" style="display:none" >
    <td   colspan="2" ><p align="center" ><strong>需求技术</strong>
    <br><strong>应用行业</strong></p></td>
    <td   colspan="9">
    <input class="form-control"   type="text" name="XQJSYYHY" id="XQJSYYHY"  placeholder="（参见国民经济行业分类，非基础研究填写）" > 
    </td>
    </tr>
    
    
<!-- 验证码 -->
<tr>
        <td style=" width:108px;padding-right:5px;"  colspan="1"  ><div align="right">验证码</div></td>
        <td style=" width:168px; "  colspan="1"  >
          <input  type="text" name="codeCheck" class="form-control" id="codeCheck" placeholder="Code">
        </td>
        <td style=" width:70px; " colspan="1"  ><input class="form-control" class="unchanged"  type="text" onClick="createCode()" readonly id="checkCode" style="width: 80px"  /></td>
        <td style=" width:306px; " colspan="1"  ></td>
      </tr>

</table>

<center>
<input  type="submit" class="btn btn-large btn-primary" value="保存并提交" /></center>
</form>

</body>
</html>