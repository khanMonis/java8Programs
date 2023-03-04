package com.Static;

interface Interf{
	
	public static void m1() {
		
		System.out.println("Interface Static method.......");
	}
}
public class Demo implements Interf{

	public static void main(String[] args) {
		
		//valid
		Interf.m1();
		//invalid
		//m1();
		//invalid
		//Demo.m1();
		Demo m=new Demo();
	//	invalid 
	//	m.m1();
	}
}
