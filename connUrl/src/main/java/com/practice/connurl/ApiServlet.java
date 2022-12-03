package com.practice.connurl;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ApiServlet
 */
public class ApiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	public ApiServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding( "UTF-8" );
		response.setContentType( "text/html; charset=UTF-8" );
		
		String command = request.getParameter( "command" );
		
		if( command.equals( "list" ) ) {
			response.sendRedirect( "dataList.jsp" );
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
