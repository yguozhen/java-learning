package com.javalearning.chapter3;

public class Demo3_homework {
	public static void main(String[] args) {
		int sum = 0;
		for(int a=1;a<=9;a++) {
			System.out.println();
			for(int b =1;b<=9;b++) {
				sum = a*b;
				System.out.print(sum+" ");
			}
		}
	}

}
