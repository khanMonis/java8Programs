package com.AnonyomousInner;

interface interf{
	
	default void m1() {
		System.out.println("Default Method");
	}
}

public class Demo implements interf{

	public	void m1() {
		System.out.println();
	
		System.out.println("Overriding Version of default method");
	}
	public static void main(String[] args) {
	
	Demo m=new  Demo();
	m.m1();
	}
}
