package aplication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

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
	ArrayList<Integer>numeros= new ArrayList<Integer>();
	JButton btn1;
	JButton btn2;
	JButton btn3;
	JButton btn4;
	JButton btn5;
	JButton btn6;
	JButton btn7;
	JButton btn8;
	JButton btn9;
	JButton btn10;
	JButton btn11;
	JButton btn12;
	JButton btn13;
	JButton btn14;
	JButton btn15;
	JButton btn16;

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
		numeros.add(1);
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		numeros.add(6);
		numeros.add(7);
		numeros.add(8);
		numeros.add(9);
		numeros.add(10);
		numeros.add(11);
		numeros.add(12);
		numeros.add(13);
		numeros.add(14);
		numeros.add(15);
		numeros.add(0);
		
		Collections.shuffle(numeros);
		
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(187, 143, 206));
		panel.setBorder(new MatteBorder(20, 30, 20, 30, (Color) new Color(187, 143, 206)));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(4, 4, 10, 10));
		
		btn1 = new JButton(numeros.get(1)+""); //
		btn1.setForeground(new Color(0, 0, 0));
		btn1.setBackground(new Color(235, 222, 240));
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(btn2.getText().equals("0")) {
					btn2.setText(btn1.getText());
					btn1.setText("0");
				}
				if(btn5.getText().equals("0")) {
					btn5.setText(btn1.getText());
					btn1.setText("0");
				}
				panel.repaint();
				panel.revalidate();
			}
			
		});
		panel.add(btn1);
		
		btn2 = new JButton(numeros.get(2)+"");
		btn2.setBackground(new Color(235, 222, 240));
		btn2.setForeground(new Color(0, 0, 0));
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(btn1.getText().equals("0")) {
					btn1.setText(btn2.getText());
					btn2.setText("0");
				}
				if(btn3.getText().equals("0")) {
					btn3.setText(btn2.getText());
					btn2.setText("0");
				}
				if(btn6.getText().equals("0")) {
					btn6.setText(btn2.getText());
					btn2.setText("0");
				}
				
				panel.repaint();
				panel.revalidate();
			}
			
		});
		panel.add(btn2);
		
		btn3 = new JButton(numeros.get(3)+"");
		btn3.setBackground(new Color(235, 222, 240));
		btn3.setForeground(new Color(0, 0, 0));
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(btn2.getText().equals("0")) {
					btn2.setText(btn3.getText());
					btn3.setText("0");
				}
				if(btn4.getText().equals("0")) {
					btn4.setText(btn3.getText());
					btn3.setText("0");
				}
				if(btn7.getText().equals("0")) {
					btn7.setText(btn3.getText());
					btn3.setText("0");
				}
				
				panel.repaint();
				panel.revalidate();
			}
			
		});
		panel.add(btn3);
		
		btn4 = new JButton(numeros.get(4)+"");
		btn4.setBackground(new Color(235, 222, 240));
		btn4.setForeground(new Color(0, 0, 0));
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(btn3.getText().equals("0")) {
					btn3.setText(btn4.getText());
					btn4.setText("0");
				}
				if(btn8.getText().equals("0")) {
					btn8.setText(btn4.getText());
					btn4.setText("0");
				}
				
				panel.repaint();
				panel.revalidate();
			}
			
		});
		panel.add(btn4);
		
		btn5 = new JButton(numeros.get(5)+"");
		btn5.setForeground(new Color(0, 0, 0));
		btn5.setBackground(new Color(235, 222, 240));
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(btn6.getText().equals("0")) {
					btn6.setText(btn5.getText());
					btn5.setText("0");
				}
				if(btn1.getText().equals("0")) {
					btn1.setText(btn5.getText());
					btn5.setText("0");
				}
				if(btn9.getText().equals("0")) {
					btn9.setText(btn5.getText());
					btn5.setText("0");
				}
				
				panel.repaint();
				panel.revalidate();
			}
			
		});
		panel.add(btn5);
		
		btn6 = new JButton(numeros.get(6)+"");//
		btn6.setBackground(new Color(235, 222, 240));
		btn6.setForeground(new Color(0, 0, 0));
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(btn5.getText().equals("0")) {
					btn5.setText(btn6.getText());
					btn6.setText("0");
				}
				if(btn7.getText().equals("0")) {
					btn7.setText(btn6.getText());
					btn6.setText("0");
				}
				if(btn2.getText().equals("0")) {
					btn2.setText(btn6.getText());
					btn6.setText("0");
				}
				if(btn10.getText().equals("0")) {
					btn10.setText(btn6.getText());
					btn6.setText("0");
				}
				
				panel.repaint();
				panel.revalidate();
			}
			
		});
		panel.add(btn6);
		
		btn7 = new JButton(numeros.get(7)+"");//
		btn7.setBackground(new Color(235, 222, 240));
		btn7.setForeground(new Color(0, 0, 0));
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(btn6.getText().equals("0")) {
					btn6.setText(btn7.getText());
					btn7.setText("0");
				}
				if(btn8.getText().equals("0")) {
					btn8.setText(btn7.getText());
					btn7.setText("0");
				}
				if(btn3.getText().equals("0")) {
					btn3.setText(btn7.getText());
					btn7.setText("0");
				}
				if(btn11.getText().equals("0")) {
					btn11.setText(btn7.getText());
					btn7.setText("0");
				}
				
				panel.repaint();
				panel.revalidate();
			}
			
		});
		panel.add(btn7);
		
		btn8 = new JButton(numeros.get(8)+"");
		btn8.setBackground(new Color(235, 222, 240));
		btn8.setForeground(new Color(0, 0, 0));
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(btn7.getText().equals("0")) {
					btn7.setText(btn8.getText());
					btn8.setText("0");
				}
				if(btn4.getText().equals("0")) {
					btn4.setText(btn8.getText());
					btn8.setText("0");
				}
				if(btn12.getText().equals("0")) {
					btn12.setText(btn8.getText());
					btn8.setText("0");
				}
				
				panel.repaint();
				panel.revalidate();
			}
			
		});
		panel.add(btn8);
		
		btn9 = new JButton(numeros.get(9)+"");
		btn9.setBackground(new Color(235, 222, 240));
		btn9.setForeground(new Color(0, 0, 0));
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(btn10.getText().equals("0")) {
					btn10.setText(btn9.getText());
					btn9.setText("0");
				}
				if(btn5.getText().equals("0")) { 
					btn5.setText(btn9.getText());
					btn9.setText("0");
				}
				if(btn13.getText().equals("0")) {
					btn13.setText(btn9.getText());
					btn9.setText("0");
				}
				
				panel.repaint();
				panel.revalidate();
			}
			
		});
		panel.add(btn9);
		
		btn10 = new JButton(numeros.get(10)+"");
		btn10.setBackground(new Color(235, 222, 240));
		btn10.setForeground(new Color(0, 0, 0));
		btn10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(btn9.getText().equals("0")) {
					btn9.setText(btn10.getText());
					btn10.setText("0");
				}
				if(btn11.getText().equals("0")) {
					btn11.setText(btn10.getText());
					btn10.setText("0");
				}
				if(btn6.getText().equals("0")) {
					btn6.setText(btn10.getText());
					btn10.setText("0");
				}
				if(btn14.getText().equals("0")) {
					btn14.setText(btn10.getText());
					btn10.setText("0");
				}
				
				panel.repaint();
				panel.revalidate();
			}
			
		});
		panel.add(btn10);
		
		btn11 = new JButton(numeros.get(11)+"");
		btn11.setBackground(new Color(235, 222, 240));
		btn11.setForeground(new Color(0, 0, 0));
		btn11.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(btn10.getText().equals("0")) {
					btn10.setText(btn11.getText());
					btn11.setText("0");
				}
				if(btn12.getText().equals("0")) {
					btn12.setText(btn11.getText());
					btn11.setText("0");
				}
				if(btn7.getText().equals("0")) {
					btn7.setText(btn11.getText());
					btn11.setText("0");
				}
				if(btn15.getText().equals("0")) {
					btn15.setText(btn11.getText());
					btn11.setText("0");
				}
				
				panel.repaint();
				panel.revalidate();
			}
			
		});
		panel.add(btn11);
		
		btn12 = new JButton(numeros.get(12)+"");
		btn12.setBackground(new Color(235, 222, 240));
		btn12.setForeground(new Color(0, 0, 0));
		btn12.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn12.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(btn11.getText().equals("0")) {
					btn11.setText(btn12.getText());
					btn12.setText("0");
				}
				if(btn8.getText().equals("0")) {
					btn8.setText(btn12.getText());
					btn12.setText("0");
				}
				if(btn16.getText().equals("0")) {
					btn16.setText(btn12.getText());
					btn12.setText("0");
				}
				
				panel.repaint();
				panel.revalidate();
			}
			
		});
		panel.add(btn12);
		
		btn13 = new JButton(numeros.get(13)+"");
		btn13.setBackground(new Color(235, 222, 240));
		btn13.setForeground(new Color(0, 0, 0));
		btn13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn13.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(btn14.getText().equals("0")) {
					btn14.setText(btn13.getText());
					btn13.setText("0");
				}
				if(btn9.getText().equals("0")) {
					btn9.setText(btn13.getText());
					btn13.setText("0");
				}
				
				panel.repaint();
				panel.revalidate();
			}
			
		});
		panel.add(btn13);
		
		btn14 = new JButton(numeros.get(14)+"");
		btn14.setBackground(new Color(235, 222, 240));
		btn14.setForeground(new Color(0, 0, 0));
		btn14.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn14.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(btn13.getText().equals("0")) {
					btn13.setText(btn14.getText());
					btn14.setText("0");
				}
				if(btn15.getText().equals("0")) {
					btn15.setText(btn14.getText());
					btn14.setText("0");
				}
				if(btn10.getText().equals("0")) {
					btn10.setText(btn14.getText());
					btn14.setText("0");
				}
				
				panel.repaint();
				panel.revalidate();
			}
			
		});
		panel.add(btn14);
		
		btn15 = new JButton(numeros.get(15)+"");
		btn15.setBackground(new Color(235, 222, 240));
		btn15.setForeground(new Color(0, 0, 0));
		btn15.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn15.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(btn14.getText().equals("0")) {
					btn14.setText(btn15.getText());
					btn15.setText("0");
				}
				if(btn16.getText().equals("0")) {
					btn16.setText(btn15.getText());
					btn15.setText("0");
				}
				if(btn11.getText().equals("0")) {
					btn11.setText(btn15.getText());
					btn15.setText("0");
				}

				panel.repaint();
				panel.revalidate();
			}
			
		});
		panel.add(btn15);
		
		btn16 = new JButton(numeros.get(0)+"");
		btn16.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn16.setBackground(new Color(235, 222, 240));
		btn16.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(btn15.getText().equals("0")) {
					btn15.setText(btn16.getText());
					btn16.setText("0");
				}
				if(btn12.getText().equals("0")) {
					btn12.setText(btn16.getText());
					btn16.setText("0");
				}
				
				panel.repaint();
				panel.revalidate();
			}
			
		});
		panel.add(btn16);
		
		
		// opciones 
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
