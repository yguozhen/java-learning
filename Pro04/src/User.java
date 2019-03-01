/**
 * test overload
 * @author Administrator
 *
 */


public class User {
	int id;
	String name;
	String pwr;
	
	public User(int id,String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public User(int id,String name, String pwr) {
		super();
		this.id = id;
		this.name = name;
		this.pwr = pwr;
	}
	
	
	public static void main(String[] args) {
		User a = new User(222,"ssss");
		User b = new User(5555,"dsafg","sdafa");
	}


}
