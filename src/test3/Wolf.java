package test3;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import test2.Pooyan;

public class Wolf extends JLabel {

	public Wolf wolf = this;
	private static final String TAG = "Wolf : ";

	private PooyanApp pooyanApp;
	
	public ImageIcon icWolfMint;
	public ImageIcon icWolfWalkR1;
	public ImageIcon icWolfWalkR2;
	public ImageIcon icWolfWalkR3;
	public ImageIcon icWolfUpL;
	public ImageIcon icWolfUpR;

	public int x; // 오른쪽 끝 800 // 사다리 x : 807
	public int y = 0; // 바닥 710;
	public int floor = 0;
	
	public boolean isDown = false;
	public boolean isRight = false;
	public boolean isUp = false;

	public Wolf(int x) {
		this.x=x;
		
		icWolfMint = new ImageIcon("images/wolfMint4.png");
		icWolfWalkR1 = new ImageIcon("images/walkWolfR1.png");
		icWolfWalkR2 = new ImageIcon("images/walkWolfR2.png");
		icWolfWalkR3 = new ImageIcon("images/walkWolfR3.png");

		icWolfUpL = new ImageIcon("images/attackStayWolfL.png");
		icWolfUpR = new ImageIcon("images/attackStayWolfR.png");
		setIcon(icWolfMint);
		setSize(88,135);
		setLocation(this.x, this.y);
		Ai();
	}

	public void Ai() {
		new Thread(new Runnable() {
			public void run() {
				moveDown();
				moveRight();
				moveUp();
			}
		}).start();
	}

	public void moveDown() {
		if (isDown == false) {
			setIcon(icWolfMint);
			setSize(88, 135);
			isDown = true;
			while (isDown) {
				y++;
				setLocation(x, y);
				if (y > 710) {
					y = 710;
					isDown = false;
					break;
				}
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void moveRight() {
		if (isRight == false) {
			if (y == 710) {
				setIcon(icWolfWalkR1);
				setSize(100, 100);
				y = y + 40;
				isRight = true;
				while (isRight) {
					x++;
					setLocation(x, y);
					if (x > 800) {
						x = 800;
						isRight = false;
						break;
					}
					try {
						Thread.sleep(5);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	public void moveUp() {
		if(isUp==false) {
			if(x==800) {
				boolean upMotion = false;
				setIcon(icWolfUpL);
				setSize(80, 79);
				x=x+10;
				pooyanApp.floor=pooyanApp.floor+1;
				floor = pooyanApp.floor;
				System.out.println(pooyanApp.floor);
				if(floor == 1) {
					y=710;
				}
				if(floor == 2) {
					y=590;
				}
				if(floor == 3) {
					y=470;
				}
				if(floor == 4) {
					y=350;
				}
				isUp=true;
				while(isUp) {
					y=y-5;
					setLocation(x, y);
					if(floor == 1 && y<629) {
						y=629;
						isUp = false;
						break;
					}
					if(floor == 2 && y<509) {
						y=509;
						isUp = false;
						break;
					}
					if(floor == 3 && y<389) {
						y=389;
						isUp = false;
						break;
					}
					if(floor == 4 && y<279) {
						y=279;
						isUp = false;
						break;
					}
					if(upMotion==false) {
						setIcon(icWolfUpL);
						upMotion = true;
					} else {
						setIcon(icWolfUpR);
						upMotion = false;
					}
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}
