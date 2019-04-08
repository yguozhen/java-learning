package com.javalearning.chapter3;
/**
 * Narcissistic number
 * @author yangguozhen
 *
 */
public class Demo3 {
	public static void main(String[] args) {
		//determine the hundred digit,ten digit number,single digit
		int n=100;;
		int a,b,c=0;
		
		//void sum=a^3+b^3+c^3
		int sum = 0;
		for(n=100;n<=999;n++) {
			a = n/100;
			b = (n-a*100)/10;
			c = (n-a*100-b*10);
			
			sum = a*a*a+b*b*b+c*c*c;
			if (sum  == n) {
				System.out.println(n);
			}
			
		}
		
		
	}

}
