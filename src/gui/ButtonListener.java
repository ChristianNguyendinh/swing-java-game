package gui;

import java.awt.Container;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;

import javax.swing.JPanel;

public class ButtonListener implements ActionListener {

	private JButton button;

	private boolean plusHP;

	private boolean minusHP;

	private boolean plusATK;

	private boolean minusATK;

	public ButtonListener(boolean hpUP, boolean hpDOWN, boolean atkUP, boolean atkDOWN) {

		plusHP = hpUP;

		minusHP = hpDOWN;

		plusATK = atkUP;

		minusATK = atkDOWN;

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