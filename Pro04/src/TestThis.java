/**
 * test this
 * @author Administrator
 *
 */
public class TestThis {
	int a,b,c;
	
	public TestThis(int a,int b) {
		this.a = a;
		this.b = b;
	}
	public TestThis(int a,int b,int c) {
		this(a,b);
		this.c = c;
	}
	void sing() {
		
	}
	void eat() {
		this.sing();
		System.out.println("your mom told you coming home to eat food!!");
	}
	public static void main(String[] args) {
		TestThis hi = new TestThis(3,4);
		hi.eat();
	}

}
