import javax.swing.JFrame;
import java.awt.Graphics2D;
import java.awt.Graphics;

public class Window {
	
	public static void start() {
		
		JFrame frame = new JFrame();
		
		frame.setBounds(100, 100, Constants.window_width, Constants.window_height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
	
	public void paint (Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
			
		//g2.draw3DRect(0, 0, 100, 100, true);
			
	}	
}
