package io.github.jirkasa.servletroutertest.httprouter;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.github.jirkasa.servletrouter.HttpErrorController;

public class TestErrorController extends HttpErrorController {
	public TestErrorController(Exception exception) {
		super(exception);
	}

	@Override
	public boolean handle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<title>Exception caught: " + getException().getMessage() + "</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>500 - Internal Server Error</h1>");
            out.println("</body>");
            out.println("</html>");
        }
		
		return false;
	}
}