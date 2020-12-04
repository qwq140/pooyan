package test1;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test1 extends JFrame implements Initable{
	
	private Test1 test1 = this;
	private static final String TAG ="test1 : ";
	private JLabel laBackground;
	private Red player;
	private Vector<Blue> vcB;
	
	public static void main(String[] args) {
		new Test1();
	}

	public Test1() {
		init();
		setting();
		batch();
		listener();
		
		setVisible(true);

	}
	
	@Override
	public void init() {
		laBackground = new JLabel(new ImageIcon("images/background.png"));
		vcB = new Vector<>();
		
		vcB.add(new Blue(80,0));
		vcB.add(new Blue(300,0));
		vcB.add(new Blue(500,0));
		vcB.add(new Blue(80,100));
		vcB.add(new Blue(400,150));
		vcB.add(new Blue(150,600));
		vcB.add(new Blue(400,500));
		
		player = new Red(750,400);
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
		for (int i = 0; i < vcB.size(); i++) {
			add(vcB.get(i));
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
	
	public void reset() {
		for (int i = 0; i < vcB.size(); i++) {
//			vcB.get(i).setVisible(false);
			remove(vcB.get(i));
		}
		vcB.clear();
//		System.out.println(vcB.size());
		remove(player);
//		revalidate();
		repaint();
		
//		player.setVisible(false);
	}
	
}
