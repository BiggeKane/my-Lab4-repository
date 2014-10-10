package action;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import DBUnits.book;

public class bookdetails extends HttpServlet {

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
		system.out.printin("I changed here!(third change)");// Put your code here
	}

	

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void Postdata(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String url = "error.jsp";
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		book book = new book();
		String title = request.getParameter("title");
		if(title!=null){
			book=DB.searchInfo(title);
			if(book.getTitle()!=null){
				url="bookdetails.jsp";
				request.setAttribute("isbn", book.getIsbn());
				request.setAttribute("title", book.getTitle());
				request.setAttribute("authorid", book.getAuthorid());
				request.setAttribute("publisher", book.getPublisher());
				request.setAttribute("publishdate", book.getPublishdate());
				request.setAttribute("price", book.getPrice());
			}
			else{
			    request.setAttribute("message", "未找到");
			}
		}
		
	    RequestDispatcher rd=request.getRequestDispatcher(url);
		rd.forward(request, response);
		return;
	}
	
	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void Getdata(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Postdata(request,response);
	}
}
	

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	
