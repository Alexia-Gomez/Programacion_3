package aplication;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;

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
	
	
	
	private void initialize() {
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 503, 501);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(3, 3, 0, 0));
		
		btnNewButton = new JButton("");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String jugador = "X";
				if(turno) {
					turno=false;
					jugador="X";
				}else {
					turno=true;
					jugador="O";
				}
				btnNewButton.setText(jugador);
				btnNewButton.setEnabled(false);
				verificar();
			}
		});
		panel.add(btnNewButton);
		
		
		
		btnNewButton_2 = new JButton("");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String jugador = "X";
				if(turno) {
					turno=false;
					jugador="X";
				}else {
					turno=true;
					jugador="O";
				}
				btnNewButton_2.setText(jugador);
				btnNewButton_2.setEnabled(false);
				verificar();
			}
		});
		panel.add(btnNewButton_2);
		
		
		btnNewButton_4 = new JButton("");
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String jugador = "X";
				if(turno) {
					turno=false;
					jugador="X";
				}else {
					turno=true;
					jugador="O";
				}
				btnNewButton_4.setText(jugador);
				btnNewButton_4.setEnabled(false);
				verificar();
			}
		});
		
		panel.add(btnNewButton_4);
		
		
		
		btnNewButton_6 = new JButton("");
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String jugador = "X";
				if(turno) {
					turno=false;
					jugador="X";
				}else {
					turno=true;
					jugador="O";
				}
				btnNewButton_6.setText(jugador);
				btnNewButton_6.setEnabled(false);
				verificar();
			}
		});
		panel.add(btnNewButton_6);
		
		
		btnNewButton_1 = new JButton("");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		btnNewButton_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String jugador = "X";
				if(turno) {
					turno=false;
					jugador="X";
				}else {
					turno=true;
					jugador="O";
				}
				btnNewButton_1.setText(jugador);
				btnNewButton_1.setEnabled(false);
				verificar();
			}
		});panel.add(btnNewButton_1);
		
		
		
		
		btnNewButton_3 = new JButton("");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String jugador = "X";
				if(turno) {
					turno=false;
					jugador="X";
				}else {
					turno=true;
					jugador="O";
				}
				btnNewButton_3.setText(jugador);
				btnNewButton_3.setEnabled(false);
				verificar();
			}
		});
		panel.add(btnNewButton_3);
		
		
		
		
		btnNewButton_5 = new JButton("");
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String jugador = "X";
				if(turno) {
					turno=false;
					jugador="X";
				}else {
					turno=true;
					jugador="O";
				}
				btnNewButton_5.setText(jugador);
				btnNewButton_5.setEnabled(false);
				verificar();
			}
		});
		panel.add(btnNewButton_5);
		
		
		
		btnNewButton_7 = new JButton("");
		btnNewButton_7.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String jugador = "X";
				if(turno) {
					turno=false;
					jugador="X";
				}else {
					turno=true;
					jugador="O";
				}
				btnNewButton_7.setText(jugador);
				btnNewButton_7.setEnabled(false);
				verificar();
			}
		});
		panel.add(btnNewButton_7);
		
		
		
		btnNewButton_8 = new JButton("");
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 30));
		btnNewButton_8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String jugador = "X";
				if(turno) {
					turno=false;
					jugador="X";
				}else {
					turno=true;
					jugador="O";
				}
				btnNewButton_8.setText(jugador);
				btnNewButton_8.setEnabled(false);
				verificar();
			}
		});
		panel.add(btnNewButton_8);
	
		
	}
	
	public void verificar() {
		
		if((btnNewButton.getText().equals(btnNewButton_2.getText()))&&(btnNewButton_2.getText().equals(btnNewButton_4.getText()))&&!(btnNewButton_4.getText().equals(""))) {
			JOptionPane.showConfirmDialog(null, "Ganador: "+btnNewButton.getText()); 
		}
		
		if((btnNewButton_6.getText().equals(btnNewButton_1.getText()))&&(btnNewButton_1.getText().equals(btnNewButton_3.getText()))&&!(btnNewButton_3.getText().equals(""))) {
			JOptionPane.showConfirmDialog(null, "Ganador: "+btnNewButton_6.getText()); 		
		}
		
		if((btnNewButton_5.getText().equals(btnNewButton_7.getText()))&&(btnNewButton_7.getText().equals(btnNewButton_8.getText()))&&!(btnNewButton_8.getText().equals(""))) {
			JOptionPane.showConfirmDialog(null, "Ganador: "+btnNewButton_5.getText()); 
		}
		
		//
		if((btnNewButton.getText().equals(btnNewButton_6.getText()))&&(btnNewButton_6.getText().equals(btnNewButton_5.getText()))&&!(btnNewButton_5.getText().equals(""))) {
			JOptionPane.showConfirmDialog(null,"Ganador: "+btnNewButton.getText()+"\n¿Volver a jugar?"); 
		}
		
		if((btnNewButton_2.getText().equals(btnNewButton_1.getText()))&&(btnNewButton_1.getText().equals(btnNewButton_7.getText()))&&!(btnNewButton_7.getText().equals(""))) {
			JOptionPane.showConfirmDialog(null,"Ganador: "+btnNewButton_2.getText()+"\n¿Volver a jugar?"); 
		}
		
		if((btnNewButton_4.getText().equals(btnNewButton_3.getText()))&&(btnNewButton_3.getText().equals(btnNewButton_8.getText()))&&!(btnNewButton_8.getText().equals(""))) {
			JOptionPane.showConfirmDialog(null,"Ganador: "+btnNewButton_4.getText()+"\n¿Volver a jugar?"); 
		}
		
		//
		if((btnNewButton.getText().equals(btnNewButton_1.getText()))&&(btnNewButton_1.getText().equals(btnNewButton_8.getText()))&&!(btnNewButton_8.getText().equals(""))) {
			JOptionPane.showConfirmDialog(null, "Ganador: "+btnNewButton.getText()+"\n¿Volver a jugar?"); 
		}
		
		if((btnNewButton_4.getText().equals(btnNewButton_1.getText()))&&(btnNewButton_1.getText().equals(btnNewButton_5.getText()))&&!(btnNewButton_5.getText().equals(""))) {
			JOptionPane.showConfirmDialog(null, "Ganador: "+btnNewButton_4.getText()+"\n¿Volver a jugar?"); 
		}
	}
	

}
