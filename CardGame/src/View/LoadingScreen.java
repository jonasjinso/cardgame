package View;

import java.awt.*;

import javax.swing.*;

public class LoadingScreen extends JFrame{
	
	private Container c = getContentPane();
	private LoadAnimation la = new LoadAnimation();
	
	public LoadingScreen(){
		super("LoadingScreen");
		setSize(1200,700);
		
		c.add(la, BorderLayout.CENTER);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}