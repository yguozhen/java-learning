/**
 * test transform number
 * @author Administrator
 *
 */
public class User4 {
	int id;
	String name;
	String pwd;
	
	public User4(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public void testParameterTransfer01(User4 u) {
		u.name = "¸ßÐ¡°Ë";
	}
	public void testParameterTransfer02(User4 u) {
		u = new User4(200,"gaosan");
	}
	public static void main(String[] args) {
		User4 u1 = new User4(100,"777777777");
		u1.testParameterTransfer01(u1);
		System.out.println(u1.name);
		
		u1.testParameterTransfer02(u1);
		System.out.println(u1.name);
		
	}

}
