package com.javalearning.chapter4;

/**
 * delete 0 and then create an array
 * @author yangguozhen
 *
 */
public class Demo4_homework3 {
	
	public static void main(String[] args) {
		int oldArr[] = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};
		
		int a = 0;
		
		//first circle to calculate the number of != 0
		for(int i = 0 ; i < oldArr.length ; i++) {
			if(oldArr[i] != 0) {
				a++;
				continue;
			}
			
		}
		int arr[] = new int [a];
		
		
		//restart a 
		a = 0;
		for(int i = 0 ; i < oldArr.length ; i++) {
			if(oldArr[i] == 0) {
				a++;
				continue;
			}
			arr[i-a] = oldArr[i];
		}
		
		for(int j:arr) {
			System.out.print(j+" ");
		}
	}

}
