package com.AnonyomousInner;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

class Employe
{
    int id;
     
    String name;
     
    int age;
     
    String gender;
     
    String department;
     
    int yearOfJoining;
     
    double salary;
     
    public Employe(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) 
    {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }
     
    public int getId() 
    {
        return id;
    }
     
    public String getName() 
    {
        return name;
    }
     
    public int getAge() 
    {
        return age;
    }
     
    public String getGender() 
    {
        return gender;
    }
     
    public String getDepartment() 
    {
        return department;
    }
     
    public int getYearOfJoining() 
    {
        return yearOfJoining;
    }
     
    public double getSalary() 
    {
        return salary;
    }
     
    @Override
    public String toString() 
    {
        return "Id : "+id
                +", Name : "+name
                +", age : "+age
                +", Gender : "+gender
                +", Department : "+department
                +", Year Of Joining : "+yearOfJoining
                +", Salary : "+salary;
    }
}


public class Main {
	
	public static void main(String[] args) {
		
		List<Employe> employeeList = new ArrayList<Employe>();
        
		employeeList.add(new Employe(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		employeeList.add(new Employe(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employe(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employe(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employe(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));

		Optional<Employe> emp = employeeList.stream()
		        .collect(Collectors.maxBy(Comparator.comparingDouble(Employe::getSalary)));
		System.out.println(emp);
	}

}
