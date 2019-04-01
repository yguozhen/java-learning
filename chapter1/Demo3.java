package com.javalearning;

public class Demo3 {
	public static void main(String[] args) {
		//定义单个字符
		char a ='A';
		System.out.println("a:"+a);
		
		//定义一个转义字符
		char a2 = '\\';
		System.out.println("a2="+a2);
		
		//unicode转中文
		char a3 = '\u6768';
		char a4 = '\u56fd';
		char a5 = '\u9707';
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
	}

}
