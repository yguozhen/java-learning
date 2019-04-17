package com.javalearning.chapter5;

public class Demo3 {
	static long notRecursion(int a) {
		long result = 1;
		for(int n = 1; n <= a; n++ ) {
			result = n * result;
			
		}
		return result;
	}
	static long Recursion(int n) {
		
		if(n==1) {
			return 1;
		}
		return Recursion(n-1)*n;
		
	}
	public static void main(String[] args) {
		Demo3 recursion = new Demo3();
		
		System.out.println(recursion.notRecursion(5));
		System.out.println(recursion.Recursion(4));
	}

}
