package com.javalearning.chapter3;
/**
 * transfer a and b
 * @author yangguozhen
 *
 */

public class Demo5_homework {
	public static void main(String[] args) {
		
	
	int a = 1;
	int b = 3;
	int c = 3;
	System.out.println("Begin, a = "+a+"b = "+ b);
	//a to c
	c = a;
	a = b;
	b = c;
	System.out.println("End, a = "+a+"b = "+ b);
	
	}

}
