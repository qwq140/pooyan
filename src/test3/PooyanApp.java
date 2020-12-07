package test3;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

//Wolf Down, Right, Up 虜菟晦
public class PooyanApp extends JFrame implements Initable {

	public PooyanApp pooyanApp = this;
	private static final String TAG = "PooyanApp : ";
	private JLabel laBackground;
	
	public Ladder ladder;
	
	private Wolf wolf;
	public Vector<Wolf> wolves;
	public Vector<Ladder> ladderFloor; 

	public int floor = 0;

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
		ladderFloor = new Vector<>();
		
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 3; i++) {
					try {
						Thread.sleep(1000);
						wolves.add(new Wolf(i*100, pooyanApp));
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
		ladderFloor.add(new Ladder(810,629)); // 1類
		ladderFloor.add(new Ladder(810,509)); // 2類
		ladderFloor.add(new Ladder(810,389)); // 3類
		ladderFloor.add(new Ladder(810,269)); // 4類
		for (int i = 0; i < ladderFloor.size(); i++) {
			add(ladderFloor.get(i));
		}
	}
	@Override
	public void listener() {

	}
}
