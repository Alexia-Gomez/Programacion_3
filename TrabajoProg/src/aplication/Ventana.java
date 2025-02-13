package aplication;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana extends JFrame{

	public Ventana(String title) {
		
		this.setTitle(title);
		this.setVisible(true);
		this.setSize(500,500);
		
		this.setResizable(false);
		this.setLayout(null);
		
		//cuando_cierro_mi_aplicacion
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//sobre_que_elemento_colocare_el_item
		this.setLocationRelativeTo(null);
		

		
		JLabel etiqueta1 = new JLabel("Bienvenido");
		etiqueta1.setSize(100,100);
		etiqueta1.setLocation(0,0);
		etiqueta1.setBackground(Color.ORANGE);
		etiqueta1.setOpaque(true);
		
		this.add(etiqueta1);
		
	}
	

}
