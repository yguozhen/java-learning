package com.javalearning.chapter5;


/**
 * 
 * @author yangguozhen
 *
 */
public class Person {
	int age;
	String name;
	
	public void speak() {
		System.out.println("我叫"+name+"我今年"+age);
	}
	public static void main(String[] args) {
		
		Person zhangsan = new Person();
		
		zhangsan.name = "zhangsan";
		zhangsan.age = 22;
		zhangsan.speak();
 		
	}

}
