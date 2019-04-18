package com.javalearning.chapter5;

public class test {
    public int[] twoSum ( int[] nums, int target) {
        
       for(int i = 0; i < nums.length; i++){
            for(int j = i; j < nums.length;j++){
                if(nums[i] + nums[j] == target){
                    return new int [] {i,j};
                }
            }
        }
       throw new IllegalArgumentException("No two sum solution");
    }
    
    public static void main(String[] args) {
		test location = new test();
		int arr[] = {1,2,3,4,5,6,7,8};
		int arr2[] = location.twoSum(arr,3);
		for(int j:arr2) {
			System.out.println(j);
		}
	}
}
