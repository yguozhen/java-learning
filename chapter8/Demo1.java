package com.javalearning.chapter8;

public class Demo1 {
	public static void main(String[] args) {
		String name1 = "san";
		System.out.println(name1);
		
		String name2 = new String("san");
		System.out.println(name2);
		
		String name3 = name2;
		System.out.println("name1 == name2 :"+(name1 == name2));
		System.out.println("name1 == name3 :"+(name1 == name3));
		System.out.println("name2 == name3 :"+(name2 == name3));
		
		System.out.println("name1 equals name2 :"+(name1.equals (name2)));
		System.out.println("name1 equals name2 :"+(name1.equals(name3)));
		System.out.println("name2 equals name3 :"+(name1.equals(name3)));
	}

}
