/**
 * test the class and the object
 * @author Administrator
 *
 */
public class ScStu {
	int id;
	String name;
	int age;
	
	
	void study() {
		System.out.println("i am studying java!!");
		
	}
	
	void play() {
		System.out.println("i am playing lol");
	}
	
	public static void main(String[] args) {
		ScStu stu = new ScStu();
		stu.play();
		stu.study();
	}

}
