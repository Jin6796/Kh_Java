package swing.template;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutApp_1 extends JFrame{
	JButton btn_north  = new JButton("북쪽"); 
	JButton btn_south  = new JButton("남쪽"); 
	JButton btn_east   = new JButton("동쪽"); 
	JButton btn_west   = new JButton("서쪽"); 
	JButton btn_center = new JButton("중앙"); 
	public void initDisplay() {
		this.add("North",btn_north);
		this.add("South",btn_south);
		this.add("East",btn_east);
		this.add("West",btn_west);
		this.add("Center",btn_center);
		this.setSize(500, 500);
		this.setVisible(true);
	}	
	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		BorderLayoutApp_1 bv = new BorderLayoutApp_1();
		bv.initDisplay();
	}
}