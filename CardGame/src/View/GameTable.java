package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;

import javax.swing.*;

public class GameTable extends JFrame {

	private Container c = getContentPane();
	private GridBagLayout gbl = new GridBagLayout();
	private GridBagConstraints gbc = new GridBagConstraints();

	private JPanel p = new JPanel();

	private JToggleButton[] hand = new JToggleButton[10];
	private JPanel[] phand = new JPanel[10];
	private ButtonGroup bh = new ButtonGroup();

	private JToggleButton[] enemy = new JToggleButton[10];
	private JPanel[] penemy = new JPanel[10];
	private ButtonGroup be = new ButtonGroup();

	private JToggleButton[] fieldY = new JToggleButton[6];
	private JPanel[] pfieldY = new JPanel[7];
	private ButtonGroup bfy = new ButtonGroup();

	private JToggleButton[] fieldE = new JToggleButton[6];
	private JPanel[] pfieldE = new JPanel[7];
	private ButtonGroup bfe = new ButtonGroup();

	private JButton endTurn = new JButton("Turn End");
	private JPanel bendTurn = new JPanel();
	
	private JLabel yCards = new JLabel();
	private JLabel eCards = new JLabel();


	public GameTable(){
		super("Rock-Hewn");
		setSize(1920,1080);

		p.setLayout(gbl);

		for(int i = 0; i < enemy.length; i++){
			enemy[i] = new JToggleButton("3");
			penemy[i] = new JPanel();

			hand[i] = new JToggleButton("0");
			phand[i] = new JPanel();
			hand[0].setBackground(new Color(10,10,10,0));

			bh.add(hand[i]);
			be.add(enemy[i]);

			enemy[i].setPreferredSize(new Dimension(150,200));
			gbc.fill = GridBagConstraints.BOTH;
			gbc.gridx = i;
			gbc.gridy = 0;
			gbc.gridheight = 1;
			gbc.gridwidth = 1;
			gbc.weightx = 1;
			gbc.weighty = 1;
			gbl.setConstraints(penemy[i], gbc);
			penemy[i].add(enemy[i]);
			p.add(penemy[i]);

			hand[i].setPreferredSize(new Dimension(150,200));
			gbc.fill = GridBagConstraints.BOTH;
			gbc.gridx = i;
			gbc.gridy = 3;
			gbc.gridheight = 1;
			gbc.gridwidth = 1;
			gbc.weightx = 1;
			gbc.weighty = 1;
			gbl.setConstraints(phand[i], gbc);
			phand[i].add(hand[i]);
			p.add(phand[i]);

		}

		for(int i = 0; i < fieldY.length;i++){

			fieldY[i] = new JToggleButton("1");
			pfieldY[i] = new JPanel();

			fieldE[i] = new JToggleButton("2");
			pfieldE[i] = new JPanel();

			bfy.add(fieldY[i]);
			bfe.add(fieldE[i]);

			fieldE[i].setPreferredSize(new Dimension(150,200));
			gbc.fill = GridBagConstraints.BOTH;
			gbc.gridx = i+2;
			gbc.gridy = 1;
			gbc.gridheight = 1;
			gbc.gridwidth = 1;
			gbc.weightx = 1;
			gbc.weighty = 1;
			gbl.setConstraints(pfieldE[i], gbc);
			pfieldE[i].add(fieldE[i]);
			p.add(pfieldE[i]);

			fieldY[i].setPreferredSize(new Dimension(150,200));
			gbc.fill = GridBagConstraints.BOTH;
			gbc.gridx = i+2;
			gbc.gridy = 2;
			gbc.gridheight = 1;
			gbc.gridwidth = 1;
			gbc.weightx = 1;
			gbc.weighty = 1;
			gbl.setConstraints(pfieldY[i], gbc);
			pfieldY[i].add(fieldY[i]);
			p.add(pfieldY[i]);


		}
		
		endTurn.setPreferredSize(new Dimension(150,80));
		gbc.fill = GridBagConstraints.BOTH;
		gbc.gridx = 9;
		gbc.gridy = 2;
		gbc.gridheight = 1;
		gbc.gridwidth = 1;
		gbc.weightx = 1;
		gbc.weighty = 1;
		gbl.setConstraints(bendTurn, gbc);
		bendTurn.add(endTurn);
		p.add(bendTurn);


		/*
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

		p.add(go);*/

		c.add(p, BorderLayout.CENTER);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
}
