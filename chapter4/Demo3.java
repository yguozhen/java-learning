package com.javalearning.chapter4;
/**
 * test multidimensional array
 * @author yangguozhen
 *
 */
public class Demo3 {
	public static void main(String[] args) {
		
		//static initiate two-dimensions array
		int [][]arr1=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		
		for(int i =0;i<arr1.length;i++) {
			for(int j=0;j<arr1[0].length;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		//
	}

}
