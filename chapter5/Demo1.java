package com.javalearning.chapter5;

/**
 * overload
 * @author yangguozhen
 *
 */
public class Demo1 {
	
	int add(int a, int b ) {
		int sum = a+b;
		return sum;
	}
	int add(int a , int b , int c) {
		int sum = a+b+c;
		return sum;
	}
	int add(int a, String b) {
		System.out.println("3 method");
		return a + Integer.parseInt(b);
	}
	
	public static void main(String[] args) {
		Demo1 demo = new Demo1();
		System.out.println(demo.add(3, "2"));
	}

}
