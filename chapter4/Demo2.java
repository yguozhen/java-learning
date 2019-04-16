package com.javalearning.chapter4;
/**
 * static determine arr
 * @author yangguozhen
 *
 */
public class Demo2 {
	public static void main(String[] args) {
		
		//static determine the arr
		int arr[] = new int[] {1,2,3};
		//iterate array
		for(int i =0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("-------------");
		//another way to foreach 
		for(int j:arr) {
			System.out.println(j);
		}
		
	};

}
