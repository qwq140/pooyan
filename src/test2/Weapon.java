package test2;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Weapon extends JLabel{

	public Weapon weapon = this;
	public Elevator elevator;
	public PooyanApp pooyanApp;
	public static final String TAG = "Pooyan : ";
	
	public ImageIcon icBow;
	
	public int x;
	public int y;
	public boolean isAttack = false; 
	
	public Weapon(int x, int y, PooyanApp pooyanApp) {
		this.x=x-40;
		this.y=y+40;
		this.pooyanApp = pooyanApp;
		icBow = new ImageIcon("images/Bow.png");
		setIcon(icBow);
		setSize(150, 66);
		setLocation(this.x, this.y);
		new Thread(new Runnable() {
			@Override
			public void run() {
				moveBow();
				
			}
		}).start();
		
	}
	
	public void moveBow() {
		isAttack = true;
		while(isAttack) {
			x--;
			setLocation(x,y);
			if(x<0) {
				pooyanApp.remove(this);
				pooyanApp.repaint();
			}
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
