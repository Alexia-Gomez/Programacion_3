package aplication;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Toolkit;

public class Ejer26 implements KeyListener{

	private JFrame frame;
	public PaintPanel panel_1;
	private Player player;
	Rectangle meta;
	private JLabel lblNewLabel;
	Timer timer, timer2;
	int seg=0, mili=0;
	boolean timerStart=false;
	private int lastPress=0;
	private ArrayList<Player> obstaculos = new ArrayList<Player>();
	int [][] laberinto = {
			{1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
		    {1,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1},
		    {1,0,1,0,1,1,1,0,1,1,1,1,1,1,1,0,1,1,0,1,0,1,1,0,1,1,1,1,1,0,1,0,1,1,1,1,1,1,1,0,1},
		    {1,0,1,0,1,0,0,0,1,0,0,0,0,0,1,0,0,1,0,1,0,0,1,0,0,0,0,0,1,0,1,0,0,0,0,0,0,0,1,0,1},
		    {1,0,1,0,1,0,1,1,1,0,1,1,1,0,1,1,0,1,0,1,1,0,1,1,1,1,1,0,1,0,1,1,1,1,1,1,1,0,1,1,1},
		    {1,0,1,0,1,0,0,0,1,0,1,0,1,0,0,1,0,1,0,0,1,0,1,0,0,0,1,0,0,0,0,0,0,0,1,0,1,0,0,0,1},
		    {1,0,1,0,1,1,1,0,1,0,1,0,1,1,0,1,0,1,1,1,1,0,1,0,1,1,1,1,1,1,1,1,1,0,1,0,1,0,0,0,1},
		    {1,0,1,0,0,0,1,0,0,0,1,0,0,0,0,1,0,0,0,1,0,0,0,0,1,0,0,0,0,0,1,1,1,0,0,0,1,1,1,0,1},
		    {1,0,1,1,1,0,1,1,1,1,1,0,1,1,1,1,1,1,0,0,0,1,1,1,1,0,1,1,1,0,0,1,1,1,1,0,0,0,1,0,1},
		    {1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,0,1,1,1,1,1,0,0,0,0,1,0,1,1,0,0,1,1,1,0,1,1,1,0,1},
		    {1,1,1,0,1,1,1,0,1,0,1,1,1,0,1,0,1,0,0,0,0,0,0,1,0,0,1,0,1,0,0,0,0,1,1,0,1,0,0,0,1},
		    {1,0,1,0,0,0,1,0,1,0,1,0,0,0,1,0,1,0,1,1,1,1,1,1,1,1,1,0,1,0,0,0,0,0,1,0,1,0,1,0,1},
		    {1,0,1,1,1,0,1,0,1,0,1,0,1,0,1,0,1,0,0,0,1,0,0,0,0,0,0,0,1,0,1,1,1,1,1,0,1,0,1,0,1},
		    {1,0,0,0,1,0,1,0,1,0,1,1,1,0,1,1,1,1,1,0,1,0,1,1,1,1,1,0,1,0,1,1,1,1,1,0,1,0,1,0,1},
		    {1,0,1,0,0,0,1,0,1,0,1,0,0,0,1,0,0,0,0,0,1,0,1,0,0,0,1,0,1,0,1,0,0,0,0,0,1,0,1,0,1},
		    {1,0,1,1,1,1,1,0,1,0,1,0,1,0,1,0,1,1,1,1,1,1,1,0,1,0,1,0,1,0,1,0,0,0,0,0,1,0,1,0,1},
		    {1,0,0,0,0,0,1,0,0,0,0,0,1,0,1,0,0,0,1,0,0,0,0,0,1,0,0,0,1,0,1,0,1,1,1,1,1,0,1,0,1},
		    {1,1,1,1,1,0,1,0,1,1,1,1,1,1,1,1,1,0,1,0,1,1,1,1,1,1,1,0,1,0,1,0,1,1,1,0,0,0,1,0,1},
		    {1,0,0,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,1,0,0,1,0,0,0,0,1,0,1,0,1,1,0,0,1,1,1,0,1},
		    {1,0,1,1,1,1,1,1,1,1,1,0,1,0,1,0,1,1,1,0,0,0,0,1,0,1,1,1,1,0,1,1,1,0,0,0,1,0,0,0,1},
		    {1,0,1,0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,1,0,0,1,0,1,0,0,0,0,1,0,0,0,0,0,0,0,1,0,1,1,1},
		    {1,0,1,1,1,0,1,1,1,0,1,0,1,0,1,0,1,0,1,0,1,1,0,1,1,1,1,0,1,1,1,1,1,1,1,1,1,0,1,0,1},
		    {1,0,0,0,0,0,1,0,1,0,0,0,1,0,1,0,1,0,1,0,1,0,0,1,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1},
		    {1,1,1,1,1,1,1,0,1,1,1,1,1,0,1,1,1,0,1,0,1,0,1,1,0,1,0,1,1,1,1,1,1,1,1,0,1,1,1,0,1},
		    {1,0,0,0,0,0,0,0,0,0,0,0,1,0,1,0,0,0,1,0,1,0,0,1,0,1,0,1,0,0,0,1,0,0,0,0,0,0,1,0,1},
		    {1,0,1,1,1,1,1,0,1,0,1,1,1,0,1,0,1,1,1,0,1,1,0,1,0,1,0,1,0,1,0,1,1,1,1,1,1,1,1,0,1},
		    {1,0,1,0,0,0,1,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,1,0,1,0,1,0,1,0,1,0,0,0,1,0,0,0,0,1},
		    {1,0,1,0,1,0,1,0,1,1,1,0,1,1,1,1,1,1,1,1,1,0,1,1,0,0,0,1,0,1,0,1,0,0,0,1,0,0,0,0,1},
		    {1,0,1,0,1,0,1,0,1,0,1,0,1,0,0,0,0,0,0,0,0,0,1,0,0,1,1,1,0,1,0,1,0,1,0,0,0,1,1,1,1},
		    {1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,1,1,0,1,1,1,1,1,1,0,1,0,0,0,1,0,0,0,1,0,0,0,1,1,0,1},
		    {1,0,1,0,1,0,1,0,0,0,1,0,1,0,0,0,1,0,0,0,0,0,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,0,1},
		    {1,0,1,0,1,0,1,1,1,1,1,0,1,1,1,0,1,1,1,1,1,1,0,1,0,1,0,0,0,0,0,0,0,1,1,0,0,0,0,0,1},
		    {1,0,1,0,1,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,1,0,1,1,1,1,1,1,1,0,0,1,1,0,1,1,0,1},
		    {1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,0,1,1,0,1,1,1,1,1,0,1,0,0,0,0,0,1,1,0,1,1,1,1,1,0,1},
		    {1,0,1,0,0,0,1,0,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,1,0,1,1,1,0,0,1,0,0,0,0,0,0,0,1},
		    {1,1,1,1,1,0,1,0,1,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,0,1,0,1,0,1,1,1,1,1,1,1,1,0,1},
		    {1,0,0,0,0,0,1,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,1,0,0,0,0,1,0,1,0,0,0,1,0,0,0,1,1,0,1},
		    {1,0,1,1,1,1,1,1,1,1,1,0,1,1,1,0,1,1,1,1,1,0,1,0,1,1,1,1,0,1,1,1,0,1,0,1,0,0,1,0,1},
		    {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0},
		    {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1}
			};

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejer26 window = new Ejer26();
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
	public Ejer26() {
		initialize();
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(Ejer26.class.getResource("/aplication/sky.jpg")));
		frame.setBounds(100, 100, 545, 630);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(29, 32, 69));
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(29, 32, 69));
		frame.getContentPane().add(panel_2, BorderLayout.NORTH);
		
		lblNewLabel = new JLabel("0:0");
		lblNewLabel.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(128, 128, 192));
		panel_2.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.setFont(new Font("Verdana", Font.PLAIN, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText("0:0");
				reinicio();
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		panel.add(btnNewButton);
		
		panel_1 = new PaintPanel();
		panel_1.setBackground(new Color(100, 100, 179));
		panel_1.setOpaque(true);
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.addKeyListener(this);
		panel_1.setFocusable(true);
		
		player=new Player(15, 0,9 ,9 , Color.white);
		meta = new Rectangle(520, 495,10,10);
		//obstaculos.add(new Player(150, 50,10 ,10 , Color.gray ));
		/*obstaculos.add(new Player(150, 50,350 ,30 , Color.gray ));
		obstaculos.add(new Player(200, 300,200 ,30 , Color.gray));*/
		int tamanoCelda = 13;

		for (int fila = 0; fila < laberinto.length; fila++) {
		    for (int col = 0; col < laberinto[0].length; col++) {
		        if (laberinto[fila][col] == 1) {
		            int x = col * tamanoCelda;
		            int y = fila * tamanoCelda;
		            obstaculos.add(new Player(x, y, tamanoCelda, tamanoCelda, Color.black));
		        }
		    }
		}
		
		timer = new Timer(100, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mili+=100;
				if(mili>=1000) {
					seg++;
					mili=0;
				}
				lblNewLabel.setText(seg+":"+(mili/10));
			}
			
		});
		
		
		ActionListener movimiento = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				update();
			}
			
		};
		timer2=new Timer(5, movimiento);
				
	}
	
	class PaintPanel extends JPanel{
		
		public PaintPanel() {
			this.setBackground(new Color(29, 32, 69));
		}
		
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			Graphics2D g2 = (Graphics2D) g;
			
			g2.setColor(Color.white);
			g2.fillRect(player.x,player.y,player.w, player.h);
			
			for(Player pared:obstaculos) {
				g2.setColor(new Color(29, 32, 69));
				g2.fillRect(pared.x,pared.y,pared.w, pared.h);
			}
			
			g2.setColor(Color.white);
			g2.fillRect(meta.x,meta.y,meta.width, meta.height);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(!timerStart) {
			timer.start();
			timerStart=true;
		}
		
		timer2.start();
		
		lastPress=e.getKeyCode();
		
		update();
        
	}
	
	public void update(){
		Player copia = new Player(player.x, player.y, player.w, player.h, player.c);
		
		if(lastPress==87) {
			copia.y-=5;
			
		}
		if(lastPress==83) {
			copia.y+=5;
			
		}
		if(lastPress==65) {
			copia.x-=5;
			
		}
		if(lastPress==68) {
			copia.x+=5;
			
		}
		
		
		Rectangle copiaRect = copia.getBounds();
        boolean colision = false;

        for (Player obstaculo : obstaculos) {
            if (copiaRect.intersects(obstaculo.getBounds())) {
                colision = true;
                System.out.println("COLISION");
                break;
            }
        }

        if (!colision) {
            player.x = copia.x;
            player.y = copia.y;
        }
		
        int ancho = frame.getWidth();
        int alto = frame.getHeight();

        if (player.x + player.w < 0) {
            player.x = ancho;
        } else if (player.x > ancho) {
            player.x = 0; 
        }

        if (player.y + player.h < 0) {
            player.y = alto; 
        } else if (player.y > alto) {
            player.y = 0;
        }
        
        
        if(player.getBounds().intersects(meta)) {
        	timer.stop();
        	timer2.stop();
        	JOptionPane.showMessageDialog(frame,"¡FELICIDADES, completaste el juego en: "
        									+seg+":"+(mili/10));
        	reinicio();
            timer2.start();
        }
        
        panel_1.repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void reinicio() {
		player.x=15;
		player.y=0;
		lastPress=0;
		seg=0;
		mili=0;
		lblNewLabel.setText("0:0");
		timer.stop();
		timerStart=false;
		panel_1.setFocusable(true);
		panel_1.requestFocus();
		panel_1.repaint();
	}
	
	class Player {
		
		int x=0,y=0,w=0,h=0;
		Color  c=Color.black;
		
		public Player(int x,  int y, int w, int h, Color c) {
			this.x=x;
			this.y=y;
			this.w=w;
			this.h=h;
			this.c=c;
			
		}
		
		public Rectangle getBounds() {
            return new Rectangle(x, y, w, h);
        }
		
		/*public Boolean colision(Player target) {
			if((this.x < target.x + target.w &&
                 this.x + this.w > target.x &&
                 this.y < target.y + target.h &&
                 this.y + this.h > target.y)) {
				return true;
			}
			
			return false;
		}*/
		
	}
	
}
