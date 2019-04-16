package com.javalearning.chapter4;

/**
 * odd and even
 * @author yangguozhen
 *
 */
public class Demo4_homework2 {
	public static void main(String[] args) {
		
		int odd = 0;
		int even = 0;
		int arr[] = {1,4,6,23,7,3};
		for(int i = 0;i < arr.length; i ++) {
			if(arr[i] % 2 == 1) {
				odd = odd + 1;
			}
			else {
				even = even + 1;
			}
		}
		
		System.out.println("the number of odd is "+odd);
		System.out.println("the number of even is "+even);
		
	}

}
