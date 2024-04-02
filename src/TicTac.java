import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;

public class TicTac extends JFrame {
	public static int contX=0,contO=0;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private JButton btnNewButton_6;
	private JButton btnNewButton_7;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;

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
		setBounds(100, 100, 855, 694);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);




		btnNewButton_1 = new JButton("");	
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnNewButton_1.setBounds(5, 58, 276, 168);
		btnNewButton_2 = new JButton("");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnNewButton_2.setBounds(281, 58, 276, 168);
		btnNewButton_3 = new JButton("");	
		btnNewButton_3.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnNewButton_3.setBounds(557, 58, 276, 168);
		btnNewButton_4 = new JButton("");	
		btnNewButton_4.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnNewButton_4.setBounds(5, 225, 276, 156);
		btnNewButton_5 = new JButton("");	
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnNewButton_5.setBounds(281, 225, 276, 156);
		btnNewButton_6 = new JButton("");	
		btnNewButton_6.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnNewButton_6.setBounds(557, 225, 276, 156);
		btnNewButton_7 = new JButton("");	
		btnNewButton_7.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnNewButton_7.setBounds(5, 378, 276, 148);
		btnNewButton_8 = new JButton("");	
		btnNewButton_8.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnNewButton_8.setBounds(281, 378, 276, 148);
		btnNewButton_9 = new JButton("");
		btnNewButton_9.setFont(new Font("Tahoma", Font.PLAIN, 35));
		btnNewButton_9.setBounds(557, 378, 276, 148);
		contentPane.setLayout(null);



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
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 255, 255));
		panel.setBounds(5, 11, 828, 43);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblNewLabel = new JLabel("X:"+contX);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setBounds(198, 11, 46, 14);
		panel.add(lblNewLabel);
		
	    lblNewLabel_1 = new JLabel("O:"+contO);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(550, 11, 46, 14);
		panel.add(lblNewLabel_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(0, 255, 0));
		panel_1.setBounds(5, 528, 828, 127);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reiniciar();
			}
		});
		btnNewButton.setBounds(346, 41, 146, 49);
		panel_1.add(btnNewButton);
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
    
    //Para reiniciar el tablero
    private void reiniciar() {
    	btnNewButton_1.setText("");
    	btnNewButton_2.setText("");
    	btnNewButton_3.setText("");
    	btnNewButton_4.setText("");
    	btnNewButton_5.setText("");
    	btnNewButton_6.setText("");
    	btnNewButton_7.setText("");
    	btnNewButton_8.setText("");
    	btnNewButton_9.setText("");
    	lblNewLabel.setText("X:"+contX);
    	lblNewLabel_1.setText("O:"+contO);
    	
    	
    	
    }
 // Método para saber quien gano
    private void ganador() {
    	//filas
    	if(btnNewButton_1.getText().equals(btnNewButton_2.getText()) && btnNewButton_1.getText().equals(btnNewButton_3.getText()) && btnNewButton_1.getText() != "") {
    		if(btnNewButton_1.getText().equals("X")) {
    			
    		
    		JOptionPane.showMessageDialog(null, "Gano el jugador con la X", "Inane warning",JOptionPane.ERROR_MESSAGE);
    		contX++;
    		
    		}
    		else {
    		JOptionPane.showMessageDialog(null, "Gano el jugador con la O", "Inane warning",JOptionPane.ERROR_MESSAGE);
    		contO++;
    		}
    		


    	}

    	if(btnNewButton_4.getText().equals(btnNewButton_5.getText()) && btnNewButton_4.getText().equals(btnNewButton_6.getText()) && btnNewButton_4.getText() != "") {
    		if(btnNewButton_4.getText().equals("X")) {
    		JOptionPane.showMessageDialog(null, "Gano el jugador con la X", "Inane warning",JOptionPane.ERROR_MESSAGE);
    		contX++;
    		}
    		else {
    		JOptionPane.showMessageDialog(null, "Gano el jugador con la O", "Inane warning",JOptionPane.ERROR_MESSAGE);
    		contO++;
    		
    		}


    	}

    	if(btnNewButton_7.getText().equals(btnNewButton_8.getText()) && btnNewButton_7.getText().equals(btnNewButton_9.getText()) && btnNewButton_7.getText() != "") {
    		if(btnNewButton_7.getText().equals("X")) {
    		JOptionPane.showMessageDialog(null, "Gano el jugador con la X", "Inane warning",JOptionPane.ERROR_MESSAGE);
    		contX++;
    		}
    		else {
    		JOptionPane.showMessageDialog(null, "Gano el jugador con la O", "Inane warning",JOptionPane.ERROR_MESSAGE);
    		contO++;
    		}


    	}
    	//columnas
    	if(btnNewButton_1.getText().equals(btnNewButton_4.getText()) && btnNewButton_1.getText().equals(btnNewButton_7.getText()) && btnNewButton_1.getText() != "") {
    		if(btnNewButton_1.getText().equals("X")) {
    		JOptionPane.showMessageDialog(null, "Gano el jugador con la X", "Inane warning",JOptionPane.ERROR_MESSAGE);
    		contX++;
    		}
    		else {
    		JOptionPane.showMessageDialog(null, "Gano el jugador con la O", "Inane warning",JOptionPane.ERROR_MESSAGE);
    		contO++;
    		}


    	}

    	if(btnNewButton_2.getText().equals(btnNewButton_5.getText()) && btnNewButton_2.getText().equals(btnNewButton_8.getText()) && btnNewButton_2.getText() != "") {
    		if(btnNewButton_2.getText().equals("X")) {
    		JOptionPane.showMessageDialog(null, "Gano el jugador con la X", "Inane warning",JOptionPane.ERROR_MESSAGE);
    		contX++;
    		}
    		else{
    		JOptionPane.showMessageDialog(null, "Gano el jugador con la O", "Inane warning",JOptionPane.ERROR_MESSAGE);
    		contO++;
    		}


    	}

    	if(btnNewButton_3.getText().equals(btnNewButton_6.getText()) && btnNewButton_3.getText().equals(btnNewButton_9.getText()) && btnNewButton_3.getText() != "") {
    		if(btnNewButton_3.getText().equals("X")) {
    		JOptionPane.showMessageDialog(null, "Gano el jugador con la X", "Inane warning",JOptionPane.ERROR_MESSAGE);
    		contX++;
    		}
    		else {
    		JOptionPane.showMessageDialog(null, "Gano el jugador con la O", "Inane warning",JOptionPane.ERROR_MESSAGE);
    		contO++;
    		}


    	}
    	//diagonales
    	if(btnNewButton_1.getText().equals(btnNewButton_5.getText()) && btnNewButton_1.getText().equals(btnNewButton_9.getText()) && btnNewButton_1.getText() != "") {
    		if(btnNewButton_1.getText().equals("X")) {
    		JOptionPane.showMessageDialog(null, "Gano el jugador con la X", "Inane warning",JOptionPane.ERROR_MESSAGE);
    		contX++;
    		}
    		else {
    		JOptionPane.showMessageDialog(null, "Gano el jugador con la O", "Inane warning",JOptionPane.ERROR_MESSAGE);
    		contO++;
    		}


    	}

    	if(btnNewButton_3.getText().equals(btnNewButton_5.getText()) && btnNewButton_3.getText().equals(btnNewButton_7.getText()) && btnNewButton_3.getText() != "") {
    		if(btnNewButton_3.getText().equals("X")) {
    		JOptionPane.showMessageDialog(null, "Gano el jugador con la X", "Inane warning",JOptionPane.ERROR_MESSAGE);
    		contX++;
    		}
    		else {
    		JOptionPane.showMessageDialog(null, "Gano el jugador con la O", "Inane warning",JOptionPane.ERROR_MESSAGE);
    		contO++;
    		}


    	}





    }
}