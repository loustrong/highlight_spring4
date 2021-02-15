package com.tom.DemoApp.highlight_spring4.chapter03.conditional;

public class WindowsListService implements ListService {

	@Override
	public String showListCmd() {
		return "dir";
	}

}
