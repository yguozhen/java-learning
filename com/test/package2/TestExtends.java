package com.test.package2;


/**
 * test extends method
 * @author Administrator
 *
 */
public class TestExtends {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.name = "yguozhen";
		stu.height = 178;
		stu.rest();
			
		
		Student stu2 = new Student("ss",15,"excavator");
		
		
		System.out.println(stu2 instanceof Student);
		System.out.println(stu2 instanceof Person);
		System.out.println(stu2 instanceof Object);
		System.out.println(new Person() instanceof Student);
	}

}


class Person{
	String name;
	int height;
	public void rest() {
		System.out.println("rest for a moment");
	}
}

class Student extends Person{
	String major;
	
	public void study() {
		System.out.println("study for two hours");
	}
	public Student(String name,int height,String major) {
		this.name = name;
		this.height = height;
		this.major = major;
	}
	public Student() {
	}
}
