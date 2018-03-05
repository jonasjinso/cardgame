package View;

import java.awt.*;

import javax.swing.*;

public class Login extends JFrame {

	private Container c = getContentPane();
	private JPanel overview = new JPanel(new GridLayout(0, 1));
	private JLabel l = new JLabel("Rock-Hewn");
	
	private JPanel center = new JPanel(new GridLayout(0,1));
	private JPanel up = new JPanel();
	private JPanel down = new JPanel();
	private JLabel name = new JLabel("User: ");
	private JLabel passwort = new JLabel("Passwort: ");
	private JTextField Ntext = new JTextField();
	private JTextField Ptext = new JTextField();
	
	private JPanel button = new JPanel();
	private JButton regi = new JButton("Registrieren");
	private JButton login = new JButton("Login");
	
	public Login(){
		super("Rock-Hewn");
		setSize(600,600);
		
		l.setFont(new Font("Times New Roman", Font.BOLD,24));
		c.add(l, BorderLayout.NORTH);
		
		up.add(name);
		up.add(Ntext);
		
		down.add(passwort);
		down.add(Ptext);
		
		center.add(up);
		center.add(down);
		
		overview.add(center, BorderLayout.CENTER);
		
		button.add(regi);
		button.add(login);
		
		c.add(button, BorderLayout.SOUTH);
		
		c.add(overview);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
