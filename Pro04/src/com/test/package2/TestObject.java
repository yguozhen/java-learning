package com.test.package2;

public class TestObject {
	public static void main(String[] args) {
		//Object obj;
		TestObject to = new TestObject();
		System.out.println(to.toString());
		
		Person2 p2 = new Person2("xixi",6);
		System.out.println(p2.toString());
		
	}
	
	
	public String toString() {
		return "test Object orientation";
	}

}

class Person2{
	String name;
	int age;
	
	public String toString() {
		return name+"ƒÍ¡‰£∫"+age;
	}
	public Person2(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}