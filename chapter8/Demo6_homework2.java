package com.javalearning.chapter8;

public class Demo6_homework2 {
	public static void main(String[] args) {
		String a = "1,3,5,6,7,8";
		int longth = 0;
		for(int i = 0;i<a.length();i++) {
			char b = a.charAt(i);
			if((b <= '9')&&(b >= '0')) {
				longth++;
			}
		}
		
		int arr[] = new int[longth];
		int num = 0;
		for(int j = 0;j<a.length();j++) {
			char b = a.charAt(j);
			if((b <= '9')&&(b >= '0')) {
			arr[num] = (int)b-48;
			num++;
			}
		}
		
		for(int k:arr) {
			System.out.print(k +" ");
		}
		
	}

}
