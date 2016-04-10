package gui;

import java.awt.Container;

import java.awt.GridLayout;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JRootPane;

import characters.*;
import characters.Character;

public class StatButtons extends JFrame {

	private JPanel panel1;

	private JPanel panel2;
	
	public static JPanel panel3;
	
	public static JPanel panel4;

	private JButton plusHP;

	private JButton minusHP;

	private JButton plusATK;

	private JButton minusATK;

	private final JRootPane rootPane = new JRootPane();

	private GridLayout g;

	private Container c;

	public StatButtons(characters.Character character, players.Player p) {

		c = getContentPane();

		g = new GridLayout(4, 1);

		panel1 = new JPanel();

		panel2 = new JPanel();
		
		panel3 = new JPanel();
		
		panel4 = new JPanel();

		c.setLayout(g);

		plusHP = new JButton("+");

		minusHP = new JButton("-");

		plusATK = new JButton("+");

		minusATK = new JButton("-");

		plusHP.addActionListener(new ButtonListener(true, false, false, false, character, p));

		minusHP.addActionListener(new ButtonListener(false, true, false, false, character, p));

		plusATK.addActionListener(new ButtonListener(false, false, true, false, character, p));

		minusATK.addActionListener(new ButtonListener(false, false, false, true, character, p));

		panel1.add(plusHP);

		panel1.add(new JLabel("HP"));

		panel1.add(minusHP);

		panel2.add(plusATK);

		panel2.add(new JLabel("ATK"));

		panel2.add(minusATK);
		
		panel4.add(new JLabel("Unit's HP: " + character.getHP() + "  Unit's ATK: " + character.getATK()));
		
		panel3.add(new JLabel("Total HP: " + p.totalHP() + "  Total ATK: " + p.totalATK()));

		this.add(panel1);

		this.add(panel2);
		
		this.add(panel4);
		
		this.add(panel3);
		
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		this.setResizable(false);

		this.setSize(200, 180);

		this.setVisible(true);

	}

	public static void main(String[] args) {

		/*StatButtons stats = new StatButtons();
		
		stats.setTitle("Set Stats for Unit");

		stats.setResizable(false);

		stats.setSize(200, 120);

		stats.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		stats.setVisible(true);
		*/

	}

}