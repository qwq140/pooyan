package test2;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

// Elevator, Pooyan JLabel 합치기, 위 아래 이동 (범위 이동)
public class PooyanApp extends JFrame implements Initable{
	
	public PooyanApp pooyanApp = this;
	private static final String TAG ="PooyanApp : ";
	private JLabel laBackground;
	private Pooyan pooyan;
	private Elevator elevator;
	private Weapon weapon;
	
	public ArrayList<Weapon> wpList;
	
	public static void main(String[] args) {
		new PooyanApp();
	}

	public PooyanApp() {
		init();
		setting();
		batch();
		listener();
		
		setVisible(true);

	}
	
	@Override
	public void init() {
		laBackground = new JLabel(new ImageIcon("images/background.png"));
		pooyan = new Pooyan();
		elevator = new Elevator();
		
		
	}

	@Override
	public void setting() {
		setTitle("POOYAN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(930, 890);
		setLayout(null);
		setLocationRelativeTo(null);
		setContentPane(laBackground);
		
		
	}

	@Override
	public void batch() {
		elevator.add(pooyan);
		add(elevator);
	}

	@Override
	public void listener() {
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_UP) {
					elevator.moveUp();
				} else if(e.getKeyCode()==KeyEvent.VK_DOWN) {
					elevator.moveDown();
				} else if(e.getKeyCode()==KeyEvent.VK_SPACE) {
					weapon = new Weapon(elevator.x, elevator.y, pooyanApp);
					add(weapon);
				}
			}
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyCode() == KeyEvent.VK_UP) {
					elevator.isUp = false;
				}else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
					elevator.isDown = false;
				} 
			}
		});
		
	}
	
}
