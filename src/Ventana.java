import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
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
import javax.swing.SwingConstants;


//OmarIbarra
public class Ventana extends JFrame {

	private static final String JTextArea = null;




	//Constructor que define los atributos base de la ventana
	public Ventana(){



		//this.setSize(1000, 300);
		this.setLocation(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Mi ventana");
		//this.setMinimumSize(new Dimension(250,700));
		//este es el que usa
		//this.setMinimumSize(new Dimension(750,900));
		this.setSize(1000,500);


		this.setLocationRelativeTo(null);
		this.IniciarComponentes();
		this.setLayout(null);
		this.setVisible(true);
		this.setResizable(true);
	}

	public void IniciarComponentes() {
		//this.admin();
		this.login();
		this.registro();
		//this.calculadoraGrid();
		//this.panelLayout();
		//this.paint(getGraphics());

		this.repaint();
		this.revalidate();

	}

	/*
	//sobrescribir con graphics
	@Override
	public void paint(Graphics g){
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		//color
		//850*500


		// Fondo
	    g2d.setColor(Color.cyan);
	    g2d.fillRect(0, 0, 900, 800);


	    //bloque

	    g2d.setColor(Color.black);
	    g2d.fillRect(70, 150, 70, 70);


	    g2d.setColor(new Color(139, 69, 19));
	    g2d.fillRect(75, 155, 60, 60);

	    //puntos
	    g2d.setColor(Color.black);
	    g2d.fillRect(80, 160, 5, 5);
	    g2d.fillRect(125, 160, 5, 5);
	    g2d.fillRect(80, 205, 5, 5);
	    g2d.fillRect(125, 205, 5, 5);



	    //bloque2

	    g2d.setColor(Color.black);
	    g2d.fillRect(190, 60, 70, 70);


	    g2d.setColor(new Color(139, 69, 19));
	    g2d.fillRect(65, 65, 60, 60);

	    //puntos
	    g2d.setColor(Color.black);
	    g2d.fillRect(70, 70, 5, 5);
	    g2d.fillRect(115, 70, 5, 5);
	    g2d.fillRect(70, 115, 5, 5);
	    g2d.fillRect(115, 115, 5, 5);








	    g2d.setColor(Color.blue);
	    g2d.fillRect(310, 200, 130, 300);

	    g2d.setColor(Color.magenta);
	    g2d.fillRect(230, 280, 130, 130);

	    g2d.setColor(Color.green);
	    g2d.fillRect(720, 280, 130, 130);

	    g2d.setColor(Color.green);
	    g2d.fillRect(520,330, 90, 130);
	    g2d.fillRect(510,280, 109, 50);

	    g2d.setColor(Color.black);
		g2d.fillOval(70, 347, 60, 80);
		g2d.fillOval(50, 367, 80, 60);
		g2d.fillOval(80, 367, 80, 60);


	    g2d.setColor(Color.green);
		g2d.fillOval(70, 350, 60, 80);
		g2d.fillOval(50, 370, 80, 60);
		g2d.fillOval(80, 370, 80, 60);

	    //g2d.drawRect(100, 100, 200, 60);






	    //suelo

	    g2d.setColor(new Color(139, 69, 19));
	    g2d.fillRect(0, 410, 900, 200);


	  		//color

		/*
		g2d.setColor(Color.blue);
		g2d.fillRect(50, 50,200,100);
		g2d.clearRect(100,100,100, 100);
		g2d.fillArc(300,300,100, 100,45, 180);
		g2d.drawArc(250,300,100, 100,45, 180);
		g2d.setColor(Color.black);
		g2d.drawLine(0, 0, 500, 500);
		g2d.drawOval(400, 400, 50, 80);
		g2d.fillOval(350, 400, 50, 80);

		int xPoints[]={100,250,300};
		int yPoints[]={100,200,300};

		//g2d.drawPolyline(xPoints, yPoints, 3);
		g2d.setColor(Color.red);
		g2d.fillPolygon(xPoints, yPoints, 3);

		g2d.setFont(new Font("Arial",Font.BOLD,40));
		g2d.drawString("Hola",250,50);

		g2d.setStroke(new BasicStroke(10));
		g2d.drawRoundRect(420, 200,150 , 130, 10,10);

		try {
			BufferedImage image = ImageIO.read(new File("src/usuario.png"));
			g2d.drawImage(image, 200, 400, null);

		}catch(IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}



		//g2d.drawLine(30,70,770,70);


	}

	 */
	public void panelLayout() {

		this.setSize(480, 650);
		JPanel panel = new JPanel();
		panel.setSize(this.getWidth(), 500);
		panel.setBackground(Color.decode("#E16D8D"));
		panel.setLayout(new BorderLayout());

		JLabel text = new JLabel("Interés",0);
		text.setOpaque(true);
		text.setFont(new Font("Arial",Font.BOLD,40));
		text.setForeground(Color.orange);
		text.setBackground(Color.white);
		panel.add(text,BorderLayout.NORTH);

		JPanel centro = new JPanel();
		centro.setBackground(Color.cyan);
		centro.setLayout(new GridBagLayout());
		panel.add(centro,BorderLayout.CENTER);

		JPanel centro2 = new JPanel();
		panel.setSize(this.getWidth(), this.getHeight());
		centro2.setBackground(Color.black);
		centro.add(centro2);


		/*
		for(int i =0;i<=8;i++) {
			if(i==7 || i==8) {

				JButton button = new JButton("lol");
				button.setBounds(10, 10, 200, 50);
				button.setHorizontalAlignment(SwingConstants.LEFT);
				centro.add(button);

			}
			if(i==1 || i==3 || i==5) {

				JLabel label = new JLabel("juas juas");
				centro.add(label);

			}
			if(i==2 || i==4 || i==6) {

				JTextField field = new JTextField("juas juas");
				centro.add(field);

			}
		}



		JTextField fieldUser = new JTextField();
		fieldUser.setBounds(60,150,370,35);
		fieldUser.setOpaque(true);
		fieldUser.setBackground(Color.white);
		centro.add(fieldUser);

		JLabel textDato1 = new JLabel("Interés",0);
		textDato1.setOpaque(true);
		textDato1.setFont(new Font("Arial",Font.BOLD,40));
		textDato1.setForeground(Color.orange);
		textDato1.setBackground(Color.white);
		centro.add(textDato1,BorderLayout.CENTER);

		JLabel textDato2 = new JLabel("Interés",0);
		textDato2.setOpaque(false);
		textDato2.setLocation(70, 70);
		textDato2.setBounds(10, 40, 100,100);
		textDato2.setFont(new Font("Arial",Font.BOLD,40));
		textDato2.setForeground(Color.orange);
		textDato2.setBackground(Color.white);
		centro.add(textDato2,BorderLayout.CENTER);
		 */



		JPanel panel2 = new JPanel();
		panel2.setLocation(0,500);
		panel2.setSize(this.getWidth(), this.getHeight());
		panel2.setBackground(Color.GREEN);


		this.add(panel2);


		this.add(panel);





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
		centro.setBackground(Color.cyan);
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

		String btns2[]= {"    +    ","    -    ","   =    "};
		for(int i =0;i<3;i++) {
			JButton button = new JButton(btns2[i]);
			//button.setSize(50, 50);
			east.add(button);
		}	


		JPanel west = new JPanel();
		west.setBackground(Color.red);
		west.setLayout(new BoxLayout(west,BoxLayout.Y_AXIS));
		panel.add(west,BorderLayout.WEST);

		String btns3[]= {"   /    ","   CE    ","    C     "};
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
		
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(rbtn2);
		grupo.add(rbtn1);

		String locaciones[]= {"Centro","Camino real","8 de octubre"};

		JComboBox combo1=new JComboBox(locaciones);
		combo1.setBounds(90,650,300,40);
		registro.add(combo1);

		JButton btnAcceder = new JButton("Crear cuenta");
		btnAcceder.setBounds(172,700,170,50);
		btnAcceder.setFont(new Font ("Arial", Font.BOLD, 20));

		registro.add(btnAcceder);

		btnAcceder.addActionListener((ActionListener) new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String usr = fieldUser.getText();
				String bio = textBio.getText();
				



				if(usr.length()==0)
				{

					fieldUser.setBorder(BorderFactory.createLineBorder(Color.red,2));
					System.out.println("Se necesita usuario");

				}
				else {
					
					fieldUser.setBorder(BorderFactory.createLineBorder(Color.green,2));
				}
				
				if(bio.length()==0) {
					textBio.setBorder(BorderFactory.createLineBorder(Color.red,2));
					System.out.println("Se necesita bio");
				}
				else {
					textBio.setBorder(BorderFactory.createLineBorder(Color.green,2));
				}
				if(rbtn1.isSelected()) {
					rbtn1.setBorderPainted(true);
					rbtn1.setBorder(BorderFactory.createLineBorder(Color.green,2));
				}
				else {
					rbtn1.setBorderPainted(true);
					rbtn1.setBorder(BorderFactory.createLineBorder(Color.red,2));
					System.out.println("Se necesita aceptar");
					
				}

			}});


		this.add(registro);
	}



	public void login() {
		this.setMinimumSize(new Dimension(1000,900));

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
		btnLogin.addActionListener((ActionListener) new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String usr = fieldUser.getText();
				String pwd = new String(fieldPass.getPassword());

				System.out.println(fieldUser.getText());
				System.out.println(fieldPass.getPassword());


				//fieldUser.setBorderPainted(true);
				if(usr.length()==0)
				{
					fieldUser.setBorder(BorderFactory.createLineBorder(Color.red,2));
					System.out.println("Se necesita usuario");
				}
				else {
					fieldUser.setBorder(BorderFactory.createLineBorder(Color.green,2));
				}

				if(pwd.length()==0) {
					fieldPass.setBorder(BorderFactory.createLineBorder(Color.red,2));
					System.out.println("Se necesita contraseña");
				}else {
					fieldPass.setBorder(BorderFactory.createLineBorder(Color.green,2));
				}


				if(usr.length()!=0 || pwd.length()!=0)
				{



					if (usr.equals("SuperUser")) {

						if(pwd.equals("SuperPass")) {
							System.out.println("Bienvenido");
						}

					}else {
						System.out.println("Usuario no encontrado");


					}
				}

			}});



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
