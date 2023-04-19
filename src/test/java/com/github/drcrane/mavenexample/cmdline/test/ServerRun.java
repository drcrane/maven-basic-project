package com.github.drcrane.mavenexample.cmdline.test;

public class ServerRun {
	public static void main(String... args) {
		System.out.println("Server running...");
		try { Thread.sleep(1000); } catch (InterruptedException ie) { }
		System.out.println("Hardly.");
	}
}
