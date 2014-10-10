<%@ page language="java" import="java.util.*,DBUnits.*,action.*" pageEncoding="GBK"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	 <br>
  <table width="615" border="0" align="center" height="75">
    <tr>
      <td colspan="5" align="center" ><strong>请输入查询作者</strong></td>
    </tr>
     <tr>
      <td colspan="5" align="center" >&nbsp;</td>
    </tr>
    <tr>
      <td align="right" width="499"> <form  name="form" method="post" action="querybook"> 作者名：（输入BiggeKane/LiuBin/ZhangHongyan）
      	<input type="text" name="name">
      	<input type="submit"  value="查询" ></form></td>
      	
    </tr>
  </table>
  </body>
</html>
