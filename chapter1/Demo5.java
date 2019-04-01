package com.javalearning;

public class Demo5 {
	public static void main(String[] args) {
		//自动类型转换
		short s=1;
		int i ;
		//自动类型转换 short 转换到 int
		 i = s;
		 System.out.println("i = "+s);
		 
		 //强制类型转换
		 double d = 1.3333232;
		 float f;
		 //double 转换为内存更小的float类型
		 f = (float)d;
		 System.out.println("f = "+f);
	}

}
