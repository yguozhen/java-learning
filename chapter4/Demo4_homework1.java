package com.javalearning.chapter4;

/**
 * get the max and min
 * @author yangguozhen
 *
 */
public class Demo4_homework1 {
	public static void main(String[] args) {
		
		// get array
		int arr1[] = {1,5,23,7,-1,-4};
		//determine the max and min
		int max = arr1[0];
		int min = arr1[0];
		for(int i = 0; i < arr1.length; i++) {
			if(max < arr1[i]) {
				max = arr1[i];
			}
			if(min > arr1[i]) {
				min = arr1[i];
			}
		}
		System.out.println("max = "+max);
		System.out.println("min = "+min);
	}

}
