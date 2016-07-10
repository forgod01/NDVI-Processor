package gui.actionlisteners.java;

import java.awt.event.*;
import java.io.File;
import java.io.FileReader;

import javax.swing.JFileChooser;

import main.java.*;

public class OpenButton implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JFileChooser chooser = new JFileChooser();
		FileReader in = null;
		if(chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION){
			File selectedFile = chooser.getSelectedFile();
			Main.imgh.setFile(selectedFile);
			System.out.println(selectedFile.getAbsolutePath());
			
		}
	}
}