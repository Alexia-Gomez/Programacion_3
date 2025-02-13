package aplication;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame{

	public Ventana(String title) {
		
		this.setTitle(title);
		this.setVisible(true);
		this.setSize(500,500);
		
		this.setResizable(true);
		this.setLayout(null);
		
		//cuando_cierro_mi_aplicacion
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//sobre_que_elemento_colocare_el_item
		this.setLocationRelativeTo(null);
		
		this.setMinimumSize(new Dimension(400,400));
		this.setMaximumSize(new Dimension(600,600));
		
		this.add(this.login());
		this.repaint();
	
	}
	
	public JPanel login() {
		
		JPanel login = new JPanel();
		login.setLocation(0,0);
		login.setSize(500,500);
		login.setOpaque(true);
		login.setBackground(new Color(211, 255, 234));
		login.setVisible(true);
		login.setLayout(null);
		
		JLabel etiqueta1 = new JLabel("¡Bienvenido!");
		etiqueta1.setSize(160,40);
		etiqueta1.setLocation(160,10);
		etiqueta1.setForeground(Color.WHITE);
		etiqueta1.setBackground(new Color(255, 195, 0));
		etiqueta1.setOpaque(true);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(new Font("Impact", Font.ITALIC, 20));
		login.add(etiqueta1);
		
		
		login.revalidate();
		return login;
		
	}

}
