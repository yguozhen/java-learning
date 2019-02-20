/**
 * test for nesting
 * @author Administrator
 *
 */
public class TestForNest {
	public static void main(String[] args) {
		
		/*5*5
		 * 
		 * for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(i+"\t");
			}
			System.out.println();
			
		}
		*/
		
		
		/*test 9*9
		int sum = 0;
		for(int i=1;i<10;i++) {
			for(int j=1;j<=i;j++) {
				
				System.out.print(i+"*"+j+"="+(i*j)+"\t");
			}
			System.out.println();
		}*/
		
		int sum = 0;
		int a =0;
		while(a <= 100) {
			if(a%2 == 0) {
				sum = sum+a;
				
			}
			a++;
		}
		System.out.println(sum);
		
	int j =0;	
	for(int i =0;i<=1000;i++) {
		if(i%5 == 0) {
			System.out.print(i+"\t");
			j++;
			if(j == 5) {
				j=0;
				System.out.println();
			}
		}
	}
		
		
	}

}
