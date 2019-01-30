
import java.awt.*;
import javax.swing.*;


public class BallGame extends JFrame{
	
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image table = Toolkit.getDefaultToolkit().getImage("images/table.jpg");
	
	double x = 100;//ball in x-axis
	double y = 100;//ball in y-axis
	boolean right = true;//right is true
	
	//the method of painting window
	public void paint(Graphics g) {
		System.out.println("paint one time");
		g.drawImage(table, 0, 0, null);
		g.drawImage(ball, (int)x, (int)y, null);
		
		
		if(right) {
			x = x + 10;	
		}
		else {
			x = x - 10;
		}
		if(x > 856-40-30) {
			right = false;
		}
		if(x < 40) {
			right = true;
		}
		
		
		
	}
	
	//loading window
	void launchFrame() {
		setSize(856,500);
		setLocation(50,50);
		setVisible(true);
	
		//repaint window, 25times per second
		while(true) {
			repaint();
			try {
				Thread.sleep(40);
			}catch(Exception e) {
				e.printStackTrace();
			}
			 
			
		}
	}
	
	
		//main method is entrance of possessing program.
	public static void main (String[] args) {
		System.out.println("the first coding of table game.");
		BallGame game = new BallGame();
		game.launchFrame();
			
	}
}
