package test3;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Red extends JLabel{

	public Red red = this;
	public static final String TAG = "Red : ";
	
	
	public int x;
	public int y;
	
	
	public Red(int x, int y) {
		this.x = x;
		this.y = y;
		setSize(80, 80);
		setOpaque(true);
		setBackground(Color.RED);
		setLocation(this.x, this.y);
	}
}
