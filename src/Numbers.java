import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Numbers extends JFrame {
	private static int[] rand = new int[15];;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Numbers frame = new Numbers();
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
	/*
	String int randoms[]= {rand1};
	for(int i =0;i<12;i++) {
		
	}
	*/
	


	public Numbers() {


		//Darles un random
		rand = new int[15];

	
		Set valoresUnicos = new HashSet<>();

		Random random = new Random();

		
		for (int i = 0; i < 15; i++) {
			int valor;
			do {
				valor = random.nextInt(15) + 1; 
			} while (valoresUnicos.contains(valor)); 

			valoresUnicos.add(valor);
			rand[i] = valor; 
		}

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 554);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 128));
		panel.setBounds(0, 0, 470, 446);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btn1 = new JButton();
		btn1.setText(String.valueOf(rand[0]));
		btn1.setBounds(10, 11, 104, 99);
		panel.add(btn1);
		
		JButton btn2 = new JButton(String.valueOf(rand[1]));
		btn2.setBounds(124, 11, 104, 99);
		panel.add(btn2);
		
		JButton btn3 = new JButton(String.valueOf(rand[2]));
		btn3.setBounds(238, 11, 104, 99);
		panel.add(btn3);

		
		JButton btn4 = new JButton(String.valueOf(rand[3]));
		btn4.setBounds(352, 11, 104, 99);
		panel.add(btn4);
		
		JButton btn5 = new JButton(String.valueOf(rand[4]));
		btn5.setBounds(10, 119, 104, 99);
		panel.add(btn5);
		
		JButton btn6 = new JButton(String.valueOf(rand[5]));
		btn6.setBounds(124, 119, 104, 99);
		panel.add(btn6);
		
		JButton btn7 = new JButton(String.valueOf(rand[6]));
		btn7.setBounds(238, 119, 104, 99);
		panel.add(btn7);

		JButton btn8 = new JButton(String.valueOf(rand[7]));
		btn8.setBounds(352, 119, 104, 99);
		panel.add(btn8);

		JButton btn9 = new JButton(String.valueOf(rand[8]));
		btn9.setBounds(10, 229, 104, 99);
		panel.add(btn9);
		
		JButton btn10 = new JButton(String.valueOf(rand[9]));
		btn10.setBounds(124, 229, 104, 99);
		panel.add(btn10);

		JButton btn11 = new JButton(String.valueOf(rand[10]));
		btn11.setBounds(238, 229, 104, 99);
		panel.add(btn11);
		
		
		JButton btn12 = new JButton(String.valueOf(rand[11]));
		btn12.setBounds(352, 229, 104, 99);
		panel.add(btn12);
		
		JButton btn13 = new JButton(String.valueOf(rand[12]));
		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn13.setBounds(10, 336, 104, 99);
		panel.add(btn13);
		
				
		JButton btn14 = new JButton(String.valueOf(rand[13]));
		btn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn14.setBounds(124, 336, 104, 99);
		panel.add(btn14);
		
		JButton btn15 = new JButton(String.valueOf(rand[14]));
		btn15.setBounds(238, 336, 104, 99);
		panel.add(btn15);
		
		JButton btn16 = new JButton();
		btn16.setBounds(352, 336, 104, 99);
		panel.add(btn16);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 128, 128));
		panel_1.setBounds(0, 446, 470, 69);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Reiniciar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(161, 21, 142, 37);
		panel_1.add(btnNewButton);
	}
}
