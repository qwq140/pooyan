package test1;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Wolf extends JLabel{

	public Wolf blue = this;
	public static final String TAG = "Blue : ";
	
	
	public int x;
	public int y;
	
	public boolean isRight = false; 
	
	public Wolf(int x, int y) {
		this.x = x;
		this.y = y;
		setSize(70, 70);
		setOpaque(true);
		setBackground(Color.BLUE);
		setLocation(this.x, this.y);
	}
}
