package action;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class delete extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}
		
	public void Postdata(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String url = "delete.jsp";
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		String title=request.getParameter("title");
		if(DB.deleteInfo(title)){
			request.setAttribute("message","书名为"+title+"删除成功！");	
		}
		else{
			request.setAttribute("message", "删除出错！");
		}
		RequestDispatcher rd=request.getRequestDispatcher(url);
		rd.forward(request, response);
		return;
	}
	
	public void Getdata(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Postdata(request,response);
	}
	
	
}