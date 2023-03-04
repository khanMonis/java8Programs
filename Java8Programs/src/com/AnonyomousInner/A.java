package com.AnonyomousInner;

interface A {

	public void m1();
	public void m2();
	default void m3() {
		System.out.println("Default Method");
	}
}
class Test1 implements A{
	
	public void m1() {}
	public void m2() {}
}
class Test2 implements A{
	
	public void m1() {}
	public void m2() {}
}
class Test3 implements A{
	
	public void m1() {}
	public void m2() {}
}
class Test100 implements A{
	
	public void m1() {}
	public void m2() {}
}