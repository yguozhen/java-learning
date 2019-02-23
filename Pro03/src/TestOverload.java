/**
 * test overload
 * @author Administrator
 *
 */
public class TestOverload {
	public static void main(String[] args) {
		System.out.println(add(5,8,6));
		System.out.println(add(5,8));
		System.out.println(add(5.0,8));
		System.out.println(add(2,8.6));
	}
	
	//sum
	public static int add(int n1,int n2) {
		int sum = n1+n2;
		return sum;
	}
	
	//overload
	public static int add(int n1,int n2,int n3) {
		int sum = n1+n2+n3;
		return sum;
	}
	
	//overload
	public static double add(double n1, int n2) {
		double sum = n1+n2;
		return sum;
	}
	
	public static double add(int n1,double n2) {
		double sum = n1+n2;
		return sum;
	}

}
