package test3;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Ladder extends JLabel{

	public Ladder ladder = this;
	public static final String TAG = "Red : ";
	
	
	public int x;
	public int y;
	
	
	public Ladder(int x, int y) {
		this.x = x;
		this.y = y;
		setSize(80, 80);
		
		setLocation(this.x, this.y);
	}
}
