package io.github.jirkasa.servletroutertest;

import io.github.jirkasa.servletrouter.HttpRouter;
import io.github.jirkasa.servletroutertest.httpmiddleware.DisplayTestAttributeController;
import io.github.jirkasa.servletroutertest.httpmiddleware.HandleRequestController;
import io.github.jirkasa.servletroutertest.httpmiddleware.HandleRequestMiddleware;
import io.github.jirkasa.servletroutertest.httpmiddleware.PathParamMiddleware;
import io.github.jirkasa.servletroutertest.httpmiddleware.SetTestAttributeToRequestMiddleware;
import io.github.jirkasa.servletroutertest.httpmiddleware.ShouldNotContinueMiddleware;

public class HttpMiddlewareTestsRouter extends HttpRouter {
	public HttpMiddlewareTestsRouter() {
		register("/handle-request", new HandleRequestMiddleware());
		register("/set-test-attribute", new SetTestAttributeToRequestMiddleware(), DisplayTestAttributeController.class);
		register("/should-not-continue", new ShouldNotContinueMiddleware(), HandleRequestController.class);
		register("/path-param/:pathParameter", new PathParamMiddleware());
	}
}