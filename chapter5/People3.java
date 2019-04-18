package com.javalearning.chapter5;

class SanWei{
	int b;
	int w;
	int h;
}

public class People3 {
	void speak(int age, SanWei sanWei) {
		System.out.println("my age is "+age+sanWei.b+sanWei.h+sanWei.w);
	}
	
	public static void main(String[] args) {
		People3 xiaoli = new People3();
		
		SanWei sanWei = new SanWei();
		sanWei.b = 90;
		sanWei.h = 60;
		sanWei.w = 90;
		xiaoli.speak(24, sanWei);
	}

}
 