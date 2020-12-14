package test1;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;


//초기화 함수 만들기
public class test1 extends JFrame implements Initable{
	
	public test1 pooyanApp = this;
	private static final String TAG ="test1 : ";
	private JLabel laBackground;
	private Player player;
	private Vector<Wolf> wolves;
	
	public static void main(String[] args) {
		new test1();
	}

	public test1() {
		init();
		setting();
		batch();
		listener();
		
		setVisible(true);

	}
	
	@Override
	public void init() {
		laBackground = new JLabel(new ImageIcon("images/background.png"));
		wolves = new Vector<>();
		
		wolves.add(new Wolf(80,0));
		wolves.add(new Wolf(300,0));
		wolves.add(new Wolf(500,0));
		wolves.add(new Wolf(80,100));
		wolves.add(new Wolf(400,150));
		wolves.add(new Wolf(150,600));
		wolves.add(new Wolf(400,500));
		wolves.add(new Wolf(200,450));
		
		player = new Player(750,400);
	}

	@Override
	public void setting() {
		setTitle("POOYAN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(930, 850);
		setLayout(null);
		setLocationRelativeTo(null);
		setContentPane(laBackground);
	}

	@Override
	public void batch() {
		for (int i = 0; i < wolves.size(); i++) {
			add(wolves.get(i));
		}
		add(player);
	}

	@Override
	public void listener() {

		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_SPACE) {
					reset();
				}
			}
		});
	}
	
	// 리셋 함수
	public void reset() {
		for (int i = 0; i < wolves.size(); i++) {
//			vcB.get(i).setVisible(false);
			remove(wolves.get(i));
		}
		wolves.clear();
		remove(player);
		repaint();
		
//		player.setVisible(false);
	}
	
}
