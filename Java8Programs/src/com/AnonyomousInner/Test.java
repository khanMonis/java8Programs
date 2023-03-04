package com.AnonyomousInner;

import java.util.ArrayList;
import java.util.Collections;

class Employee{
	
	String name;
	int eno;
	
	 Employee(String name,int eno) {
		this.name=name;
		this.eno=eno;
	}
	 public String toString() {
		return eno+" "+name;
		 
	 }
}
public class Test {

	public static void main(String[] args) {
		
		ArrayList<Employee> al=new ArrayList<Employee>();
	
		al.add(new Employee("Dunny", 102134));
		al.add(new Employee("Bunny", 105656));
		al.add(new Employee("Aunny", 103323));
		al.add(new Employee("Chinny",132333));
		System.out.println(al);
		
		// Sorting by employee no
		
	//	Collections.sort(al,(e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);
		
		// Sorting by employee name
		
		Collections.sort(al,(e1,e2)->e1.name.compareTo(e2.name));
		System.out.println(al);
	}
	
}
