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
        	    g2d.fillRect(220, 50, 100, 70);
        	    
                
        	    
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
        System.out.println("Código de la tecla presionada fue: " + e.getKeyCode());
    }
    
    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    public void keyReleased(KeyEvent e) {
    }

}
