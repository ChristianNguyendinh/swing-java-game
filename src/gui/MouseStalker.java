package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.event.MouseInputAdapter;


public class MouseStalker extends MouseInputAdapter{
	private SpriteScreen grid;
	private JPanel panel;	private GridPoint loc;

	public MouseStalker(GridPoint myLoc, SpriteScreen g1){
		loc=myLoc;
		grid=g1;
		panel=grid.getBoard(loc.getRow(), loc.getCol());
	}
	public void mouseClicked(MouseEvent e){
		
		if((e.getModifiers() & InputEvent.BUTTON3_MASK) == InputEvent.BUTTON3_MASK)
			grid.getBoard(loc.getRow(), loc.getCol()).setBackground(Color.GREEN);
		else
			grid.getBoard(loc.getRow(), loc.getCol()).setBackground(Color.BLUE);
		
		/*
		 * 
		 */
		if (loc.getRow()==1 && loc.getCol()==3) {
			//System.exit(0);
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