package io.github.jirkasa.servletroutertest;

import io.github.jirkasa.servletrouter.HttpRouter;
import io.github.jirkasa.servletroutertest.httpcontroller.ContinueHandlersChainRouter;
import io.github.jirkasa.servletroutertest.httpcontroller.EmptyController;
import io.github.jirkasa.servletroutertest.httpcontroller.ForwardToJSPController;
import io.github.jirkasa.servletroutertest.httpcontroller.ForwardToServletController;
import io.github.jirkasa.servletroutertest.httpcontroller.HandleGETRequestController;
import io.github.jirkasa.servletroutertest.httpcontroller.HandleRequestController;
import io.github.jirkasa.servletroutertest.httpcontroller.PathParamRouter;
import io.github.jirkasa.servletroutertest.httpcontroller.PathParameterController;
import io.github.jirkasa.servletroutertest.httpcontroller.SkipUnimplementedMethodsRouter;

public class HttpControllerTestsRouter extends HttpRouter {
	public HttpControllerTestsRouter() {
		register("/handle-request", HandleRequestController.class);
		register("/handle-get-request", HandleGETRequestController.class);
		register("/empty-controller", EmptyController.class);
		register("/skip-unimplemented-methods", new SkipUnimplementedMethodsRouter());
		register("/path-param/:pathParameter", PathParameterController.class);
		register("/path-param-router/:pathParameter", new PathParamRouter());
		register("/forward-to-jsp", ForwardToJSPController.class);
		register("/forward-to-servlet", ForwardToServletController.class);
		register("/continue-handlers-chain", new ContinueHandlersChainRouter());
	}
}