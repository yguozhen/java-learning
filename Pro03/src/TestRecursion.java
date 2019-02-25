/**
 * Test Recursion
 * @author Administrator
 *
 */
public class TestRecursion {
	public static void main(String[] args) {
		long d1 = System.currentTimeMillis();
		System.out.printf("%d factorial result is %d\n",10,factorial(10));
		long d2 = System.currentTimeMillis();
		System.out.printf("factorial time is %s\n", d2-d1);
			
		
		factorialLoop(10);
	}
	static long factorial(int n){
		if (n ==1) {
			return 1;
		}else {
			return n*factorial(n-1);
		}
	}
	
	static long factorialLoop(int a) {
		long d3 = System.currentTimeMillis();
		long result =1;
		while(a>1) {
			result *= a * (a-1);
			a -= 2;
		}
		long d4 = System.currentTimeMillis();
		System.out.println(result);
		System.out.println("normal recycle time is %s\n");
		return result;
	}
	
	

}
