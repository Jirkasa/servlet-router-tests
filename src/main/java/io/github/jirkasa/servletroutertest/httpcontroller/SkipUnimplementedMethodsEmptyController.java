package io.github.jirkasa.servletroutertest.httpcontroller;

import io.github.jirkasa.servletrouter.HttpController;

public class SkipUnimplementedMethodsEmptyController extends HttpController {
	public SkipUnimplementedMethodsEmptyController() {
		skipUnimplementedMethods = true;
	}
}