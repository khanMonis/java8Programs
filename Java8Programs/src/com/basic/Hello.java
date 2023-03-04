package com.basic;

@FunctionalInterface
public interface Hello {

	public void m1();
	default void m2() {
		
	}
	public static void m3() {
	
	}
}
