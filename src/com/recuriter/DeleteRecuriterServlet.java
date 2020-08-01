package com.recuriter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/DeleteRecuriterServlet")
public class DeleteRecuriterServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String sid=request.getParameter("id");
		int id=Integer.parseInt(sid);
		RecuriterDao.delete(id);
		out.println("<b style='font-family:Times New Roman;font-size:large;color:green'>Successfully Deleted Details....</b>");
		request.getRequestDispatcher("ViewRecuriterServlet").forward(request, response);
	}
}
