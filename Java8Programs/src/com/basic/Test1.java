package com.basic;

interface Inter{
	
	public void m1(int a,int b);
}

/*
 * class Main implements Inter{
 * 
 * public void m1(int a, int b) { System.out.println("the Sum:"+(a+b)); } }
 */
public class Test1 {

	public static void main(String[] args) {
	//	Inter i=new Main();
	//i.m1(10, 23);	
	
	Inter i=( a, b)->System.out.println("The sum:"+(a+b));
	i.m1(20, 30);
	i.m1(230, 110);
	i.m1(20333, 3000);
	i.m1(2025632, 30909);
	}
}
