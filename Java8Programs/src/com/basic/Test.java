package com.basic;

interface Interf {

	public void m1();
}

/*
 * class Demo implements Interf{
 * 
 * public void m1() {
 * 
 * System.out.println("Hello........"); } }
 */
public class Test {
//public static void main(String[] args) {
	//Interf i=new Demo();
	//i.m1();

	public static void main(String[] args) {
		Interf i=()->System.out.println("hello..... by lambda expression");
		i.m1();
	}
}
