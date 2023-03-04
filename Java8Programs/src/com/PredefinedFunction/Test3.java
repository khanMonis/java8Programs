package com.PredefinedFunction;

import java.util.ArrayList;
import java.util.function.Predicate;

class Employee {

	String name;
	double salary;

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
}

public class Test3 {

	public static void main(String[] args) {

		ArrayList<Employee> al = new ArrayList<Employee>();
		al.add(new Employee("Anas", 2000));
		al.add(new Employee("Sahil", 4000));
		al.add(new Employee("Saad", 6000));
		al.add(new Employee("Danish", 8000));
		al.add(new Employee("Hnas", 9000));
		al.add(new Employee("Fnas", 10000));

		System.out.println(al);

		Predicate<Employee> p = e -> e.salary > 6000;
		for (Employee e1 : al) {
			if (p.test(e1)) {
				System.out.println(e1.name+":"+e1.salary);
			}
		}

	}
}
