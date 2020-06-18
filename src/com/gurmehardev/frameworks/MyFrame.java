package com.gurmehardev.frameworks;

import java.awt.HeadlessException;

import javax.swing.JFrame;

/**
 * this is the custom JFrame class that holds the entire
 * program 
 * 
 * @author Gurmehar Singh
 *
 */
public class MyFrame extends JFrame {

	/**
	 * generated serialVersionUID
	 */
	private static final long serialVersionUID = -920798717489805177L;

	public MyFrame() throws HeadlessException {

		super("Bikrami Calendar Conversion");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1605, 1005);
		setResizable(false);
		
		setVisible(true);
	}

	

}
