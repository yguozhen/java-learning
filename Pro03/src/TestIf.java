/**
 * Test the if 
 * @author Administrator
 *
 */
public class TestIf {
	public static void main(String[] args) {
		double d = Math.random();
		System.out.println(d);
		
		int h = (int)(6 * Math.random()+1);
		System.out.println(h);
		if(h <= 3) {
			System.out.println("С");
			System.out.println("ССС");
			
		}
		
		
		System.out.println("###############");
		//throwing a dice to test today's luck
		int i = (int)(6*Math.random()+1);
		int j = (int)(6*Math.random()+1);
		int k = (int)(6*Math.random()+1);
		int count = i+j+k;
		//if sum is bigger than 15 then it is great
		if(count > 15) {
			System.out.println("great");
		}
		if(count >= 10 & count <= 15) {
			System.out.println("normal");
		}
		if(count < 10) {
			System.out.println("not good");
			
		}
	}

}
