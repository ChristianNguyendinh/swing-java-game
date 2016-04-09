package gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import characters.*;
import characters.Character;


public class BattleScreen extends JFrame {

	JPanel[][] battleBoard;
	private Container place;
	private GridLayout grid;

	public BattleScreen(ArrayList<Character> characters1, ArrayList<Character> characters2) {
		place=getContentPane();
		battleBoard=new JPanel[3][5];
		grid=new GridLayout(3,5);
		place.setLayout(grid);

		for (int i=0; i<5; i++) {
			for (int k=0; k<3; k++) {
				battleBoard[k][i]= new JPanel();
			}
		}

		for (int k=0; k<3; k++) {
			for (int i=0; i<5; i++) {
				place.add(battleBoard[k][i]);
			}
		}

		for(int x=0;x<3;x++){
			for(int y=0;y<5;y++){
				battleBoard[x][y].addMouseListener(new BATTLEMouseStalker(new GridPoint(x,y), this));
			}
		}
		setBoard(characters1, characters2);
	}
	
	private void setBoard(ArrayList<Character> characters1, ArrayList<Character> characters2) {
		
		String fileName=characters1.get(0).getImage();
		setSprite(fileName, 0, 0);
		
		fileName=characters1.get(1).getImage();
		setSprite(fileName, 1, 0);
		
		fileName=characters1.get(2).getImage();
		setSprite(fileName, 2, 0);
		
		fileName=characters1.get(3).getImage();
		setSprite(fileName, 0, 1);
		
		fileName=characters1.get(4).getImage();
		setSprite(fileName, 1, 1);
		
		fileName=characters1.get(5).getImage();
		setSprite(fileName, 2, 1);
		
		/*PLAYER 1 SET*/
		
		fileName=characters2.get(0).getImage();
		setSprite(fileName, 0, 3);
		
		fileName=characters2.get(1).getImage();
		setSprite(fileName, 1, 3);
		
		fileName=characters2.get(2).getImage();
		setSprite(fileName, 2, 3);
		
		fileName=characters2.get(3).getImage();
		setSprite(fileName, 0, 4);
		
		fileName=characters2.get(4).getImage();
		setSprite(fileName, 1, 4);
		
		fileName=characters2.get(5).getImage();
		setSprite(fileName, 2, 4);
		
	}

	private void setSprite(String fileName, int row, int col) {

		ImageIcon spriteImage=new ImageIcon(fileName);

		Image img=spriteImage.getImage();
		Image scaledImage = img.getScaledInstance(125,125,Image.SCALE_SMOOTH);

		ImageIcon sprite=new ImageIcon(scaledImage);

		battleBoard[row][col].add(new JLabel(sprite));

		this.pack();
		this.setVisible(true);

		/*JPanel panel1 = new JPanel();
	    ImageIcon pic = new ImageIcon("your.jpg");
	    panel1.add(new JLabel(pic));
	    this.add(panel1);
	    this.pack();
	    this.setVisible(true);*/

	}

	public GridLayout getGrid(){
		return grid;
	}
	public JPanel[][] getBoard(){
		return battleBoard;
	}
	public JPanel getBoard(int k, int i) {
		return battleBoard[k][i];
	}
	public Container getPlace(){
		return place;
	}

	public static void main(String[] args) {
		BattleScreen battle=new BattleScreen(null, null);
		battle.setResizable(false);
		battle.setSize(700, 450);
		battle.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		battle.setVisible(true);


	}
}