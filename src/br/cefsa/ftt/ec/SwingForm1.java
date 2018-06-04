package br.cefsa.ftt.ec;

import javax.swing.*;

/*
 *  UI Swing
 *  
 *  Fonte: https://docs.oracle.com/javase/tutorial/uiswing
 *  
 *  Livro: Java Como Programar, Deitel
 *  
 *  Java Swing � uma biblioteca gr�fica legado, ou seja,
 *  sistemas novos s�o criados com JavaFX (client/server)
 *  as vers�es mais recentes do livro abordam JavaFX
 *  e os cap�tulos de Swing foram retirados do livro impresso e est�o online
 *  � importante aprender UI Swing "am-passam" para manuten��o, 
 *  pois h� muito c�digo corporativo neste framework
 *  os componentes UI Swing podem ser usados no JavaFX
 *  
 *  Site do livro: http://www.deitel.com/Books/Java/JavaHowtoProgram10eEarlyObjects/tabid/3656/Default.aspx
 */

public class SwingForm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame("Swing Form 1");
		
		final JLabel label = new JLabel("Vai Corinthians!!");
		
		frame.getContentPane().add(label);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setLocation(200, 200);
		//frame.pack();
		frame.setVisible(true);		
		
	} //main

} //SwingForm1
