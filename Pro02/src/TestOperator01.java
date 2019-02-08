/**
 * test operator
 * @author Administrator
 *
 */
public class TestOperator01 {
	public static void main(String[] args) {

/*		
		byte a = 1;
		int b = 2;
		long b2 = 3;
		//byte c = a + b;error
		//int c2 = b2 + b;error
		
		float f1 = 3.14f;
		float d = b + b2;
		
		//float d2 = f1 + 6.2;error
		
		System.out.println(-9%5);//the symbol of result follow in the -9
*/		
		// test ++ and -- 
		
		/*
		int a = 3;
		int b = a ++;
		System.out.println("a="+a+"\nb="+b);
		a = 3;
		b = ++ a;
		System.out.println("a="+a+"\nc="+b);
		*/
		
		int a = 3;
		int b = 4;
		a += b;
		System.out.println("a+"+a+"\nb="+b);
		a = 3;
		a *= b + 3;
		System.out.println("a="+a+"\nb="+b);
		
		
	}

}
