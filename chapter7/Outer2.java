package com.javalearning.chapter7;


public class Outer2 {
	private int a = 1;
	
	class Inner{
		public void show() {
			System.out.println(a);
		}
	}
	
	public static void main(String[] args) {
		Outer2 outer2 = new Outer2();
		Outer2.Inner inner = outer2.new Inner();
		
	}


}
