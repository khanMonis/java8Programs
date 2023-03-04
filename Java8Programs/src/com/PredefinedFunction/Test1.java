package com.PredefinedFunction;

import java.util.function.Predicate;

public class Test1 {

	public static void main(String[] args) {
		
		String []s= {"Nag","Chiranjeevi","Venkatesh","Balaiah","Sunny","Katrina"};
	Predicate<String> p = s1->s1.length()>5;
	
	for(String s1:s) {
		if(p.test(s1)) {
			System.out.println(s1);
		}
	}
	}
}
