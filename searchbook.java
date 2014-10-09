package action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DBUnits.author;

public class searchbook extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	private static final long serialVersionUID = 1L;
	/*public QueryBook() {
		super();
	}
		
	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	
	public void Postdata(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String url = "searchshow.jsp";
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		@SuppressWarnings("rawtypes")
		List list=new ArrayList();
		author bookname = new author();
		String name = request.getParameter("name").trim();
		bookname=DB.searchName(name);
		String authorid = bookname.getAuthorid();
		list = DB.searchBooks(authorid);
		request.setAttribute("list", list);
		
	    RequestDispatcher rd=request.getRequestDispatcher(url);
		rd.forward(request, response);
		return;
	}

	public void Getdata(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Postdata(request,response);
	}
	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	

}
