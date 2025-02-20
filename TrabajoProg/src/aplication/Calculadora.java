package aplication;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculadora extends JFrame{
	
	public Calculadora(String title) {
		this.setTitle(title);
		this.setVisible(true);
		this.setSize(550,640);
		
		this.setResizable(true);
		this.setLayout(null);
		
		//cuando_cierro_mi_aplicacion
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//sobre_que_elemento_colocare_el_item
		this.setLocationRelativeTo(null);
		
		this.setMinimumSize(new Dimension(560,600));
		this.setMaximumSize(new Dimension(600,600));
		
		this.add(this.resultado());
		this.add(this.botones());
		this.repaint();
	}
	
	Font btn = new Font("Nunito", Font.BOLD, 30);
	
	public JPanel resultado() {
		JPanel resultado = new JPanel();
		resultado.setLocation(0,0);
		resultado.setSize(550,100);
		resultado.setOpaque(true);
		resultado.setBackground(new Color(200, 213, 227));
		resultado.setVisible(true);
		resultado.setLayout(null);
		
		JLabel texto = new JLabel("0");
		texto.setBounds(20, 15, 500, 70);
		texto.setHorizontalAlignment(JLabel.RIGHT);
		texto.setBackground(Color.WHITE);
		texto.setOpaque(true);
		texto.setFont( new Font("Nunito", Font.BOLD, 40));
		resultado.add(texto);
		
		resultado.revalidate();
		return resultado;
		
	}
	
	public JPanel botones() {
		JPanel botones = new JPanel();
		botones.setLayout(new GridLayout(5,4, 10, 10));
		botones.setLocation(0,100);
		botones.setSize(550,500);
		botones.setOpaque(true);
		botones.setBackground(new Color(165, 185, 208));
		botones.setVisible(true);
		
		JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt0, btP, btCE, btCL, 
		btMas, btMenos, btMul, btDiv, btIgual, btMN, btPunto;
		
		bt1=new JButton("1");
        bt2=new JButton("2");
        bt3=new JButton("3");
        bt4=new JButton("4");
        bt5=new JButton("5");
        bt6=new JButton("6");
        bt7=new JButton("7");
        bt8=new JButton("8");
        bt9=new JButton("9");
        bt0=new JButton("0");
        btP=new JButton("%");
        btCE=new JButton("CE");
        btCL=new JButton("CL");
        btMas=new JButton("+");
        btMenos=new JButton("-");
        btMul=new JButton("x");
        btDiv=new JButton("/");
        btIgual=new JButton("=");
        btMN=new JButton("+/-");    
        btPunto=new JButton(".");
        
        bt1.setFont(btn);
        bt2.setFont(btn);
        bt3.setFont(btn);
        bt4.setFont(btn);
        bt5.setFont(btn);
        bt6.setFont(btn);
        bt7.setFont(btn);
        bt8.setFont(btn);
        bt9.setFont(btn);
        bt0.setFont(btn);
        btP.setFont(btn);
        btCE.setFont(btn);
        btCL.setFont(btn);
        btMas.setFont(btn);
        btMenos.setFont(btn);
        btMul.setFont(btn);
        btDiv.setFont(btn);
        btIgual.setFont(btn);
        btMN.setFont(btn);
        btPunto.setFont(btn);
        
        btIgual.setBackground(new Color(71, 116, 167));
        
        botones.add(btCE);
        botones.add(btCL);
        botones.add(btP);
        botones.add(btDiv);
        
        botones.add(bt7);
        botones.add(bt8);
        botones.add(bt9);
        botones.add(btMul);
        
        botones.add(bt4);
        botones.add(bt5);
        botones.add(bt6);
        botones.add(btMenos);
        
        botones.add(bt1);
        botones.add(bt2);
        botones.add(bt3);
        botones.add(btMas);
        
        botones.add(btMN);
        botones.add(bt0);
        botones.add(btPunto);
        botones.add(btIgual);
        
		
		botones.revalidate();
		return botones;
	}
}
