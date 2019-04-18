package com.javalearning.chapter5;

/**
 * hobbies
 * @author yangguozhen
 *
 */
public class People2 {
	int speak(String name, String ...hobbies) {
		System.out.println("my name is"+name);
		int hobbiesNumber = 0;
		System.out.print("my hobbies are ");
		for(String hobby:hobbies) {
			System.out.print(hobby+" ");
			hobbiesNumber++;
		}
		return hobbiesNumber;
		
	}
	public static void main(String[] args) {
		People2 zhangsan = new People2();
		int n = zhangsan.speak("zhangsan", "swimming","basketball");
		System.out.println(n);
	}

}
