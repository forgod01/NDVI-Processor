package main.java;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;

import gui.java.*;

public class NdviCalculator {
	
	BufferedImage img;
	int pixels[];
	
	int red;
	int nir;
	int color;
	double grey;
	int greyscale;
	
	public NdviCalculator(BufferedImage i){
		//Change i to an ARGB int type BufferedImage
		img = new BufferedImage(i.getWidth(), i.getHeight(), BufferedImage.TYPE_INT_ARGB);
		Graphics2D g = img.createGraphics();
		g.drawImage(i,  0,  0,  null);
		g.dispose();
		
		pixels = ((DataBufferInt)img.getRaster().getDataBuffer()).getData();
	}
	
	public BufferedImage CalculateNdvi(){
		for(int i = 0; i < pixels.length; i++ ){
			color = pixels[i];
			//bitmasks to get red and NIR(stored in blue channel) values
			nir = color & 0xff;
			red = (color & 0xff0000) >> 16;
		
			try{
		 	grey = (double)nir / ((double)nir + (double)red);
		 	grey = grey * 255;
		 	greyscale = (int)grey;
			} catch(Exception e){
				System.out.println("Error has occured, probably divide by zero: " + e);
			}
		 	
		 	pixels[i] = (255 << 24) | (greyscale << 16) | (greyscale << 8) | greyscale;
		}
		return img;
	}
	
}
