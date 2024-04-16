
import java.awt.EventQueue;
import javax.swing.Timer;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;


import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class Numbers extends JFrame implements ActionListener{
	private static int[] rand = new int[15];;
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10,btn11,btn12,btn13,btn14,btn15,btn16,btnReinicio;
	private JButton[] botones ;
	private String[] arregloNumeros;
	private JLabel lblTiempo;
	private Timer timer;
	private int tiempo;
	private boolean pausado;

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
		//Arreglo de botones
		botones = new JButton[16];

		//Arreglo de strings

		arregloNumeros = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", ""};

		//Random
		List<String> lista = Arrays.asList(arregloNumeros);
		Collections.shuffle(lista);

		//Ya revuelto
		String[] arregloRevuelto = lista.toArray(new String[0]);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 486, 554);
		contentPane = new JPanel();
		

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 128));
		panel.setBounds(0, 0, 470, 446);
		contentPane.add(panel);
		panel.setLayout(null);

		btn1 = new JButton(String.valueOf(arregloRevuelto[0]));
		botones[0]= btn1;
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				movimiento(btn1);
				
			}
		});
		btn1.setBounds(10, 11, 104, 99);
		panel.add(btn1);

		btn2 = new JButton(String.valueOf(arregloRevuelto[1]));
		botones[1]=btn2;
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				movimiento(btn2);

			}
		});
		btn2.setBounds(124, 11, 104, 99);
		panel.add(btn2);

		btn3 = new JButton(String.valueOf(arregloRevuelto[2]));
		botones[2]=btn3;
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				movimiento(btn3);

			}
		});
		btn3.setBounds(238, 11, 104, 99);
		panel.add(btn3);


		btn4 = new JButton(String.valueOf(arregloRevuelto[3]));
		botones[3]=btn4;
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				movimiento(btn4);

			}
		});
		btn4.setBounds(352, 11, 104, 99);
		panel.add(btn4);

		btn5 = new JButton(String.valueOf(arregloRevuelto[4]));
		botones[4]=btn5;
		btn5.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				movimiento(btn5);
			}
		});
		btn5.setBounds(10, 119, 104, 99);
		panel.add(btn5);

		btn6 = new JButton(String.valueOf(arregloRevuelto[5]));
		botones[5]=btn6;
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				movimiento(btn6);
			}
		});
		btn6.setBounds(124, 119, 104, 99);
		panel.add(btn6);

		btn7 = new JButton(String.valueOf(arregloRevuelto[6]));
		botones[6]=btn7;
		btn7.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				movimiento(btn7);
			}
		});
		btn7.setBounds(238, 119, 104, 99);
		panel.add(btn7);

		btn8 = new JButton(String.valueOf(arregloRevuelto[7]));
		botones[7]=btn8;
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				movimiento(btn8);
			}
		});
		btn8.setBounds(352, 119, 104, 99);
		panel.add(btn8);

		btn9 = new JButton(String.valueOf(arregloRevuelto[8]));
		botones[8]=btn9;
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				movimiento(btn9);
			}
		});
		btn9.setBounds(10, 229, 104, 99);
		panel.add(btn9);

		btn10 = new JButton(String.valueOf(arregloRevuelto[9]));
		botones[9]=btn10;
		btn10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				movimiento(btn10);
			}
		});
		btn10.setBounds(124, 229, 104, 99);
		panel.add(btn10);

		btn11 = new JButton(String.valueOf(arregloRevuelto[10]));
		botones[10]=btn11;
		btn11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				movimiento(btn11);
			}
		});
		btn11.setBounds(238, 229, 104, 99);
		panel.add(btn11);


		btn12 = new JButton(String.valueOf(arregloRevuelto[11]));
		botones[11]=btn12;
		btn12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				movimiento(btn12);
			}
		});
		btn12.setBounds(352, 229, 104, 99);
		panel.add(btn12);

		btn13 = new JButton(String.valueOf(arregloRevuelto[12]));
		botones[12]=btn13;
		btn13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				movimiento(btn13);
			}
		});
		btn13.setBounds(10, 336, 104, 99);
		panel.add(btn13);


		btn14 = new JButton(String.valueOf(arregloRevuelto[13]));
		botones[13]=btn14;
		btn14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				movimiento(btn14);
			}
		});
		btn14.setBounds(124, 336, 104, 99);
		panel.add(btn14);

		btn15 = new JButton(String.valueOf(arregloRevuelto[14]));
		botones[14]=btn15;
		btn15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				movimiento(btn15);
			}
		});
		btn15.setBounds(238, 336, 104, 99);
		panel.add(btn15);

		btn16 = new JButton(String.valueOf(arregloRevuelto[15]));
		botones[15]=btn16;
		btn16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				movimiento(btn16);
			}
		});
		btn16.setBounds(352, 336, 104, 99);
		panel.add(btn16);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 128, 128));
		panel_1.setBounds(0, 446, 470, 69);
		contentPane.add(panel_1);
		panel_1.setLayout(null);


		btnReinicio = new JButton("Reiniciar");
		btnReinicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reiniciar();
			}
		});
		btnReinicio.setBounds(352, 21, 100, 37);
		panel_1.add(btnReinicio);

		JButton btnPausa = new JButton("Pausa");
		
		btnPausa.setBounds(242, 21, 100, 37);
		btnPausa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setEnabled(false);
				for (int i = 0; i < botones.length; i++) {
					botones[i].setEnabled(false);
					pausado=true;
				}
				
			}
		});
		panel_1.add(btnPausa);

		JButton btnReanudar = new JButton("Reanudar");
		btnReanudar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < botones.length; i++) {
					botones[i].setEnabled(true);
					pausado=false;
				}
			}
		});
		
		btnReanudar.setBounds(132, 21, 100, 37);
		panel_1.add(btnReanudar);

		lblTiempo = new JLabel("00:00:00");
		lblTiempo.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTiempo.setBounds(10, 26, 100, 26);
		panel_1.add(lblTiempo);

        

        //tiempo
        tiempo = 0;
        timer = new Timer(1000, this);
        timer.start();
        pausado=false;
        
	}
	public void movimiento(JButton btnClick) {
		
		
		//Que boton se tomo
		int indice = 0;
		for (int i = 0; i < botones.length; i++) {
			if (botones[i] == btnClick) {
				indice = i;
				break;
			}
		}

		//Filita y columna
		int fila = indice / 4;
		int columna = indice % 4;

		//Buscar el vacio
		JButton btnCambio = null;
		//los de ariba
		if (fila > 0 && botones[indice - 4].getText().equals("")) { 
			btnCambio = botones[indice - 4];
			String aux = btnClick.getText();
			btnClick.setText(btnCambio.getText());
			btnCambio.setText(aux);
		//abajo
		} else if (fila < 3 && botones[indice + 4].getText().equals("")) { 
			btnCambio = botones[indice + 4];
			String aux = btnClick.getText();
			btnClick.setText(btnCambio.getText());
			btnCambio.setText(aux);
		//der
		} else if (columna > 0 && botones[indice - 1].getText().equals("")) { 
			btnCambio = botones[indice - 1];
			String aux = btnClick.getText();
			btnClick.setText(btnCambio.getText());
			btnCambio.setText(aux);
			//izq
		} else if (columna < 3 && botones[indice + 1].getText().equals("")) {
			btnCambio = botones[indice + 1];
			String aux = btnClick.getText();
			btnClick.setText(btnCambio.getText());
			btnCambio.setText(aux);
		}
		//si se gano
		 ganador();



	}
	public void ganador() {
			if(btn1.getText().equals("1")&&btn2.getText().equals("2")&&btn3.getText().equals("3")&&btn4.getText().equals("4")&&btn5.getText().equals("5")&&
					btn6.getText().equals("6")&&btn7.getText().equals("7")&&btn8.getText().equals("8")&&btn9.getText().equals("9")&&
					btn10.getText().equals("10")&&btn11.getText().equals("11")&&btn12.getText().equals("12")&&btn13.getText().equals("13")&&btn14.getText().equals("14")&&
					btn15.getText().equals("15")&&btn16.getText().equals("")) {
				
				JOptionPane.showMessageDialog(null, "Ganaste", "Inane warning",JOptionPane.ERROR_MESSAGE);
			}
	}
	private void reiniciar() {
		


		//Revolver 
		List<String> lista = Arrays.asList(arregloNumeros);
		Collections.shuffle(lista);
		String[] arregloRevuelto = lista.toArray(new String[0]);

		//dar los numeros
		for (int i = 0; i < botones.length; i++) {
			botones[i].setText(arregloRevuelto[i]);
		}
		tiempo=0;


	}
	@Override
	public void actionPerformed(ActionEvent e) {
		 if (!pausado) {
	            tiempo++;
	            int horas = tiempo / 3600;
	            int minutos = (tiempo % 3600) / 60;
	            int segundos = tiempo % 60;
	            	lblTiempo.setText(String.format("%02d:%02d:%02d", horas, minutos, segundos));
	        };

		
	}
}