package com.github.drcrane.mavenexample.cmdline;

import org.apache.commons.io.IOUtils;

public class WithDependency {
	public static void main(String... args) {
		if (IOUtils.length(args) > 0) {
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
		} else {
			System.out.println("There were no arguments provided.");
		}
	}
}
