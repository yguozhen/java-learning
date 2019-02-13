import java.util.Scanner;
/**
 * test get scanner
 * @author Administrator
 *
 */
public class TestScanner {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("input name");
		String name = scanner.nextLine();
		System.out.println("input hobby");
		String favor = scanner.nextLine();	
		System.out.println("input age");
		int age = scanner.nextInt();
		
		System.out.println("############");
		System.out.println(name);
		System.out.println(favor);
		System.out.println(age);
	
	}

}
