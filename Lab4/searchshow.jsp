<%@ page language="java" import="java.util.*,DBUnits.*" pageEncoding="GBK"%>
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
  <table width="615" border="1" align="center">
  <tr>
     <td colspan="5" align="center" >查询结果</td>
   </tr>
  </table>
    <table width="615" border="1" align="center">
   <tr>
     <td width="179" colspan="1" align="left" >书名（点击查看详情）</td>
      <td width="179" colspan="11" align="right" >操作</td>
   </tr>
    <%
    	List list=(List)request.getAttribute("list");
    	Iterator iter=list.iterator();
    	while(iter.hasNext()){
    		book book=(book)iter.next();
    	%>
    	<tr>
		<td align="left"> <form  name="form" method='post' action='showbook'> 
		<input type="hidden" name="title" value=<%=book.getTitle()%>>
		<input type="submit" name="action" value=<%=book.getTitle()%> ></form></td>
		<td align="right"> <form  name="form" method='post' action='deletebook'> 
		<input type="hidden" name="title" value=<%=book.getTitle()%>>
		<input type="submit" name="action" value="删除" ></form></td>
		</tr>
    	<% 
    	} 
    	%>
    </table>
 	<p><a href="main.jsp">返回主页</a></p>
  </body>
</html>