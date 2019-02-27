/**
 * test constructor
 * @author Administrator
 *
 */
class Point{
	double x,y;
	
	public Point(double x1,double y1) {
		x = x1;
		y = y1;
	}
	public double getDistance(Point p) {
		return Math.sqrt((x-p.x)*(x-p.x)+(y-p.y)*(y-p.y));
	}
}




public class TestConstructor {
	public static void main(String[] args) {
		Point a =new Point(3.0,4.0);
		Point origin = new Point(0.0,0.0);
		
		System.out.println(a.getDistance(origin));
		
	}

}
