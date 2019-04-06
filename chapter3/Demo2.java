package com.javalearning.chapter3;
/**
 * switch语句，switch语句scanner语句
 */

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		System.out.println("input a number");
		//void a system input 
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println("n = "+ n);
		
		
		//判断是1还是2
		switch(n) {
		case 1:{
			System.out.println("it is 1");
			break;
		}
		case 2:{
			System.out.println("it is 2");
			break;
		}
		default:{
			System.out.println("this number is not 1 or 2");
		}
		}
	}

}
