package test1;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Red extends JLabel{

	public Red red = this;
	public static final String TAG = "Red : ";
	
	
	public int x;
	public int y;
	
	public boolean isRight = false; 
	
	public Red(int x, int y) {
		this.x = x;
		this.y = y;
		setSize(70, 70);
		setOpaque(true);
		setBackground(Color.RED);
		setLocation(this.x, this.y);
	}
}
