package com.github.drcrane.mavenexample.cmdline;

public class WithoutDependency {
	public static void main(String... args) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < args.length; i++) {
			String arg = args[i];
			sb.append("arg[");
			sb.append(Integer.toString(i));
			sb.append("]: ");
			sb.append(arg);
			sb.append("\r\n");
		}
		System.out.println("Your arguments were:");
		System.out.print(sb.toString());
	}
}
