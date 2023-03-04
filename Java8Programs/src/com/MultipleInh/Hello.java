package com.MultipleInh;

interface Left{
	default void m1() {
		System.out.println("Left Interface m1 method");
	}
}

interface Right{
	default void m1() {
		System.out.println("Right Interface m1 method");
	}
}

public class Hello implements Left,Right{

	public void m1() {
		
	//	System.out.println("Our Own M1 method.......");
	//	Left.super.m1();
		Right.super.m1();
	}
	
	public static void main(String[] args) {
		
		Hello h=new Hello();
		h.m1();
	}
}
