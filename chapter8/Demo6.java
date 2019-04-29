package com.javalearning.chapter8;

public class Demo6 {
	public static void main(String[] args) {
		
		String str = "aa  dgsag ewOO  dsa 2352 ";
		String newstr = str.trim();
		int chanum = 0;
		int spacenum = 0;
		int numnum = 0;
		
		//every element in the string
		for(int i = 0; i<newstr.length();i++) {
			char a = newstr.charAt(i);
			
			if((a>='a'&& a <= 'z')||(a >= 'A' && a <= 'Z')) {
				chanum++;
			}else if(a == ' ') {
				spacenum++;
			}else if(a >='0'&& a <= '9') {
				numnum++;
			}
			
			
			
		}
		System.out.println("chanum = "+chanum);
		System.out.println("spacenum = "+spacenum);
		System.out.println("numnum = "+numnum);
		
	}

}
