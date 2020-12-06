package test2;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Pooyan extends JLabel{

	public Pooyan pooyan = this;
	public static final String TAG = "Pooyan : ";
	
	public ImageIcon icPooyan;
	
	public int x=-5;
	public int y=20;
	 
	
	public Pooyan() {
		icPooyan = new ImageIcon("images/attackBowPy.png");
		setIcon(icPooyan);
		setSize(90, 76);
		setLocation(this.x, this.y);

	}
}
