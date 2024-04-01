import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
//Omar Antonio Ibarra Hernandez Exanen segunda unidad 4to semestre
public class Examen extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTable table_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Examen frame = new Examen();
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
	public Examen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 534);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 64, 128));
		panel.setBounds(0, 0, 612, 77);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Factura en Java - NetBeans - ArrayList y POO");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(28, 21, 463, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("[Sin Base de datos]");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(28, 46, 136, 14);
		panel.add(lblNewLabel_1);
		
	
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(10, 89, 592, 100);
        Border borde = BorderFactory.createLineBorder(Color.gray);
        panel_1.setBorder(borde);
        contentPane.add(panel_1);
        panel_1.setLayout(null);
        
        JLabel lblNewLabel_2_1_1 = new JLabel("Datos del cliente");
        lblNewLabel_2_1_1.setBounds(10, 0, 108, 14);
        panel_1.add(lblNewLabel_2_1_1);
        
        JLabel lblNewLabel_2_1_2 = new JLabel("Dirección:");
        lblNewLabel_2_1_2.setBounds(51, 59, 79, 14);
        panel_1.add(lblNewLabel_2_1_2);
        
        JLabel lblNewLabel_2_1_3 = new JLabel("Docuemento:");
        lblNewLabel_2_1_3.setBounds(51, 25, 79, 14);
        panel_1.add(lblNewLabel_2_1_3);
        
        JLabel lblNewLabel_2_1_4 = new JLabel("Nombres:");
        lblNewLabel_2_1_4.setBounds(314, 25, 68, 14);
        panel_1.add(lblNewLabel_2_1_4);
        
        JLabel lblNewLabel_2_1_5 = new JLabel("Teléfono:");
        lblNewLabel_2_1_5.setBounds(314, 59, 68, 14);
        panel_1.add(lblNewLabel_2_1_5);
        
        textField = new JTextField();
        textField.setBounds(392, 56, 167, 20);
        panel_1.add(textField);
        textField.setColumns(10);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(392, 22, 167, 20);
        panel_1.add(textField_1);
        
        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(130, 22, 134, 20);
        panel_1.add(textField_2);
        
        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(130, 56, 134, 20);
        panel_1.add(textField_3);
        
        JPanel panel_1_1 = new JPanel();
        panel_1_1.setBounds(10, 200, 592, 54);
        panel_1_1.setBorder(borde);
        contentPane.add(panel_1_1);
        panel_1_1.setLayout(null);
        
        JLabel lblNewLabel_2_1_6 = new JLabel("N° Factura:");
        lblNewLabel_2_1_6.setBounds(10, 23, 71, 14);
        panel_1_1.add(lblNewLabel_2_1_6);
       
		
		

		
        
        JLabel lblNewLabel_2_1_6_2 = new JLabel("Fecha:");
        lblNewLabel_2_1_6_2.setBounds(312, 23, 46, 14);
        panel_1_1.add(lblNewLabel_2_1_6_2);
        
        JLabel lblNewLabel_2_1_6_3 = new JLabel("31/3/2024");
        lblNewLabel_2_1_6_3.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_2_1_6_3.setBounds(368, 23, 104, 14);
        panel_1_1.add(lblNewLabel_2_1_6_3);
        
        JLabel lblNewLabel_2_1_6_1_1 = new JLabel("Datos de factura");
        lblNewLabel_2_1_6_1_1.setBounds(10, 0, 127, 14);
        panel_1_1.add(lblNewLabel_2_1_6_1_1);
        
        JLabel lblNewLabel_5 = new JLabel("1");
        lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_5.setBounds(91, 23, 46, 14);
        panel_1_1.add(lblNewLabel_5);
        
        JPanel panel_1_1_1 = new JPanel();
        panel_1_1_1.setBounds(10, 258, 592, 28);
      
        panel_1_1_1.setBorder(borde);
        contentPane.add(panel_1_1_1);
        panel_1_1_1.setLayout(null);
        
        JLabel lblNewLabel_2_1_11 = new JLabel("Ver listado de facturas");
        lblNewLabel_2_1_11.setBounds(54, 7, 129, 14);
        panel_1_1_1.add(lblNewLabel_2_1_11);
        
        JLabel lblNewLabel_2_1_12 = new JLabel("Añadir");
        lblNewLabel_2_1_12.setBounds(440, 7, 46, 14);
        panel_1_1_1.add(lblNewLabel_2_1_12);
        
        JLabel lblNewLabel_2_1_13 = new JLabel("Eliminar");
        lblNewLabel_2_1_13.setBounds(522, 7, 46, 14);
        panel_1_1_1.add(lblNewLabel_2_1_13);
        
        JLabel lblNewLabel_2_1_11_1 = new JLabel("");
        lblNewLabel_2_1_11_1.setBounds(24, 2, 38, 25);
        lblNewLabel_2_1_11_1.setIcon(new ImageIcon(getClass().getResource("menu-abierto.png")));
        panel_1_1_1.add(lblNewLabel_2_1_11_1);
        
        JLabel lblNewLabel_2_1_11_1_1 = new JLabel("");
        lblNewLabel_2_1_11_1_1.setBounds(409, 1, 30, 28);
        lblNewLabel_2_1_11_1_1.setIcon(new ImageIcon(getClass().getResource("boton-agregar.png")));
        panel_1_1_1.add(lblNewLabel_2_1_11_1_1);
        
        JLabel lblNewLabel_2_1_11_1_2 = new JLabel("");
        lblNewLabel_2_1_11_1_2.setBounds(496, 2, 24, 25);
        lblNewLabel_2_1_11_1_2.setIcon(new ImageIcon(getClass().getResource("cancelar.png")));
        panel_1_1_1.add(lblNewLabel_2_1_11_1_2);
        
       	String tittle[]= {"Producto","Cantidad","Valor","Subtotal"};

		String tableData [][] = {
			
                {"Agua", "2", "500","1000.0"},
                {"Cereal", "5", "1000","5000.0"},
                {"Leche", "2", "300","600.0"}
		};
		JTable tableUser = new JTable(tableData,tittle);
		//tableUser.setBounds(100, 450, 500, 200);
		JScrollPane tableScroll = new JScrollPane(tableUser);
		tableScroll.setBounds(10, 290, 592, 100);
		contentPane.add(tableScroll);

        
        
        
        JLabel lblNewLabel_2 = new JLabel("SubTotal:");
        lblNewLabel_2.setBounds(20, 401, 76, 14);
        contentPane.add(lblNewLabel_2);
        
        JLabel lblNewLabel_3 = new JLabel("% Descuento:");
        lblNewLabel_3.setBounds(20, 422, 76, 14);
        contentPane.add(lblNewLabel_3);
        
        JLabel lblNewLabel_3_1 = new JLabel("Total Factura:");
        lblNewLabel_3_1.setBounds(20, 461, 91, 14);
        contentPane.add(lblNewLabel_3_1);
        
        JLabel lblNewLabel_3_2 = new JLabel("IVA 19%:");
        lblNewLabel_3_2.setBounds(20, 442, 76, 14);
        contentPane.add(lblNewLabel_3_2);
        
        JLabel lblNewLabel_4 = new JLabel("");
        lblNewLabel_4.setEnabled(false);
        lblNewLabel_4.setOpaque(true);
        lblNewLabel_4.setBackground(new Color(0, 64, 128));
        lblNewLabel_4.setBounds(0, 481, 612, 14);
        contentPane.add(lblNewLabel_4);
        
        JLabel lblNewLabel_2_1 = new JLabel("6600.0");
        lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_2_1.setBounds(121, 401, 46, 14);
        contentPane.add(lblNewLabel_2_1);
        
        JLabel lblNewLabel_2_5 = new JLabel("Valor  descontado:");
        lblNewLabel_2_5.setBounds(267, 422, 106, 14);
        contentPane.add(lblNewLabel_2_5);
        
        JCheckBox chckbxNewCheckBox = new JCheckBox("");
        chckbxNewCheckBox.setBounds(183, 419, 28, 23);
        contentPane.add(chckbxNewCheckBox);
        
        JButton btnNewButton = new JButton("Finalizar Factura");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnNewButton.setBounds(366, 457, 137, 23);
        contentPane.add(btnNewButton);
        
        JButton btnLimpiar = new JButton("Limpiar");
        btnLimpiar.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnLimpiar.setBounds(513, 457, 89, 23);
        contentPane.add(btnLimpiar);
        
        textField_4 = new JTextField();
        textField_4.setColumns(10);
        textField_4.setBounds(121, 422, 49, 14);
        contentPane.add(textField_4);
        
        JLabel lblNewLabel_2_1_7 = new JLabel("1254.0");
        lblNewLabel_2_1_7.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_2_1_7.setBounds(121, 442, 46, 14);
        contentPane.add(lblNewLabel_2_1_7);
        
        JLabel lblNewLabel_2_1_8 = new JLabel("7524.0");
        lblNewLabel_2_1_8.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_2_1_8.setBounds(121, 461, 46, 14);
        contentPane.add(lblNewLabel_2_1_8);
        
        JLabel lblNewLabel_2_1_9 = new JLabel("330.0");
        lblNewLabel_2_1_9.setFont(new Font("Tahoma", Font.BOLD, 11));
        lblNewLabel_2_1_9.setBounds(375, 422, 46, 14);
        contentPane.add(lblNewLabel_2_1_9);
        
        table_1 = new JTable();
        table_1.setColumnSelectionAllowed(true);
        table_1.setCellSelectionEnabled(true);
        table_1.setBounds(20, 297, 564, 88);
        contentPane.add(table_1);
	}
}
