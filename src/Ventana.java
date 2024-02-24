import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.BorderFactory;
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
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;


//OmarIbarra
public class Ventana extends JFrame {

	private static final String JTextArea = null;




	//Constructor que define los atributos base de la ventana
	public Ventana(){

		this.setTitle("Asd");
		
		//calculadora
		
		this.setLocation(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Mi ventana");
	
		//este es el que usa
		//this.setMinimumSize(new Dimension(1000,900));
		//calculadora
		this.setMinimumSize(new Dimension(590,740));

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
		this.calculadora();


		this.repaint();
		this.revalidate();

	}
	
	
	public void boton(JButton button) {
        button.setFont(new Font("Arial", Font.BOLD, 24));
        button.setBackground(Color.gray);
        button.setFocusable(false);
        button.setBorderPainted(false);
    }
	public void calculadora() {
		JPanel calculadoraPanel = new JPanel();
		calculadoraPanel.setSize(this.getWidth(), this.getHeight());
		calculadoraPanel.setLocation(0, 0);
		calculadoraPanel.setBackground(Color.black);
		calculadoraPanel.setLayout(null);
		
		//contenido panel
		JLabel numbersLabel = new JLabel("180.0",0);
		numbersLabel.setBounds(15, 20, 545, 60);
		numbersLabel.setFont(new Font("Arial",Font.BOLD,24));
		numbersLabel.setForeground(Color.black);
		numbersLabel.setBackground(Color.white);
		numbersLabel.setOpaque(true);
		calculadoraPanel.add(numbersLabel);
		
		//primera columna
		JButton btnCE = new JButton("CE");
		boton(btnCE);
		btnCE.setBounds(15,100,125,100);
		calculadoraPanel.add(btnCE);
		
		JButton btn7 = new JButton("7");
		boton(btn7);
		btn7.setBounds(15,220,125,100);
		calculadoraPanel.add(btn7);
		
		JButton btn4 = new JButton("4");
		boton(btn4);
		btn4.setBounds(15,340,125,100);
		calculadoraPanel.add(btn4);
		
		JButton btn1 = new JButton("1");
		boton(btn1);
		btn1.setBounds(15,460,125,100);
		calculadoraPanel.add(btn1);
		
		JButton btn0 = new JButton("0");
		boton(btn0);
		btn0.setBounds(15,580,125,100);
		calculadoraPanel.add(btn0);
		
		//segunda columna
		JButton btnEmpty1 = new JButton("");
		boton(btnEmpty1);
		btnEmpty1.setBounds(155,100,125,100);
		calculadoraPanel.add(btnEmpty1);
		
		JButton btn8 = new JButton("8");
		boton(btn8);
		btn8.setBounds(155,220,125,100);
		calculadoraPanel.add(btn8);
		
		JButton btn5 = new JButton("5");
		boton(btn5);
		btn5.setBounds(155,340,125,100);
		calculadoraPanel.add(btn5);
		
		JButton btn2 = new JButton("2");
		boton(btn2);
		btn2.setBounds(155,460,125,100);
		calculadoraPanel.add(btn2);
		
		JButton btnPunto = new JButton(".");
		boton(btnPunto);
		btnPunto.setBounds(155,580,125,100);
		calculadoraPanel.add(btnPunto);
		
		//tercera columna
		
		JButton btnEmpty2 = new JButton("");
		boton(btnEmpty2);
		btnEmpty2.setBounds(295,100,125,100);
		calculadoraPanel.add(btnEmpty2);
	
		JButton btn9 = new JButton("9");
		boton(btn9);
		btn9.setBounds(295,220,125,100);
		calculadoraPanel.add(btn9);
		
		JButton btn6 = new JButton("6");
		boton(btn6);
		btn6.setBounds(295,340,125,100);
		calculadoraPanel.add(btn6);
		
		JButton btn3 = new JButton("3");
		boton(btn3);
		btn3.setBounds(295,460,125,100);
		calculadoraPanel.add(btn3);
		
		JButton btnIgual = new JButton("=");
		boton(btnIgual);
		btnIgual.setBounds(295,580,125,100);
		btnIgual.setBackground(Color.orange);
		calculadoraPanel.add(btnIgual);
		
		//cuarta columna
		JButton btnEmpty3 = new JButton("");
		boton(btnEmpty3);
		btnEmpty3.setBounds(435,100,125,100);
		
		calculadoraPanel.add(btnEmpty3);
		
		JButton btnDiv = new JButton("/");
		boton(btnDiv);
		btnDiv.setBounds(435,220,125,100);
		btnDiv.setBackground(Color.orange);
		calculadoraPanel.add(btnDiv);
		
		JButton btnX = new JButton("*");
		boton(btnX);
		btnX.setBounds(435,340,125,100);
		btnX.setBackground(Color.orange);
		calculadoraPanel.add(btnX);
		
		JButton btnMinus = new JButton("-");
		boton(btnMinus);
		btnMinus.setBounds(435,460,125,100);
		btnMinus.setBackground(Color.orange);
		calculadoraPanel.add(btnMinus);
		
		JButton btnPlus = new JButton("-");
		boton(btnPlus);
		btnPlus.setBounds(435,580,125,100);
		btnPlus.setBackground(Color.orange);
		calculadoraPanel.add(btnPlus);
		
		
		
	
		
		
		
		
		this.add(calculadoraPanel);		
		
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
		tableScroll.setBounds(50, 350, 900, 200);
		
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