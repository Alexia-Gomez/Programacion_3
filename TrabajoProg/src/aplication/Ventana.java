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
		
		JMenu menu1 = new JMenu("Archivo");
		JMenu menu2 = new JMenu("Ayuda");
		JMenu menu3 = new JMenu("Cuenta");
		
		JMenuItem op_abrir = new JMenuItem("Abrir");
		JMenuItem op_nuevo = new JMenuItem("Nuevo");
		JMenuItem op_guardar= new JMenuItem("Guardar");
		JMenuItem op_cerrar = new JMenuItem("Cerrar");
		
		JMenuItem op_login= new JMenuItem("Inicio de sesión");
		JMenuItem op_registro = new JMenuItem("Registro");
		
		menu1.add(op_abrir);
		menu1.add(op_nuevo);
		menu1.add(op_guardar);
		menu1.add(op_cerrar);
		
		JRadioButtonMenuItem op_ayuda = new JRadioButtonMenuItem("Manual de usuario");
		JCheckBoxMenuItem op_soporte = new JCheckBoxMenuItem ("Soporte");
		
		menu2.add(op_ayuda);
		menu2.add(op_soporte);
		
		menu3.add(op_login);
		menu3.add(op_registro);
		
		
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
		
		this.add(this.login());
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
		
		usuarios.revalidate();
		return usuarios;
		
	}
	
	/*@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		g2.setColor(Color.red);
		
		g2.drawRect(80, 80, 400, 400);
		g2.fillRect(200, 200, 200, 200);
		g2.clearRect(220, 220, 50, 50);
		
		g2.setColor(Color.blue);
		g2.fillRoundRect(400, 80, 200, 200, 30, 30);
		
		g2.setColor(Color.GREEN);
		g2.setStroke(new BasicStroke(10));
		g2.drawLine(100, 100, 900, 500);
		
		g2.setStroke(new BasicStroke(5));
		g2.setColor(new Color(229, 114, 126));
		g2.drawOval(400, 400, 90, 90);
		g2.fillOval(400, 450, 75, 100);
		
		g2.setColor(new Color(207, 147, 240));
		g2.drawArc(600, 200, 200, 200, 0, -180);
		g2.fillArc(600, 200, 200, 200, 0, 180);
		
		g2.setColor(new Color(51, 167, 241));
		g2.setFont(etiquetas2);
		g2.drawString("Hola crayola", 350, 200);
		
		
		int [] xs = {100, 100, 400};
		int [] ys = {100, 200, 400};
		
		g2.drawPolygon(xs, ys, 3);
		
		int [] xs2 = {600, 500, 100};
		int [] ys2 = {600, 200, 150};
		g2.fillPolygon(xs2, ys2, 3);
		
		
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		Graphics2D g2 = (Graphics2D) g;
		Color blanco = new Color(246, 243, 237);
		
		//FONDO
			//CIELO
		g2.setColor(new Color(120, 196, 199));
		g2.fillRect(0, 0, 1000, 800);
		g2.setColor(new Color(255, 202, 6));
		g2.fillOval(850, 60, 70, 70);
		
			//PASTO
		g2.setColor(new Color(35, 117, 30));
		g2.fillRect(0, 450, 1000, 300);
		
			//CERCO
		g2.setColor(new Color(232, 232, 232));
		g2.fillRect(0, 425, 1000, 15);
		g2.fillRect(0, 450, 1000, 15);
		
		g2.setColor(blanco);
		int [] xsc = {0, 0, 20 , 40, 40 };
		int [] ysc = {480,420 , 400 , 420, 480  };
		g2.fillPolygon(xsc, ysc, 5);
		
		int [] xsc2 = {50, 50, 70 , 90, 90 };
		int [] ysc2 = {480,420 , 400 , 420, 480  };
		g2.fillPolygon(xsc2, ysc2, 5);
		
		int [] xsc3 = {100, 100, 120 , 140, 140 };
		int [] ysc3 = {480,420 , 400 , 420, 480  };
		g2.fillPolygon(xsc3, ysc3, 5);
		
		int [] xsc4 = {150, 150, 170 , 190, 190 };
		int [] ysc4 = {480,420 , 400 , 420, 480  };
		g2.fillPolygon(xsc4, ysc4, 5);
		
		int [] xsc5 = {710, 710, 730 , 750, 750 };
		int [] ysc5 = {480,420 , 400 , 420, 480  };
		g2.fillPolygon(xsc5, ysc5, 5);
		
		int [] xsc6 = {760, 760, 780 , 800, 800 };
		int [] ysc6 = {480,420 , 400 , 420, 480  };
		g2.fillPolygon(xsc6, ysc6, 5);
		
		int [] xsc7 = {810, 810, 830 , 850, 850 };
		int [] ysc7 = {480,420 , 400 , 420, 480  };
		g2.fillPolygon(xsc7, ysc7, 5);
		
		int [] xsc8 = {860, 860, 880 , 900, 900 };
		int [] ysc8 = {480,420 , 400 , 420, 480  };
		g2.fillPolygon(xsc8, ysc8, 5);
		
		int [] xsc9 = {910, 910, 930 , 950, 950 };
		int [] ysc9 = {480,420 , 400 , 420, 480  };
		g2.fillPolygon(xsc9, ysc9, 5);
		
		int [] xsc10 = {960, 960, 980 , 1000, 1000 };
		int [] ysc10 = {480,420 , 400 , 420, 480  };
		g2.fillPolygon(xsc10, ysc10, 5);
		
		//BASE CASA
		g2.setColor(new Color(243, 213, 136));
		g2.fillRect(200, 200, 500, 300);
		
		
		g2.setStroke(new BasicStroke(4));
		g2.setColor(new Color(229, 199, 107));
		g2.drawLine(202, 330, 699, 330);
		g2.drawLine(202, 350, 699, 350);
		g2.drawLine(202, 370, 699, 370);
		g2.drawLine(202, 390, 699, 390);
		g2.drawLine(202, 410, 699, 410);
		g2.drawLine(202, 430, 699, 430);
		g2.drawLine(202, 450, 699, 450);
		g2.drawLine(202, 470, 699, 470);
		g2.drawLine(202, 490, 699, 490);
		
		
		//CHIMENEA
		g2.setColor(new Color(21, 31, 39)); //azul3
		g2.fillRect(230, 100, 60, 50);
		g2.setColor(blanco);
		g2.fillRect(225, 100, 70, 10);
		
		
		
		//TECHOS
			//BACK
		g2.setColor(new Color(29, 43, 54)); //azul2
		int [] xs = {150, 200 , 700, 750 };
		int [] ys = {300, 150 , 150, 300 };
		g2.fillPolygon(xs, ys, 4);
		
		g2.setColor(blanco);
		g2.setStroke(new BasicStroke(10));
		g2.drawLine(155, 302, 745, 302);
		
			//FRONT
		g2.setColor(new Color(38, 53, 64)); //azul1
		int [] xs2 = {300, 450 , 600 };
		int [] ys2 = {330, 220 , 330 };
		g2.fillPolygon(xs2, ys2, 3);
				
		g2.setColor(blanco);
		g2.setStroke(new BasicStroke(10));
		g2.drawLine(306, 330, 594, 330);
		
		
		//DETALLES
		
			//PUERTA
		g2.setColor(new Color( 47, 20, 29)); //cafe
		g2.fillRect(405, 370, 90, 130);
		g2.setColor(new Color( 39, 15, 24));
		g2.setStroke(new BasicStroke(5));
		g2.drawRect(425, 385, 50, 60);
		g2.drawRect(425, 455, 50, 30);
		g2.fillOval(480, 445, 10, 10);
		
		
			//PILARES
		g2.setColor(blanco);
		
		g2.setStroke(new BasicStroke(25));
		g2.drawLine(350 ,348 ,350 ,488);
		
		g2.setStroke(new BasicStroke(25));
		g2.drawLine(550 ,348 ,550 ,488);
		
			//VENTANAS
		g2.setColor(new Color(120, 196, 199)); //azulClaro
		
		g2.fillRect(580, 370, 100, 70);
		g2.fillRect(220, 370, 100, 70);
		
		g2.setColor(blanco);
		g2.setStroke(new BasicStroke(5));
		g2.drawRect(580, 370, 100, 70);
		g2.drawRect(220, 370, 100, 70);
		
		g2.drawLine(270, 370, 270, 440);
		g2.drawLine(220, 405, 320, 405);
		
		g2.drawLine(630, 370, 630, 440);
		g2.drawLine(580, 405, 680 , 405);
		
	}*/
	
}
