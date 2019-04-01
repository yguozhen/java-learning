package com.javalearning;

public class Demo2 {
	public static void main(String[] args) {
		
		//小数默认是double，加一个f
		float f = 1.1f;
		
		//快捷键 option+/  syso
		System.out.println(f);
		
		//获取float的最大值
		//command+tap 查看详细
		float maxF = Float.MAX_VALUE;
		System.out.println(maxF);
		
		//获取double的最大值和最小值
		double maxD= Double.MAX_VALUE;
		double minD = Double.MIN_VALUE;
		System.out.println(maxD+"\n"+minD);
		
	}

}
