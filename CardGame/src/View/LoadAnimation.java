package View;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

import javax.swing.*;

public class LoadAnimation extends JPanel implements Runnable {
	private int breite;
	private int hoehe;

	private Image img;

	public Dimension getPreferredSize(){
		return new Dimension(breite, hoehe);

	}

	public Dimension getMinimumSize(){
		return getPreferredSize();

	}

	public LoadAnimation(){
		

	}
	
	private int i = 0;

	public void paintComponent(Graphics g){
		super.paintComponent(g);

		/*//img.setImage(img.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
		BufferedImage bi = new BufferedImage(img.getIconWidth(), img.getIconHeight()
				, BufferedImage.TYPE_INT_ARGB);
		
		AffineTransform at = AffineTransform.getTranslateInstance(100, 100);
		at.rotate(Math.toRadians(i++), img.getIconWidth()/2, img.getIconHeight()/2);
		
		Graphics2D g2d = (Graphics2D) g;
		
		g2d.drawImage(bi, at, null);*/
		
		img = getToolkit().getImage("logoHearthstone_Rock_HEwn.png");
		
		AffineTransform at = AffineTransform.getTranslateInstance(100, 100);
		at.rotate(Math.toRadians(i++), 100,100);
		
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(img, at, this);
		
		repaint();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

	
}
