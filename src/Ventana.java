
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


//OmarIbarra
public class Ventana extends JFrame {

	private static final String JTextArea = null;




	//Constructor que define los atributos base de la ventana
	public Ventana(){

		this.setTitle("Asd");

		this.setSize(1000, 300);
		this.setLocation(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Mi ventana");
		this.setMinimumSize(new Dimension(250,500));
		this.setMinimumSize(new Dimension(750,750));



		this.setLocationRelativeTo(null);
		this.IniciarComponentes();
		this.setLayout(null);
		this.setVisible(true);
		this.setResizable(true);
	} 
	public void IniciarComponentes() {
		this.login();

		JPanel registro = new JPanel();
		registro.setSize(this.getWidth()/2, this.getHeight());
		registro.setLocation(500, 0);
		registro.setBackground(Color.decode("#FFCCEE"));
		registro.setLayout(null);
		
		JLabel regisLabel = new JLabel("Registro",0);
		regisLabel.setSize(300, 80);
		regisLabel.setFont(new Font("Arial",Font.BOLD,24));
		regisLabel.setForeground(Color.white);
		regisLabel.setLocation(100, 10);
		regisLabel.setBackground(Color.orange);
		regisLabel.setOpaque(true);
		registro.add(regisLabel);
		
		JLabel labelUser = new JLabel("Nombre de usuario:");
		labelUser.setBounds(150,120,200,40);
		labelUser.setFont(new Font ("Arial", Font.BOLD, 20));
		registro.add(labelUser);
	
		JTextField fieldUser = new JTextField();
		fieldUser.setBounds(60,150,370,35);
		fieldUser.setHorizontalAlignment(0);
		fieldUser.setOpaque(true);
		fieldUser.setBackground(Color.white);
		registro.add(fieldUser);	
		
		JLabel bioLabel = new JLabel("Biografia",0);
		bioLabel.setBounds(150,210,200,40);
		bioLabel.setFont(new Font("Arial",Font.BOLD,24));
		bioLabel.setForeground(Color.black);
		
		bioLabel.setBackground(Color.decode("#FFCCEE"));
		bioLabel.setOpaque(true);
		registro.add(bioLabel);
		
		
		JTextArea textBio = new JTextArea();
		textBio.setBounds(150,250,200,100);
		registro.add(textBio);
		
			
		
		JLabel askLabel = new JLabel("Preferencias",0);
		askLabel.setBounds(150,400,200,40);
		askLabel.setFont(new Font("Arial",Font.BOLD,15));
		askLabel.setForeground(Color.black);
		
		askLabel.setBackground(Color.decode("#FFCCEE"));
		askLabel.setOpaque(true);
		registro.add(askLabel);
		
		
		JCheckBox opBox1 = new JCheckBox("Dulces")	;
		opBox1.setBounds(120,450,100,70);
		opBox1.setFont(new Font("Arial",Font.BOLD,10));
		opBox1.setBackground(Color.decode("#FFCCEE"));
		registro.add(opBox1);
		

		JCheckBox opBox2 = new JCheckBox("Salado")	;
		opBox2.setBounds(200,450,100,70);
		opBox2.setFont(new Font("Arial",Font.BOLD,10));
		opBox2.setBackground(Color.decode("#FFCCEE"));
		registro.add(opBox2);
		

		JCheckBox opBox3 = new JCheckBox("Agrio")	;
		opBox3.setBounds(280,450,100,70);
		opBox3.setFont(new Font("Arial",Font.BOLD,10));
		opBox3.setBackground(Color.decode("#FFCCEE"));
		registro.add(opBox3);
		
		JLabel askLabel2 = new JLabel("Wings",0);
		askLabel2.setBounds(150,530,200,40);
		askLabel2.setFont(new Font("Arial",Font.BOLD,15));
		askLabel2.setForeground(Color.black);
		
		askLabel2.setBackground(Color.decode("#FFCCEE"));
		askLabel2.setOpaque(true);
		registro.add(askLabel2);
		
		JRadioButton rbtn1=new JRadioButton("txt1",false);
		rbtn1.setBounds(160,580,100,40);
		rbtn1.setBackground(Color.decode("#FFCCEE"));
		rbtn1.setOpaque(true);
		registro.add(rbtn1);
	
		JRadioButton rbtn2=new JRadioButton("txt2",false);
		rbtn2.setBounds(240,580,100,40);
		rbtn2.setBackground(Color.decode("#FFCCEE"));
		rbtn2.setOpaque(true);
		registro.add(rbtn2);
		
		String locaciones[]= {"centro","camino real","8"};
		
		JComboBox combo1=new JComboBox(locaciones);
		combo1.setBounds(240,650,100,40);
		 registro.add(combo1);
	
		registro.setVisible(true);
		this.add(registro);
		this.repaint();
		this.revalidate();
		
		

	}
	
	
	
	
	public void login() {
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

		


		
		this.add(login);

		
	}




}