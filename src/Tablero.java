import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;

public class Tablero implements KeyListener {
	public int x=10,y=10,widht=20,height=20;
	Jugador jugador = new Jugador(x,y,widht,height,"#3933FF");
	Jugador obstaculo = new Jugador(250,100,40,100,"#DA2909");

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
		frame.setBounds(100, 100, 545, 349);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);


		JPanel panel = new JPanel() {

			@Override
			public void paintComponent(Graphics g) {
				super.paintComponent(g);
				Graphics2D g2d = (Graphics2D) g;

				g2d.setColor(Color.decode(jugador.getColor()));
				g2d.fillRect(jugador.getX(), jugador.getY(),jugador.getWidht(),jugador.getHeight());

				g2d.setColor(Color.decode(obstaculo.getColor()));
				g2d.fillRect(obstaculo.getX(), obstaculo.getY(),obstaculo.getWidht(),obstaculo.getHeight());





			}
		};

		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 529, 273);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		panel.addKeyListener(this);
		panel.setFocusable(true);

		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(new Color(0, 128, 192));
		buttonPanel.setBounds(0, 273, 529, 37);
		frame.getContentPane().add(buttonPanel);
		buttonPanel.setLayout(null);

		JButton btnReinicio = new JButton("Reiniciar");
		btnReinicio.setBounds(226, 11, 89, 23);
		btnReinicio.setFocusable(false);
		buttonPanel.add(btnReinicio);

	}


	@Override

	public void keyPressed(KeyEvent e) {
		boolean colision = false;
		//bastante complicadito debes de cambiar los if para cada tecla dependiendo de que es lo que se desea, parece no tener sentido pero una vez colisionan dos objetos dependiendo del lado este
		//va a ser mayor por lo que se debe de validar para que se pueda seguir moviendo por donde vino
		//se debe de pensar como es que quedara el objeto una vez colisionado, a partir de esto son los ifs
		
		
		//arriba
		if(e.getKeyCode()==87) {
			if(
					//Se piensa que la segunda linea despues del comentario es innecesario pero una vez que colisiona se cumple pero se necesita para volver a moverse de forma vertical
					//El truco en arriba y abajo es que una vez que colisionan se valide para que se regrese tambien
					jugador.getY() <= obstaculo.getY() + obstaculo.getHeight() && 
					//esto podria hasta ser un valor fijo en lugar de obstaculo.getY()
		            jugador.getY() >= obstaculo.getY() &&
		            
		            //limitacion simple para evitar problemas con las X, una colision sin mucha complicacion pero sin el igual para que no de probemas al moverse estando colisionando
		            jugador.getX() + jugador.getWidht() > obstaculo.getX() &&
		            jugador.getX() < obstaculo.getX() + obstaculo.getWidht()) {
				System.out.println("Colision");
				colision=true;

			}
		}
		//abajo
		// se repite lo anterior pero cambiando algunas cosas para que sea desde arriba,ademas de agragar el limite inferior del panel
		if(e.getKeyCode()==83) {
			if(jugador.getY()+jugador.getHeight()>=273||
					jugador.getY() + jugador.getHeight()>= obstaculo.getY() &&
		            jugador.getY() <= obstaculo.getY() &&
		            
		            jugador.getX() + jugador.getWidht() > obstaculo.getX() &&
		            jugador.getX() < obstaculo.getX() + obstaculo.getWidht()) {
				System.out.println("Colision");
				colision=true;


			}
		}
		//derecha
		//se va a repetir el mismo principio que los if anteriores pero ahora para las x osea horizontal, las y se quedan como una limitacion estable que no se cambia y las x se cambian
		//si viene por derecha o izquierda
		if(e.getKeyCode()==68) {
			if(
					jugador.getY() < obstaculo.getY() + obstaculo.getHeight() &&
		            jugador.getY() + jugador.getHeight() > obstaculo.getY() &&
		            
		            
		            jugador.getX() + jugador.getWidht() >= obstaculo.getX() &&
		            jugador.getX() <= obstaculo.getX()) {
				System.out.println("Colision");
				colision=true;


			}
		}
		
		//izquierda
		if(e.getKeyCode()==65) {
			if(		jugador.getY() < obstaculo.getY() + obstaculo.getHeight() &&
		            jugador.getY() + jugador.getHeight() > obstaculo.getY() &&
		            
		            
		            jugador.getX() <= obstaculo.getWidht() + obstaculo.getX() &&
		            jugador.getX() >= obstaculo.getX()) {
				System.out.println("Colision");
				colision=true;


			}


		}
		
		//para solo moverse cuando no hay colision, la separacion con los ifs es solo para diferenciarse mejor
		if(colision==false) {
			switch(e.getKeyCode()) {
			//arriba
			case 87:
				jugador.setY(y-=10);

				break;
			//abajo
			case 83:
				jugador.setY(y+=10);


				break;


			//derecha
			case 68 :

				jugador.setX(x+=10);;

				break;

			//izquierda
			case 65:

				jugador.setX(x-=10);

				break;
			default:
				break;

			}


		}


		//frame.update(getGraphics());
		frame.repaint();
		frame.revalidate();

	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
	@Override
	public void keyReleased(KeyEvent e) {
	}

}