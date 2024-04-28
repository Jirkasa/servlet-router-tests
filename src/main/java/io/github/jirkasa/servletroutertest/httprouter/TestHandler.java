package io.github.jirkasa.servletroutertest.httprouter;

import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.github.jirkasa.servletrouter.Handler;

public class TestHandler implements Handler<HttpServletRequest, HttpServletResponse> {
	private String title;
	
	public TestHandler(String title) {
		this.title = title;
	}

	@Override
	public boolean handle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<title>" + title + "</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" + title + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
		return false;
	}

	@Override
	public void setPathParams(Map<String, String> pathParams) {}

	@Override
	public boolean matchesFullPath() {
		return false;
	}
	
}