package com.javalearning.chapter9;

public class Test2 extends C implements D {

public void a() {
		
		
		System.out.println("a method");
	}

@Override
public void b() {
	// TODO Auto-generated method stub
	System.out.println("b method");
	
}
@Override
public void d() {
	// TODO Auto-generated method stub
	System.out.println("d method");
	
}
	
	
	public static void main(String[] args) {
		Test test = new Test();
		test.a();
		test.b();
		test.c();
		test.d();
		System.out.println(Test.BLOG);
	}



}
