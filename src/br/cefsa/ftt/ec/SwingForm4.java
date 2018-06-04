package br.cefsa.ftt.ec;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

//Java: Como Programar, pg 106 

public class SwingForm4 {

	public static void main (String[] args) {
		// TODO Auto-generated constructor stub
		System.out.println("SwingForm 4 - Draw");

		JPanel panel = new DrawPanel();
		
		JFrame app = new JFrame();
		
		 // configura o frame para ser encerrado quando ele é fechado
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		app.add(panel); // adiciona o painel ao frame 
		app.setTitle("X Form!!");
		app.setLocation(100, 100);
		app.setSize(600, 600); // configura o tamanho do frame
		app.setVisible(true); // torna o frame visível
		
	}

} //SwingForm

class DrawPanel extends JPanel {
 // desenha um X a partir dos cantos do painel
	public void paintComponent(Graphics g) {
 // chama paintComponent para assegurar que o painel é exibido corretamente
		super.paintComponent(g);

		int width = getWidth(); // largura total 
		int height = getHeight(); // altura total

		g.drawLine(0, 0, width, height);

		g.drawLine(0, height, width, 0);

	} //paintComponent

 } // fim da classe