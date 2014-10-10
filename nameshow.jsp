<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>查询显示</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <body>
   <table width="299" border="1" align="center" height="60">
  <tr>
    <td colspan="2"  align="center"><strong>图书列表</strong></td>
  </tr>

  <tr>
    <td width="99" height="33">图书名称</td>
    <td width="199"><%=request.getAttribute("authorid")%></td>
  </tr>
</table>
 <p><a href="main.jsp">返回主页</a></p>
  </body>
</html>
