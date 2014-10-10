<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    <title>图书详情</title>
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
<table width="615" border="1" align="center">
  <tr>
     <td colspan="5" align="center" >图书详情</td>
   </tr>
   </table>
   <table width="615" border="1" align="center">
   <tr>
     <td width="179" colspan="1" align="center" >ISBN(PK)</td>
     <td width="179" colspan="1" align="center" >Title</td>
     <td width="130" colspan="1" align="center" >AuthorID(FK)</td>
     <td width="121" colspan="1" align="center" >Publisher</td>
     <td width="84" colspan="1" align="center" >PublishDate</td>
     <td width="64" colspan="1" align="center" >Price</td>
   </tr>
       <tr >
    	<td><%=request.getAttribute("isbn") %></td>
    	<td><%=request.getAttribute("title")%></td>
    	<td><%=request.getAttribute("authorid") %></td>
    	<td><%=request.getAttribute("publisher") %></td>
    	<td><%=request.getAttribute("publishdate")%></td>
    	<td><%=request.getAttribute("price") %></td>
   </tr>
   </table>
 <p><a href="main.jsp">返回主页</a></p>
  </body>
</html>
