package View;

import java.awt.*;

import javax.swing.*;

public class Launcher extends JFrame{

	private Container c = getContentPane();
	private GridBagLayout gbl = new GridBagLayout();
	private GridBagConstraints gbc = new GridBagConstraints();

	private JMenuBar mb = new JMenuBar();
	private JMenu friend;
	private JMenu games;
	private JMenu chat;
	
	

	private JPanel p = new JPanel();

	private JList gamelist = new JList();
	private JScrollPane sc0 = new JScrollPane(gamelist);
	
	private ButtonGroup bg = new ButtonGroup();
	
	private ImageIcon img = new ImageIcon("logoHearthstone_Rock_HEwn.png");
	private JToggleButton tb = new JToggleButton();
	
	private ImageIcon img1 = new ImageIcon("Test.png");
	private JToggleButton tb1 = new JToggleButton();
	
	
	private ImageIcon gamelogo = new ImageIcon("RH_NAME.png");
	private JLabel gamename = new JLabel();
	private JPanel logo = new JPanel();

	private JButton play = new JButton("Spielen");
	private JPanel go = new JPanel();
	
	private JTextArea text = new JTextArea("HELLO,"+"\n"+"Welcome to Rock-Hewn."+"\n"+"CARDGAME!!!!!!!!!!!!!!!!!!!!!");
	private JPanel fortext = new JPanel();
	
	public Launcher(){
		super("Rock-Hewn-Launcher");
		setSize(1200,700);
		
		mb.add(Box.createRigidArea(new Dimension(0,50)));
		
		games = new JMenu("Games");
		mb.add(games);
		chat = new JMenu("Chat");
		mb.add(chat);
		
		//Align-Right
		mb.add(Box.createHorizontalGlue());
		
		friend = new JMenu("Friends");
		mb.add(friend);
		
		c.add(mb, BorderLayout.NORTH);
		
		
		bg.add(tb);
		bg.add(tb1);


		p.setLayout(gbl);

		gbc.anchor = GridBagConstraints.WEST;
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbl.setConstraints(tb, gbc);
		img.setImage(img.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		tb.setIcon(img);
		p.add(tb);
		
		gbc.anchor = GridBagConstraints.WEST;
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbl.setConstraints(tb1, gbc);
		img1.setImage(img1.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));
		tb1.setIcon(img1);
		p.add(tb1);
		
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbl.setConstraints(gamename, gbc);
		gamelogo.setImage(gamelogo.getImage().getScaledInstance(656, 164, Image.SCALE_SMOOTH));
		gamename.setIcon(gamelogo);
		logo.add(gamename);
		p.add(logo);
		
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbl.setConstraints(text, gbc);
		text.setOpaque(false);
		fortext.add(text);
		p.add(text);
		
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 2;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbl.setConstraints(go, gbc);
		play.setPreferredSize(new Dimension(200,100));
		go.add(play);
		
		p.add(go);

		c.add(p, BorderLayout.CENTER);



		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
