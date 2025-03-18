package aplication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.JTable;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class examen {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					examen window = new examen();
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
	public examen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 628, 590);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(0, 64, 128));
		panel.setBounds(0, 0, 621, 97);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Factura en Java - NetBeans - ArrayList y POO");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 21, 445, 25);
		lblNewLabel.setForeground(new Color(255, 255, 255));
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("[Sin Base de datos]");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(10, 46, 166, 25);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBorder(new TitledBorder(null, "Datos del cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(20, 108, 577, 108);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Documento:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(35, 27, 71, 14);
		panel_1.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(114, 27, 135, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Dirección:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3.setBounds(35, 67, 71, 14);
		panel_1.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(114, 62, 135, 20);
		panel_1.add(textField_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Nombres:");
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_1.setBounds(291, 29, 71, 14);
		panel_1.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("Teléfono:");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_2.setBounds(291, 65, 71, 14);
		panel_1.add(lblNewLabel_2_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(370, 26, 160, 20);
		panel_1.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(370, 62, 160, 20);
		panel_1.add(textField_3);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(255, 255, 255));
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new TitledBorder(null, "Datos de factura", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1_1.setBounds(20, 227, 577, 62);
		frame.getContentPane().add(panel_1_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("N° Factura:");
		lblNewLabel_2_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_3.setBounds(32, 30, 71, 14);
		panel_1_1.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Fecha:");
		lblNewLabel_2_3_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_3_1.setBounds(291, 31, 71, 14);
		panel_1_1.add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_4 = new JLabel("1");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(113, 31, 49, 14);
		panel_1_1.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("2021/50/21");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_1.setBounds(372, 31, 93, 14);
		panel_1_1.add(lblNewLabel_4_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 255, 255));
		panel_2.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_2.setBounds(20, 300, 577, 35);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_3_1 = new JLabel("Ver listado de facturas:");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3_1.setBounds(47, 11, 130, 14);
		panel_2.add(lblNewLabel_3_1);
		
		ImageIcon listado = new ImageIcon("C:\\Users\\alexi\\OneDrive\\Imágenes\\listado.png");
		JLabel listado_icon = new JLabel();
		listado_icon.setBounds(8, 3, 30, 30);
		listado_icon.setIcon(new ImageIcon(listado.getImage().getScaledInstance(30, 30, Image.SCALE_SMOOTH)));
		panel_2.add(listado_icon);
		
		JLabel lblNewLabel_3_2 = new JLabel("Eliminar");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3_2.setBounds(526, 11, 41, 14);
		panel_2.add(lblNewLabel_3_2);
		
		ImageIcon cancelar = new ImageIcon("C:\\Users\\alexi\\OneDrive\\Imágenes\\cancelar1.png");
		JLabel cancelar_icon = new JLabel();
		cancelar_icon.setBounds(495, 9, 20, 20);
		cancelar_icon.setIcon(new ImageIcon(cancelar.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
		panel_2.add(cancelar_icon);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Añadir");
		lblNewLabel_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_3_2_1.setBounds(435, 12, 41, 14);
		panel_2.add(lblNewLabel_3_2_1);
		
		ImageIcon añadir = new ImageIcon("C:\\Users\\alexi\\OneDrive\\Imágenes\\añadir.png");
		JLabel añadir_icon = new JLabel();
		añadir_icon.setBounds(400, 9, 20, 20);
		añadir_icon.setIcon(new ImageIcon(añadir.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
		panel_2.add(añadir_icon);
		
		String [] columnNames = {
				"Producto",
				"Cantidad",
				"Valor",
				"SubTotal"				
		};
		
		Object[][] data = {
				{"Producto","Cantidad","Valor","SubTotal"},
				{"Agua",2, 500, 1000.0},
				{"Cereal", 5, 1000, 5000.0},
				{"Leche", 2, 300, 600.0},
		};
		
		table = new JTable(data, columnNames);
		table.setBounds(20, 346, 577, 62);
		frame.getContentPane().add(table);
		
		JLabel lblNewLabel_2_4 = new JLabel("subTotal:");
		lblNewLabel_2_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_4.setBounds(20, 435, 71, 14);
		frame.getContentPane().add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_5 = new JLabel("% Descuento:");
		lblNewLabel_2_5.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_5.setBounds(20, 460, 94, 14);
		frame.getContentPane().add(lblNewLabel_2_5);
		
		JLabel lblNewLabel_2_6 = new JLabel("IVA 19%:");
		lblNewLabel_2_6.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_6.setBounds(20, 485, 71, 14);
		frame.getContentPane().add(lblNewLabel_2_6);
		
		JLabel lblNewLabel_2_7 = new JLabel("Total Factura:");
		lblNewLabel_2_7.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_7.setBounds(20, 510, 94, 14);
		frame.getContentPane().add(lblNewLabel_2_7);
		
		JLabel lblNewLabel_4_2 = new JLabel("6600.0");
		lblNewLabel_4_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_2.setBounds(129, 436, 49, 14);
		frame.getContentPane().add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("1254.0");
		lblNewLabel_4_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_3.setBounds(129, 486, 49, 14);
		frame.getContentPane().add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("7524.0");
		lblNewLabel_4_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_4.setBounds(129, 511, 49, 14);
		frame.getContentPane().add(lblNewLabel_4_4);
		
		JLabel lblNewLabel_2_5_1 = new JLabel("Valor descontado:");
		lblNewLabel_2_5_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_2_5_1.setBounds(309, 460, 105, 14);
		frame.getContentPane().add(lblNewLabel_2_5_1);
		
		JLabel lblNewLabel_4_3_1 = new JLabel("330.0");
		lblNewLabel_4_3_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_3_1.setBounds(418, 461, 49, 14);
		frame.getContentPane().add(lblNewLabel_4_3_1);
		
		textField_4 = new JTextField();
		textField_4.setBounds(124, 458, 49, 20);
		frame.getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBackground(new Color(255, 255, 255));
		chckbxNewCheckBox.setBounds(179, 457, 21, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		JButton btnNewButton = new JButton("Finalizar factura");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setBounds(396, 519, 136, 23);
		frame.getContentPane().add(btnNewButton);
		
	}
}
