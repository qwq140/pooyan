package test2;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Pooyan extends JLabel{

	public Pooyan pooyan = this;
	public static final String TAG = "Pooyan : ";
	
	public ImageIcon icPooyan;
	
	public int x=0;
	public int y=0;
	 
	
	public Pooyan() {
		icPooyan = new ImageIcon("images/attackBowPy.png");
		setIcon(icPooyan);
		setSize(200, 200);
		setLocation(this.x, this.y);

	}
}
