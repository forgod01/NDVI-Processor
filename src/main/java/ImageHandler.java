package main.java;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import gui.java.JFrame;

public class ImageHandler {
	
	public BufferedImage img;
	
	public ImageHandler(){
		img = new BufferedImage(1024, 720, BufferedImage.TYPE_INT_ARGB);
	}
	//read image
	public void setImage(BufferedImage image){
		try{
			img = image;
			JFrame.image.setIcon(new ImageIcon(img));
			JFrame.imagePanel.repaint();
			} catch(Exception e){
				System.out.println(e);
			}
	}
}
