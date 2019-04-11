package com.javalearning.chapter3;

/**
 * sum 1+2+3+4....100
 * @author yangguozhen
 *
 */
public class Demo5_homework3 {
	public static void main(String[] args) {
		int a = 0;
		int sum = 0;
		for(; a<=100;a++) {
			sum = a+sum;
		}
		System.out.println(sum);
	}

}
