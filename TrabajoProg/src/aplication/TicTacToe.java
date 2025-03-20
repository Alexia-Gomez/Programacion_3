package aplication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class TicTacToe {

	private JFrame frame;
	boolean turno =true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
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
	public TicTacToe() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	JButton btnNewButton;
	JButton btnNewButton_1;
	JButton btnNewButton_2;
	JButton btnNewButton_3;
	JButton btnNewButton_4;
	JButton btnNewButton_5;
	JButton btnNewButton_6;
	JButton btnNewButton_7;
	JButton btnNewButton_8;
	private JPanel panel_1;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JPanel panel_2;
	private JButton btnNewButton_9;
	private int contX=0;
	private int contO=0;
	String jugador="";
	String ganador="";
	
	
	private void initialize() {
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 503, 501);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(254, 251, 186));
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
		ImageIcon roll=new ImageIcon(TicTacToe.class.getResource("/aplication/cinnamonroll.png"));
		ImageIcon melody=new ImageIcon(TicTacToe.class.getResource("/aplication/melody2.png"));
		
		
		btnNewButton = new JButton("");
		btnNewButton.setBackground(new Color(249, 231, 247));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 0));
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jugador = "X";
				if(turno) {
					turno=false;
					jugador="X";
					btnNewButton.setIcon(new ImageIcon(roll.getImage().getScaledInstance(195,180, Image.SCALE_SMOOTH)));
				}else {
					turno=true;
					jugador="O";
					btnNewButton.setIcon(new ImageIcon(melody.getImage().getScaledInstance(180,150, Image.SCALE_SMOOTH)));
					
				}
				btnNewButton.setText(jugador);
				btnNewButton.setEnabled(false);
				verificar();
			}
		});
		panel.add(btnNewButton);
		
		
		
		btnNewButton_2 = new JButton("");
		btnNewButton_2.setBackground(new Color(249, 231, 247));
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 0));
		btnNewButton_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jugador = "X";
				if(turno) {
					turno=false;
					jugador="X";
					btnNewButton_2.setIcon(new ImageIcon(roll.getImage().getScaledInstance(195,180, Image.SCALE_SMOOTH)));
				}else {
					turno=true;
					jugador="O";
					btnNewButton_2.setIcon(new ImageIcon(melody.getImage().getScaledInstance(180,150, Image.SCALE_SMOOTH)));
				}
				btnNewButton_2.setText(jugador);
				btnNewButton_2.setEnabled(false);
				verificar();
			}
		});
		panel.add(btnNewButton_2);
		
		
		btnNewButton_4 = new JButton("");
		btnNewButton_4.setBackground(new Color(249, 231, 247));
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 0));
		btnNewButton_4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jugador = "X";
				if(turno) {
					turno=false;
					jugador="X";
					btnNewButton_4.setIcon(new ImageIcon(roll.getImage().getScaledInstance(195,180, Image.SCALE_SMOOTH)));
				}else {
					turno=true;
					jugador="O";
					btnNewButton_4.setIcon(new ImageIcon(melody.getImage().getScaledInstance(180,150, Image.SCALE_SMOOTH)));
				}
				btnNewButton_4.setText(jugador);
				btnNewButton_4.setEnabled(false);
				verificar();
			}
		});
		
		panel.add(btnNewButton_4);
		
		
		
		btnNewButton_6 = new JButton("");
		btnNewButton_6.setBackground(new Color(249, 231, 247));
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 0));
		btnNewButton_6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jugador = "X";
				if(turno) {
					turno=false;
					jugador="X";
					btnNewButton_6.setIcon(new ImageIcon(roll.getImage().getScaledInstance(195,180, Image.SCALE_SMOOTH)));
				}else {
					turno=true;
					jugador="O";
					btnNewButton_6.setIcon(new ImageIcon(melody.getImage().getScaledInstance(180,150, Image.SCALE_SMOOTH)));
				}
				btnNewButton_6.setText(jugador);
				btnNewButton_6.setEnabled(false);
				verificar();
			}
		});
		panel.add(btnNewButton_6);
		
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.setBackground(new Color(249, 231, 247));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 0));
		
		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jugador = "X";
				if(turno) {
					turno=false;
					jugador="X";
					btnNewButton_1.setIcon(new ImageIcon(roll.getImage().getScaledInstance(195,180, Image.SCALE_SMOOTH)));
				}else {
					turno=true;
					jugador="O";
					btnNewButton_1.setIcon(new ImageIcon(melody.getImage().getScaledInstance(180,150, Image.SCALE_SMOOTH)));
				}
				btnNewButton_1.setText(jugador);
				btnNewButton_1.setEnabled(false);
				verificar();
			}
		});panel.add(btnNewButton_1);
		
		
		
		
		btnNewButton_3 = new JButton("");
		btnNewButton_3.setBackground(new Color(249, 231, 247));
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 0));
		btnNewButton_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jugador = "X";
				if(turno) {
					turno=false;
					jugador="X";
					btnNewButton_3.setIcon(new ImageIcon(roll.getImage().getScaledInstance(195,180, Image.SCALE_SMOOTH)));
				}else {
					turno=true;
					jugador="O";
					btnNewButton_3.setIcon(new ImageIcon(melody.getImage().getScaledInstance(180,150, Image.SCALE_SMOOTH)));
				}
				btnNewButton_3.setText(jugador);
				btnNewButton_3.setEnabled(false);
				verificar();
			}
		});
		panel.add(btnNewButton_3);
		
		
		
		
		btnNewButton_5 = new JButton("");
		btnNewButton_5.setBackground(new Color(249, 231, 247));
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 0));
		btnNewButton_5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jugador = "X";
				if(turno) {
					turno=false;
					jugador="X";
					btnNewButton_5.setIcon(new ImageIcon(roll.getImage().getScaledInstance(195,180, Image.SCALE_SMOOTH)));
				}else {
					turno=true;
					jugador="O";
					btnNewButton_5.setIcon(new ImageIcon(melody.getImage().getScaledInstance(180,150, Image.SCALE_SMOOTH)));
				}
				btnNewButton_5.setText(jugador);
				btnNewButton_5.setEnabled(false);
				verificar();
			}
		});
		panel.add(btnNewButton_5);
		
		
		
		btnNewButton_7 = new JButton("");
		btnNewButton_7.setBackground(new Color(249, 231, 247));
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 0));
		btnNewButton_7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jugador = "X";
				if(turno) {
					turno=false;
					jugador="X";
					btnNewButton_7.setIcon(new ImageIcon(roll.getImage().getScaledInstance(195,180, Image.SCALE_SMOOTH)));
				}else {
					turno=true;
					jugador="O";
					btnNewButton_7.setIcon(new ImageIcon(melody.getImage().getScaledInstance(180,150, Image.SCALE_SMOOTH)));
				}
				btnNewButton_7.setText(jugador);
				btnNewButton_7.setEnabled(false);
				verificar();
			}
		});
		panel.add(btnNewButton_7);
		
		
		
		btnNewButton_8 = new JButton("");
		btnNewButton_8.setBackground(new Color(249, 231, 247));
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 0));
		btnNewButton_8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				jugador = "X";
				if(turno) {
					turno=false;
					jugador="X";
					btnNewButton_8.setIcon(new ImageIcon(roll.getImage().getScaledInstance(195,180, Image.SCALE_SMOOTH)));
					
				}else {
					turno=true;
					jugador="O";
					btnNewButton_8.setIcon(new ImageIcon(melody.getImage().getScaledInstance(180,150, Image.SCALE_SMOOTH)));
				}
				btnNewButton_8.setText(jugador);
				btnNewButton_8.setEnabled(false);
				verificar();
			}
		});
		panel.add(btnNewButton_8);
		
		panel_1 = new JPanel();
		panel_1.setBackground(new Color(176, 218, 236));
		frame.getContentPane().add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lblNewLabel = new JLabel("X:   ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("O:   ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		panel_1.add(lblNewLabel_1);
		
		panel_2 = new JPanel();
		panel_2.setBackground(new Color(248, 189, 195));
		frame.getContentPane().add(panel_2, BorderLayout.SOUTH);
		
		btnNewButton_9 = new JButton("Reiniciar");
		btnNewButton_9.setBackground(new Color(247, 214, 225));
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ganador="";
				lblNewLabel.setText("X: ");
				lblNewLabel_1.setText("O: ");
				reinicio();
			}
		});
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_2.add(btnNewButton_9);
	
		
	}
	
	public void verificar() {
		
		if((btnNewButton.getText().equals(btnNewButton_2.getText()))&&(btnNewButton_2.getText().equals(btnNewButton_4.getText()))&&!(btnNewButton_4.getText().equals(""))) { 
			JOptionPane.showMessageDialog(null,"Ganador: "+btnNewButton.getText());
			ganador=btnNewButton.getText();
		}
		
		if((btnNewButton_6.getText().equals(btnNewButton_1.getText()))&&(btnNewButton_1.getText().equals(btnNewButton_3.getText()))&&!(btnNewButton_3.getText().equals(""))) {
			JOptionPane.showMessageDialog(null,"Ganador: "+btnNewButton_6.getText()); 	
			ganador=btnNewButton_6.getText();
		}
		
		if((btnNewButton_5.getText().equals(btnNewButton_7.getText()))&&(btnNewButton_7.getText().equals(btnNewButton_8.getText()))&&!(btnNewButton_8.getText().equals(""))) {
			JOptionPane.showMessageDialog(null,"Ganador: "+btnNewButton_5.getText()); 
			ganador=btnNewButton_5.getText();
		}
		
		//
		if((btnNewButton.getText().equals(btnNewButton_6.getText()))&&(btnNewButton_6.getText().equals(btnNewButton_5.getText()))&&!(btnNewButton_5.getText().equals(""))) {
			JOptionPane.showMessageDialog(null,"Ganador: "+btnNewButton.getText());
			ganador=btnNewButton.getText();
		}
		
		if((btnNewButton_2.getText().equals(btnNewButton_1.getText()))&&(btnNewButton_1.getText().equals(btnNewButton_7.getText()))&&!(btnNewButton_7.getText().equals(""))) {
			JOptionPane.showMessageDialog(null,"Ganador: "+btnNewButton_2.getText()); 
			ganador=btnNewButton_2.getText();
		}
		
		if((btnNewButton_4.getText().equals(btnNewButton_3.getText()))&&(btnNewButton_3.getText().equals(btnNewButton_8.getText()))&&!(btnNewButton_8.getText().equals(""))) {
			JOptionPane.showMessageDialog(null,"Ganador: "+btnNewButton_4.getText()); 
			ganador=btnNewButton_4.getText();
		}
		
		//
		if((btnNewButton.getText().equals(btnNewButton_1.getText()))&&(btnNewButton_1.getText().equals(btnNewButton_8.getText()))&&!(btnNewButton_8.getText().equals(""))) {
			JOptionPane.showMessageDialog(null,"Ganador: "+btnNewButton.getText());
			ganador=btnNewButton.getText();
		}
		
		if((btnNewButton_4.getText().equals(btnNewButton_1.getText()))&&(btnNewButton_1.getText().equals(btnNewButton_5.getText()))&&!(btnNewButton_5.getText().equals(""))) {
			JOptionPane.showMessageDialog(null,"Ganador: "+btnNewButton_4.getText());
			ganador=btnNewButton_4.getText();
		}
		
		
		
		if(ganador.equals("X")) {
			contX++;
			lblNewLabel.setText("X: "+ contX);
			
			
		}else if(ganador.equals("O")) {
			contO++;
			lblNewLabel_1.setText("O: "+ contO);
			
		}
		
		empate(jugador);
		
	}
	
		public void empate(String ganador){
			if((!btnNewButton.getText().isEmpty())&&(!btnNewButton_1.getText().isEmpty())&&(!btnNewButton_2.getText().isEmpty())&&(!btnNewButton_3.getText().isEmpty())&&
					(!btnNewButton_4.getText().isEmpty())&&(!btnNewButton_5.getText().isEmpty())&&(!btnNewButton_6.getText().isEmpty()&&!btnNewButton_7.getText().isEmpty())&&(!btnNewButton_8.getText().isEmpty())) {
				JOptionPane.showMessageDialog(null, "Empate");
				reinicio();
			}
	}
		
		public void reinicio() {
			
			turno=true;
			
			btnNewButton.setText("");
			btnNewButton.setIcon(null);
			btnNewButton.setEnabled(true);
			
			btnNewButton_1.setText("");
			btnNewButton_1.setIcon(null);
			btnNewButton_1.setEnabled(true);
			
			btnNewButton_2.setText("");
			btnNewButton_2.setIcon(null);
			btnNewButton_2.setEnabled(true);
			
			btnNewButton_3.setText("");
			btnNewButton_3.setIcon(null);
			btnNewButton_3.setEnabled(true);
			
			btnNewButton_4.setText("");
			btnNewButton_4.setIcon(null);
			btnNewButton_4.setEnabled(true);
			
			btnNewButton_5.setText("");
			btnNewButton_5.setIcon(null);
			btnNewButton_5.setEnabled(true);
			
			btnNewButton_6.setText("");
			btnNewButton_6.setIcon(null);
			btnNewButton_6.setEnabled(true);
			
			btnNewButton_7.setText("");
			btnNewButton_7.setIcon(null);
			btnNewButton_7.setEnabled(true);
			
			btnNewButton_8.setText("");
			btnNewButton_8.setIcon(null);
			btnNewButton_8.setEnabled(true);
		}
	

}
