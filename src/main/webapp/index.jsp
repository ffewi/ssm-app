<%@ page pageEncoding="utf-8"%>  
 
<html>
<head>
	<title>首页</title>
	
</head>
<body>
<h2>Hello World!</h2>
<form action="<%=application.getContextPath() %>/user/showUser" method="get">
	<label for="idlable" >查询:</label>
	<input type="text" name="id" id="idlable" value="1" />
	<input type="submit" value="search" />
</form>

</body>
</html>
