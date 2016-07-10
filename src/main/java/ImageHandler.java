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
	public void setFile(File f){
		try{
			img = ImageIO.read(f);
			JFrame.image = new JLabel(new ImageIcon(img));
			JFrame.imagePanel.repaint();
			} catch(Exception e){
				System.out.println(e);
			}
	}
}
