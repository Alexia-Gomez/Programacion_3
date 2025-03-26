package aplication;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.border.MatteBorder;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;

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
	
	JPanel opciones;
	JLabel lblNewLabel_1;
	
	JLabel labelTiempo = new JLabel();
	JButton iniciar;
	JButton pausar;
	
	int elapsedTime=0;
	int miliS=0;
	int sec=0;
	int min=0;
	int hr=0;
	
	String milis_text=String.format("%03d",miliS);
	String sec_text=String.format("%02d",sec);
	String min_text=String.format("%02d",min);
	String hr_text=String.format("%02d",hr);
	
	Timer timer=new Timer(10, new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			elapsedTime+=10;
			hr=(elapsedTime/3600000);
			min=(elapsedTime/60000)%60;
			sec=(elapsedTime/1000)%60;
			miliS=elapsedTime%1000;
			
			milis_text=String.format("%03d",miliS);
			sec_text=String.format("%02d",sec);
			min_text=String.format("%02d",min);
			hr_text=String.format("%02d",hr);
			
			labelTiempo.setText(hr_text+":"+min_text+":"+sec_text+"."+milis_text);
			
		}
		
	});
	private JButton reinicio_1;
	
	public void paint(Graphics g) {
		
	}

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
		frame.setBounds(100, 100, 711, 533);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel tablero = new JPanel();
		tablero.setForeground(new Color(0, 0, 0));
		tablero.setBounds(20, 153, 376, 289);
		tablero.setBackground(new Color(232, 162, 2));
		tablero.setBorder(new MatteBorder(2, 2, 2, 2, (Color) new Color(232, 162, 2)));
		frame.getContentPane().add(tablero);
		
		
		btn1 = new JButton(numeros.get(1)+"");
		btn1.setForeground(new Color(0, 0, 0));
		btn1.setBackground(new Color(255, 255, 255));
		btn1.setFont(new Font("Bahnschrift", Font.BOLD, 20));
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
				
				tablero.repaint();
				tablero.revalidate();
				juegoGanado();
			}
			
		});
		tablero.setLayout(new GridLayout(0, 4, 0, 0));
		tablero.add(btn1);
		
		btn2 = new JButton(numeros.get(2)+"");
		btn2.setBackground(new Color(255, 255, 255));
		btn2.setForeground(new Color(0, 0, 0));
		btn2.setFont(new Font("Bahnschrift", Font.BOLD, 20));
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
				
				tablero.repaint();
				tablero.revalidate();
				juegoGanado();
			}
			
		});
		tablero.add(btn2);
		
		btn3 = new JButton(numeros.get(3)+"");
		btn3.setBackground(new Color(255, 255, 255));
		btn3.setForeground(new Color(0, 0, 0));
		btn3.setFont(new Font("Bahnschrift", Font.BOLD, 20));
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
				
				tablero.repaint();
				tablero.revalidate();
				juegoGanado();
			}
			
		});
		tablero.add(btn3);
		
		btn4 = new JButton(numeros.get(4)+"");
		btn4.setBackground(new Color(255, 255, 255));
		btn4.setForeground(new Color(0, 0, 0));
		btn4.setFont(new Font("Bahnschrift", Font.BOLD, 20));
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
				
				tablero.repaint();
				tablero.revalidate();
				juegoGanado();
			}
			
		});
		tablero.add(btn4);
		
		btn5 = new JButton(numeros.get(5)+"");
		btn5.setForeground(new Color(0, 0, 0));
		btn5.setBackground(new Color(255, 255, 255));
		btn5.setFont(new Font("Bahnschrift", Font.BOLD, 20));
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
				
				tablero.repaint();
				tablero.revalidate();
				juegoGanado();
			}
			
		});
		tablero.add(btn5);
		
		btn6 = new JButton(numeros.get(6)+"");
		btn6.setBackground(new Color(255, 255, 255));
		btn6.setForeground(new Color(0, 0, 0));
		btn6.setFont(new Font("Bahnschrift", Font.BOLD, 20));
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
				
				tablero.repaint();
				tablero.revalidate();
				juegoGanado();
			}
			
		});
		tablero.add(btn6);
		
		btn7 = new JButton(numeros.get(7)+"");
		btn7.setBackground(new Color(255, 255, 255));
		btn7.setForeground(new Color(0, 0, 0));
		btn7.setFont(new Font("Bahnschrift", Font.BOLD, 20));
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
				
				tablero.repaint();
				tablero.revalidate();
				juegoGanado();
			}
			
		});
		tablero.add(btn7);
		
		btn8 = new JButton(numeros.get(8)+"");
		btn8.setBackground(new Color(255, 255, 255));
		btn8.setForeground(new Color(0, 0, 0));
		btn8.setFont(new Font("Bahnschrift", Font.BOLD, 20));
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
				
				tablero.repaint();
				tablero.revalidate();
				juegoGanado();
			}
			
		});
		tablero.add(btn8);
		
		btn9 = new JButton(numeros.get(9)+"");
		btn9.setBackground(new Color(255, 255, 255));
		btn9.setForeground(new Color(0, 0, 0));
		btn9.setFont(new Font("Bahnschrift", Font.BOLD, 20));
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
				
				tablero.repaint();
				tablero.revalidate();
				juegoGanado();
			}
			
		});
		tablero.add(btn9);
		
		btn10 = new JButton(numeros.get(10)+"");
		btn10.setBackground(new Color(255, 255, 255));
		btn10.setForeground(new Color(0, 0, 0));
		btn10.setFont(new Font("Bahnschrift", Font.BOLD, 20));
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
				
				tablero.repaint();
				tablero.revalidate();
				juegoGanado();
			}
			
		});
		tablero.add(btn10);
		
		btn11 = new JButton(numeros.get(11)+"");
		btn11.setBackground(new Color(255, 255, 255));
		btn11.setForeground(new Color(0, 0, 0));
		btn11.setFont(new Font("Bahnschrift", Font.BOLD, 20));
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
				
				tablero.repaint();
				tablero.revalidate();
				juegoGanado();
			}
			
		});
		tablero.add(btn11);
		
		btn12 = new JButton(numeros.get(12)+"");
		btn12.setBackground(new Color(255, 255, 255));
		btn12.setForeground(new Color(0, 0, 0));
		btn12.setFont(new Font("Bahnschrift", Font.BOLD, 20));
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
				
				tablero.repaint();
				tablero.revalidate();
				juegoGanado();
			}
			
		});
		tablero.add(btn12);
		
		btn13 = new JButton(numeros.get(13)+"");
		btn13.setBackground(new Color(255, 255, 255));
		btn13.setForeground(new Color(0, 0, 0));
		btn13.setFont(new Font("Bahnschrift", Font.BOLD, 20));
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
				
				tablero.repaint();
				tablero.revalidate();
				juegoGanado();
			}
			
		});
		tablero.add(btn13);
		
		btn14 = new JButton(numeros.get(14)+"");
		btn14.setBackground(new Color(255, 255, 255));
		btn14.setForeground(new Color(0, 0, 0));
		btn14.setFont(new Font("Bahnschrift", Font.BOLD, 20));
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
				
				tablero.repaint();
				tablero.revalidate();
				juegoGanado();
			}
			
		});
		tablero.add(btn14);
		
		btn15 = new JButton(numeros.get(15)+"");
		btn15.setBackground(new Color(255, 255, 255));
		btn15.setForeground(new Color(0, 0, 0));
		btn15.setFont(new Font("Bahnschrift", Font.BOLD, 20));
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

				tablero.repaint();
				tablero.revalidate();
				juegoGanado();
			}
			
		});
		tablero.add(btn15);
		
		btn16 = new JButton(numeros.get(0)+"");
		btn16.setFont(new Font("Bahnschrift", Font.BOLD, 20));
		btn16.setBackground(new Color(255, 255, 255));
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
				
				tablero.repaint();
				tablero.revalidate();
				juegoGanado();
			}
			
		});
		tablero.add(btn16);
		
		
		// opciones 
		JPanel titulo = new JPanel();
		//titulo.setBackground(new Color(255, 255, 255));
		titulo.setOpaque(false);
		titulo.setBounds(10, 0, 400, 142);
		frame.getContentPane().add(titulo);
		titulo.setLayout(null);
		
		lblNewLabel_1 = new JLabel("15 PUZZLE");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(10, 0, 400, 60);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Cooper Black", Font.PLAIN, 60));
		titulo.add(lblNewLabel_1);
		
		JButton reinicio = new JButton("Reiniciar");
		reinicio.setForeground(new Color(255, 255, 255));
		reinicio.setBackground(new Color(209, 42, 88));
		reinicio.setVerticalAlignment(SwingConstants.BOTTOM);
		reinicio.setFont(new Font("Bahnschrift", Font.BOLD, 17));
		reinicio.setBounds(241, 99, 130, 32);
		reinicio.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				reiniciar();
			}
			
		});
		titulo.add(reinicio);
		
		JButton nuevo= new JButton("Nuevo tablero");
		nuevo.setForeground(new Color(255, 255, 255));
		nuevo.setBackground(new Color(90, 173, 1));
		nuevo.setVerticalAlignment(SwingConstants.BOTTOM);
		nuevo.setFont(new Font("Bahnschrift", Font.BOLD, 17));
		nuevo.setBounds(42, 99, 155, 32);
		nuevo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				revolver();
			}
			
		});
		titulo.add(nuevo);
		
		
		opciones = new JPanel();
		opciones.setBorder(null);
		opciones.setBounds(432, 11, 229, 413);
		opciones.setOpaque(false);
		frame.getContentPane().add(opciones);
		opciones.setLayout(null);

		iniciar = new JButton("Iniciar");
		iniciar.setForeground(new Color(255, 255, 255));
		iniciar.setBackground(new Color(209, 42, 88));
		iniciar.setFont(new Font("Bahnschrift", Font.BOLD, 17));
		iniciar.setBounds(48, 252, 130, 32);
		iniciar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					timer.start();
					iniciar.setText("Reanundar");
					iniciar.setEnabled(false);
					pausar.setEnabled(true);
					activarBtn();
			}
			
		});
		opciones.add(iniciar);	
		
		
		pausar = new JButton("Pausar");
		pausar.setFont(new Font("Bahnschrift", Font.BOLD, 17));
		pausar.setForeground(new Color(255, 255, 255));
		pausar.setBackground(new Color(0, 109, 184));
		pausar.setEnabled(false);
		pausar.setBounds(48, 295, 130, 32);
		pausar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
					timer.stop();
					pausar.setEnabled(false);
					iniciar.setEnabled(true);
					desactivarBtn();
					
			}
			
		});
		opciones.add(pausar);
		
		/*JButton prueba = new JButton("prueba");
		prueba.setBounds(140, 0, 89, 23);
		prueba.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				pruebaGanar();
			}
			
		});
		opciones.add(prueba);*/
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new LineBorder(new Color(90, 173, 1), 3), "Tiempo: ", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(0, 151, 229, 77);
		panel.setOpaque(false);
		opciones.add(panel);
		panel.add(labelTiempo);
		labelTiempo.setFont(new Font("Tahoma", Font.PLAIN, 30));
		labelTiempo.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		labelTiempo.setText(hr_text+":"+min_text+":"+sec_text+"."+milis_text);
		
		ImageIcon fondo_img=new ImageIcon(RompecabezasNumerico.class.getResource("/aplication/fondo_puzzle.png"));
		JLabel Fondo = new JLabel("");
		Fondo.setHorizontalAlignment(SwingConstants.CENTER);
		Fondo.setIcon(new ImageIcon(fondo_img.getImage().getScaledInstance(711, 533, Image.SCALE_SMOOTH)));
		Fondo.setBounds(0, 0, 695, 494);
		frame.getContentPane().add(Fondo);
		
		
		
	}
	
	public void stop() {
		timer.stop();
	}
	
	public void juegoGanado() {
		for (int i = 0; i < 15; i++) {
	        if (numeros.get(i) != i + 1) {
	            return;
	        }
	    }
		
	    if (numeros.get(15)==0) {
	    	stop();
	        JOptionPane.showMessageDialog(frame, "¡Felicidades! Completaste el juego\nTiempo jugando: "+labelTiempo.getText(), "Juego Completado", JOptionPane.INFORMATION_MESSAGE);
	        reiniciar();
	    }
	}
	
	public void desactivarBtn() {
		btn1.setEnabled(false);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
		btn8.setEnabled(false);
		btn9.setEnabled(false);
		btn10.setEnabled(false);
		btn11.setEnabled(false);
		btn12.setEnabled(false);
		btn13.setEnabled(false);
		btn14.setEnabled(false);
		btn15.setEnabled(false);
		btn16.setEnabled(false);
		
	}
	
	public void activarBtn() {
		btn1.setEnabled(true);
		btn2.setEnabled(true);
		btn3.setEnabled(true);
		btn4.setEnabled(true);
		btn5.setEnabled(true);
		btn6.setEnabled(true);
		btn7.setEnabled(true);
		btn8.setEnabled(true);
		btn9.setEnabled(true);
		btn10.setEnabled(true);
		btn11.setEnabled(true);
		btn12.setEnabled(true);
		btn13.setEnabled(true);
		btn14.setEnabled(true);
		btn15.setEnabled(true);
		btn16.setEnabled(true);
		
	}
	
	public void revolver() {
		btn1.setText(numeros.get(1)+ "");
		btn2.setText(numeros.get(2)+ "");
		btn3.setText(numeros.get(3)+ "");
		btn4.setText(numeros.get(4)+ "");
		btn5.setText(numeros.get(5)+ "");
		btn6.setText(numeros.get(6)+ "");
		btn7.setText(numeros.get(7)+ "");
		btn8.setText(numeros.get(8)+ "");
		btn9.setText(numeros.get(9)+ "");
		btn10.setText(numeros.get(10)+ "");
		btn11.setText(numeros.get(11)+ "");
		btn12.setText(numeros.get(12)+ "");
		btn13.setText(numeros.get(13)+ "");
		btn14.setText(numeros.get(14)+ "");
		btn15.setText(numeros.get(15)+ "");
		btn16.setText(numeros.get(0)+ "");
		
		Collections.shuffle(numeros);
		frame.repaint();
	}
	
	public void reiniciar() {
		revolver();
		
		stop();
		elapsedTime=0;
		miliS=0;
		sec=0;
		min=0;
		hr=0;
		
		milis_text=String.format("%03d",miliS);
		sec_text=String.format("%02d",sec);
		min_text=String.format("%02d",min);
		hr_text=String.format("%02d",hr);
		
		labelTiempo.setText(hr_text+":"+min_text+":"+sec_text+"."+milis_text);
		
		iniciar.setText("Iniciar");
		iniciar.setEnabled(true);
        pausar.setEnabled(false);
		
		frame.repaint();
	}
	
	/*private void pruebaGanar() {
	    numeros.clear();
	    
	    // Llenamos la lista con los números en orden
	    for (int i = 1; i <= 15; i++) {
	        numeros.add(i);
	    }
	    numeros.add(0); // El último espacio es el vacío

	    // Asignamos los valores ordenados a los botones
	    btn1.setText(numeros.get(0) + "");
	    btn2.setText(numeros.get(1) + "");
	    btn3.setText(numeros.get(2) + "");
	    btn4.setText(numeros.get(3) + "");
	    btn5.setText(numeros.get(4) + "");
	    btn6.setText(numeros.get(5) + "");
	    btn7.setText(numeros.get(6) + "");
	    btn8.setText(numeros.get(7) + "");
	    btn9.setText(numeros.get(8) + "");
	    btn10.setText(numeros.get(9) + "");
	    btn11.setText(numeros.get(10) + "");
	    btn12.setText(numeros.get(11) + "");
	    btn13.setText(numeros.get(12) + "");
	    btn14.setText(numeros.get(13) + "");
	    btn15.setText(numeros.get(14) + "");
	    btn16.setText(""); // Espacio vacío

	    frame.repaint(); // Redibuja la interfaz
	}*/
}
