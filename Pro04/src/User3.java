/**
 * test static
 * @author Administrator
 *
 */
public class User3 {
	int id;
	String name;
	String pwd;
	static String company;
	
	static {
		System.out.println("exert the initial operation");
		company = "电子科技大学";
		printCompany();
	}
	public static void printCompany() {
		System.out.println(company);
	}
	public static void main(String[] args) {
		User3 u3 =null;
	}

}
