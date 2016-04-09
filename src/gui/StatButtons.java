package gui;

import java.awt.Container;

import java.awt.GridLayout;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JRootPane;

public class StatButtons extends JFrame {

	private JPanel panel1;

	private JPanel panel2;

	private JButton plusHP;

	private JButton minusHP;

	private JButton plusATK;

	private JButton minusATK;

	private final JRootPane rootPane = new JRootPane();

	private GridLayout g;

	private Container c;

	public StatButtons() {

		c = getContentPane();

		g = new GridLayout(2, 1);

		panel1 = new JPanel();

		panel2 = new JPanel();

		c.setLayout(g);

		plusHP = new JButton("+");

		minusHP = new JButton("-");

		plusATK = new JButton("+");

		minusATK = new JButton("-");

		plusHP.addActionListener(new ButtonListener(true, false, false, false));

		minusHP.addActionListener(new ButtonListener(false, true, false, false));

		plusATK.addActionListener(new ButtonListener(false, false, true, false));

		minusATK.addActionListener(new ButtonListener(false, false, false, true));

		panel1.add(plusHP);

		panel1.add(new JLabel("HP"));

		panel1.add(minusHP);

		panel2.add(plusATK);

		panel2.add(new JLabel("ATK"));

		panel2.add(minusATK);

		this.add(panel1);

		this.add(panel2);

	}

	public static void main(String[] args) {

		StatButtons stats = new StatButtons();

		stats.setResizable(false);

		stats.setSize(200, 120);

		stats.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		stats.setVisible(true);

	}

}