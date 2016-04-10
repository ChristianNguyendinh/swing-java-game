package gui;

import java.awt.Container;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JFrame;

import javax.swing.JPanel;

public class MenuButtonListener implements ActionListener {

	private JButton button;

	private boolean plusHP;

	private boolean minusHP;

	private boolean plusATK;

	private boolean minusATK;

	public MenuButtonListener() {

	}

	public void actionPerformed(ActionEvent e) {

		SpriteScreen sprites = new SpriteScreen();

		sprites.setResizable(false);

		sprites.setSize(700, 700);

		sprites.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		sprites.setVisible(true);

	}

}