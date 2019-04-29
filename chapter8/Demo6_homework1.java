package com.javalearning.chapter8;

public class Demo6_homework1 {
	public static void main(String[] args) {
		String a = "abcdefg";
		String son = a.substring(0);
		String result = "";
		System.out.println(a.length());
		
		for(int i = 0;i <= a.length()-1;i++) {
			result = result +a.substring(a.length()-i-1,a.length()-i);
		}
		System.out.println(result);
		System.out.println(result.length());
	}
}
