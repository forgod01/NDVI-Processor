package gui.actionlisteners.java;

import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFileChooser;

import main.java.*;

public class OpenButton implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JFileChooser chooser = new JFileChooser();
		FileReader in = null;
		if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
			File selectedFile = chooser.getSelectedFile();
			BufferedImage img = null;
			try {
				img = ImageIO.read(selectedFile);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			Main.imgh.setImage(img);
			System.out.println(selectedFile.getAbsolutePath());
			
		}
	}
}