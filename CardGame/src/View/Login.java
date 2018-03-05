package View;

import java.awt.*;
import java.awt.geom.FlatteningPathIterator;

import javax.swing.*;

public class Login extends JFrame {

	private Container c = getContentPane();
	private JPanel overview = new JPanel(new GridLayout(0, 1));
	private JPanel mitte = new JPanel();
	private ImageIcon img = new ImageIcon("logoHearthstone_Rock_HEwn.pdf");
	private JLabel l = new JLabel("Rock-Hewn");
	
	private JPanel center = new JPanel(new GridLayout(0,1));
	private JPanel align = new JPanel(new FlowLayout(FlowLayout.LEFT));
	private JPanel left = new JPanel(new GridLayout(0, 1));
	private JPanel right = new JPanel(new GridLayout(0, 1));
	private JLabel name = new JLabel("User: ");
	private JLabel passwort = new JLabel("Passwort: ");
	private JTextField Ntext = new JTextField(20);
	private JTextField Ptext = new JTextField(20);
	
	private JPanel button = new JPanel();
	private JButton regi = new JButton("Registrieren");
	private JButton login = new JButton("Login");
	
	public Login(){
		super("Rock-Hewn-Login");
		setSize(250,400);
		setLocation(800,300);
		
		l.setFont(new Font("Times New Roman", Font.BOLD,24));
		mitte.add(l);
		overview.add(mitte);
		
		left.add(name);
		left.add(passwort);
		
		right.add(Ntext);
		right.add(Ptext);
		
		align.add(left);
		align.add(right);
		
		center.add(align, BorderLayout.CENTER);
		
		overview.add(center, BorderLayout.CENTER);
		
		button.add(regi);
		button.add(login);
		
		overview.add(button, BorderLayout.SOUTH);
		
		c.add(overview);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(false);
	}
	
}
