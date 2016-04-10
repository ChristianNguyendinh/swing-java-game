package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class VictoryScreen extends JFrame{
	private Container place;
	private GridLayout grid;
	private JPanel jp1;
	private JPanel jp2;
	
	public VictoryScreen(String msg) {
		place = getContentPane();
		grid = new GridLayout(2,1);
		place.setLayout(grid);
		jp1 = new JPanel();
		jp2 = new JPanel();
		ImageIcon img = new ImageIcon("pics/RoundhouseKick.jpg");
		jp1.add(new JLabel(img));
		
		JLabel message = new JLabel(msg);
		message.setFont(new Font("Old English Text MT", Font.BOLD, 72));
		jp2.add(message);
		jp1.setBackground(Color.ORANGE);
		jp1.setBackground(Color.LIGHT_GRAY);
		place.add(jp1);
		place.add(jp2);
		setResizable(false);
		setSize(700, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}
