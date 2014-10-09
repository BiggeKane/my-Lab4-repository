package action;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DBUnits.author;

public class searchname extends HttpServlet {


	private static final long serialVersionUID = 1L;
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void Postdata(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String url = "error.jsp";
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		author bookname = new author();
		String name = request.getParameter("name").trim();
		if(name!=null){
			bookname=DB.searchName(name);
			if(bookname.getAuthorid()!=null){
				url="nameshow.jsp";
				request.setAttribute("authorid", bookname.getAuthorid());
			}
			else{
			    request.setAttribute("message", "Œ¥≤È—ØµΩ");
			}
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
