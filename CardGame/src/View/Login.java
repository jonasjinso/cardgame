package View;

import java.awt.*;
import java.awt.geom.FlatteningPathIterator;

import javax.swing.*;

public class Login extends JFrame {

	private Container c = getContentPane();
	private JPanel overview = new JPanel(new GridLayout(0, 1));
	private JPanel mitte = new JPanel();
	private ImageIcon img = new ImageIcon("logoHearthstone_Rock_HEwn.png");
	private JLabel l = new JLabel();
	
	private JPanel all = new JPanel();
	private JPanel center = new JPanel(new GridLayout(0,1));
	private JPanel left = new JPanel(new GridLayout(0,1));
	private JPanel right = new JPanel(new GridLayout(0,1));
	private JLabel name = new JLabel("User: ");
	private JLabel passwort = new JLabel("Passwort: ");
	private JTextField Ntext = new JTextField(20);
	private JTextField Ptext = new JTextField(20);
	
	private JPanel button = new JPanel();
	private JButton regi = new JButton("Registrieren");
	private JButton login = new JButton("Login");
	
	public Login(){
		super("Rock-Hewn-Login");
		setSize(350,500);
		setLocation(800,300);
		
		//all.setBackground(Color.BLACK);
		//right.setBackground(Color.BLACK);
		//left.setBackground(Color.BLACK);
		
		//l.setFont(new Font("Times New Roman", Font.BOLD,24));
		img.setImage(img.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH));
		l.setIcon(img);
		mitte.add(l);
		overview.add(mitte);
		
		left.add(name);
		left.add(Ntext);
		
		right.add(passwort);
		right.add(Ptext);
		
		center.add(left);
		center.add(right);
		
		all.add(center, BorderLayout.CENTER);
		
		overview.add(all, BorderLayout.CENTER);
		
		button.add(regi);
		button.add(login);
		
		overview.add(button, BorderLayout.SOUTH);
		
		c.add(overview);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(false);
	}
	
}
