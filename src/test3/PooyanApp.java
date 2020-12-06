package test3;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

//Wolf Down, Right, Up ¸¸µé±â
public class PooyanApp extends JFrame implements Initable {

	private PooyanApp pooyanApp = this;
	private static final String TAG = "PooyanApp : ";
	private JLabel laBackground;

	private Wolf wolf;
	private Vector<Wolf> wolves;

	private int num = 0;

	public static int floor = 0;

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
		wolves = new Vector<>();
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 3; i++) {
					try {
						Thread.sleep(1000);
						wolves.add(new Wolf(i*100));
						add(wolves.get(i));
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		
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
//		new Thread(new Runnable() {
//			@Override
//			public void run() {
//				for (int i = 0; i < wolves.size(); i++) {
//					try {
//						Thread.sleep(1000);
//						System.out.println(i);
//						add(wolves.get(i));
//					} catch (InterruptedException e) {
//						e.printStackTrace();
//					}
//				}
//			}
//		}).start();
	}
	@Override
	public void listener() {

	}
}
