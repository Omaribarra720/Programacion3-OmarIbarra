import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

import java.awt.Color;

public class Tablero implements KeyListener {
	public int x=30,y=30,widht=10,height=10,dir;
	Jugador jugador = new Jugador(x,y,widht,height,"#3933FF");
	//meta
	Jugador meta =new Jugador(560, 560, 20, 20, "#09DA0F");
	private int tiempo;
	private Timer tiempoMeta,timer;


	Jugador obstaculos[]= {
			//paredes
			new Jugador(0, 0, 600, 15, "#000000"),
			new Jugador(0, 0, 15, 600, "#000000"),
			new Jugador(585, 0, 15, 600, "#000000"),
			new Jugador(0, 585, 600, 15, "#000000"),

			new Jugador(40, 300, 80, 20, "#000000"),
			new Jugador(120, 120, 20, 200, "#000000"),
			new Jugador(40, 240, 20, 20, "#000000"),
			new Jugador(20, 260, 40, 20, "#000000"),
			new Jugador(80, 200, 60, 20, "#000000"),
			new Jugador(20, 180, 40, 20, "#000000"),
			new Jugador(80, 120, 20, 60, "#000000"),
			new Jugador(40, 140, 40, 20, "#000000"),
			new Jugador(40, 100, 20, 40, "#000000"),
			new Jugador(40, 80, 40, 20, "#000000"),
			new Jugador(60, 20, 20, 60, "#000000"),
			new Jugador(20, 40, 20, 20, "#000000"),
			new Jugador(580, 0, 20, 600, "#000000"),
			new Jugador(0, 0, 20, 600, "#000000"),
			new Jugador(0, 580, 600, 20, "#000000"),
			new Jugador(0, 0, 600, 20, "#000000"),

			new Jugador(320, 120, 20, 220, "#000000"),
			new Jugador(120, 80, 220, 20, "#000000"),
			new Jugador(80, 400, 100, 20, "#000000"),
			new Jugador(160, 140, 20, 80, "#000000"),
			new Jugador(120, 40, 60, 20, "#000000"),
			new Jugador(100, 20, 20, 80, "#000000"),
			new Jugador(40, 520, 20, 20, "#000000"),
			new Jugador(40, 540, 80, 20, "#000000"),
			new Jugador(120, 440, 20, 120, "#000000"),
			new Jugador(80, 500, 20, 20, "#000000"),
			new Jugador(20, 480, 80, 20, "#000000"),
			new Jugador(40, 440, 80, 20, "#000000"),
			new Jugador(40, 320, 20, 120, "#000000"),
			new Jugador(80, 240, 20, 60, "#000000"),

			new Jugador(220, 40, 120, 20, "#000000"),
			new Jugador(360, 40, 20, 60, "#000000"),
			new Jugador(200, 100, 20, 80, "#000000"),
			new Jugador(160, 360, 20, 20, "#000000"),
			new Jugador(40, 340, 180, 20, "#000000"),
			new Jugador(200, 360, 20, 80, "#000000"),
			new Jugador(120, 360, 20, 20, "#000000"),
			new Jugador(80, 360, 20, 20, "#000000"),
			new Jugador(160, 400, 20, 80, "#000000"),
			new Jugador(160, 260, 20, 80, "#000000"),
			new Jugador(160, 100, 20, 20, "#000000"),
			new Jugador(200, 20, 20, 40, "#000000"),
			new Jugador(200, 280, 160, 20, "#000000"),
			new Jugador(360, 120, 20, 80, "#000000"),
			new Jugador(360, 100, 200, 20, "#000000"),
			new Jugador(360, 440, 220, 20, "#000000"),
			new Jugador(160, 540, 220, 20, "#000000"),
			new Jugador(160, 240, 160, 20, "#000000"),
			new Jugador(500, 20, 20, 260, "#000000"),

			new Jugador(380, 320, 20, 240, "#000000"),
			new Jugador(200, 300, 20, 20, "#000000"),
			new Jugador(240, 300, 20, 60, "#000000"),
			new Jugador(240, 360, 120, 20, "#000000"),
			new Jugador(180, 200, 60, 20, "#000000"),
			new Jugador(40, 200, 20, 20, "#000000"),
			new Jugador(260, 320, 40, 20, "#000000"),
			new Jugador(220, 120, 80, 20, "#000000"),
			new Jugador(280, 140, 20, 80, "#000000"),
			new Jugador(220, 160, 40, 20, "#000000"),
			new Jugador(260, 200, 20, 20, "#000000"),
			new Jugador(340, 220, 120, 20, "#000000"),
			new Jugador(380, 140, 100, 20, "#000000"),
			new Jugador(402, 20, 20, 60, "#000000"),
			new Jugador(460, 40, 20, 60, "#000000"),
			new Jugador(360, 240, 20, 20, "#000000"),
			new Jugador(400, 240, 20, 60, "#000000"),
			new Jugador(380, 280, 20, 20, "#000000"),
			new Jugador(420, 60, 20, 20, "#000000"),
			new Jugador(540, 40, 40, 20, "#000000"),
			new Jugador(540, 80, 20, 20, "#000000"),
			new Jugador(460, 160, 20, 40, "#000000"),
			new Jugador(400, 160, 20, 40, "#000000"),
			new Jugador(420, 180, 20, 20, "#000000"),
			new Jugador(520, 140, 40, 20, "#000000"),
			new Jugador(540, 180, 40, 20, "#000000"),
			new Jugador(520, 220, 40, 20, "#000000"),
			new Jugador(540, 260, 40, 20, "#000000"),
			new Jugador(420, 20, 20, 20, "#000000"),
			new Jugador(220, 400, 140, 20, "#000000"),
			new Jugador(240, 420, 20, 100, "#000000"),
			new Jugador(200, 440, 20, 60, "#000000"),
			new Jugador(160, 500, 60, 20, "#000000"),
			new Jugador(440, 280, 20, 60, "#000000"),
			new Jugador(440, 260, 62, 20, "#000000"),
			new Jugador(480, 220, 20, 20, "#000000"),
			new Jugador(540, 280, 20, 40, "#000000"),
			new Jugador(480, 300, 60, 20, "#000000"),
			new Jugador(440, 340, 100, 20, "#000000"),
			new Jugador(420, 320, 20, 20, "#000000"),
			new Jugador(420, 360, 120, 20, "#000000"),
			new Jugador(260, 440, 40, 20, "#000000"),
			new Jugador(320, 420, 20, 80, "#000000"),
			new Jugador(500, 340, 40, 20, "#000000"),
			new Jugador(560, 340, 20, 40, "#000000"),
			new Jugador(340, 320, 20, 20, "#000000"),
			new Jugador(280, 480, 40, 20, "#000000"),
			new Jugador(160, 220, 20, 20, "#000000"),
			new Jugador(120, 560, 20, 20, "#000000"),
			new Jugador(280, 500, 20, 20, "#000000"),
			new Jugador(320, 500, 40, 20, "#000000"),
			new Jugador(340, 480, 20, 20, "#000000"),
			new Jugador(460, 360, 20, 60, "#000000"),
			new Jugador(500, 400, 80, 20, "#000000"),
			new Jugador(420, 400, 40, 20, "#000000"),
			new Jugador(420, 460, 20, 100, "#000000"),
			new Jugador(440, 480, 40, 20, "#000000"),
			new Jugador(500, 460, 20, 60, "#000000"),
			new Jugador(540, 460, 20, 60, "#000000"),
			new Jugador(460, 520, 20, 60, "#000000"),
			new Jugador(500, 540, 80, 20, "#000000"),
			
			
			




	};

	JFrame frame;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tablero window = new Tablero();
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
	public Tablero() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 617, 675);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);


		JPanel panel = new JPanel() {

			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				Graphics2D g2d = (Graphics2D) g;

				g2d.setColor(Color.decode(jugador.getColor()));
				g2d.fillRect(jugador.getX(), jugador.getY(),jugador.getWidht(),jugador.getHeight());
				g2d.setColor(Color.decode(meta.getColor()));
				g2d.fillRect(meta.getX(), meta.getY(),meta.getWidht(),meta.getHeight());

				for (Jugador obstaculo : obstaculos) {
					g2d.setColor(Color.decode(obstaculo.getColor()));
					g2d.fillRect(obstaculo.getX(), obstaculo.getY(), obstaculo.getWidht(), obstaculo.getHeight());
				}





			}
		};
		
		
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 600, 600);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		panel.addKeyListener(this);
		panel.setFocusable(true);

	
		//Reinicio
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBounds(0, 600, 600, 42);
		frame.getContentPane().add(buttonPanel);
		buttonPanel.setBackground(new Color(0, 128, 192));
		buttonPanel.setLayout(null);

		JButton btnReinicio = new JButton("Reiniciar");
		btnReinicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tiempo=0;
				dir=0;
				jugador.setX(30);
				jugador.setY(30);
				timer.start();
				iniciarTemporizador();
			}
		});
		btnReinicio.setBounds(266, 11, 89, 23);
		btnReinicio.setFocusable(false);
		buttonPanel.add(btnReinicio);
		
		timer = new Timer(50, new ActionListener() {
       
            @Override
            public void actionPerformed(ActionEvent e) {
            		            
	            	
                
        	    int anteriorX = jugador.getX();
        	    int anteriorY = jugador.getY();
               
                	if(dir!=0){
                	
                	if(dir==1) {jugador.setY(jugador.getY()-10);}
                			 
                	if(dir==2) {jugador.setY(jugador.getY()+10);}
                	
                	if(dir==3) { jugador.setX(jugador.getX()-10);}
                	
                	if(dir==4) {jugador.setX(jugador.getX()+10);}
                	
                	}
                	 //verificar colision con todos los obstaculos
            	    boolean hayColision = false;
            	    for (Jugador obstaculo : obstaculos) {
            	        if (jugador.colision(obstaculo)) {
            	            
            	            jugador.setX(anteriorX);
            	            jugador.setY(anteriorY);
            	            hayColision = true;
            	            break;
            	        }
            	    }

            	    //si no colisiona pinta
            	    if (!hayColision) {
            	        frame.repaint();
            	        frame.revalidate();
            	    }
        }
        });
		timer.start();
       iniciarTemporizador();
		

	}


	@Override
	public void keyPressed(KeyEvent e) {
	    

	    
	    switch(e.getKeyCode()) {
	        case 87:
	        
	            dir=1;
	            break;
	        case 83: 
	            dir=2;
	            break;
	        case 65: 
	            dir=3;
	            break;
	        case 68: 
	            dir=4;
	            break;
	    }

	   
	}


	@Override
	public void keyTyped(KeyEvent e) {
	}
	@Override
	public void keyReleased(KeyEvent e) {
	}
	
	
	public void ganador(KeyEvent e) {
		
	}
	//tiempo del juego
    private void iniciarTemporizador() {
        tiempoMeta= new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
                tiempo++;

                int horas = tiempo / 3600;
                int minutos = (tiempo % 3600) / 60;
                int segundos = tiempo % 60;

               
                if (jugador.getX() + jugador.getWidht() > meta.getX() &&
                        jugador.getX() < meta.getX() + meta.getWidht() &&
                        jugador.getY() + jugador.getHeight() > meta.getY() &&
                        jugador.getY() < meta.getY() + meta.getHeight()) {
                	tiempoMeta.stop();
                	timer.stop();
                	
                    JOptionPane.showMessageDialog(null, String.format("¡Conseguiste terminar el laberinto en %02d:%02d:%02d!", horas, minutos, segundos), "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });

        tiempoMeta.start();
    }

   		 
	       
}