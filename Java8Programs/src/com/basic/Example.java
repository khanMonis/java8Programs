package com.basic;

import java.util.function.Function;

public class Example {

	public static void main(String[] args) {
		
		Function<Integer, Integer>f=i->i*i;
		System.out.println("the square of 4:"+f.apply(4));
		System.out.println("the square of 23:"+f.apply(23));
	}
}
