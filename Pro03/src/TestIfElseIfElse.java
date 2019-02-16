/**
 * Test if else if else
 * @author Administrator
 *
 */
public class TestIfElseIfElse {
	public static void main(String[] args) {
		int age = (int)(100*Math.random());
		System.out.println("age: "+age+",belong to");
		if(age <= 15) {
			System.out.println("kid native character ");
		}else if(age <= 25) {
			System.out.println("adolescent need more learning");
		}else if(age <= 45) {
			System.out.println("middle age nees more work");
		}else if(age <= 65) {
			System.out.println("middle and old age people");
		}else {
			System.out.println("wow, you are excellent");
			
			
		}
	}

}
