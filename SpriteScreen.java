import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
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
				
				if (x==1 && y==3) {
					spriteBoard[x][y].setBackground(Color.CYAN);
				}
			}
		}

	}
	
	private void setSpriteBoard() {
		
		/*JPanel panel1 = new JPanel();
	    ImageIcon pic = new ImageIcon("your.jpg");
	    panel1.add(new JLabel(pic));
	    this.add(panel1);
	    this.pack();
	    this.setVisible(true);*/
		
		
		/*
		 * spriteBoard[x][y].ADD IMAGE OR WHATEVER ()
		 */
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
