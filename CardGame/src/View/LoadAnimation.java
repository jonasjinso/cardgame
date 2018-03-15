package View;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.*;

public class LoadAnimation extends JPanel implements Runnable {
	private int breite;
	private int hoehe;

	private Image img;
	private int x = 1;

	public Dimension getPreferredSize(){
		return new Dimension(breite, hoehe);

	}

	public Dimension getMinimumSize(){
		return getPreferredSize();

	}

	public LoadAnimation(){
		Thread t1 = new Thread(this);
		t1.start();
		
		setBackground(Color.BLACK);
		
	}
	
	private int i = 0;
	private boolean b = false;

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		
		g.setColor(Color.WHITE);
		g.fillRect(300, 180, 800, 10);
		
		g.setColor(Color.WHITE);
		g.fillRect(300, 340, 800, 10);
		
		g.setColor(Color.WHITE);
		g.fillRect(1100, 180, 10, 170);
		
		//g.setColor(Color.RED);
		//g.fillRect(380, 200, 40, 130);
		
		
			g.setColor(Color.RED);
			g.fillRect(380, 200, 40+x, 130);
		
			
			x++;
		
		
		
		img = getToolkit().getImage("logoHearthstone_Rock_HEwn.png");
		
		AffineTransform at = AffineTransform.getTranslateInstance(100, 100);
		at.rotate(Math.toRadians(i++), img.getWidth(this)/2, img.getHeight(this)/2);
		
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(img, at, this);
		
		
		
		
		
	
	}
	
	

	@Override
	public void run() {
		while(x != 680){
			
			
				try {





					
					b = true;
					//repaint();





					Thread.sleep(10);
					repaint();




				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
		}
		
	}

	
}