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
	public int x=10,y=10;

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

        	    g2d.setColor(Color.blue);
        	    g2d.fillRect(x, y, 20, 20);
        	    
        	    
        	    
                
        	    
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
        //System.out.println("Código de la tecla presionada fue: " + e.getKeyCode());
        
        switch(e.getKeyCode()) {
        //arriba
        case 87:
        	y-=10;
        	break;
        //abajo
        case 83:
        	y+=10;
        	break;
        	
        
        //derecha
        case 68 :
        	x+=10;
        	break;
        
        //izquierda
        case 65:
        	x-=10;
        	break;
        default:
        	break;
        
               
        
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