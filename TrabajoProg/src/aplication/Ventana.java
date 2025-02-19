package aplication;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Ventana extends JFrame{

	public Ventana(String title) {
		
		this.setTitle(title);
		this.setVisible(true);
		this.setSize(1000,800);
		
		this.setResizable(true);
		this.setLayout(null);
		
		//cuando_cierro_mi_aplicacion
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//sobre_que_elemento_colocare_el_item
		this.setLocationRelativeTo(null);
		
		this.setMinimumSize(new Dimension(400,400));
		this.setMaximumSize(new Dimension(600,600));
		
		this.add(this.login());
		this.add(this.registro());
		this.repaint();
	
	}
	
	Font etiquetas = new Font("Nunito", Font.BOLD, 15);
	
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
		
		JLabel etiqueta2 = new JLabel("Usuario:");
		etiqueta2.setBounds(90, 120, 160, 30);
		etiqueta2.setBackground(Color.WHITE);
		etiqueta2.setOpaque(true);
		etiqueta2.setFont(etiquetas);
		login.add(etiqueta2);
		
		JTextField user = new JTextField();
		user.setBounds(90, 155, 280, 30);
		user.setBackground(new Color(237, 237, 237 ));
		user.setOpaque(true);
		user.setFont(etiquetas);
		login.add(user);
		
		JLabel etiqueta3 = new JLabel("Contraseña:");
		etiqueta3.setBounds(90, 200, 160, 30);
		etiqueta3.setBackground(Color.WHITE);
		etiqueta3.setOpaque(true);
		etiqueta3.setFont(etiquetas);
		login.add(etiqueta3);
		
		JPasswordField pass = new JPasswordField();
		pass.setBounds(90, 235, 280, 30);
		pass.setBackground(new Color(237, 237, 237 ));
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
	
	public JPanel registro() {
		JPanel registro = new JPanel();
		registro.setLocation(500,0);
		registro.setSize(500,800);
		registro.setOpaque(true);
		registro.setBackground(Color.WHITE);
		registro.setVisible(true);
		registro.setLayout(null);
		
		JLabel etiqueta1 = new JLabel("Registro");
		etiqueta1.setBounds(175, 60, 170, 40);
		etiqueta1.setForeground(new Color(10, 73, 143));
		etiqueta1.setBackground(Color.WHITE);
		etiqueta1.setOpaque(true);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(new Font("Nunito", Font.BOLD, 25));
		registro.add(etiqueta1);
		
		JLabel etiqueta2 = new JLabel("Usuario:");
		etiqueta2.setBounds(90, 120, 160, 30);
		etiqueta2.setBackground(Color.WHITE);
		etiqueta2.setOpaque(true);
		etiqueta2.setFont(etiquetas);
		registro.add(etiqueta2);
		
		JTextField user = new JTextField();
		user.setBounds(90, 155, 345, 30);
		user.setBackground(new Color(237, 237, 237 ));
		user.setOpaque(true);
		user.setFont(etiquetas);
		registro.add(user);
		
		JLabel etiqueta3 = new JLabel("BIO:");
		etiqueta3.setBounds(90, 200, 160, 30);
		etiqueta3.setBackground(Color.WHITE);
		etiqueta3.setOpaque(true);
		etiqueta3.setFont(etiquetas);
		registro.add(etiqueta3);
		
		JTextField bio_txt = new JTextField();
		bio_txt.setBounds(90, 245, 345, 50);
		bio_txt.setBackground(Color.WHITE);
		bio_txt.setBackground(new Color(237, 237, 237 ));
		bio_txt.setOpaque(true);
		bio_txt.setFont(etiquetas);
		registro.add(bio_txt);
		
		JLabel etiqueta4 = new JLabel("Preferencias:");
		etiqueta4.setBounds(90, 310, 160, 30);
		etiqueta4.setBackground(Color.WHITE);
		etiqueta4.setOpaque(true);
		etiqueta4.setFont(etiquetas);
		registro.add(etiqueta4);
		
		JCheckBox box1 = new JCheckBox();
		box1.setBounds(90, 340, 30, 30);
		box1.setBackground(Color.WHITE);
		box1.setOpaque(true);
		registro.add(box1);
		
		JLabel check1 = new JLabel("Dulce");
		check1.setBounds(120, 340, 50, 30);
		check1.setBackground(Color.WHITE);
		check1.setOpaque(true);
		check1.setFont(new Font("Nunito",Font.PLAIN, 14));
		registro.add(check1);
		
		JCheckBox box2 = new JCheckBox();
		box2.setBounds(180, 340, 30, 30);
		box2.setBackground(Color.WHITE);
		box2.setOpaque(true);
		registro.add(box2);
		
		JLabel check2 = new JLabel("Salado");
		check2.setBounds(210, 340, 50, 30);
		check2.setBackground(Color.WHITE);
		check2.setOpaque(true);
		check2.setFont(new Font("Nunito",Font.PLAIN, 14));
		registro.add(check2);
		
		JCheckBox box3 = new JCheckBox();
		box3.setBounds(270, 340, 30, 30);
		box3.setBackground(Color.WHITE);
		box3.setOpaque(true);
		registro.add(box3);
		
		JLabel check3 = new JLabel("Saludable");
		check3.setBounds(300, 340, 70, 30);
		check3.setBackground(Color.WHITE);
		check3.setOpaque(true);
		check3.setFont(new Font("Nunito",Font.PLAIN, 14));
		registro.add(check3);
		
		JLabel etiqueta5 = new JLabel("Términos");
		etiqueta5.setBounds(90, 380, 160, 30);
		etiqueta5.setBackground(Color.WHITE);
		etiqueta5.setOpaque(true);
		etiqueta5.setFont(etiquetas);
		registro.add(etiqueta5);
		
		ButtonGroup terminos = new ButtonGroup();
		
		JRadioButton terms1 = new JRadioButton("Acepto los terminos", true);
		terms1.setBounds(90, 410, 150, 30);
		terms1.setBackground(Color.WHITE);
		terms1.setBorder(BorderFactory.createLineBorder(new Color(237, 237, 237 )));
		terms1.setBorderPainted(true);
		terms1.setFont(new Font("Nunito",Font.PLAIN, 14));
		registro.add(terms1);
		
		JRadioButton terms2 = new JRadioButton("No acepto los terminos");
		terms2.setBounds(260, 410, 170, 30);
		terms2.setBackground(Color.WHITE);
		terms2.setBorder(BorderFactory.createLineBorder(new Color(237, 237, 237 )));
		terms2.setBorderPainted(true);
		terms2.setFont(new Font("Nunito",Font.PLAIN, 14));
		registro.add(terms2);
		
		terminos.add(terms1);
		terminos.add(terms2);
		
		String [] colonias_list = {"Centro", "Pedregal","Esterito","Camino Real","Villas del Encanto", "Chametla" };
		JComboBox colonias = new JComboBox(colonias_list);
		
		colonias.setBounds(90, 470,345, 30);
		colonias.setFont(new Font("Nunito",Font.PLAIN, 14));
		registro.add(colonias);
		
		JButton btn = new JButton("Crear cuenta");
		btn.setBounds(190, 530, 150, 40);
		btn.setBackground(new Color(10, 73, 143) );
		btn.setForeground(Color.white);
		btn.setOpaque(true);
		btn.setFont(new Font("Nunito", Font.BOLD, 18));
		registro.add(btn);
		
		
		registro.revalidate();
		return registro;
	}

}
