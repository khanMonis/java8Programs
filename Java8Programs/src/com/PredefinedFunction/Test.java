package com.PredefinedFunction;

import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		
		Predicate<Integer> p1=i->i%2==0;
		System.out.println(p1.test(10));
	    System.out.println(p1.test(15));
	}
}
