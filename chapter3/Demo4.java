package com.javalearning.chapter3;

public class Demo4 {
	public static void main(String[] args) {
		for(int i =1;i<=9;i++) {
			System.out.print("i = "+i+"\t");
			for(int j=1; j<=9; j++) {
				System.out.print("j = "+j);
			if(j == 4) {
				System.out.println("\n");
				break;
			}
			}
		}
	}

}
