package MethodsAndConstructor;

class Student {
	String name;
	int age;
	int rollno;
	int marks;

	public Student(String name, int age, int rollno, int marks) {
		super();
		this.name = name;
		this.age = age;
		this.rollno = rollno;
		this.marks = marks;
	}	
}
interface interf {

	public Student get(String name, int age, int rollno, int marks);
}

public class Hello {
	public static void main(String[] args) {

	//	Interf i=(name,age,rollno,marks)->new Student( name,age,rollno,marks);
	interf	i=Student::new;
	Student s1=i.get("Monis", 34, 101, 40000);
	}
}
