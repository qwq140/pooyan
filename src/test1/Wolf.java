package test1;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Wolf extends JLabel{

	public Wolf wolf = this;
	public static final String TAG = "Wolf : ";
	
	public ImageIcon icWolfR;
	
	public int x=0;
	public int y=0;
	
	public boolean isRight = false; 
	
	public Wolf() {
		icWolfR = new ImageIcon("images/walkWolfR1.png");
		setIcon(icWolfR);
		setSize(100, 100);
		setLocation(this.x, this.y);
//		new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				move();
//			}
//		}).start();;
	}
	
//	public void move() {
//		moveRight();
//	}
//	
//	public void moveRight() {
//		setIcon(icWolfR);
//		isRight = true;
//		while(isRight) {
//			x++;
//			setLocation(x, y);
//			try {
//				Thread.sleep(10);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		isRight = false;
//	}
}
