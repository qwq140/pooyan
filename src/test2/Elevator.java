package test2;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Elevator extends JLabel{

	public Elevator elevator = this;
	
	public ImageIcon icElevator;
	
	public boolean isUp = false;
	public boolean isDown = false;
	
	public int x=650;
	public int y=500;
	
	public Elevator() {
		icElevator = new ImageIcon("images/elevator.png");
		setIcon(icElevator);
		setSize(200, 260);
		setLocation(this.x, this.y);

	}
	
	public void moveDown() {
		if(isDown==false) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					isDown=true;
					while(isDown) {
						y++;
						setLocation(x, y);
						try {
							Thread.sleep(5);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}).start();;
		}
	}
	
	public void moveUp() {
		if(isUp==false) {
			new Thread(new Runnable() {
				
				@Override
				public void run() {
					isUp=true;
					while(isUp) {
						y--;
						setLocation(x, y);
						try {
							Thread.sleep(5);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			}).start();;
		}
	}
}
