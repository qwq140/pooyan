package test1;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Player extends JLabel{

	public Player red = this;
	public static final String TAG = "Red : ";
	
	
	public int x;
	public int y;
	
	public boolean isRight = false; 
	
	public Player(int x, int y) {
		this.x = x;
		this.y = y;
		setSize(70, 70);
		setOpaque(true);
		setBackground(Color.RED);
		setLocation(this.x, this.y);
	}
}
