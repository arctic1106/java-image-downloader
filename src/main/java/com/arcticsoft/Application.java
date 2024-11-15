package com.arcticsoft;

public class Application {

	public static void main(String[] args) throws Exception {
		System.setProperty("java.util.logging.config.file", "src/main/resources/logging.properties");
		var fromPage = 1;
		var toPage = 10;
		if (args.length == 2) {
			fromPage = Integer.parseInt(args[0]);
			toPage = Integer.parseInt(args[1]);
		}
		// Set true for parallel downloading with Virtual Threads 
		ImageService.downloadPages(fromPage, toPage, true);
	}
}