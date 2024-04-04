

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class TicTac extends JFrame {
	
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private boolean turno = true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTac frame = new TicTac();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TicTac() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 855, 576);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 3, 0, 0));
		
		
		
		
		btnNewButton_1 = new JButton("");	
		btnNewButton_2 = new JButton("");
		btnNewButton_3 = new JButton("");	
		btnNewButton_4 = new JButton("");	
		btnNewButton_5 = new JButton("");	
		btnNewButton_6 = new JButton("");	
		btnNewButton_7 = new JButton("");	
		btnNewButton_8 = new JButton("");	
		btnNewButton_9 = new JButton("");
		
		
		
		contentPane.add(btnNewButton_1);
		
		btnNewButton_1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btn = ((JButton)e.getSource());
				click(btn);
				
				
             }
			
		});
		
		
		contentPane.add(btnNewButton_2);
		
		btnNewButton_2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btn = ((JButton)e.getSource());
				click(btn);
				
			}
			
		});
				
		contentPane.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btn = ((JButton)e.getSource());
				click(btn);
			
			}
			
		});
	
		contentPane.add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btn = ((JButton)e.getSource());
				click(btn);
				
			}
			
		});
		
		
		contentPane.add(btnNewButton_5);
		btnNewButton_5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btn = ((JButton)e.getSource());
				click(btn);
				
			}
			
		});
		
		
		contentPane.add(btnNewButton_6);
		btnNewButton_6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btn = ((JButton)e.getSource());
				click(btn);
				
			}
			
		});

		contentPane.add(btnNewButton_7);
		btnNewButton_7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btn = ((JButton)e.getSource());
				click(btn);
				
			}
			
		});
		
		
		contentPane.add(btnNewButton_8);
		btnNewButton_8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btn = ((JButton)e.getSource());
				click(btn);
				
			}
			
		});
		
		
		contentPane.add(btnNewButton_9);
		btnNewButton_9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JButton btn = ((JButton)e.getSource());
				click(btn);
				
			}
			
		});
	}
	
	
	// para los clicks
    private void click(JButton btn) {
        if (btn.getText().equals("")) {
            if (turno) {
                btn.setText("X");
            } else {
                btn.setText("O");
            }
            turno = !turno;
        }
        ganador();
        
        
        
    }
 // Método para saber quien gano
    private void ganador() {
    	//filas
    	if(btnNewButton_1.getText().equals(btnNewButton_2.getText()) && btnNewButton_1.getText().equals(btnNewButton_3.getText()) && btnNewButton_1.getText() != "") {
    		if(btnNewButton_1.getText().equals("X"))
    		JOptionPane.showMessageDialog(null, "Gano el jugador con la X", "Inane warning",JOptionPane.ERROR_MESSAGE);
    		else {
    		JOptionPane.showMessageDialog(null, "Gano el jugador con la O", "Inane warning",JOptionPane.ERROR_MESSAGE);
    		}
    		
    		
    	}
    	
    	if(btnNewButton_4.getText().equals(btnNewButton_5.getText()) && btnNewButton_4.getText().equals(btnNewButton_6.getText()) && btnNewButton_4.getText() != "") {
    		if(btnNewButton_4.getText().equals("X"))
    		JOptionPane.showMessageDialog(null, "Gano el jugador con la X", "Inane warning",JOptionPane.ERROR_MESSAGE);
    		else {
    		JOptionPane.showMessageDialog(null, "Gano el jugador con la O", "Inane warning",JOptionPane.ERROR_MESSAGE);
    		}
    		
    		
    	}
    	
    	if(btnNewButton_7.getText().equals(btnNewButton_8.getText()) && btnNewButton_7.getText().equals(btnNewButton_9.getText()) && btnNewButton_7.getText() != "") {
    		if(btnNewButton_7.getText().equals("X"))
    		JOptionPane.showMessageDialog(null, "Gano el jugador con la X", "Inane warning",JOptionPane.ERROR_MESSAGE);
    		else {
    		JOptionPane.showMessageDialog(null, "Gano el jugador con la O", "Inane warning",JOptionPane.ERROR_MESSAGE);
    		}
    		
    		
    	}
    	//columnas
    	if(btnNewButton_1.getText().equals(btnNewButton_4.getText()) && btnNewButton_1.getText().equals(btnNewButton_7.getText()) && btnNewButton_1.getText() != "") {
    		if(btnNewButton_1.getText().equals("X"))
    		JOptionPane.showMessageDialog(null, "Gano el jugador con la X", "Inane warning",JOptionPane.ERROR_MESSAGE);
    		else {
    		JOptionPane.showMessageDialog(null, "Gano el jugador con la O", "Inane warning",JOptionPane.ERROR_MESSAGE);
    		}
    		
    		
    	}
    	
    	if(btnNewButton_2.getText().equals(btnNewButton_5.getText()) && btnNewButton_2.getText().equals(btnNewButton_8.getText()) && btnNewButton_2.getText() != "") {
    		if(btnNewButton_2.getText().equals("X"))
    		JOptionPane.showMessageDialog(null, "Gano el jugador con la X", "Inane warning",JOptionPane.ERROR_MESSAGE);
    		else {
    		JOptionPane.showMessageDialog(null, "Gano el jugador con la O", "Inane warning",JOptionPane.ERROR_MESSAGE);
    		}
    		
    		
    	}
    	
    	if(btnNewButton_3.getText().equals(btnNewButton_6.getText()) && btnNewButton_3.getText().equals(btnNewButton_9.getText()) && btnNewButton_3.getText() != "") {
    		if(btnNewButton_3.getText().equals("X"))
    		JOptionPane.showMessageDialog(null, "Gano el jugador con la X", "Inane warning",JOptionPane.ERROR_MESSAGE);
    		else {
    		JOptionPane.showMessageDialog(null, "Gano el jugador con la O", "Inane warning",JOptionPane.ERROR_MESSAGE);
    		}
    		
    		
    	}
    	//diagonales
    	if(btnNewButton_1.getText().equals(btnNewButton_5.getText()) && btnNewButton_1.getText().equals(btnNewButton_9.getText()) && btnNewButton_1.getText() != "") {
    		if(btnNewButton_1.getText().equals("X"))
    		JOptionPane.showMessageDialog(null, "Gano el jugador con la X", "Inane warning",JOptionPane.ERROR_MESSAGE);
    		else {
    		JOptionPane.showMessageDialog(null, "Gano el jugador con la O", "Inane warning",JOptionPane.ERROR_MESSAGE);
    		}
    		
    		
    	}
    	
    	if(btnNewButton_3.getText().equals(btnNewButton_5.getText()) && btnNewButton_3.getText().equals(btnNewButton_7.getText()) && btnNewButton_3.getText() != "") {
    		if(btnNewButton_3.getText().equals("X"))
    		JOptionPane.showMessageDialog(null, "Gano el jugador con la X", "Inane warning",JOptionPane.ERROR_MESSAGE);
    		else {
    		JOptionPane.showMessageDialog(null, "Gano el jugador con la O", "Inane warning",JOptionPane.ERROR_MESSAGE);
    		}
    		
    		
    	}
    	
    	
    	
    	
        
        
    }
    

}