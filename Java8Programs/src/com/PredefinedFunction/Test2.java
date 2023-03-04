package com.PredefinedFunction;

import java.util.function.Predicate;

public class Test2 {

	public static void main(String[] args) {

		String[] s = { "Nag", "Chiranjeevi", "Venkatesth", "Balaiah", "Sunny", "Katrina" };
		Predicate<String> p = s1 -> s1.length() % 2 == 0;

		for (String s1 : s) {

			if (p.test(s1)) {
				System.out.println(s1);
			}
		}
	}
}
