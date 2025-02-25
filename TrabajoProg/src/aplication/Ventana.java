package aplication;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;

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
		//this.add(this.registro());
		//this.add(this.usuarios());
		this.repaint();
	
	}
	
	Font etiquetas2 = new Font("Nunito", Font.BOLD, 15); 
	Font etiquetas3 = new Font("Nunito", Font.PLAIN, 14); 
	
	public JPanel login() {
		
		JPanel login = new JPanel();
		login.setLocation(0,0);
		login.setSize(700,600);
		login.setOpaque(true);
		login.setBackground(Color.WHITE);
		login.setVisible(true);
		login.setLayout(null);
		
		JLabel etiqueta1 = new JLabel("Iniciar Sesión");
		etiqueta1.setBounds(245, 120, 200, 40);
		etiqueta1.setForeground(new Color(10, 73, 143));
		etiqueta1.setBackground(Color.WHITE);
		etiqueta1.setOpaque(true);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(new Font("Nunito", Font.BOLD, 30));
		login.add(etiqueta1);
		
		
		
		//ICONO USUARIO
		ImageIcon usuario = new ImageIcon("C:\\Users\\alexi\\OneDrive\\Imágenes\\usuario1.png");
		JLabel usuario_icon = new JLabel();
		usuario_icon.setBounds(150, 210, 40, 40);
		usuario_icon.setIcon(new ImageIcon(usuario.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
		login.add(usuario_icon);
		
		//USUARIO
		JLabel etiqueta2 = new JLabel("Usuario:");
		etiqueta2.setBounds(190, 180, 160, 30);
		etiqueta2.setBackground(Color.WHITE);
		etiqueta2.setForeground(new Color(4, 83, 125));
		etiqueta2.setOpaque(true);
		etiqueta2.setFont(etiquetas2);
		login.add(etiqueta2);
		
		JTextField user = new JTextField();	
		user.setBounds(190, 215, 330, 30);
		user.setBackground(new Color(237, 237, 237 ));
		user.setOpaque(true);
		user.setFont(etiquetas3);
		login.add(user);
		
		
		
		//ICONO CONTRASEÑA
		ImageIcon contraseña = new ImageIcon("C:\\Users\\alexi\\OneDrive\\Imágenes\\contraseña.png");
		JLabel contraseña_icon = new JLabel();
		contraseña_icon.setBounds(150, 290, 40, 40);
		contraseña_icon.setIcon(new ImageIcon(contraseña.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
		login.add(contraseña_icon);
		
		//CONTRASEÑA
		JLabel etiqueta3 = new JLabel("Contraseña:");
		etiqueta3.setBounds(190, 260, 160, 30);
		etiqueta3.setBackground(Color.WHITE);
		etiqueta3.setForeground(new Color(4, 83, 125));
		etiqueta3.setOpaque(true);
		etiqueta3.setFont(etiquetas2);
		login.add(etiqueta3);
		
		JPasswordField pass = new JPasswordField();
		pass.setBounds(190, 295, 330, 30);
		pass.setBackground(new Color(237, 237, 237 ));
		pass.setOpaque(true);
		pass.setFont(etiquetas3);
		login.add(pass);
		
		
		
		//RECORDAR CONTRASEÑA
		JCheckBox box = new JCheckBox();
		box.setBounds(190, 330, 25, 30);
		box.setBackground(Color.WHITE);
		box.setOpaque(true);
		login.add(box);
				
		JLabel etiqueta4 = new JLabel("Recuérdame");
		etiqueta4.setBounds(215, 330, 120, 30);
		etiqueta4.setBackground(Color.WHITE);
		etiqueta4.setForeground(new Color(4, 83, 125));
		etiqueta4.setOpaque(true);
		etiqueta4.setFont(new Font("Nunito", Font.PLAIN, 12));
		login.add(etiqueta4);
				
	
				
		//RECUPERAR CONTRASEÑA
		JLabel etiqueta5 = new JLabel("¿Has perdido tu contraseña?");
		etiqueta5.setBounds(360, 330, 160, 30);
		etiqueta5.setBackground(Color.WHITE);
		etiqueta5.setForeground(new Color(4, 83, 125));
		etiqueta5.setOpaque(true);
		etiqueta5.setFont(new Font("Nunito", Font.ITALIC, 12));
		login.add(etiqueta5);
		
		
				
		//BOTON ACCEDER
		JButton btn_a = new JButton("Acceder");
		btn_a.setBounds(370, 390, 150, 35);
		btn_a.setBackground(new Color(10, 73, 143) );
		btn_a.setForeground(Color.white);
		btn_a.setOpaque(true);
		btn_a.setFont(new Font("Nunito", Font.BOLD, 15));
		login.add(btn_a);
		
		//BOTON CREAR
		JButton btn_b = new JButton("Crear cuenta");
		btn_b.setBounds(190, 390, 150, 35);
		btn_b.setBackground(Color.white);
		btn_b.setForeground(new Color(4, 83, 125));
		btn_b.setOpaque(true);
		btn_b.setFont(new Font("Nunito", Font.BOLD, 15));
		login.add(btn_b);
		
		//HOVER
		btn_a.addMouseListener(new MouseAdapter(){
			
			public void mouseEntered(MouseEvent e) {
				btn_a.setBackground(new Color(0, 49, 74));
			}
			
			public void mouseExited(MouseEvent e) {
				btn_a.setBackground(new Color(4, 83, 125));
			}
		});
		
		btn_b.addMouseListener(new MouseAdapter(){
			
			public void mouseEntered(MouseEvent e) {
				btn_b.setForeground(Color.white);
				btn_b.setBackground(new Color(0, 49, 74));
			}
			
			public void mouseExited(MouseEvent e) {
				btn_b.setBackground(Color.WHITE);
				btn_b.setForeground(new Color(4, 83, 125));
			}
		});
		
		
		
		
		
		//FONDO1
		JLabel fondo1 = new JLabel();
		fondo1.setBounds(100, 80, 480, 400);
		fondo1.setBackground(Color.white);
		fondo1.setOpaque(true);
		login.add(fondo1);
		
		
		//FONDO
		ImageIcon fondo = new ImageIcon("C:\\Users\\alexi\\OneDrive\\Imágenes\\fondo.png");
		JLabel fondo_img = new JLabel();
		fondo_img.setBounds(0, 0, 700, 600);
		fondo_img.setIcon(fondo);
		//fondo_img.setIcon(new ImageIcon(fondo.getImage().getScaledInstance(700, 300, Image.SCALE_SMOOTH)));
		login.add(fondo_img);
		
	
		login.revalidate();
		return login;
		
	}
/*	
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

	public JPanel usuarios() {
		
		JPanel usuarios = new JPanel();
		usuarios.setLocation(0,0);
		usuarios.setSize(1000,800);
		usuarios.setOpaque(true);
		usuarios.setBackground(Color.WHITE);
		usuarios.setVisible(true);
		usuarios.setLayout(null);
		
		JLabel etiqueta1 = new JLabel("USUARIOS");
		etiqueta1.setBounds(400, 40, 200, 30);
		etiqueta1.setForeground(Color.black);
		etiqueta1.setBackground(Color.WHITE);
		etiqueta1.setOpaque(true);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		
		etiqueta1.setFont(new Font("Nunito", Font.BOLD, 30));
		usuarios.add(etiqueta1);
		
		JLabel text1 = new JLabel("Total de usuarios");
		text1.setBounds(60, 100, 200, 30);
		text1.setFont(etiquetas);
		text1.setHorizontalAlignment(JLabel.CENTER);
		text1.setOpaque(true);
		text1.setBackground(new Color(154, 201, 255));
		usuarios.add(text1);
		
		JLabel text2 = new JLabel("20");
		text2.setBounds(60, 130, 200, 30);
		text2.setFont(etiquetas);
		text2.setHorizontalAlignment(JLabel.CENTER);
		text2.setOpaque(true);
		text2.setBackground(new Color(154, 201, 255));
		usuarios.add(text2);
		
		JLabel totalPop= new JLabel();
		totalPop.setBounds(60, 90, 200, 80);
		totalPop.setOpaque(true);
		totalPop.setBackground(new Color(154, 201, 255));
		usuarios.add(totalPop);
		
		JLabel text3 = new JLabel("Añadir");
		text3.setBounds(800, 120, 100, 30);
		text3.setFont(etiquetas);
		text3.setHorizontalAlignment(JLabel.CENTER);
		text3.setBackground(new Color(154, 201, 255));
		text3.setOpaque(true);
		text3.setBorder(BorderFactory.createLineBorder(new Color(122, 146, 173), 2));
		usuarios.add(text3);
		
		JLabel text4 = new JLabel("Exportar");
		text4.setBounds(680, 120, 100, 30);
		text4.setFont(etiquetas);
		text4.setHorizontalAlignment(JLabel.CENTER);
		text4.setBackground(new Color(154, 201, 255));
		text4.setOpaque(true);
		text4.setBorder(BorderFactory.createLineBorder(new Color(122, 146, 173), 2));
		usuarios.add(text4);
		
		
		String [] columnNames = {
				"First Name",
				"Last Name",
				"Game",
				"Age",
				"Vegetarian"
				
		};
		
		Object[][] data = {
				{"Kathy", "Smith", "SnowBoarding", 1995, true},
				{"John", "DOe", "Rowing", 2002, true},
				{"Sue", "Black", "Knitting", 2015, false},
				{"Jane", "White", "Speed reading", 1999, true},
				{"Joe", "Brown", "Pool", 2019, false},
				{"Kathy", "Smith", "SnowBoarding", 1995, true},
				{"John", "DOe", "Rowing", 2002, true},
				{"Sue", "Black", "Knitting", 2015, false},
				{"Jane", "White", "Speed reading", 1999, true},
				{"Joe", "Brown", "Pool", 2019, false},
				{"Kathy", "Smith", "SnowBoarding", 1995, true},
				{"John", "DOe", "Rowing", 2002, true},
				{"Sue", "Black", "Knitting", 2015, false},
				{"Jane", "White", "Speed reading", 1999, true},
				{"Joe", "Brown", "Pool", 2019, false},
				{"Kathy", "Smith", "SnowBoarding", 1995, true},
				{"John", "DOe", "Rowing", 2002, true},
				{"Sue", "Black", "Knitting", 2015, false},
				{"Jane", "White", "Speed reading", 1999, true},
				{"Joe", "Brown", "Pool", 2019, false}
		};
		
		JTable table = new JTable(data, columnNames);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setSize(930,200);
		scrollPane.setLocation(30, 200);
		usuarios.add(scrollPane);
		
		usuarios.revalidate();
		return usuarios;
		
	}
	
	*/
	
}
