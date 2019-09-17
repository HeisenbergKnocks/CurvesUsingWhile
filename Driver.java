import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Driver extends JPanel implements ActionListener, KeyListener {
	

	public void paint(Graphics g) {
		super.paintComponent(g);
		
		//declare and assign a counter variable
		//initialize it to 0
		
		
		/*int count = 0;
		double total = 0;
		while (count < 1000) {
			
			int x = (int) (Math.random()*750);
			int y = (int) (Math.random()*550);
			int d = (int) (Math.random()*50);
			
			int r = (int) (Math.random()*255);
			int gr = (int) (Math.random()*255);
			int b = (int) (Math.random()*255);
			
			Color rgb = new Color(r, gr, b);
			g.setColor(rgb);
			g.fillOval(x, y, d, d);	
			
			count++; //increment count so condition has chance to be false
			total = (d/2) * (d/2) * Math.PI;
		}
		
		t.stop();
		System.out.println(total);
		 */
		
		int x1 = 0, x2 = 800, y1 = 570, y2 = 800;

		while(y2 > 0) {
			g.drawLine(x1,  y1,  x2,  y2);
			y2 -= 20;
			x1 += 20;			
			
		}
	
		t.stop();
		
	}	
		
		
		
		
		
		
		
		
		
		
		
		
	// function (method) for updating variables
	public void update() {

		
		

	} // end of update function, do not accidentally delete this curly bracket

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		update();
		repaint();

	}

	public static void main(String[] arg) {
		Driver d = new Driver();
	}

	public Driver() {

		JFrame f = new JFrame();
		f.setTitle("Pong");
		f.setSize(800	, 600);
		f.setBackground(Color.BLACK);
		f.setResizable(false);
		
		f.addKeyListener(this);
		
		f.add(this);
		t = new Timer(17, this);
		t.start();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}

	Timer t;

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println(e.getKeyCode());
	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
