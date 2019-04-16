package com.javalearning.chapter4;

/**
 * bubble sort
 * @author yangguozhen
 *
 */
public class Demo4 {
	public static void main(String[] args) {
		int []arr= {4,21,0,-1,-2};
		
		//circle number
		for(int i=0;i<arr.length-1;i++) {
			//comparative number
			for(int j=0;j<arr.length-i-1;j++) {
				
				if(arr[j] > arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
				
				
			}
		}
		for(int k:arr){
			System.out.print(k+" ");
		}
		
	}

}
