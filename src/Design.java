import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JSpinner;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import java.awt.Choice;
import java.awt.List;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.Button;
import javax.swing.JTextArea;
import javax.swing.DropMode;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import javax.swing.JTextPane;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Design extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Design frame = new Design();
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
	public Design() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 651, 699);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Registro de Usuario");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblNewLabel.setBounds(10, 11, 187, 34);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 43, 361, 333);
		panel.setBackground(Color.decode("#66FFCC"));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Datos generales");
		lblNewLabel_1.setBounds(10, 11, 96, 14);
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 13));
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nombres:");
		lblNewLabel_1_1.setBounds(62, 61, 96, 14);
		lblNewLabel_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Apellido Paterno:");
		lblNewLabel_1_1_1.setBounds(62, 106, 96, 14);
		lblNewLabel_1_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		panel.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Apellido Materno:");
		lblNewLabel_1_1_2.setBounds(62, 152, 122, 14);
		lblNewLabel_1_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		panel.add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Fecha de nacimiento");
		lblNewLabel_1_1_3.setBounds(62, 192, 122, 14);
		lblNewLabel_1_1_3.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		panel.add(lblNewLabel_1_1_3);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Nacionalidad:");
		lblNewLabel_1_1_2_1.setBounds(62, 289, 96, 14);
		lblNewLabel_1_1_2_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		panel.add(lblNewLabel_1_1_2_1);
		
		JLabel lblNewLabel_1_1_2_2 = new JLabel("Sexo:");
		lblNewLabel_1_1_2_2.setBounds(62, 232, 96, 14);
		lblNewLabel_1_1_2_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		panel.add(lblNewLabel_1_1_2_2);
		
		textField = new JTextField();
		textField.setBounds(218, 59, 109, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(218, 104, 109, 20);
		textField_1.setColumns(10);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(218, 150, 109, 20);
		textField_2.setColumns(10);
		panel.add(textField_2);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Masculino");
		rdbtnNewRadioButton.setBounds(218, 229, 109, 23);
		rdbtnNewRadioButton.setOpaque(false);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Femenino");
		rdbtnNewRadioButton_1.setBounds(218, 259, 109, 23);
		rdbtnNewRadioButton_1.setOpaque(false);
		panel.add(rdbtnNewRadioButton_1);
		
		Choice choice = new Choice();
		choice.setBounds(218, 289, 96, 20);
		choice.add("Estados Unidos");
		choice.add("Canadá");
		choice.add("Reino Unido");
		choice.add("Australia");
		choice.add("Japón");
		choice.add("Brasil");
		panel.add(choice);
		
		textField_3 = new JTextField();
		textField_3.setBounds(218, 190, 109, 20);
		textField_3.setColumns(10);
		panel.add(textField_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(381, 43, 244, 333);
		panel_1.setBackground(Color.decode("#FF9999"));
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1_2 = new JLabel("Perfil de usuario");
		lblNewLabel_1_2.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1_2.setBounds(21, 11, 96, 14);
		panel_1.add(lblNewLabel_1_2);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar Foto de Perfil");
		chckbxNewCheckBox.setBounds(34, 228, 183, 23);
		chckbxNewCheckBox.setOpaque(false);
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Mostrar Fecha de Nacimiento");
		chckbxNewCheckBox_1.setBounds(34, 272, 183, 23);
		chckbxNewCheckBox_1.setOpaque(false);
		panel_1.add(chckbxNewCheckBox_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("hombre.png")));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(22, 36, 212, 185);
		panel_1.add(lblNewLabel_2);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 387, 362, 262);
		panel_2.setBackground(Color.decode("#FF6666"));
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_1_3 = new JLabel("Datos opcionales");
		lblNewLabel_1_3.setFont(new Font("Times New Roman", Font.BOLD, 13));
		lblNewLabel_1_3.setBounds(10, 11, 96, 14);
		panel_2.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_1_2_1_1 = new JLabel("Descripción:");
		lblNewLabel_1_1_2_1_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_2_1_1.setBounds(60, 59, 96, 14);
		panel_2.add(lblNewLabel_1_1_2_1_1);
		
		JLabel lblNewLabel_1_1_2_1_2 = new JLabel("Preferencias:");
		lblNewLabel_1_1_2_1_2.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblNewLabel_1_1_2_1_2.setBounds(190, 59, 96, 14);
		panel_2.add(lblNewLabel_1_1_2_1_2);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(60, 79, 96, 160);
		panel_2.add(textArea);
		
		TextArea textArea_1 = new TextArea();
		textArea_1.setBounds(190, 79, 96, 160);
		panel_2.add(textArea_1);
		
		
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(Color.decode("#66FFCC"));
		panel_1_1.setBounds(381, 387, 244, 262);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(null);
		
		Button button = new Button("Nuevo");
		
		button.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setForeground(new Color(255, 255, 255));
		button.setBackground(new Color(0, 0, 0));
				
		button.setBounds(73, 54, 89, 22);
		panel_1_1.add(button);
		
		Button button_1 = new Button("Guardar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setBackground(Color.BLACK);
		button_1.setBounds(73, 102, 89, 22);
		panel_1_1.add(button_1);
		
		Button button_2 = new Button("Salir");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_2.setForeground(Color.WHITE);
		button_2.setBackground(Color.BLACK);
		button_2.setBounds(73, 150, 89, 22);
		panel_1_1.add(button_2);
	}
}
