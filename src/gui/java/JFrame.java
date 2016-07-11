package gui.java;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.PrintStream;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import gui.actionlisteners.java.OpenButton;

import javax.swing.JToolBar;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import javax.swing.DropMode;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.JTextArea;
import java.awt.Dimension;

import main.java.*;


public class JFrame extends javax.swing.JFrame {

	private JPanel contentPane;
	public static JPanel imagePanel;
	public static JLabel image;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrame frame = new JFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public JFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmOpen = new JMenuItem("Open");
		mnFile.add(mntmOpen);
		
		OpenButton OpenButton = new OpenButton();
		mntmOpen.addActionListener(OpenButton);
		
		JMenu mnRun = new JMenu("Run");
		menuBar.add(mnRun);
		
		JMenuItem mntmCreateGrayscale = new JMenuItem("Create Grayscale");
		mnRun.add(mntmCreateGrayscale);
		
		JMenuItem mntmOverlayGradient = new JMenuItem("Overlay Gradient");
		mnRun.add(mntmOverlayGradient);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		imagePanel = new JPanel();
		contentPane.add(imagePanel, BorderLayout.CENTER);
		
		image  = new JLabel(new ImageIcon(Main.imgh.img));
		imagePanel.add(image);
		
		
		
	}

}
