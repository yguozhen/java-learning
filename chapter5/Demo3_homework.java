package com.javalearning.chapter5;

/**
 * Fibonacci sequence
 * @author yangguozhen
 *
 */
public class Demo3_homework {
	static long fibSequence(int a) {
		if(a == 1) {
			return 1;
		}else if(a == 2) {
			return 1;
		}
		
		return fibSequence(a-1)+fibSequence(a-2);
	}
	
	public static void main(String[] args) {
		Demo3_homework Fib = new Demo3_homework();
		for(int n = 1; n<10; n++) {
			System.out.println(Fib.fibSequence(n));
		}
	}

}
