package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class GridPoint {
	private int col;
	private int row;

	public GridPoint(int row1, int col1){
		row=row1;
		col=col1;
	}
	
	public GridPoint(int row1, int col1, Color color1){
		row=row1;
		col=col1;
	}

	public int getRow(){
		return row;
	}

	public int getCol(){
		return col;
	}

	public void setRow(int row1){
		row=row1;
	}
	public void setCol(int col1){
		col=col1;
	}

}