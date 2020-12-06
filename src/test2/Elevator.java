package test2;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.Timer;

public class Elevator extends JLabel{

	public Elevator elevator = this;
	
	public ImageIcon icElevator;
	
	public boolean isUp = false;
	public boolean isDown = false;
	
	public int yMax=589;
	
	public int x=732;
	public int y=130;
	
	public Elevator() {
		icElevator = new ImageIcon("images/elevator.png");
		setIcon(icElevator);
		setSize(110, 100);
		setLocation(this.x, this.y);
		setHorizontalAlignment(JLabel.CENTER);

	}
	
	public void moveDown() {
		if(isDown==false) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					isDown=true;
					while(isDown) {
						y++;
						System.out.println("y°ª : " +y);
						if(y>589) {
							y=589;
						}
						setLocation(x, y);
						try {
							Thread.sleep(5);
						} catch (Exception e) {
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
						if(y<130) {
							y=130;
						}
						setLocation(x, y);
						try {
							Thread.sleep(5);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}
			}).start();;
		}
	}
}
