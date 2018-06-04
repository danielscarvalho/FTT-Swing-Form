package br.cefsa.ftt.ec;

import javax.swing.*;

class SwingFormUI extends JFrame {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SwingFormUI() {
	// TODO Auto-generated constructor stub
		super();
		setTitle("Swing Form 2");
		final JLabel label = new JLabel("Timão eeeooo...");
		getContentPane().add(label);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
}


public class SwingForm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwingFormUI frame = new SwingFormUI();
    }

}
