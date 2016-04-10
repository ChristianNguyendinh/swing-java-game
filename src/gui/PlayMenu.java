package gui;

import java.awt.Container;

import java.awt.Font;

import java.awt.GridLayout;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JPanel;

import javax.swing.JScrollPane;

import javax.swing.JTextArea;

public class PlayMenu extends JFrame {

	private Container place;

	private GridLayout grid;

	private JPanel gameName;

	private JPanel rules;

	private JPanel playButton;

	private JButton playGame;

	public PlayMenu() {

		place = getContentPane();

		gameName = new JPanel();

		rules = new JPanel();

		playButton = new JPanel();

		grid = new GridLayout(2, 1);

		place.setLayout(grid);

		playGame = new JButton("PLAY");

		playGame.addActionListener(new MenuButtonListener());

		// JLabel name=new JLabel("\nInsert Name Here");

		// name.setFont(new Font("Old English Text MT", Font.PLAIN, 50));

		String ruleText = "\t\t\t\tRULES:\n\n" +

		"\t\tPick 6 cards, set their stats and classes.\n\n" +

		"\t\tYou have a maximum of 40 hp and 15 atk to assign to your 6 cards using the pop-up.\n\n" +

		"\t\tThe next player repeats the same process in game: \n\n" +

		"\t\tClick a unit on your side, then click a unit on the enemy side to attack. \n\n" +

		"\t\tAttack dmg is calculated based on the classes you chose for characters\n\n " +

		"\t\tHover over a character on the board to see his stats.\n\n" +

		"\t\tYou lose if all your units die.\n\n";

		JTextArea text = new JTextArea(15, 70);

		text.setEditable(false);

		text.setText(ruleText);

		// gameName.add(name);

		rules.add(text);

		playButton.add(playGame);

		// place.add(gameName);

		place.add(rules);

		place.add(playButton);

		setResizable(false);

		setSize(700, 700);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setVisible(true);

	}

	public static void main(String[] args) {

		PlayMenu p = new PlayMenu();

	}

}