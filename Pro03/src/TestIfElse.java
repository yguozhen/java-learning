/**
 * test if else
 * @author Administrator
 *
 */
public class TestIfElse {
	public static void main(String[] args) {
		int h = (int)(6*Math.random()+1);
		System.out.println(h);
		if(h <= 3) {
			System.out.println("small");
		}else {
			System.out.println("big");
		}
		
		System.out.println("##############");
		//produce random number in[0.0 4.0), compute area and perimeter
		double r = 4* Math.random();
		//Math.pow(r,2) r^2
		double area = Math.PI*Math.pow(r, 2);
		double circle = 2*Math.PI*r;
		System.out.println("radius is "+r);
		System.out.println("area is "+ area);
		System.out.println("perimeter is "+ circle);
		
		if(area >= circle) {
			System.out.println("area is bigger than perimeter");
		}
		else {
			System.out.println("area is smaller than perimeter");
		}
		
		
	}

}
