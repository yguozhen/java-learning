package com.javalearning.chapter2;

public class Demo4 {
	public static void main(String[] args) {
		boolean b = (5>2)&&(4<8);
		System.out.println("b = "+b);
		
		//test &
		boolean b2 = (4<2)&(5<9);
		System.out.println("b2 = "+b2);
		
		//test ||
		boolean b3 = (4<2)||(5<9);
		System.out.println("b3 = "+b3);
		
		//test|
		boolean b4 = (4<2)|(5<9);
		System.out.println("b4 = "+b4);
		
		//test !
		boolean b5 = !(4<2);
		System.out.println("b5 = "+b5);
			
		//test^ 
		boolean b6 = (4<2)^(5<9);
		System.out.println("b6 = "+b6);
	}

}
