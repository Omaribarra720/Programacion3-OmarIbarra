import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


//OmarIbarra
public class Ventana extends JFrame {
	
	//Constructor que define los atributos base de la ventana
	public Ventana(){

		this.setTitle("Asd");
		
		this.setSize(1000, 300);
		this.setLocation(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Mi ventana");
		this.setMinimumSize(new Dimension(250,250));
		this.setMinimumSize(new Dimension(750,750));
		

		
		this.setLocationRelativeTo(null);
		this.IniciarComponentes();
		this.setLayout(null);
		this.setResizable(false);
	} 
	public void IniciarComponentes() {

		
		JPanel login = new JPanel();
		login.setSize(this.getWidth()/2, this.getHeight());
		login.setBackground(Color.PINK);
		login.setLayout(null);
		
		JLabel titulo = new JLabel("Acceder",0);
		titulo.setSize(300, 80);
		
		titulo.setFont(new Font("Arial",Font.BOLD,24));
		titulo.setForeground(Color.white);
		titulo.setLocation(100, 10);
		titulo.setBackground(Color.GREEN);
		titulo.setOpaque(true);
		login.add(titulo);
		
		
		JLabel labelUser = new JLabel("Nombre de usuario:");
		labelUser.setBounds(60,120,200,40);
		labelUser.setFont(new Font ("Arial", Font.BOLD, 20));
		login.add(labelUser);
				
		
		JTextField fieldUser = new JTextField();
		fieldUser.setBounds(60,150,370,35);
		fieldUser.setOpaque(true);
		fieldUser.setBackground(Color.white);
		login.add(fieldUser);		
		
		
		JLabel labelPass = new JLabel("Contraseña:");
		labelPass.setBounds(60,220,200,40);
		labelPass.setFont(new Font ("Arial", Font.BOLD, 20));
		login.add(labelPass);
		
		JPasswordField fieldPass = new JPasswordField();
		fieldPass.setBounds(60,250,370,35);
		fieldPass.setOpaque(true);
		fieldPass.setBackground(Color.white);
		login.add(fieldPass);
				
		JCheckBox remember = new JCheckBox("Recordarme");
		remember.setBounds(60,290,150,30);
		remember.setFont(new Font ("Arial", Font.BOLD, 15));
		remember.setOpaque(false);
		login.add(remember);
		
		JLabel forgetPass = new JLabel("¿Olvidó su contraseña?");
		forgetPass.setBounds(260,290,180,30);
		forgetPass.setFont(new Font ("Arial", Font.BOLD, 15));
		login.add(forgetPass);
		
		JButton btnLogin = new JButton("Acceder");
		btnLogin.setBounds(172,370,170,50);
		btnLogin.setFont(new Font ("Arial", Font.BOLD, 20));
		
		login.add(btnLogin);
		
		JPanel registro = new JPanel();
		registro.setSize(this.getWidth()/2, this.getHeight());
		registro.setLocation(500, 0);
		registro.setBackground(Color.RED);
		
		this.setVisible(true);
		
		//this.add(registro);
		this.add(login);
		
		
	}




}