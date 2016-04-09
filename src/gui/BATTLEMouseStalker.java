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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.event.MouseInputAdapter;


public class BATTLEMouseStalker extends MouseInputAdapter{
	private BattleScreen grid;
	private JPanel panel;	
	private GridPoint loc;
	
	private static GridPoint green=null;
	private static GridPoint red=null;
	
	private static double clicked=0;
	
	private static boolean p1Turn = true;
	private static boolean fSelected = false;
	private static boolean eSelected = false;
	private static int turnClick = 0;
	
	
	//ArrayList<Player> players;

	public BATTLEMouseStalker(GridPoint myLoc, BattleScreen g1){
		loc=myLoc;
		grid=g1;
		panel=grid.getBoard(loc.getRow(), loc.getCol());
	}
	public void mouseClicked(MouseEvent e){

		/*	
		if (clicked%2==0 && clicked!=1) {
			grid.getBoard(loc.getRow(), loc.getCol()).setBackground(Color.GREEN);
			green=loc;
			clicked++;
		} else {
			grid.getBoard(loc.getRow(), loc.getCol()).setBackground(Color.RED);
			red=loc;
			
			grid.getBoard(green.getRow(), green.getCol()).setBackground(Color.LIGHT_GRAY);
			grid.getBoard(red.getRow(), red.getCol()).setBackground(Color.LIGHT_GRAY);
			green=null;
			red=null;
			clicked++;
		}
			
		*/
		if(p1Turn) {
			if(turnClick == 0) {
				if((loc.getCol() == 0 || loc.getCol() == 1) && !fSelected) {
					grid.getBoard(loc.getRow(), loc.getCol()).setBackground(Color.CYAN);
					fSelected = true;
					turnClick++;
				}
			} else {
				if((loc.getCol() == 3 || loc.getCol() == 4) && fSelected) {
					grid.getBoard(loc.getRow(), loc.getCol()).setBackground(Color.RED);
					fSelected = false;
					turnClick = 0;
					p1Turn = false;
					JOptionPane.showMessageDialog(null, "Player 2 Turn");
					emptyBackground();
				}
			}
		} else {
			if(turnClick == 0) {
				if(loc.getCol() == 3 || loc.getCol() == 4) {
					grid.getBoard(loc.getRow(), loc.getCol()).setBackground(Color.CYAN);
					fSelected = true;
					turnClick++;
				}
			} else {
				if(loc.getCol() == 0 || loc.getCol() == 1) {
					grid.getBoard(loc.getRow(), loc.getCol()).setBackground(Color.RED);
					fSelected = false;
					turnClick = 0;
					p1Turn = true;
					JOptionPane.showMessageDialog(null, "Player 1 Turn");
					emptyBackground();
				}
			}
		}
		clicked++;

		
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
	
	public void mouseDragged(MouseEvent e){
		
	}
	public void mouseMoved(MouseEvent e){
		//if(panel.getMover()!=null){
		//DISPLAY panel.getMover on square, but not deleting the Piece stored inside the square
		//}
	}
	public void mousePressed(MouseEvent e) {
		
		/*if(panel.getOccupied()){
						grid.setPieceForMove(panel.getPiece());
						grid.removePiece(loc.getRow(), loc.getCol());
						panel.setOccupied(false);
					}*/
	}

	public void mouseReleased(MouseEvent e) {
		//System.out.println("YOU ARE RELEASING THE MOUSE");
		/*if(!(panel.getOccupied())){
						Piece pawn=new Piece(1, "src/pawn-white.png.png", loc.getRow(), loc.getCol());
						grid.setPiece(pawn, loc.getRow(), loc.getCol());

						for (int k=0; k<8; k++) {
							for (int i=0; i<8; i++) {
								grid.getPlace().add(grid.getBoard(k, i));
							}
						}
						grid.getPlace().add(grid.getBoard(8, 1));
						panel.setOccupied(true);
						grid.setVisible(true);
					}*/
	}
	public void mouseEntered(MouseEvent e) {

	}
	public void mouseExited(MouseEvent e) {
		//System.out.println("YOU ARE EXITING: "+loc.getRow()+","+loc.getCol());
	}


}