package com.javalearning.chapter8;

public class Dog extends Animal {
	public void say() {
		System.out.println("catcat");
	}
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("旺财");
		dog.setAge(12);
		dog.say();
	}

}
