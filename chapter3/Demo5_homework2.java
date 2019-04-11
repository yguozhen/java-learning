package com.javalearning.chapter3;
/**
 * the max number in 3numbers
 * @author yangguozhen
 *
 */
public class Demo5_homework2 {
	public static void main(String[] args) {
		int a =129;
		int b = 1435;
		int c = 6;
		int max = 0;
		
		max = a;
		if(b >= max) {
			max = b;
			if( c >= max) {
				max = c;
			}
			
		}else {
			if(c >= max) {
				max = c;
			}
			
		}
		System.out.println(max);
	}

}
