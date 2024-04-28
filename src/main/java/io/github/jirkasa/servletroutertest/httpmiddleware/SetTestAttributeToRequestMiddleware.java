package io.github.jirkasa.servletroutertest.httpmiddleware;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.github.jirkasa.servletrouter.HttpMiddleware;

public class SetTestAttributeToRequestMiddleware extends HttpMiddleware {
	@Override
	public boolean handle(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setAttribute("test", "test_value");
		return true;
	}
}