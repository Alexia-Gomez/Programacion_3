package aplication;

import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Ejer26 implements KeyListener{

	private JFrame frame;
	public PaintPanel panel_1;
	private Player player;
	private ArrayList<Player> obstaculos = new ArrayList<Player>();

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
		frame.setBounds(100, 100, 650, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(100, 100, 179));
		frame.getContentPane().add(panel, BorderLayout.SOUTH);
		
		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				player.x=250;
				player.y=200;
				
				panel_1.repaint();
				panel_1.setFocusable(true);
				panel_1.requestFocus();
			}
		});
		btnNewButton.setBackground(new Color(255, 255, 255));
		panel.add(btnNewButton);
		
		panel_1 = new PaintPanel();
		panel_1.setBackground(new Color(29, 32, 69));
		panel_1.setOpaque(true);
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.addKeyListener(this);
		panel_1.setFocusable(true);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(100, 100, 179));
		frame.getContentPane().add(panel_2, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("00:00:00.000");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(128, 128, 192));
		panel_2.add(lblNewLabel);
		
		player=new Player(250, 200,30 ,30 , Color.white);
		obstaculos.add(new Player(150, 50,350 ,30 , Color.black ));
		obstaculos.add(new Player(200, 300,200 ,30 , Color.black));
		
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
				g2.setColor(Color.black);
				g2.fillRect(pared.x,pared.y,pared.w, pared.h);
			}
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		Player copia = new Player(player.x, player.y, player.w, player.h, player.c);
		
		if(e.getKeyCode()==87) {
			copia.y-=5;
			
		}
		if(e.getKeyCode()==83) {
			copia.y+=5;
			
		}
		if(e.getKeyCode()==65) {
			copia.x-=5;
			
		}
		if(e.getKeyCode()==68) {
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
        
        
        panel_1.repaint();
        
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
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
