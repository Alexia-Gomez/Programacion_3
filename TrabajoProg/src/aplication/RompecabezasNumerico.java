package aplication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;

public class RompecabezasNumerico {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RompecabezasNumerico window = new RompecabezasNumerico();
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
	public RompecabezasNumerico() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 530);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(187, 143, 206));
		panel.setBorder(new MatteBorder(20, 30, 20, 30, (Color) new Color(187, 143, 206)));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 4, 10, 10));
		
		JButton btn1 = new JButton("1");
		btn1.setForeground(new Color(0, 0, 0));
		btn1.setBackground(new Color(235, 222, 240));
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setBackground(new Color(235, 222, 240));
		btn2.setForeground(new Color(0, 0, 0));
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setBackground(new Color(235, 222, 240));
		btn3.setForeground(new Color(0, 0, 0));
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.setBackground(new Color(235, 222, 240));
		btn4.setForeground(new Color(0, 0, 0));
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setForeground(new Color(0, 0, 0));
		btn5.setBackground(new Color(235, 222, 240));
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setBackground(new Color(235, 222, 240));
		btn6.setForeground(new Color(0, 0, 0));
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.setBackground(new Color(235, 222, 240));
		btn7.setForeground(new Color(0, 0, 0));
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.setBackground(new Color(235, 222, 240));
		btn8.setForeground(new Color(0, 0, 0));
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.setBackground(new Color(235, 222, 240));
		btn9.setForeground(new Color(0, 0, 0));
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btn9);
		
		JButton btn10 = new JButton("10");
		btn10.setBackground(new Color(235, 222, 240));
		btn10.setForeground(new Color(0, 0, 0));
		btn10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btn10);
		
		JButton btn11 = new JButton("11");
		btn11.setBackground(new Color(235, 222, 240));
		btn11.setForeground(new Color(0, 0, 0));
		btn11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btn11);
		
		JButton btn12 = new JButton("12");
		btn12.setBackground(new Color(235, 222, 240));
		btn12.setForeground(new Color(0, 0, 0));
		btn12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btn12);
		
		JButton btn13 = new JButton("13");
		btn13.setBackground(new Color(235, 222, 240));
		btn13.setForeground(new Color(0, 0, 0));
		btn13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btn13);
		
		JButton btn14 = new JButton("14");
		btn14.setBackground(new Color(235, 222, 240));
		btn14.setForeground(new Color(0, 0, 0));
		btn14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btn14);
		
		JButton btn15 = new JButton("15");
		btn15.setBackground(new Color(235, 222, 240));
		btn15.setForeground(new Color(0, 0, 0));
		btn15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel.add(btn15);
		
		JButton btn16 = new JButton("");
		btn16.setBackground(new Color(255, 255, 255));
		panel.add(btn16);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(142, 68, 173));
		frame.getContentPane().add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnReinicio = new JButton("Reiniciar");
		btnReinicio.setBackground(new Color(240, 240, 240));
		btnReinicio.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(btnReinicio);
	}

}
