package com.javalearning.chapter7;

public class Demo2 {
	{
		//noraml block
		System.out.println("normal block");
	}
	
	//first method to create
	public Demo2() {
		System.out.println("method1");
	}
	
	//second method to create
	public Demo2(int i) {
			System.out.println("method2");
		}
		
	//third method to create
	public Demo2(int i, int j) {
			System.out.println("method3");
		}
	
	public static void main(String[] args) {
		new Demo2();
		new Demo2(1);
		new Demo2(1,2);
	}

}
