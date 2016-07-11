package gui.actionlisteners.java;

import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileReader;

import javax.swing.JFileChooser;


import main.java.*;

public class GreyscaleButton implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		NdviCalculator ndvi = new NdviCalculator(Main.imgh.img);
		BufferedImage image = ndvi.CalculateNdvi();
		Main.imgh.setImage(image);
			
		}
	}
