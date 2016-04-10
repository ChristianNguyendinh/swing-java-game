package gui;

import java.awt.Container;

import java.awt.GridLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
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
			p.incrementHP(c);
			StatButtons.panel3.removeAll();
			StatButtons.panel3.add(new JLabel("Total HP: " + p.totalHP() + "  Total ATK: " + p.totalATK()));
			StatButtons.panel3.revalidate();
			StatButtons.panel3.repaint();
		} else if (minusHP) {
			p.decrementHP(c);
			StatButtons.panel3.removeAll();
			StatButtons.panel3.add(new JLabel("Total HP: " + p.totalHP() + "  Total ATK: " + p.totalATK()));
			StatButtons.panel3.revalidate();
			StatButtons.panel3.repaint();
		} else if (plusATK) {
			p.incrementAtk(c);
			StatButtons.panel3.removeAll();
			StatButtons.panel3.add(new JLabel("Total HP: " + p.totalHP() + "  Total ATK: " + p.totalATK()));
			StatButtons.panel3.revalidate();
			StatButtons.panel3.repaint();
		} else if (minusATK) {
			p.decrementAtk(c);
			StatButtons.panel3.removeAll();
			StatButtons.panel3.add(new JLabel("Total HP: " + p.totalHP() + "  Total ATK: " + p.totalATK()));
			StatButtons.panel3.revalidate();
			StatButtons.panel3.repaint();
		}

	}

}