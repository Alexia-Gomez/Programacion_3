package aplication;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

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
		login.setBackground(Color.WHITE);
		login.setVisible(true);
		login.setLayout(null);
		
		JLabel etiqueta1 = new JLabel("Iniciar Sesión");
		etiqueta1.setBounds(150, 60, 170, 40);
		etiqueta1.setForeground(new Color(10, 73, 143));
		etiqueta1.setBackground(Color.WHITE);
		etiqueta1.setOpaque(true);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(new Font("Nunito", Font.BOLD, 25));
		login.add(etiqueta1);
		
		JLabel etiqueta2 = new JLabel("Correo electrónico:");
		etiqueta2.setBounds(90, 120, 160, 30);
		etiqueta2.setBackground(Color.WHITE);
		etiqueta2.setOpaque(true);
		etiqueta2.setFont(new Font("Nunito", Font.PLAIN, 15));
		login.add(etiqueta2);
		
		JTextField user = new JTextField();
		user.setBounds(90, 150, 280, 30);
		user.setBackground(Color.WHITE);
		user.setOpaque(true);
		user.setFont(new Font("Nunito", Font.PLAIN, 15));
		login.add(user);
		
		JLabel etiqueta3 = new JLabel("Contraseña:");
		etiqueta3.setBounds(90, 200, 160, 30);
		etiqueta3.setBackground(Color.WHITE);
		etiqueta3.setOpaque(true);
		etiqueta3.setFont(new Font("Nunito", Font.PLAIN, 15));
		login.add(etiqueta3);
		
		JPasswordField pass = new JPasswordField();
		pass.setBounds(90, 230, 280, 30);
		pass.setBackground(Color.WHITE);
		pass.setOpaque(true);
		pass.setFont(new Font("Nunito", Font.ITALIC, 15));
		login.add(pass);
		
		JCheckBox box = new JCheckBox();
		box.setBounds(90, 278, 30, 30);
		box.setBackground(Color.WHITE);
		box.setOpaque(true);
		login.add(box);
		
		JLabel etiqueta4 = new JLabel("Recuérdame");
		etiqueta4.setBounds(120, 278, 120, 30);
		etiqueta4.setBackground(Color.WHITE);
		etiqueta4.setOpaque(true);
		etiqueta4.setFont(new Font("Nunito", Font.PLAIN, 12));
		login.add(etiqueta4);
		
		JButton btn = new JButton("Acceder");
		btn.setBounds(270, 280, 100, 30);
		btn.setBackground(new Color(10, 73, 143) );
		btn.setForeground(Color.white);
		btn.setOpaque(true);
		btn.setFont(new Font("Nunito", Font.BOLD, 15));
		login.add(btn);
		
		
		JLabel etiqueta5 = new JLabel("¿Has perdido tu contraseña?");
		etiqueta5.setBounds(90, 325, 160, 30);
		etiqueta5.setBackground(Color.WHITE);
		etiqueta5.setOpaque(true);
		etiqueta5.setFont(new Font("Nunito", Font.ITALIC, 12));
		login.add(etiqueta5);
		
	
		login.revalidate();
		return login;
		
	}

}
