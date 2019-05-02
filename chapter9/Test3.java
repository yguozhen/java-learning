package com.javalearning.chapter9;

public class Test3 {
	public static void main(String[] args) {
//		Dog dog = new Dog();
//		dog.say();
		Animal animal = new Dog();
		animal.say();
		
		//down
		Dog dog = (Dog) animal;
		dog.say();
		
		//down 2  not safe
		Cat cat = (Cat) animal;
		cat.say();
		
//		dog = new Cat();
//		dog.say();
	}

}
