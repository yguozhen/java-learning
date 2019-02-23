/**
 * test method
 * @author Administrator
 *
 */
public class TestMethod {
	public static void main(String[] args) {
		TestMethod tm = new TestMethod();
		tm.printSss();
		int c =tm.add(20, 30, 60);
		System.out.println(c);
		
	}
	void printSss() {
		System.out.println("ahhahhaha");
		System.out.println("lllll");
	}
	int add(int a,int b,int c) {
		int sum =a+b+c;
		System.out.println(sum);
		return sum;
	}

}
