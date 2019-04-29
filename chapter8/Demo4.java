package com.javalearning.chapter8;

public class Demo4 {
	public static void main(String[] args) {
		//indexOf
		
		String str = "abcdefghijkmlen";
		
		int a = str.indexOf("e");
		// test indexOf
		System.out.println(a);
		
		//test indexOf after location 4
		System.out.println(str.indexOf("e", 5));
	}

}
