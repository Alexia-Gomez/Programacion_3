package aplication;

import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class graphics extends JFrame {

	public graphics(String title) {
		this.setIconImage(new ImageIcon("C:\\Users\\alexi\\OneDrive\\Imágenes\\mario-icon.png").getImage());
		this.setTitle(title);
		this.setVisible(true);
		this.setSize(800,600);
		this.setBackground(Color.BLACK);
		
		this.setResizable(true);
		this.setLayout(new BorderLayout());
		
		//cuando_cierro_mi_aplicacion
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//sobre_que_elemento_colocare_el_item
		this.setLocationRelativeTo(null);
		
		this.setMinimumSize(new Dimension(600, 600));
		this.setMaximumSize(new Dimension(850,850));
		
		this.setResizable(true);
		
		this.repaint();
		this.revalidate();
	}
	
	/*@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		//FONDO
		g2.setColor(new Color(178, 238, 254));
		g2.fillRect(0, 0, 850, 600);
		
		//BLOQUES
			//azul
		//sombra
		g2.setColor(Color.black);
		g2.fillRoundRect(430, 280, 50, 240, 10, 30);
		g2.fillRoundRect(297, 248, 155, 250, 10, 30);
		
		//resalte
		g2.setColor(new Color(15, 141, 220));
		g2.fillRoundRect(300, 250, 150, 250, 10, 30);
		//base
		g2.setColor(new Color(132, 192, 255));
		g2.fillRoundRect(300, 250, 143, 245, 10, 30);
		//tornillos
		g2.setColor(new Color(193, 206, 222));
		g2.fillOval(305, 255, 15, 15);
		g2.fillOval(429, 255, 15, 15);
		g2.fillOval(429, 480, 15, 15);
		
		g2.setColor(Color.black);
		g2.setStroke(new BasicStroke(2));
		g2.drawOval(305, 255, 15, 15);
		g2.drawLine(308, 267 , 316, 257);
		
		g2.drawOval(429, 255, 15, 15);
		g2.drawOval(429, 480, 15, 15);
		g2.drawLine(432, 267, 440, 257);
		g2.drawLine(432, 492, 440, 484);
		
			//rosa
		//sombra
		g2.setColor(Color.black);
		g2.fillRoundRect(330, 380, 50, 140, 10, 30);
		g2.fillRoundRect(198, 347,154 , 153, 10, 30);
		
		//resalte
		g2.setColor(new Color(235, 148, 107));
		g2.fillRoundRect(200, 350, 150, 150, 10, 30);
		//base
		g2.setColor(new Color(255, 195, 184));
		g2.fillRoundRect(200, 350, 145, 145, 10, 30);
		//tornillos
		g2.setColor(new Color(193, 206, 222));
		g2.fillOval(205, 355, 15, 15);
		g2.fillOval(329, 355, 15, 15);
		g2.fillOval(205, 480, 15, 15);
		g2.fillOval(329, 480, 15, 15);
		
		g2.setColor(Color.black);
		g2.setStroke(new BasicStroke(2));
		g2.drawOval(205, 355, 15, 15);
		g2.drawOval(205, 480, 15, 15);
		
		g2.drawLine(208, 367, 216, 357);
		g2.drawLine(208, 492, 216, 484);
		
		
		g2.drawOval(329, 355, 15, 15);
		g2.drawOval(329, 480, 15, 15);
		
		g2.drawLine(330, 367, 341, 357);
		g2.drawLine(330, 492, 341, 484);
		
	
		
			//verde
		//borde
		g2.setColor(Color.black);
		g2.fillRoundRect(717, 347, 143, 153,10 ,30 );
		//resalte
		g2.setColor(new Color(39, 122, 45));
		g2.fillRoundRect(720, 350, 150, 150, 10, 30);
		//base
		g2.setColor(new Color(81, 217, 107));
		g2.fillRoundRect(720, 350, 140, 145, 10, 30);
		//tornillos
		g2.setColor(new Color(193, 206, 222));
		g2.fillOval(725, 355, 15, 15);
		g2.fillOval(725, 480, 15, 15);
		
		g2.setColor(Color.black);
		g2.drawOval(725, 355, 15, 15);
		g2.drawOval(725, 480, 15, 15);
		
		g2.drawLine(728, 367, 736, 358);
		g2.drawLine(728, 493, 736, 484);
		
		
		//bloques aire
			//doble
		g2.setColor(Color.black);
		g2.fillRect(128, 102, 115, 58);
		
		g2.setColor(new Color(254, 146, 92));
		g2.fillRect(135, 105, 50, 50);
		g2.fillRect(190, 105, 50, 50);
		//
		g2.setColor(Color.black);
		g2.fillRect(140, 110, 4, 4);
		g2.fillRect(140, 145, 4, 4);
		g2.fillRect(175, 110, 4, 4);
		g2.fillRect(175, 145, 4, 4);
		
		g2.fillRect(195, 110, 4, 4);
		g2.fillRect(195, 145, 4, 4);
		g2.fillRect(230, 110, 4, 4);
		g2.fillRect(230, 145, 4, 4);
		
		
			//izq
		g2.setColor(Color.black);
		g2.fillRect(45, 295, 58, 58);
		
		g2.setColor(new Color(254, 146, 92));
		g2.fillRect(50, 300, 50, 50);
		//
		g2.setColor(Color.black);
		g2.fillRect(55, 305, 4, 4);
		g2.fillRect(55, 340, 4, 4);
		
		g2.fillRect(90, 305, 4, 4);
		g2.fillRect(90, 340, 4, 4);
		
		
			//der
		g2.setColor(Color.black);
		g2.fillRect(700, 155, 60, 54);
		
		g2.setColor(new Color(254, 146, 92));
		g2.fillRect(705, 157, 50, 50);
		//
		g2.setColor(Color.black);
		g2.fillRect(710, 163, 4, 4);
		g2.fillRect(710, 197, 4, 4);
		
		g2.fillRect(745, 163, 4, 4);
		g2.fillRect(745, 197, 4, 4);
		
		
		//maceta
		
			//negro
		g2.fillRect(555, 350, 115, 45);
		g2.fillRect(565, 395, 100, 110);
		
			//verde
		g2.setColor(new Color(29, 131, 27));
		g2.fillRect(560, 355, 105, 35);
		g2.fillRect(568, 400, 93, 98);
		
		g2.setColor(Color.black);
		g2.fillRect(620, 355, 43, 35);
		g2.fillRect(628, 400, 30, 98);
		
		g2.setColor(new Color(29, 131, 27));
		g2.fillRect(633, 400, 3, 98);
		g2.fillRect(634, 355, 8, 35);
		
			//claro
		g2.setColor(new Color(75, 221, 100));
		
				//sup
		g2.fillRect(627, 355, 3, 35);
		g2.fillRect(565, 355, 5, 35);
		g2.fillRect(575, 355, 10, 35);
		g2.fillRect(618, 355, 3, 35);
		
				//inf
		g2.fillRect(575, 400, 3, 98);
		g2.fillRect(583, 400, 10, 98);
		g2.fillRect(625, 400, 3, 98);
		g2.fillRect(640, 400, 2, 98);
		
		//PISO
		g2.setColor(new Color(247, 208, 188));
		g2.fillRect(0, 501, 850, 20);
		
		g2.setColor(new Color( 246, 152, 119));
		g2.fillRect(0, 521, 850, 80);
		
		g2.setStroke(new BasicStroke(2));
		g2.setColor(Color.black);
		g2.drawLine(0, 500, 850, 500);
		
		g2.setColor(new Color(92, 33, 22));
		g2.drawLine(0, 521, 850, 521);
		
		
		
		//imagenes
		
		BufferedImage mario, arbusto, planta, bola;
		try {
			mario = ImageIO.read(new File("C:\\Users\\alexi\\OneDrive\\Imágenes\\figura-mario.png"));
			arbusto = ImageIO.read(new File("C:\\Users\\alexi\\OneDrive\\Imágenes\\arbusto.png"));
			planta = ImageIO.read(new File("C:\\Users\\alexi\\OneDrive\\Imágenes\\planta.png"));
			bola = ImageIO.read(new File("C:\\Users\\alexi\\OneDrive\\Imágenes\\bola.png"));
			
			g2.drawImage(mario,
						430,
						425,
						40,
						80, 
						null);
			
			g2.drawImage(arbusto,
						0,
						440,
						70,
						70, 
						null);
			
			g2.drawImage(planta,
					565,
					248,
					100,
					130, 
					null);
			
			g2.drawImage(bola,
					490,
					355,
					45,
					45, 
					null);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}*/
	
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		//FONDO
		g2.setColor(new Color(6, 101, 192));
		g2.fillRect(0, 0, 800, 600);
		
		
		//Montañas back
			//1
		g2.setColor(new Color(198, 227, 231));//montañas back
		g2.fillArc(30, 200, 130, 150, 0, 180);
		g2.fillRect(30, 275, 130, 225);
		
		g2.setColor(new Color(236, 243, 254));
		g2.fillOval(50, 355, 15, 25);
		g2.fillOval(100, 250, 15, 25);
		g2.fillOval(100, 320, 15, 25);
		
			//2
		g2.setColor(new Color(198, 227, 231));
		g2.fillArc(350, 200, 130, 150, 0, 180);
		g2.fillRect(350, 275, 130, 225);
		
		g2.setColor(new Color(236, 243, 254));
		g2.fillOval(380, 355, 15, 25);
		g2.fillOval(380, 290, 15, 25);
		g2.fillOval(420, 250, 15, 25);
		
			//3
		g2.setColor(new Color(198, 227, 231));
		g2.fillArc(480, 100, 130, 150, 0, 180);
		g2.fillRect(480, 175, 130, 325);
		
		g2.setColor(new Color(236, 243, 254));
		g2.fillOval(510, 250, 15, 25);
		g2.fillOval(550, 150, 15, 25);
		
		
		//nubes
		g2.setColor(new Color(236, 243, 254));
		g2.fillArc(60, 278, 50, 40, 270, 180);
		g2.fillRect(0, 278, 85, 40);
		
		g2.fillArc(335, 315, 50, 40, 270, 180);
		g2.fillRect(185, 315, 175, 40);
		g2.fillArc(160, 315, 50, 40, 90, 180);
		
		g2.fillArc(240, 395, 50, 40, 90, 180);
		g2.fillRect(265, 395, 85, 40);
		
		g2.fillArc(300, 435, 50, 40, 270, 180);
		g2.fillRect(160, 435, 165, 40);
		
		g2.fillArc(240, 475, 50, 40, 90, 180);
		g2.fillRect(265, 475, 85, 40);
		
		g2.fillArc(650, 255, 50, 40, 270, 180);
		g2.fillRect(610, 255, 65, 40);
		
		g2.fillArc(610, 215, 50, 40, 90, 180);
		g2.fillRect(635, 215, 80, 40);
		g2.fillArc(690, 215, 50, 40, 270, 180);
		
		//Montañas front
		
			//1
		g2.setColor(new Color(23, 78, 103));//borde
		g2.fillArc(-60, 388, 175, 150, 0, 180);
		g2.fillRect(-60, 460, 175, 40);
		
		g2.setColor(new Color(118, 178, 215));
		g2.fillArc(-65, 390, 175, 150, 0, 180);
		g2.fillRect(-65, 460, 175, 40);
		
			//2
		g2.setColor(new Color(23, 78, 103));//borde		
		g2.fillArc(348, 388, 179, 150, 0, 180);
		g2.fillRect(348, 460, 175, 40);
		
		g2.setColor(new Color(118, 178, 215));
		g2.fillArc(350, 390, 175, 150, 0, 180);
		g2.fillRect(350, 460, 175, 40);
		
			//3
		g2.setColor(new Color(23, 78, 103));//borde	
		g2.fillArc(523, 298, 179, 150, 0, 180);
		g2.fillRect(523, 373, 179, 127);
		
		g2.setColor(new Color(118, 178, 215));
		g2.fillArc(525, 300, 175, 150, 0, 180);
		g2.fillRect(525, 375, 175, 125);
		
		g2.setColor(new Color(198, 227, 231));
		g2.fillOval(570, 345, 15, 25);
		g2.fillOval(640, 425, 15, 25);
		 	//nube
		g2.setColor(new Color(236, 243, 254));
		g2.fillArc(620, 475, 50, 40, 90, 180);
		g2.fillRect(645, 475, 150, 40);
		
		
		//maceta	
			//negro
		g2.setColor(Color.black);
		g2.fillRect(410, 389, 85, 45);
		g2.fillRect(415, 400, 75, 100);
		
			//morado
		g2.setColor(new Color(78, 72, 151));
		g2.fillRect(413, 391, 78, 39);
		g2.fillRect(417, 435, 67, 65);
		
			//claro
		g2.setColor(new Color(134, 131, 210));
	
		g2.fillRect(425, 391, 5, 39);	
		g2.fillRect(430, 435, 4, 65);
		
		g2.setColor(Color.white);
		g2.fillRect(430, 391, 10, 39);
		g2.fillRect(434, 435, 10, 65);
		
		
		//PISO
		g2.setColor(new Color(18, 207, 24));
		g2.fillRect(0, 501, 800, 20);
		
		g2.setColor(new Color( 204, 158, 95));
		g2.fillRect(0, 521, 800, 80);
		
		g2.setStroke(new BasicStroke(2));
		g2.setColor(Color.black);
		g2.drawLine(0, 500, 800, 500);
		
		g2.setColor(new Color(145, 115, 46));
		g2.drawLine(0, 521, 800, 521);
		
		
		//maceta2
			//negro
		g2.setColor(Color.black);
		g2.fillRect(725, 430, 65, 35);
		g2.fillRect(730, 445, 75, 55);
			//morado
		g2.setColor(new Color(78, 72, 151));
		g2.fillRect(728, 432, 65, 28);
		g2.fillRect(733, 465, 67, 35);
		
			//claro
		g2.setColor(new Color(134, 131, 210));
			
		g2.fillRect(740, 432, 5, 28);	
		g2.fillRect(745, 465, 5, 35);
				
		g2.setColor(Color.white);
		g2.fillRect(745, 432, 10, 28);
		g2.fillRect(750, 465, 10, 35);
		
		
		//piedras
		g2.setColor(Color.black);
		g2.fillRoundRect(680, 465, 40, 35, 15, 5);
		g2.fillRoundRect(680, 430, 40, 35, 15, 5);
		g2.fillRoundRect(680, 395, 40, 35, 15, 5);
		g2.fillRoundRect(680, 360, 40, 35, 15, 5);
		
		g2.fillRoundRect(720, 360, 40, 35, 15, 5);
		g2.fillRoundRect(760, 360, 40, 35, 15, 5);
		
		//dentro
		g2.setColor(Color.gray);
		g2.fillRoundRect(683, 467, 35, 31, 15, 5);
		g2.fillRoundRect(683, 432, 35, 31, 15, 5);
		g2.fillRoundRect(683, 397, 35, 31, 15, 5);
		g2.fillRoundRect(683, 362, 35, 31, 15, 5);
		
		g2.setColor(Color.yellow);
		g2.fillRoundRect(723, 362, 35, 31, 15, 5);
		g2.fillRoundRect(763, 362, 35, 31, 15, 5);
		
		g2.setColor(Color.black);
		g2.fillOval(733, 370, 5, 10);
		g2.fillOval(744, 370, 5, 10);
		
		
		//imagenes
		BufferedImage mario2, planta2, arbusto2;
		try {
			mario2 = ImageIO.read(new File("C:\\Users\\alexi\\OneDrive\\Imágenes\\figura-mario2.png"));
			planta2 = ImageIO.read(new File("C:\\Users\\alexi\\OneDrive\\Imágenes\\planta2.png"));
			arbusto2 = ImageIO.read(new File("C:\\Users\\alexi\\OneDrive\\Imágenes\\arbusto2.png"));
			
			g2.drawImage(planta2,
					425,
					310,
					50,
					50, 
					null);
			
			g2.drawImage(mario2,
					345,
					430,
					70,
					80, 
					null);

			g2.drawImage(arbusto2,
					145,
					455,
					130,
					60, 
					null);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
}
