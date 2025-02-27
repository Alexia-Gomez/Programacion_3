package aplication;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class VentanaLayout extends JFrame {

	public VentanaLayout(String title) {
		this.setTitle(title);
		this.setVisible(true);
		this.setSize(800,800);
		
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
		
		JMenuItem op_abrir = new JMenuItem("Abrir");
		JMenuItem op_nuevo = new JMenuItem("Nuevo");
		JMenuItem op_guardar= new JMenuItem("Guardar");
		JMenuItem op_cerrar = new JMenuItem("Cerrar");
		
		menu1.add(op_abrir);
		menu1.add(op_nuevo);
		menu1.add(op_guardar);
		menu1.add(op_cerrar);
		
		JRadioButtonMenuItem op_ayuda = new JRadioButtonMenuItem("Manual de usuario");
		JCheckBoxMenuItem op_soporte = new JCheckBoxMenuItem ("Soporte");
		
		menu2.add(op_ayuda);
		menu2.add(op_soporte);
		
		
		barra.add(menu1);
		barra.add(menu2);
		
		this.setJMenuBar(barra);
		this.add(layoutP());
		
		this.repaint();
		this.revalidate();
	}
	
	public JPanel layoutP() {
		JPanel layoutP = new JPanel();
		layoutP.setBounds(0, 0,  500, 500);
		layoutP.setOpaque(true);
		layoutP.setBackground(Color.pink);
		layoutP.setVisible(true);
		layoutP.setLayout(new BorderLayout());
		
		JLabel titulo = new JLabel("Interés");
		titulo.setSize(200, 40);
		titulo.setLocation(160,  10);
		titulo.setOpaque(true);
		layoutP.add(titulo, BorderLayout.NORTH);
		
		TitledBorder title = BorderFactory.createTitledBorder("Calcular interés");
		
		JPanel calc = new JPanel();
		calc.setOpaque(true);
		calc.setBackground(Color.green);
		calc.setVisible(true);
		calc.setBorder(title);
		calc.setLayout(new GridLayout(4,2));
		layoutP.add(calc, BorderLayout.CENTER);
		
		
		JPanel footer = new JPanel();
		footer.setOpaque(true);
		footer.setBackground(Color.ORANGE);
		footer.setVisible(true);
		footer.setLayout(new GridLayout(2, 2, 20, 20));
		
		JLabel inte = new JLabel("Interés:");
		JTextField inte_txt = new JTextField();
		
		JLabel cant = new JLabel(":");
		JTextField cant_txt = new JTextField();
		
		footer.add(inte);
		footer.add(inte_txt);
		footer.add(cant);
		footer.add(cant_txt);
		
		layoutP.add(footer, BorderLayout.PAGE_END);
		
		return layoutP;
		
	}

}
