/**
 * test break sentence
 * @author Administrator
 *
 */
public class TestBreak {
	public static void main(String[] args) {
		int count = 0;
		while (true) {
			int i = (int)(100*Math.random());
			if(i == 88) break;
			count ++;
		}
		System.out.println(count);
	}

}
