package View;

import java.awt.*;

import javax.swing.*;

public class SearchGame extends JFrame{

	private Container c = getContentPane();
	private ImageIcon img = new ImageIcon("RH_NAME.png");
	private JLabel logo = new JLabel();
	private JPanel p = new JPanel();
	private JButton ss = new JButton("Spiel Suchen");
	private JButton exit = new JButton("Exit");
	private JPanel b = new JPanel();
	private JPanel b1 = new JPanel();
	private JPanel all = new JPanel(new GridLayout(0,1));
	
	public SearchGame(){
		super("Search Game");
		setSize(500, 400);
		
		img.setImage(img.getImage().getScaledInstance(300, 100, Image.SCALE_SMOOTH));
		logo.setIcon(img);
		p.add(logo);
		all.add(p);
		
		ss.setPreferredSize(new Dimension(200,100));
		exit.setPreferredSize(new Dimension(200,100));
		
		b.add(ss);
		b1.add(exit);
		all.add(b);
		all.add(b1);
		
		c.add(all, BorderLayout.CENTER);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	
}
