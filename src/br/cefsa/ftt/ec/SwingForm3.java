package br.cefsa.ftt.ec;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

//Referência: Java: como programar, pg 72

class SwingFormUI3 extends JFrame {
	
	//https://docs.oracle.com/javase/tutorial/uiswing/components/rootpane.html
	public SwingFormUI3() {
	// TODO Auto-generated constructor stub
		super();
		setTitle("Swing Form 2");
		final JLabel label = new JLabel("Timão eeeooo...");
		JButton button = new JButton("Hey!!");
		
		//https://docs.oracle.com/javase/tutorial/uiswing/layout/border.html
		getContentPane().add(label, BorderLayout.PAGE_START);
		getContentPane().add(button, BorderLayout.PAGE_END);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		pack();
		
		JOptionPane.showMessageDialog(this, "Corinthans!!!");
		//JOptionPane.showConfirmDialog(this, "O Palmeiras tem mundial?");
		
		int q = JOptionPane.showConfirmDialog(
	            this,
	            "O Palmeiras tem mundial?",
	            "Conhecimentos futibolisticos",
	            JOptionPane.YES_NO_OPTION);
		
		if (q != JOptionPane.YES_OPTION) {
			label.setText("Correto! Palmeiras não tem mundial!!!");
		} else {
			label.setText("Sabe nada inocente!!!");
		} //if
		
		//Inner class
		//https://docs.oracle.com/javase/tutorial/uiswing/events/generalrules.html
		//https://docs.oracle.com/javase/tutorial/java/javaOO/innerclasses.html
		//https://docs.oracle.com/javase/tutorial/java/javaOO/nested.html
	    button.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	
	            System.out.println("Goool!!! Do Conrinthians!!!");
	            
	        } //actionPerformed
	    });
		
	}
	
}

public class SwingForm3 {

		public static void main(String[] args) {
			
			// TODO Auto-generated method stub
			System.out.println("Swing Form 3");
			SwingFormUI3 frame = new SwingFormUI3();
			
	    } //main

} //SwingForm
