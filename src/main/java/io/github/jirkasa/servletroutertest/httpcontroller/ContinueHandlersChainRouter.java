package io.github.jirkasa.servletroutertest.httpcontroller;

import io.github.jirkasa.servletrouter.HttpRouter;

public class ContinueHandlersChainRouter extends HttpRouter {
	public ContinueHandlersChainRouter() {
		register("/first-controller", ContinueHandlersChainFirstController.class);
		register(ContinueHandlersChainSecondController.class);
	}
}