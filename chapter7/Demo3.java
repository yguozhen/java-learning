package com.javalearning.chapter7;

public class Demo3 {
	
	
	{
		System.out.println("normal");
	}
	static {
		System.out.println("static");
		
	}
	public Demo3() {
		System.out.println("first");
	}
	public Demo3(int i) {
		System.out.println("second");
	}
	public Demo3(int i, int j) {
		System.out.println("third");
	}
	public static void main(String[] args) {
		new Demo3();
		new Demo3(1);
		new Demo3(1,2);
	}
	

}
