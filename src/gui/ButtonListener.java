package gui;

import java.awt.Container;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JPanel;

import characters.*;
import characters.Character;

public class ButtonListener implements ActionListener {

	private JButton button;

	private boolean plusHP;

	private boolean minusHP;

	private boolean plusATK;

	private boolean minusATK;
	private characters.Character c;
	private players.Player p;

	public ButtonListener(boolean hpUP, boolean hpDOWN, boolean atkUP, boolean atkDOWN,
			characters.Character c, players.Player p) {

		plusHP = hpUP;

		minusHP = hpDOWN;

		plusATK = atkUP;

		minusATK = atkDOWN;
		
		this.c = c;
		
		this.p = p;

	}

	public void actionPerformed(ActionEvent e) {

		if (plusHP) {

		} else if (minusHP) {

		} else if (plusATK) {

		} else if (minusATK) {

			System.exit(0);

		}

	}

}