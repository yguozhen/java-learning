package com.javalearning.chapter8;

public class Demo2 {
	public static void main(String[] args) {
		String name1 = "san";
		String name2 = "san";
		String name3 = new String("san");
		String name4 = new String("san");
		
		System.out.println("name1 == name2 "+(name1 == name2));
		System.out.println("name1 == name3 "+(name1 == name3));
		System.out.println("name3 == name4 "+(name3 == name4));
		
		String name = "zhang";
		name+="san";
		System.out.println(name);
	}

}
