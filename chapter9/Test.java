package com.javalearning.chapter9;

public class Test extends C implements A,B{
	
	public void a() {
		
		
		System.out.println("a method");
	}
	
	
	public static void main(String[] args) {
		Test test = new Test();
		test.a();
		test.b();
		test.c();
		System.out.println(Test.BLOG);
	}


	@Override
	public void b() {
		// TODO Auto-generated method stub
		System.out.println("b method");
		
	}


	public void d() {
		// TODO Auto-generated method stub
		System.out.println("d method");
	}


	

}
