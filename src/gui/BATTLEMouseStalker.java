package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.event.MouseInputAdapter;

import gui.BattleScreen;


public class BATTLEMouseStalker extends MouseInputAdapter{
	private BattleScreen grid;
	private JPanel panel;	
	private GridPoint loc;
	
	private static double clicked=0;
	
	private static boolean p1Turn = true;
	private static boolean fSelected = false;
	private static int turnClick = 0;
	private static characters.Character friend;
	private static characters.Character target;
	ArrayList<characters.Character> p1List;
	ArrayList<characters.Character> p2List;
	private players.Player p1;
	private players.Player p2;
	
	//ArrayList<Player> players;

	public BATTLEMouseStalker(GridPoint myLoc, BattleScreen g1, 
			ArrayList<characters.Character> characters1, ArrayList<characters.Character> characters2, players.Player p1, players.Player p2){
		loc=myLoc;
		grid=g1;
		panel=grid.getBoard(loc.getRow(), loc.getCol());
		p1List = characters1;
		p2List = characters2;
		this.p1 = p1;
		this.p2 = p2;
	}
	public void mouseClicked(MouseEvent e){

		if(p1Turn) {
			if(turnClick == 0) {
				if((loc.getCol() == 0 || loc.getCol() == 1) && !fSelected && 
						grid.getBoard(loc.getRow(), loc.getCol()).getForeground() != Color.RED) {
					grid.getBoard(loc.getRow(), loc.getCol()).setBackground(Color.BLUE);
					fSelected = true;
					turnClick++;
					if(loc.getCol() == 0) {
						if(loc.getRow() == 0) {
							JOptionPane.showMessageDialog(null, "we here");
							friend = p1List.get(0);
						} else if(loc.getRow() == 1) {
							friend = p1List.get(1);
						} else if(loc.getRow() == 2) {
							friend = p1List.get(2);
						}
					} else if(loc.getCol() == 1) {
						if(loc.getRow() == 0) {
							friend = p1List.get(3);
						} else if(loc.getRow() == 1) {
							friend = p1List.get(4);
						} else if(loc.getRow() == 2) {
							friend = p1List.get(5);
						}
					}
				}
			} else {
				if((loc.getCol() == 3 || loc.getCol() == 4) && fSelected && 
						grid.getBoard(loc.getRow(), loc.getCol()).getForeground() != Color.RED) {
					grid.getBoard(loc.getRow(), loc.getCol()).setBackground(Color.RED);
					fSelected = false;
					turnClick = 0;
					p1Turn = false;
					JOptionPane.showMessageDialog(null, "Player 2 Turn");
					if(loc.getCol() == 3) {
						if(loc.getRow() == 0) {
							target = p2List.get(0);
							p1Action();
						} else if(loc.getRow() == 1) {
							target = p2List.get(1);
							p1Action();
						} else if(loc.getRow() == 2) {
							target = p2List.get(2);
							p1Action();
						}
					} else if(loc.getCol() == 4) {
						if(loc.getRow() == 0) {
							target = p2List.get(3);
							p1Action();
						} else if(loc.getRow() == 1) {
							target = p2List.get(4);
							p1Action();
						} else if(loc.getRow() == 2) {
							target = p2List.get(5);
							p1Action();
						}
					}
					friend = null;
					target = null;
					emptyBackground();
				}
			}
		} else {
			if(turnClick == 0) {
				if(loc.getCol() == 3 || loc.getCol() == 4 && !fSelected &&
						grid.getBoard(loc.getRow(), loc.getCol()).getForeground() != Color.RED) {
					grid.getBoard(loc.getRow(), loc.getCol()).setBackground(Color.CYAN);
					fSelected = true;
					turnClick++;
					if(loc.getCol() == 3) {
						if(loc.getRow() == 0) {
							friend = p2List.get(0);
						} else if(loc.getRow() == 1) {
							friend = p2List.get(1);
						} else if(loc.getRow() == 2) {
							friend = p2List.get(2);
						}
					} else if(loc.getCol() == 4) {
						if(loc.getRow() == 0) {
							friend = p2List.get(0);
						} else if(loc.getRow() == 1) {
							friend = p2List.get(4);
						} else if(loc.getRow() == 2) {
							friend = p2List.get(5);
						}
					}
				}
			} else {
				if(loc.getCol() == 0 || loc.getCol() == 1 && fSelected &&
						grid.getBoard(loc.getRow(), loc.getCol()).getForeground() != Color.RED) {
					grid.getBoard(loc.getRow(), loc.getCol()).setBackground(Color.RED);
					fSelected = false;
					turnClick = 0;
					p1Turn = true;
					JOptionPane.showMessageDialog(null, "Player 1 Turn");
					if(loc.getCol() == 0) {
						if(loc.getRow() == 0) {
							target = p1List.get(0);
							p2Action();
						} else if(loc.getRow() == 1) {
							target = p1List.get(1);
							p2Action();
						} else if(loc.getRow() == 2) {
							target = p1List.get(2);
							p2Action();
						}
					} else if(loc.getCol() == 1) {
						if(loc.getRow() == 0) {
							target = p1List.get(3);
							p2Action();
						} else if(loc.getRow() == 1) {
							target = p1List.get(4);
							p2Action();
						} else if(loc.getRow() == 2) {
							target = p1List.get(5);
							p2Action();
						}
					}
					friend = null;
					target = null;
					emptyBackground();
				}
			}
		}
		clicked++;		
	}
	
	private void p1Action() {
		JLabel text = new JLabel();
		text.setText("<html><p style =\"width:100px;\">" + p1.action(p2, friend, target) + "</html>");
		grid.textPanel.removeAll();
		grid.textPanel.add(text);
		grid.textPanel.revalidate();
		grid.textPanel.repaint();
		if(target.isDead()) {
			grid.getBoard(loc.getRow(), loc.getCol()).removeAll();
			grid.getBoard(loc.getRow(), loc.getCol()).setBackground(Color.RED);
			grid.getBoard(loc.getRow(), loc.getCol()).setForeground(Color.RED);
		} 
		grid.getBoard(loc.getRow(), loc.getCol()).setToolTipText("Name: "
				+ target.getName() + "\nATK: " + 
				target.getATK() + "\nHP:" +
				target.getHP());
		
	}
	
	private void p2Action() {
		JLabel text = new JLabel();
		text.setText("<html><p style =\"width:100px;\">" + p2.action(p1, friend, target) + "</html>");
		grid.textPanel.removeAll();
		grid.textPanel.add(text);
		grid.textPanel.revalidate();
		grid.textPanel.repaint();
		if(target.isDead()) {
			grid.getBoard(loc.getRow(), loc.getCol()).removeAll();
			grid.getBoard(loc.getRow(), loc.getCol()).setBackground(Color.RED);
			grid.getBoard(loc.getRow(), loc.getCol()).setForeground(Color.RED);
		}
		grid.getBoard(loc.getRow(), loc.getCol()).setToolTipText("Name: "
				+ target.getName() + "\nATK: " + 
				target.getATK() + "\nHP:" +
				target.getHP());
	}
	
	private void emptyBackground() {
		for(int i = 0; i <= 1; i++) {
			for(int j = 0; j <= 2; j++) {
				grid.getBoard(j, i).setBackground(null);
			}
		}
		
		for(int i = 3; i <= 4; i++) {
			for(int j = 0; j <= 2; j++) {
				grid.getBoard(j, i).setBackground(null);
			}
		}
	}
}