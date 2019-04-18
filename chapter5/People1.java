package com.javalearning.chapter5;

/**
 * method
 * @author yangguozhen
 *
 */
public class People1 {
	
	
//	void speak(){
//		System.out.println("我叫张三");
//		
//	}
//	
//	public static void main(String[] args) {
//		People1 zhangsan = new People1();
//		zhangsan.speak();
//		
//	}
	public void speak(String name) {
		System.out.println("我叫"+name);
	}
	
	public static void main(String[] args) {
		People1 zhangsan = new People1();
		zhangsan.speak("张三");
	}

	
	
}
