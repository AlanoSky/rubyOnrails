<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!--
<script type="text/javascript">
var oTimer = document.getElementById('create_time');
var timeStamp = new Date(oTimer.value).getTime();

Date.prototype.Format = function(fmt)     
{ //author: meizz  
  var o = {     
    "M+" : this.getMonth()+1,                 //月份  
    "d+" : this.getDate(),                    //日  
    "h+" : this.getHours(),                   //小时  
    "m+" : this.getMinutes(),                 //分  
    "s+" : this.getSeconds(),                 //秒  
    "q+" : Math.floor((this.getMonth()+3)/3), //季度
    "S"  : this.getMilliseconds()             //毫秒  
  };     
  if(/(y+)/.test(fmt))     
    fmt=fmt.replace(RegExp.$1, (this.getFullYear()+"").substr(4 - RegExp.$1.length));     
  for(var k in o)     
    if(new RegExp("("+ k +")").test(fmt))     
  fmt = fmt.replace(RegExp.$1, (RegExp.$1.length==1) ? (o[k]) : (("00"+ o[k]).substr((""+ o[k]).length)));     
  return fmt;     
};
oTimer.value = new Date(1459382400000).Format("yyyy-MM-dd hh:mm:ss");
</script>
  -->
<script language="javascript" type="text/javascript">
	function check_mail(e) {
		if (!/(\S)+[@]{1}(\S)+[.]{1}(\w)+/.test(e)) {
			alert("请输入格式正确的 e-mail 地址！");
		}
	}
</script>

</head>
<body>

	<form action="UserLoginServlet">
		<label>UserName</label> <input type="text" name="username"><br>
		<label>Password</label> <input type="password" name="password"><br>
		<input type="submit" value="submit">
		<c:if test="${ username!=null}">
			<input type="submit" value="退出">
		</c:if>
		/ YYYY-MM-DDTHH:mm:ss搜索
	</form>
	<h1>表单 提交Date</h1>
	<hr>
	<h2>表单 提交Timestamp</h2>
	<form action="UserAddServlet" method="get">
		日期和时间：<input type="datetime-local" name="create_time"
			value="2017-02-01 12:05:00" step="2" id="create_time" /> <input
			type="submit" /> 日期和时间2：<input type="datetime-local"
			name="create_time" value="2017-02-01 12:05:00" id="create_time" /> <input
			type="submit" />

	</form>

	${create_time }
	<hr>

	<form name="registerform" action="#" method="post">

		<input type="text" name="email" value="邮箱"
			onblur="check_mail(document.getElementsByName('u_mail')[0].value)" />
		<div>
			<button class='register_button' type="submit">注册</button>
	</form>


</body>
</html>