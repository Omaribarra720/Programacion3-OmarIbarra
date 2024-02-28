import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
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
		this.setMinimumSize(new Dimension(250,700));
		//este es el que usa
		this.setMinimumSize(new Dimension(750,900));



		this.setLocationRelativeTo(null);
		this.IniciarComponentes();
		this.setLayout(null);
		this.setVisible(true);
		this.setResizable(true);
	}

	public void IniciarComponentes() {
		//this.admin();
		//this.login();
		//this.registro();
		this.calculadoraGrid();


		this.repaint();
		this.revalidate();

	}
	public void calculadoraGrid(){
		
		this.setSize(480, 650);
		
		JPanel panel = new JPanel();
		panel.setSize(this.getWidth(), this.getHeight());
		panel.setBackground(Color.decode("#E16D8D"));
		panel.setLayout(new BorderLayout());
		
		JLabel text = new JLabel("100.00",0);
		text.setOpaque(true);
		text.setFont(new Font("Arial",Font.BOLD,40));
		text.setBackground(Color.white);
		panel.add(text,BorderLayout.NORTH);
		
		JPanel centro = new JPanel();
		centro.setBackground(Color.orange);
		centro.setLayout(new GridLayout(4,3,10,10));
		panel.add(centro,BorderLayout.CENTER);
		
		String btns[]= {"7","8","9","4","5","6","1","2","3","0",".","*"};
		for(int i =0;i<12;i++) {
			JButton button = new JButton(btns[i]);
			centro.add(button);
		}
		

		
		JPanel east = new JPanel();
		east.setBackground(Color.orange);
		east.setLayout(new GridLayout(3,1,10,10));
		panel.add(east,BorderLayout.EAST);
		
		String btns2[]= {"+","-","="};
		for(int i =0;i<3;i++) {
			JButton button = new JButton(btns2[i]);
			//button.setSize(50, 50);
			east.add(button);
		}	
			

		JPanel west = new JPanel();
		west.setBackground(Color.red);
		west.setLayout(new BoxLayout(west,BoxLayout.Y_AXIS));
		panel.add(west,BorderLayout.WEST);
		
		String btns3[]= {"/","CE","C"};
		for(int i =0;i<3;i++) {
			JButton button = new JButton(btns3[i]);
			//button.setSize(50, 50);
			west.add(button);
		}	
		
		this.add(panel);
		
		
	}
	
	
	public void admin() {

		//panel admin
		JPanel adminPanel = new JPanel();
		adminPanel.setSize(this.getWidth(), this.getHeight());
		adminPanel.setLocation(0, 0);
		adminPanel.setBackground(Color.CYAN);
		adminPanel.setLayout(null);
		
		//barra
		JMenuBar barra = new JMenuBar(); 
		JMenu menuFile = new JMenu("Archivo");
		JMenuItem openItem = new JMenuItem("Abrir archivo...");
		JMenuItem createItem = new JMenuItem("Crear archivo...");
		
		barra.add(menuFile);
		menuFile.add(openItem);
		menuFile.add(createItem);
		
		
		this.setJMenuBar(barra);
		
		
		//contenido de panel
		JLabel userLabel = new JLabel("Usuarios",0);
		userLabel.setSize(300, 80);
		userLabel.setFont(new Font("Arial",Font.BOLD,24));
		userLabel.setForeground(Color.white);
		userLabel.setLocation(400, 10);
		userLabel.setBackground(Color.black);
		userLabel.setOpaque(true);
		adminPanel.add(userLabel);
		
		
		JLabel widgetTitle = new JLabel("Total de usuarios",0);
		widgetTitle.setBounds(40, 120, 300, 80);
		widgetTitle.setFont(new Font("Arial",Font.BOLD,18));
		widgetTitle.setOpaque(true);
		widgetTitle.setBackground(Color.black);
		widgetTitle.setForeground(Color.white);
		adminPanel.add(widgetTitle);
		
		
		
		JLabel widgetContent = new JLabel("100",0);
		widgetContent.setBounds(40, 175, 300, 80);
		widgetContent.setFont(new Font("Arial",Font.BOLD,22));
		widgetContent.setOpaque(true);
		widgetContent.setBackground(Color.black);
		widgetContent.setForeground(Color.white);
		adminPanel.add(widgetContent);
		
		JLabel widget = new JLabel("");
		widget.setBounds(40, 180, 300, 80);
		widget.setOpaque(true);
		widget.setBackground(Color.black);
		adminPanel.add(widget);
		
		JButton download = new JButton ("Exportar") ;
		download.setBounds(730, 300, 100, 40);
		download.setOpaque(true);
		adminPanel.add(download);
		
		JButton add = new JButton ("Añadir") ;
		add.setBounds(850, 300, 100, 40);
		add.setOpaque(true);
		adminPanel.add(add);
		
		
				
				
	
		String tittle[]= {"No. Control","Nombre","ApelliSdo","semestre"};
		
		String tableData [][] = {
				{"No. Control","Nombre","ApelliSdo","semestre"},
				{"No. Control","Nombre","ApelliSdo","semestre"},
				{"No. Control","Nombre","ApelliSdo","semestre"},
				{"No. Control","Nombre","ApelliSdo","semestre"},
				{"No. Control","Nombre","ApelliSdo","semestre"},
				{"No. Control","Nombre","ApelliSdo","semestre"},
				{"No. Control","Nombre","ApelliSdo","semestre"},
				{"No. Control","Nombre","ApelliSdo","semestre"},
				{"No. Control","Nombre","ApelliSdo","semestre"},
				{"No. Control","Nombre","ApelliSdo","semestre"},
				{"No. Control","Nombre","ApelliSdo","semestre"},
				{"No. Control","Nombre","ApelliSdo","semestre"},
				{"No. Control","Nombre","ApelliSdo","semestre"},
				{"No. Control","Nombre","ApelliSdo","semestre"},
				{"No. Control","Nombre","ApelliSdo","semestre"},
				{"No. Control","Nombre","ApelliSdo","semestre"}
						
				
		};
		
		JTable tableUser = new JTable(tableData,tittle);
		//tableUser.setBounds(100, 450, 500, 200);
		JScrollPane tableScroll = new JScrollPane(tableUser);
		tableScroll.setBounds(50, 350, 900, 300);
		
		adminPanel.add(tableScroll);
		
		
		
		
		
		this.add(adminPanel);
		
		
	}
	




	public void registro(){
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

		JLabel bioLabel = new JLabel("Bio",0);
		bioLabel.setBounds(150,210,200,40);
		bioLabel.setFont(new Font("Arial",Font.BOLD,24));
		registro.add(bioLabel);


		JTextArea textBio = new JTextArea();
		textBio.setBounds(80,250,330,100);
		registro.add(textBio);



		JLabel askLabel = new JLabel("Preferencias",0);
		askLabel.setBounds(155,400,200,40);
		askLabel.setFont(new Font("Arial",Font.BOLD,15));
		askLabel.setBackground(Color.ORANGE);
		askLabel.setOpaque(true);
		registro.add(askLabel);


		JCheckBox opBox1 = new JCheckBox("Dulces") ;
		opBox1.setBounds(130,450,100,70);
		opBox1.setFont(new Font("Arial",Font.BOLD,15));
		opBox1.setBackground(Color.decode("#FFCCEE"));

		registro.add(opBox1);


		JCheckBox opBox2 = new JCheckBox("Salado") ;
		opBox2.setBounds(210,450,100,70);
		opBox2.setFont(new Font("Arial",Font.BOLD,15));
		opBox2.setBackground(Color.decode("#FFCCEE"));
		registro.add(opBox2);


		JCheckBox opBox3 = new JCheckBox("Saludable") ;
		opBox3.setBounds(290,450,100,70);
		opBox3.setFont(new Font("Arial",Font.BOLD,15));
		opBox3.setBackground(Color.decode("#FFCCEE"));
		registro.add(opBox3);

		JLabel askLabel2 = new JLabel("Términos",0);
		askLabel2.setBounds(100,530,300,40);
		askLabel2.setFont(new Font("Arial",Font.BOLD,15));
		askLabel2.setForeground(Color.black);
		askLabel2.setBackground(Color.orange);
		askLabel2.setOpaque(true);
		registro.add(askLabel2);

		JRadioButton rbtn1=new JRadioButton("Acepto lo términos",false);
		rbtn1.setBounds(85,580,180,40);
		rbtn1.setBackground(Color.decode("#FFCCEE"));
		rbtn1.setOpaque(true);
		registro.add(rbtn1);

		JRadioButton rbtn2=new JRadioButton("No acepto los términos",false);
		rbtn2.setBounds(260,580,190,40);
		rbtn2.setBackground(Color.decode("#FFCCEE"));
		rbtn2.setOpaque(true);
		registro.add(rbtn2);

		String locaciones[]= {"Centro","Camino real","8 de octubre"};

		JComboBox combo1=new JComboBox(locaciones);
		combo1.setBounds(90,650,300,40);
		registro.add(combo1);

		JButton btnAcceder = new JButton("Crear cuenta");
		btnAcceder.setBounds(172,700,170,50);
		btnAcceder.setFont(new Font ("Arial", Font.BOLD, 20));

		registro.add(btnAcceder);



		this.add(registro);
	}



	public void login() {
		JPanel login = new JPanel();
		login.setSize(this.getWidth()/2, this.getHeight());
		login.setBackground(Color.decode("#3C61A9"));
		login.setLayout(null);

		JLabel titulo = new JLabel("User login",0);
		titulo.setSize(300, 80);
		titulo.setFont(new Font("Arial",Font.BOLD,24));
		titulo.setForeground(Color.white);
		titulo.setLocation(100, 10);
		titulo.setBackground(Color.decode("#3C61A9"));
		titulo.setOpaque(true);
		login.add(titulo);


	
		JLabel labelAccount = new JLabel("My Account:");
		labelAccount.setForeground(Color.decode("#DCCA8A"));
		labelAccount.setBounds(140,120,250,60);
		labelAccount.setFont(new Font ("Arial", Font.BOLD, 40));
		login.add(labelAccount);



		
		
		JLabel labelUserName = new JLabel("Enter your username:");
		labelUserName.setForeground(Color.white);
		labelUserName.setBounds(120,230,250,30);
		labelUserName.setFont(new Font ("Arial", Font.BOLD, 15));
		login.add(labelUserName);
		
		JTextField fieldUser = new JTextField();
		fieldUser.setBounds(120,250,290,40);
		fieldUser.setOpaque(true);
		fieldUser.setBackground(Color.white);
		login.add(fieldUser);		
		
		JLabel logo = new JLabel();
		logo.setIcon(new ImageIcon(getClass().getResource("usuario.png")));
		logo.setBounds(60,170, 200, 200);
		login.add(logo);
		
		JLabel labelPass = new JLabel("Enter your password:");
		labelPass.setForeground(Color.white);
		labelPass.setBounds(120,330,250,30);
		labelPass.setFont(new Font ("Arial", Font.BOLD, 15));
		login.add(labelPass);
		
		JPasswordField fieldPass = new JPasswordField();
		fieldPass.setBounds(120,350,290,40);
		fieldPass.setOpaque(true);
		fieldPass.setBackground(Color.white);
		login.add(fieldPass);		
		
		JLabel logo2 = new JLabel();
		logo2.setIcon(new ImageIcon(getClass().getResource("cerrar.png")));
		logo2.setBounds(60,270, 200, 200);
		login.add(logo2);
		
		
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setBounds(180,430,170,50);
		btnLogin.setBackground(Color.decode("#DCCA8A"));
		btnLogin.setFont(new Font ("Arial", Font.BOLD, 20));
		login.add(btnLogin);
		
		JLabel labelQuestion = new JLabel("Don´t have an acount?");
		labelQuestion .setForeground(Color.white);
		labelQuestion .setBounds(200,540,250,30);
		labelQuestion .setFont(new Font ("Arial", Font.BOLD, 10));
		login.add(labelQuestion );

		JButton btnSign = new JButton("Sign up");
		btnSign.setBounds(190,570,130,40);
		btnSign.setBackground(Color.decode("#DCCA8A"));
		btnSign.setFont(new Font ("Arial", Font.BOLD, 18));
		login.add(btnSign);
		
		
		JLabel labelBack = new JLabel();
		labelBack.setBackground(Color.decode("#253C71"));
		labelBack.setBounds(50,90,390,430);
		labelBack.setOpaque(true);
		login.add(labelBack);
		
		
		/*
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
		*/
	
		

		this.add(login);


	}




}