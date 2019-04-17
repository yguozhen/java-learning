package com.javalearning.chapter5;

/**
 * test static and normal
 * @author yangguozhen
 *
 */

public class Demo2 {
	void fun1() {
		System.out.println("this is a normal function");
	}
	
	static void fun2() {
		System.out.println("this is a static function");
	}
	
	public static void main(String[] args) {
		Demo2 demo = new Demo2();
		
		demo.fun1();
		demo.fun2();
		Demo2.fun2();
	}

}
