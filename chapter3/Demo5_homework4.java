package com.javalearning.chapter3;

/**
 * compute sum the factorial of 1,2,3,...100
 * @author yangguozhen
 *
 */
public class Demo5_homework4 {
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int a=1;a<=4;a++) {
			int singleSum = 1;
			for(int b = 1;b<=a;b++) {
				singleSum = b*singleSum;
			}
			sum = sum+ singleSum;
		}
		System.out.println(sum);
	}

}
