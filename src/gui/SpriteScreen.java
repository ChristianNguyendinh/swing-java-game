package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class SpriteScreen extends JFrame {
	
	JPanel[][] spriteBoard;
	private Container place;
	private GridLayout grid;
	
	public SpriteScreen() {
		place=getContentPane();
		spriteBoard=new JPanel[5][5];
		grid=new GridLayout(5,5);
		place.setLayout(grid);
		
		for (int i=0; i<5; i++) {
			for (int k=0; k<5; k++) {
				spriteBoard[k][i]= new JPanel();
			}
		}
		
		for (int k=0; k<5; k++) {
			for (int i=0; i<5; i++) {
				place.add(spriteBoard[k][i]);
			}
		}
		
		for(int x=0;x<5;x++){
			for(int y=0;y<5;y++){
				spriteBoard[x][y].addMouseListener(new MouseStalker(new GridPoint(x,y), this));
			}
		}
		
		setSpriteBoard();

	}
	
	private void setSpriteBoard() {
		spriteBoard[0][0].setName("pics/AverageJoe.jpg");
		setSprite("pics/BC Macho-Macho.jpg", 0, 1);
		spriteBoard[0][1].setName("pics/BC Macho-Macho.jpg");
		setSprite("pics/Clown1.jpg", 0, 2);
		spriteBoard[0][2].setName("pics/Clown1.jpg");
		setSprite("pics/ComputerGuy.jpg", 0, 3);
		spriteBoard[0][3].setName("pics/ComputerGuy.jpg");
		setSprite("pics/Dev1.jpg", 0, 4);
		spriteBoard[0][4].setName("pics/Dev1.jpg");
		
		setSprite("pics/Dev2.jpg", 1, 0);
		spriteBoard[1][0].setName("pics/Dev2.jpg");
		setSprite("pics/Dumpling.jpg", 1, 1);
		spriteBoard[1][1].setName("pics/Dumpling.jpg");
		setSprite("pics/FighterJet.jpg", 1, 2);
		spriteBoard[1][2].setName("pics/FighterJet.jpg");
		setSprite("pics/Heliman.jpg", 1, 3);
		spriteBoard[1][3].setName("pics/Heliman.jpg");
		setSprite("pics/Heliman2.jpg", 1, 4);
		spriteBoard[1][4].setName("pics/Heliman2.jpg");
		
		setSprite("pics/Jet2.jpg", 2, 0);
		spriteBoard[2][0].setName("pics/Jet2.jpg");
		setSprite("pics/Koala.jpg", 2, 1);
		spriteBoard[2][1].setName("pics/Koala.jpg");
		setSprite("pics/LinkedList.jpg", 2, 2);
		spriteBoard[2][2].setName("pics/LinkedList.jpg");
		setSprite("pics/OldMan.jpg", 2, 3);
		spriteBoard[2][3].setName("pics/OldMan.jpg");
		setSprite("pics/PolymorphicBST.jpg", 2, 4);
		spriteBoard[2][4].setName("pics/PolymorphicBST");
		
		setSprite("pics/RacoonMan.jpg", 3, 0);
		spriteBoard[3][0].setName("pics/RacoonMan.jpg");
		setSprite("pics/RoundhouseKick.jpg", 3, 1);
		spriteBoard[3][1].setName("pics/RoundhouseKick.jpg");
		setSprite("pics/SafeOpener.jpg", 3, 2);
		spriteBoard[3][2].setName("pics/SafeOpener.jpg");
		setSprite("pics/Slicer.jpg", 3, 3);
		spriteBoard[3][3].setName("pics/Slicer.jpg");
		setSprite("pics/Snake.jpg", 3, 4);
		spriteBoard[3][4].setName("pics/Snake.jpg");
		
		setSprite("pics/TheImposter.jpg", 4, 0);
		spriteBoard[4][0].setName("pics/TheImposter.jpg");
		setSprite("pics/LeafThing.jpg", 4, 1);
		spriteBoard[4][1].setName("pics/LeafThing.jpg");
		setSprite("pics/Umbrellaman.jpg", 4, 2);
		spriteBoard[4][2].setName("pics/Umbrellaman.jpg");
		setSprite("pics/Wombat.jpg", 4, 3);
		spriteBoard[4][3].setName("pics/Wombat.jpg");
		setSprite("pics/NotoriousGalamaster.jpg", 4, 4);
		spriteBoard[4][4].setName("pics/NotoriousGalamaster.jpg");
	
	}

	private void setSprite(String fileName, int row, int col) {
	    
		ImageIcon spriteImage=new ImageIcon(fileName);
		
		Image img=spriteImage.getImage();
		Image scaledImage = img.getScaledInstance(125,125,Image.SCALE_SMOOTH);
		
		ImageIcon sprite=new ImageIcon(scaledImage);
		
		spriteBoard[row][col].add(new JLabel(sprite));
		
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
		return spriteBoard;
	}
	public JPanel getBoard(int k, int i) {
		return spriteBoard[k][i];
	}
	public Container getPlace(){
		return place;
	}

	
	
	public static void main(String[] args) {
		SpriteScreen sprites=new SpriteScreen();
		sprites.setResizable(false);
		sprites.setSize(700, 700);
		sprites.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sprites.setVisible(true);

	}
	
}