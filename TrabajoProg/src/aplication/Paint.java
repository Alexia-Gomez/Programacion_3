package aplication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;

public class Paint {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paint window = new Paint();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Paint() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 880, 620);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(182, 233, 255));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JPanel lateral = new JPanel();
		lateral.setBackground(new Color(217, 245, 255));
		lateral.setBounds(32, 29, 158, 518);
		panel.add(lateral);
		lateral.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Herramientas");
		lblNewLabel.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 15, 138, 30);
		lateral.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("  Pincel");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton.setIcon(new ImageIcon(Paint.class.getResource("/aplication/brush2.png")));
		btnNewButton.setBounds(20, 52, 120, 30);
		lateral.add(btnNewButton);
		
		JButton btnBorrador = new JButton("  Borrador");
		btnBorrador.setBackground(new Color(255, 255, 255));
		btnBorrador.setHorizontalAlignment(SwingConstants.LEADING);
		btnBorrador.setIcon(new ImageIcon(Paint.class.getResource("/aplication/eraser.png")));
		btnBorrador.setBounds(20, 93, 120, 30);
		lateral.add(btnBorrador);
		
		JButton btnNewButton_1 = new JButton("   Guardar");
		btnNewButton_1.setIcon(new ImageIcon(Paint.class.getResource("/aplication/save (2).png")));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBackground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(20, 347, 120, 30);
		lateral.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("Grueso");
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(20, 276, 120, 30);
		lateral.add(btnNewButton_1_1);
		
		JButton btnRegular = new JButton("Regular");
		btnRegular.setBackground(Color.WHITE);
		btnRegular.setBounds(20, 235, 120, 30);
		lateral.add(btnRegular);
		
		JButton btnFino = new JButton("Fino");
		btnFino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFino.setBackground(Color.WHITE);
		btnFino.setBounds(20, 194, 120, 30);
		lateral.add(btnFino);
		
		JLabel lblTamao = new JLabel("Tamaño");
		lblTamao.setHorizontalAlignment(SwingConstants.CENTER);
		lblTamao.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		lblTamao.setBounds(10, 157, 138, 30);
		lateral.add(lblTamao);
		
		JButton btnNewButton_1_2 = new JButton("  Limpiar");
		btnNewButton_1_2.setIcon(new ImageIcon(Paint.class.getResource("/aplication/delete (1).png")));
		btnNewButton_1_2.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton_1_2.setBackground(Color.WHITE);
		btnNewButton_1_2.setBounds(20, 392, 120, 30);
		lateral.add(btnNewButton_1_2);
		
		JButton btnNewButton_9_4 = new JButton("");
		btnNewButton_9_4.setIcon(new ImageIcon(Paint.class.getResource("/aplication/next.png")));
		btnNewButton_9_4.setBackground(Color.WHITE);
		btnNewButton_9_4.setBounds(86, 461, 30, 30);
		lateral.add(btnNewButton_9_4);
		
		JButton btnNewButton_9_3 = new JButton("");
		btnNewButton_9_3.setBounds(38, 461, 30, 30);
		lateral.add(btnNewButton_9_3);
		btnNewButton_9_3.setIcon(new ImageIcon(Paint.class.getResource("/aplication/back.png")));
		btnNewButton_9_3.setBackground(Color.WHITE);
		
		JPanel barra = new JPanel();
		barra.setBackground(new Color(217, 245, 255));
		barra.setBounds(264, 29, 520, 82);
		panel.add(barra);
		barra.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(322, 20, 102, 43);
		barra.add(panel_1);
		panel_1.setBackground(new Color(217, 245, 255));
		panel_1.setLayout(new GridLayout(0, 3, 5, 5));
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBackground(new Color(255, 255, 255));
		panel_1.add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("");
		btnNewButton_4.setBackground(new Color(0, 0, 255));
		panel_1.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("");
		btnNewButton_5.setBackground(new Color(0, 0, 0));
		panel_1.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setBackground(new Color(128, 128, 128));
		panel_1.add(btnNewButton_6);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setBackground(new Color(255, 0, 0));
		panel_1.add(btnNewButton_3);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.setBackground(new Color(0, 128, 64));
		panel_1.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("");
		btnNewButton_8.setBounds(434, 11, 60, 60);
		barra.add(btnNewButton_8);
		btnNewButton_8.setBackground(new Color(255, 255, 255));
		
		JLabel lblColores = new JLabel("Colores");
		lblColores.setHorizontalAlignment(SwingConstants.CENTER);
		lblColores.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		lblColores.setBounds(231, 25, 81, 30);
		barra.add(lblColores);
		
		JLabel lblFiguras = new JLabel("Figuras");
		lblFiguras.setHorizontalAlignment(SwingConstants.CENTER);
		lblFiguras.setFont(new Font("Bahnschrift", Font.BOLD, 15));
		lblFiguras.setBounds(10, 25, 81, 30);
		barra.add(lblFiguras);
		
		JButton btnNewButton_9 = new JButton("");
		btnNewButton_9.setIcon(new ImageIcon(Paint.class.getResource("/aplication/square.png")));
		btnNewButton_9.setBackground(new Color(255, 255, 255));
		btnNewButton_9.setBounds(90, 25, 30, 30);
		barra.add(btnNewButton_9);
		
		JButton btnNewButton_9_1 = new JButton("");
		btnNewButton_9_1.setIcon(new ImageIcon(Paint.class.getResource("/aplication/circle1.png")));
		btnNewButton_9_1.setBackground(Color.WHITE);
		btnNewButton_9_1.setBounds(120, 25, 30, 30);
		barra.add(btnNewButton_9_1);
		
		JButton btnNewButton_9_2 = new JButton("");
		btnNewButton_9_2.setIcon(new ImageIcon(Paint.class.getResource("/aplication/triangle.png")));
		btnNewButton_9_2.setBackground(Color.WHITE);
		btnNewButton_9_2.setBounds(150, 25, 30, 30);
		barra.add(btnNewButton_9_2);
		
		JButton btnNewButton_9_1_1 = new JButton("");
		btnNewButton_9_1_1.setIcon(new ImageIcon(Paint.class.getResource("/aplication/line2 (1).png")));
		btnNewButton_9_1_1.setBackground(Color.WHITE);
		btnNewButton_9_1_1.setBounds(180, 25, 30, 30);
		barra.add(btnNewButton_9_1_1);
		
		JPanel pizarra = new JPanel();
		pizarra.setBackground(new Color(255, 255, 255));
		pizarra.setBounds(214, 134, 624, 413);
		panel.add(pizarra);
	}
}
