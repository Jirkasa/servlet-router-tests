package io.github.jirkasa.servletroutertest.httpcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import io.github.jirkasa.servletrouter.HttpController;

public class ForwardToJSPController extends HttpController {
	@Override
	protected void handleGet(HttpServletRequest request, HttpServletResponse response) throws Exception {
		forwardTo("/WEB-INF/jsp/Page.jsp", request, response);
	}
}