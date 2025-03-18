package aplication;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class Ventana extends JFrame{

	public Ventana(String title) {
		
		this.setIconImage(new ImageIcon("C:\\Users\\alexi\\OneDrive\\Imágenes\\cinnamonroll2.jpg").getImage());
		this.setTitle(title);
		this.setVisible(true);
		this.setSize(1000,650);
		this.setBackground(Color.BLACK);
		
		this.setResizable(true);
		this.setLayout(new BorderLayout());
		
		//cuando_cierro_mi_aplicacion
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//sobre_que_elemento_colocare_el_item
		this.setLocationRelativeTo(null);
		
		this.setMinimumSize(new Dimension(400,400));
		this.setMaximumSize(new Dimension(800,800));
		
		this.setResizable(true);
		
		JMenuBar barra = new JMenuBar();
		
		JMenu menu1 = new JMenu("Cuenta");
		JMenu menu2 = new JMenu("Usuarios");
		JMenu menu3 = new JMenu("Ayuda");
		
		JMenuItem op_alta = new JMenuItem("Alta");
		JMenuItem op_baja = new JMenuItem("Baja");
		JMenuItem op_consultar= new JMenuItem("Consultar");
		
		JMenuItem op_login= new JMenuItem("Inicio de sesión");
		JMenuItem op_registro = new JMenuItem("Registro");
		JMenuItem op_recuperar = new JMenuItem("Recuperación de cuenta");
		
		JMenuItem op_ayuda1 = new JMenuItem("¿Cómo crear un usuario?");
		JMenuItem op_ayuda2 = new JMenuItem("¿Cómo acceder al sistema?");
		JMenuItem op_ayuda3 = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
		
		menu2.add(op_alta);
		menu2.add(op_baja);
		menu2.add(op_consultar);
		
		/*JRadioButtonMenuItem op_ayuda = new JRadioButtonMenuItem("Manual de usuario");
		JCheckBoxMenuItem op_soporte = new JCheckBoxMenuItem ("Soporte");*/
		
		menu3.add(op_ayuda1);
		menu3.add(op_ayuda2);
		menu3.add(op_ayuda3);
		
		menu1.add(op_login);
		menu1.add(op_registro);
		menu1.add(op_recuperar);		
		
		barra.add(menu1);
		barra.add(menu2);
		barra.add(menu3);
		
		op_login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("login");
			}
			
		});	
		
		op_registro.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("registro");
			}
			
		});
		
		op_consultar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("usuarios");
			}
			
		});
		
		op_recuperar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("recuperar");
			}
			
		});
		
		op_alta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("alta");
			}
			
		});
		
		op_baja.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("baja");
			}
			
		});
		
		op_ayuda1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("ayuda1");
			}
			
		});
		
		op_ayuda2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("ayuda2");
			}
			
		});
		
		op_ayuda3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("ayuda3");
			}
			
		});
		
		
		//this.add(this.login());
		this.add(this.botones());
		//this.add(this.registro());
		
		//this.add(this.usuarios());
		//this.add((this.layoutP()));

		this.setJMenuBar(barra);
		
		
		this.repaint();
		this.revalidate();
	
	}
	
	Font etiquetas2 = new Font("Nunito", Font.BOLD, 15); 
	Font etiquetas3 = new Font("Nunito", Font.PLAIN, 16);
	Font etiquetas4 = new Font("Nunito", Font.BOLD, 25);
	Font botones = new Font("Nunito", Font.BOLD, 16);
	
	public JPanel layoutP() {
		JPanel layoutP = new JPanel();
		layoutP.setBounds(0, 0,  500, 500);
		layoutP.setOpaque(true);
		layoutP.setVisible(true);
		layoutP.setLayout(new BorderLayout());
		
		JLabel titulo = new JLabel("Interés");
		titulo.setSize(200, 40);
		titulo.setLocation(160,  10);
		titulo.setFont(etiquetas4);
		titulo.setOpaque(true);
		layoutP.add(titulo, BorderLayout.NORTH);
		
		TitledBorder title = BorderFactory.createTitledBorder("Calcular interés");
		title.setTitleFont(etiquetas2);
		
		JPanel calc = new JPanel();
		calc.setOpaque(true);
		calc.setBackground(new Color(165, 207, 255));
		calc.setVisible(true);
		calc.setBorder(title);
		calc.setLayout(new GridLayout(4,2, 50, 60));
		
		JLabel cp = new JLabel("Capital:");
		cp.setFont(etiquetas3);
		JTextField cp_txt = new JTextField();
		
		JLabel tm = new JLabel("Tiempo:");
		tm.setFont(etiquetas3);
		JTextField tm_txt = new JTextField();
		
		JLabel ti = new JLabel("Tasa interés:");
		ti.setFont(etiquetas3);
		JTextField ti_txt = new JTextField();
		
		JButton calcular = new JButton("Calcular");
		calcular.setBackground(new Color(209, 209, 209));
		calcular.setFont(botones);
		JButton cancelar = new JButton("Cancelar");
		cancelar.setBackground(new Color(209, 209, 209));
		cancelar.setFont(botones);
		
		calc.add(cp);
		calc.add(cp_txt);
		calc.add(tm);
		calc.add(tm_txt);
		calc.add(ti);
		calc.add(ti_txt);
		
		calc.add(calcular);
		calc.add(cancelar);
		
		
		
		layoutP.add(calc, BorderLayout.CENTER);
		
		
		
		
		
		JPanel footer = new JPanel();
		footer.setOpaque(true);
		footer.setBackground(new Color(206, 229, 255 ));
		footer.setVisible(true);
		footer.setLayout(new GridLayout(2, 2, 40, 45));
		
		JLabel inte = new JLabel("Interés:");
		inte.setFont(etiquetas3);
		
		JTextField inte_txt = new JTextField();
		
		JLabel cant = new JLabel("Monto:");
		cant.setFont(etiquetas3);
		
		JTextField cant_txt = new JTextField();
		
		footer.add(inte);
		footer.add(inte_txt);
		footer.add(cant);
		footer.add(cant_txt);
		
		layoutP.add(footer, BorderLayout.PAGE_END);
		
		return layoutP;
		
	} 
	
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
		
		btn_a.addActionListener(new ActionListener() {

			@SuppressWarnings("deprecation")
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(user.getText().equals("")) {
					user.setBorder(BorderFactory.createLineBorder(Color.red,5));
				}else {
					user.setBorder(BorderFactory.createLineBorder(Color.green,5));
				}
				if(pass.getText().equals("")) {
					pass.setBorder(BorderFactory.createLineBorder(Color.red,5));
				}else {
					pass.setBorder(BorderFactory.createLineBorder(Color.green,5));
				}
			}
		});
		
		btn_b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("registro");
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
		login.add(fondo_img);
		
	
		login.revalidate();
		return login;
		
	}
	public void manager(String target) {
		
		
		this.getContentPane().removeAll();
		
		if(target.equals("registro")) {
			this.add(this.registro());
		}
		if(target.equals("login")) {
			this.add(this.login());
		}
		if(target.equals("usuarios")) {
			this.add(this.usuarios());
		}
		if(target.equals("recuperar")) {
			this.add(this.recuperar());
		}
		if(target.equals("alta")) {
			this.add(this.alta());
		}
		if(target.equals("baja")) {
			this.add(this.baja());
		}
		if(target.equals("ayuda1")) {
			this.add(this.ayuda1());
		}
		if(target.equals("ayuda2")) {
			this.add(this.ayuda2());
		}
		if(target.equals("ayuda3")) {
			this.add(this.ayuda3());
		}
		
		
		this.repaint();
		this.revalidate();
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
		etiqueta1.setBounds(175, 70, 170, 40);
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
		etiqueta2.setFont(etiquetas2);
		registro.add(etiqueta2);
		
		JTextField user = new JTextField();
		user.setBounds(90, 155, 345, 30);
		user.setBackground(new Color(237, 237, 237 ));
		user.setOpaque(true);
		user.setFont(etiquetas2);
		registro.add(user);
		
		JLabel etiqueta3 = new JLabel("BIO:");
		etiqueta3.setBounds(90, 200, 160, 30);
		etiqueta3.setBackground(Color.WHITE);
		etiqueta3.setOpaque(true);
		etiqueta3.setFont(etiquetas2);
		registro.add(etiqueta3);
		
		JTextField bio_txt = new JTextField();
		bio_txt.setBounds(90, 245, 345, 50);
		bio_txt.setBackground(Color.WHITE);
		bio_txt.setBackground(new Color(237, 237, 237 ));
		bio_txt.setOpaque(true);
		bio_txt.setFont(etiquetas2);
		registro.add(bio_txt);
		
		JLabel etiqueta4 = new JLabel("Preferencias:");
		etiqueta4.setBounds(90, 310, 160, 30);
		etiqueta4.setBackground(Color.WHITE);
		etiqueta4.setOpaque(true);
		etiqueta4.setFont(etiquetas2);
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
		etiqueta5.setFont(etiquetas2);
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
		btn.setBounds(90, 530, 150, 40);
		btn.setBackground(new Color(10, 73, 143) );
		btn.setForeground(Color.white);
		btn.setOpaque(true);
		btn.setFont(new Font("Nunito", Font.BOLD, 18));
		registro.add(btn);
		
		JButton btn_login = new JButton("Volver al inicio");
		btn_login.setBounds(250, 530, 180, 40);
		btn_login.setBackground(Color.white );
		btn_login.setForeground(new Color(10, 73, 143));
		btn_login.setOpaque(true);
		btn_login.setFont(new Font("Nunito", Font.BOLD, 18));
		registro.add(btn_login);
		
		btn_login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("login");
			}
			
		});	
		
		JLabel fondo1 = new JLabel();
		fondo1.setBounds(50, 50, 430, 535);
		fondo1.setBackground(Color.white);
		fondo1.setOpaque(true);
		registro.add(fondo1);
		
		ImageIcon fondo = new ImageIcon("C:\\Users\\alexi\\OneDrive\\Imágenes\\fondo.png");
		JLabel fondo_img = new JLabel();
		fondo_img.setBounds(0, 0, 550, 600);
		fondo_img.setIcon(fondo);
		registro.add(fondo_img);
		
		
		registro.revalidate();
		return registro;
	}
	
	public JPanel usuarios() {
		
		JPanel usuarios = new JPanel();
		usuarios.setLocation(0,0);
		usuarios.setSize(1000,800);
		usuarios.setOpaque(true);
		usuarios.setBackground(new Color(10, 73, 143));
		usuarios.setVisible(true);
		usuarios.setLayout(null);
		
		JLabel etiqueta1 = new JLabel("USUARIOS");
		etiqueta1.setBounds(390, 80, 200, 30);
		etiqueta1.setForeground(new Color(10, 73, 143));
		etiqueta1.setBackground(Color.WHITE);
		etiqueta1.setOpaque(true);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		
		etiqueta1.setFont(new Font("Nunito", Font.BOLD, 30));
		usuarios.add(etiqueta1);
		
		JLabel text1 = new JLabel("Total de usuarios");
		text1.setBounds(60, 100, 200, 30);
		text1.setFont(etiquetas2);
		text1.setHorizontalAlignment(JLabel.CENTER);
		text1.setOpaque(true);
		text1.setBackground(new Color(154, 201, 255));
		usuarios.add(text1);
		
		JLabel text2 = new JLabel("20");
		text2.setBounds(60, 130, 200, 30);
		text2.setFont(etiquetas2);
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
		text3.setFont(etiquetas2);
		text3.setHorizontalAlignment(JLabel.CENTER);
		text3.setBackground(new Color(154, 201, 255));
		text3.setOpaque(true);
		text3.setBorder(BorderFactory.createLineBorder(new Color(122, 146, 173), 2));
		usuarios.add(text3);
		
		JLabel text4 = new JLabel("Exportar");
		text4.setBounds(680, 120, 100, 30);
		text4.setFont(etiquetas2);
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
		
		JButton btn_login = new JButton("Volver al inicio");
		btn_login.setBounds(60, 450, 180, 40);   //CAMBIAR POSICION
		btn_login.setBackground(Color.white );
		btn_login.setForeground(new Color(10, 73, 143));
		btn_login.setOpaque(true);
		btn_login.setFont(new Font("Nunito", Font.BOLD, 18));
		usuarios.add(btn_login);
		
		btn_login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("login");
			}
			
		});	
		
		//FONDO1
		JLabel fondo1 = new JLabel();
		fondo1.setBounds(10, 40, 960, 500);
		fondo1.setBackground(Color.white);
		fondo1.setOpaque(true);
		usuarios.add(fondo1);
					
		
		
		usuarios.revalidate();
		return usuarios;
		
	}
	
	public JPanel recuperar() {
		JPanel recuperar = new JPanel();
		recuperar.setLocation(0,0);
		recuperar.setSize(700,600);
		recuperar.setOpaque(true);
		recuperar.setBackground(Color.WHITE);
		recuperar.setVisible(true);
		recuperar.setLayout(null);
		
		JLabel etiqueta1 = new JLabel("Recuperación de cuenta");
		etiqueta1.setBounds(190, 120, 300, 40);
		etiqueta1.setForeground(new Color(10, 73, 143));
		etiqueta1.setBackground(Color.WHITE);
		etiqueta1.setOpaque(true);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(new Font("Nunito", Font.BOLD, 25));
		recuperar.add(etiqueta1);
		
		
		//ingreso de correo 
		JLabel etiqueta2 = new JLabel("Ingrese el correo vinculado a su cuenta de usuario:");
		etiqueta2.setBounds(155, 230, 400, 25);
		etiqueta2.setBackground(Color.WHITE);
		etiqueta2.setForeground(new Color(4, 83, 125));
		etiqueta2.setOpaque(true);
		etiqueta2.setFont(etiquetas2);
		recuperar.add(etiqueta2);
				
		JTextField user = new JTextField();	
		user.setBounds(190, 270, 300, 30);
		user.setBackground(new Color(237, 237, 237 ));
		user.setOpaque(true);
		user.setFont(etiquetas3);
		recuperar.add(user);
		
				
		JButton btn_login = new JButton("Volver al inicio");
		btn_login.setBounds(140, 400, 180, 40);   //CAMBIAR POSICION
		btn_login.setBackground(Color.white );
		btn_login.setForeground(new Color(10, 73, 143));
		btn_login.setOpaque(true);
		btn_login.setFont(new Font("Nunito", Font.BOLD, 18));
		recuperar.add(btn_login);
		
		btn_login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("login");
			}
			
		});	
		
		JButton btn = new JButton("Enviar código");
		btn.setBounds(350, 400, 180, 40);
		btn.setBackground(new Color(10, 73, 143) );
		btn.setForeground(Color.white);
		btn.setOpaque(true);
		btn.setFont(new Font("Nunito", Font.BOLD, 18));
		recuperar.add(btn);
		
		
		//FONDO1
		JLabel fondo1 = new JLabel();
		fondo1.setBounds(100, 80, 480, 400);
		fondo1.setBackground(Color.white);
		fondo1.setOpaque(true);
		recuperar.add(fondo1);
		
		//FONDO
		ImageIcon fondo = new ImageIcon("C:\\Users\\alexi\\OneDrive\\Imágenes\\fondo.png");
		JLabel fondo_img = new JLabel();
		fondo_img.setBounds(0, 0, 700, 600);
		fondo_img.setIcon(fondo);
		recuperar.add(fondo_img);
		
		
		recuperar.revalidate();
		return recuperar;
	}

	public JPanel alta() {
		JPanel alta = new JPanel();
		alta.setLocation(0,0);
		alta.setSize(700,600);
		alta.setOpaque(true);
		alta.setBackground(Color.WHITE);
		alta.setVisible(true);
		alta.setLayout(null);
		
		JLabel etiqueta1 = new JLabel("Alta de cuenta");
		etiqueta1.setBounds(190, 120, 300, 40);
		etiqueta1.setForeground(new Color(10, 73, 143));
		etiqueta1.setBackground(Color.WHITE);
		etiqueta1.setOpaque(true);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(new Font("Nunito", Font.BOLD, 25));
		alta.add(etiqueta1);
		
		JButton btn_login = new JButton("Volver al inicio");
		btn_login.setBounds(140, 400, 180, 40);   //CAMBIAR POSICION
		btn_login.setBackground(Color.white );
		btn_login.setForeground(new Color(10, 73, 143));
		btn_login.setOpaque(true);
		btn_login.setFont(new Font("Nunito", Font.BOLD, 18));
		alta.add(btn_login);
		
		btn_login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("login");
			}
			
		});	
		
		//FONDO1
		JLabel fondo1 = new JLabel();
		fondo1.setBounds(100, 80, 480, 400);
		fondo1.setBackground(Color.white);
		fondo1.setOpaque(true);
		alta.add(fondo1);
				
		//FONDO
		ImageIcon fondo = new ImageIcon("C:\\Users\\alexi\\OneDrive\\Imágenes\\fondo.png");
		JLabel fondo_img = new JLabel();
		fondo_img.setBounds(0, 0, 700, 600);
		fondo_img.setIcon(fondo);
		alta.add(fondo_img);
		
		
		alta.revalidate();
		return alta;
	}
	
	public JPanel baja() {
		JPanel baja = new JPanel();
		baja.setLocation(0,0);
		baja.setSize(700,600);
		baja.setOpaque(true);
		baja.setBackground(Color.WHITE);
		baja.setVisible(true);
		baja.setLayout(null);
		
		JLabel etiqueta1 = new JLabel("Baja de cuenta");
		etiqueta1.setBounds(190, 120, 300, 40);
		etiqueta1.setForeground(new Color(10, 73, 143));
		etiqueta1.setBackground(Color.WHITE);
		etiqueta1.setOpaque(true);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(new Font("Nunito", Font.BOLD, 25));
		baja.add(etiqueta1);
		
		JButton btn_login = new JButton("Volver al inicio");
		btn_login.setBounds(140, 400, 180, 40);   //CAMBIAR POSICION
		btn_login.setBackground(Color.white );
		btn_login.setForeground(new Color(10, 73, 143));
		btn_login.setOpaque(true);
		btn_login.setFont(new Font("Nunito", Font.BOLD, 18));
		baja.add(btn_login);
		
		btn_login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("login");
			}
			
		});	
		
		//FONDO1
		JLabel fondo1 = new JLabel();
		fondo1.setBounds(100, 80, 480, 400);
		fondo1.setBackground(Color.white);
		fondo1.setOpaque(true);
		baja.add(fondo1);
				
		//FONDO
		ImageIcon fondo = new ImageIcon("C:\\Users\\alexi\\OneDrive\\Imágenes\\fondo.png");
		JLabel fondo_img = new JLabel();
		fondo_img.setBounds(0, 0, 700, 600);
		fondo_img.setIcon(fondo);
		baja.add(fondo_img);
		
		
		baja.revalidate();
		return baja;
	}

	public JPanel ayuda1() {
		JPanel ayuda1 = new JPanel();
		ayuda1.setLocation(0,0);
		ayuda1.setSize(700,600);
		ayuda1.setOpaque(true);
		ayuda1.setBackground(Color.WHITE);
		ayuda1.setVisible(true);
		ayuda1.setLayout(null);
		
		JLabel etiqueta1 = new JLabel("¿Cómo crear un usuario?");
		etiqueta1.setBounds(160, 120, 350, 40);
		etiqueta1.setForeground(new Color(10, 73, 143));
		etiqueta1.setBackground(Color.WHITE);
		etiqueta1.setOpaque(true);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(new Font("Nunito", Font.BOLD, 25));
		ayuda1.add(etiqueta1);
		
		JLabel etiqueta2 = new JLabel("Para registrarte, sigue estos sencillos pasos:");
		etiqueta2.setBounds(155, 180, 400, 25);
		etiqueta2.setBackground(Color.WHITE);
		etiqueta2.setForeground(new Color(4, 83, 125));
		etiqueta2.setOpaque(true);
		etiqueta2.setFont(etiquetas2);
		ayuda1.add(etiqueta2);
		
		JLabel paso1 = new JLabel("1.- Haz clic en el boton de crear cuenta.");
		paso1.setBounds(155, 210, 400, 25);
		paso1.setBackground(Color.WHITE);
		paso1.setForeground(new Color(4, 83, 125));
		paso1.setOpaque(true);
		paso1.setFont(etiquetas2);
		ayuda1.add(paso1);

		JLabel paso2 = new JLabel("2.- Completa el formulario de registro.");
		paso2.setBounds(155, 235, 400, 25);
		paso2.setBackground(Color.WHITE);
		paso2.setForeground(new Color(4, 83, 125));
		paso2.setOpaque(true);
		paso2.setFont(etiquetas2);
		ayuda1.add(paso2);
		
		JLabel paso3 = new JLabel("3.- Ya registrado, podrás iniciar sesión.");
		paso3.setBounds(155, 260, 400, 25);
		paso3.setBackground(Color.WHITE);
		paso3.setForeground(new Color(4, 83, 125));
		paso3.setOpaque(true);
		paso3.setFont(etiquetas2);
		ayuda1.add(paso3);
		
		JButton btn_login = new JButton("Volver al inicio");
		btn_login.setBounds(140, 400, 180, 40);   //CAMBIAR POSICION
		btn_login.setBackground(Color.white );
		btn_login.setForeground(new Color(10, 73, 143));
		btn_login.setOpaque(true);
		btn_login.setFont(new Font("Nunito", Font.BOLD, 18));
		ayuda1.add(btn_login);
		
		btn_login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("login");
			}
			
		});	
		
		JButton btn = new JButton("Crear cuenta");
		btn.setBounds(350, 400, 180, 40);
		btn.setBackground(new Color(10, 73, 143) );
		btn.setForeground(Color.white);
		btn.setOpaque(true);
		btn.setFont(new Font("Nunito", Font.BOLD, 18));
		ayuda1.add(btn);
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("registro");
			}
			
		});	
		
		//FONDO1
		JLabel fondo1 = new JLabel();
		fondo1.setBounds(100, 80, 480, 400);
		fondo1.setBackground(Color.white);
		fondo1.setOpaque(true);
		ayuda1.add(fondo1);
				
		//FONDO
		ImageIcon fondo = new ImageIcon("C:\\Users\\alexi\\OneDrive\\Imágenes\\fondo.png");
		JLabel fondo_img = new JLabel();
		fondo_img.setBounds(0, 0, 700, 600);
		fondo_img.setIcon(fondo);
		ayuda1.add(fondo_img);
		
		
		ayuda1.revalidate();
		return ayuda1;
	}

	public JPanel ayuda2() {
		JPanel ayuda2 = new JPanel();
		ayuda2.setLocation(0,0);
		ayuda2.setSize(700,600);
		ayuda2.setOpaque(true);
		ayuda2.setBackground(Color.WHITE);
		ayuda2.setVisible(true);
		ayuda2.setLayout(null);
		
		JLabel etiqueta1 = new JLabel("¿Cómo acceder al sistema?");
		etiqueta1.setBounds(160, 120, 350, 40);
		etiqueta1.setForeground(new Color(10, 73, 143));
		etiqueta1.setBackground(Color.WHITE);
		etiqueta1.setOpaque(true);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(new Font("Nunito", Font.BOLD, 25));
		ayuda2.add(etiqueta1);
		
		
		JButton btn_login = new JButton("Volver al inicio");
		btn_login.setBounds(140, 400, 180, 40);   //CAMBIAR POSICION
		btn_login.setBackground(Color.white );
		btn_login.setForeground(new Color(10, 73, 143));
		btn_login.setOpaque(true);
		btn_login.setFont(new Font("Nunito", Font.BOLD, 18));
		ayuda2.add(btn_login);
		
		btn_login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("login");
			}
			
		});	
		
		//FONDO1
		JLabel fondo1 = new JLabel();
		fondo1.setBounds(100, 80, 480, 400);
		fondo1.setBackground(Color.white);
		fondo1.setOpaque(true);
		ayuda2.add(fondo1);
				
		//FONDO
		ImageIcon fondo = new ImageIcon("C:\\Users\\alexi\\OneDrive\\Imágenes\\fondo.png");
		JLabel fondo_img = new JLabel();
		fondo_img.setBounds(0, 0, 700, 600);
		fondo_img.setIcon(fondo);
		ayuda2.add(fondo_img);
		
		
		ayuda2.revalidate();
		return ayuda2;
	}
	
	public JPanel ayuda3() {
		JPanel ayuda3 = new JPanel();
		ayuda3.setLocation(0,0);
		ayuda3.setSize(700,600);
		ayuda3.setOpaque(true);
		ayuda3.setBackground(Color.WHITE);
		ayuda3.setVisible(true);
		ayuda3.setLayout(null);
		
		JLabel etiqueta1 = new JLabel("¿Qué pasa si olvidé mi contraseña?");
		etiqueta1.setBounds(115, 120, 450, 40);
		etiqueta1.setForeground(new Color(10, 73, 143));
		etiqueta1.setBackground(Color.WHITE);
		etiqueta1.setOpaque(true);
		etiqueta1.setHorizontalAlignment(JLabel.CENTER);
		etiqueta1.setFont(new Font("Nunito", Font.BOLD, 25));
		ayuda3.add(etiqueta1);
		
		JLabel etiqueta2 = new JLabel("Para recuperar tu cuenta, sigue estos sencillos pasos:");
		etiqueta2.setBounds(140, 180, 420, 25);
		etiqueta2.setBackground(Color.WHITE);
		etiqueta2.setForeground(new Color(4, 83, 125));
		etiqueta2.setOpaque(true);
		etiqueta2.setFont(etiquetas2);
		ayuda3.add(etiqueta2);
		
		JLabel paso1 = new JLabel("1.- Haz clic en el boton de recuperar cuenta.");
		paso1.setBounds(155, 210, 400, 25);
		paso1.setBackground(Color.WHITE);
		paso1.setForeground(new Color(4, 83, 125));
		paso1.setOpaque(true);
		paso1.setFont(etiquetas2);
		ayuda3.add(paso1);
		
		JLabel paso2 = new JLabel("2.- Llena los datos que se pidan.");
		paso2.setBounds(155, 235, 400, 25);
		paso2.setBackground(Color.WHITE);
		paso2.setForeground(new Color(4, 83, 125));
		paso2.setOpaque(true);
		paso2.setFont(etiquetas2);
		ayuda3.add(paso2);
		
		JLabel paso3 = new JLabel("3.- Ingresa el codigo de recuperación.");
		paso3.setBounds(155, 260, 400, 25);
		paso3.setBackground(Color.WHITE);
		paso3.setForeground(new Color(4, 83, 125));
		paso3.setOpaque(true);
		paso3.setFont(etiquetas2);
		ayuda3.add(paso3);
		
		JButton btn_login = new JButton("Volver al inicio");
		btn_login.setBounds(140, 400, 180, 40);   //CAMBIAR POSICION
		btn_login.setBackground(Color.white );
		btn_login.setForeground(new Color(10, 73, 143));
		btn_login.setOpaque(true);
		btn_login.setFont(new Font("Nunito", Font.BOLD, 18));
		ayuda3.add(btn_login);
		
		btn_login.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("login");
			}
			
		});	
		
		JButton btn = new JButton("Recuperar cuenta");
		btn.setBounds(350, 400, 190, 40);
		btn.setBackground(new Color(10, 73, 143) );
		btn.setForeground(Color.white);
		btn.setOpaque(true);
		btn.setFont(new Font("Nunito", Font.BOLD, 18));
		ayuda3.add(btn);
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				manager("recuperar");
			}
			
		});	
		
		//FONDO1
		JLabel fondo1 = new JLabel();
		fondo1.setBounds(100, 80, 480, 400);
		fondo1.setBackground(Color.white);
		fondo1.setOpaque(true);
		ayuda3.add(fondo1);
				
		//FONDO
		ImageIcon fondo = new ImageIcon("C:\\Users\\alexi\\OneDrive\\Imágenes\\fondo.png");
		JLabel fondo_img = new JLabel();
		fondo_img.setBounds(0, 0, 700, 600);
		fondo_img.setIcon(fondo);
		ayuda3.add(fondo_img);
		
		
		ayuda3.revalidate();
		return ayuda3;
	}

	public JPanel botones() {
		JPanel botones = new JPanel();
		botones.setLocation(0,0);
		botones.setSize(700,600);
		botones.setOpaque(true);
		botones.setBackground(new Color(6, 189, 178 ));
		botones.setVisible(true);
		botones.setLayout(null);
		
		JButton boton1 = new JButton("Click me!");
		boton1.setBounds(400, 450, 200, 50);
		boton1.setBackground(Color.white);
		boton1.setFont(etiquetas2);
		boton1.setVisible(true);
		botones.add(boton1);
		
		boton1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton boton = new JButton("click");
				
				Random rand = new Random();
				Color randColor = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
			
				boton.setSize(rand.nextInt(200), rand.nextInt(100));
				boton.setLocation(rand.nextInt(700), rand.nextInt(600));
				boton.setBackground(randColor);
				
				botones.add(boton);
				botones.repaint();
			}
			
		});	
		
		botones.revalidate();
		return botones;
	}
}
