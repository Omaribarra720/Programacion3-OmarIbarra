import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;

public class Registro extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_2;
    private JTextField textField_1;
    private JTextField textField_3;
   
    private JPasswordField password,password2;
    private JTextField textField_4;
    private JTextField textField_5;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Registro frame = new Registro();
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
    
    public Registro() {
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 610);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(128, 128, 128));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        JLabel lblNewLabel = new JLabel("Iniciar sesión");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setBounds(141, 52, 177, 40);
        contentPane.add(lblNewLabel);
        
        JLabel lblIngreseElNombre = new JLabel("Ingrese el nombre de usuario", JLabel.CENTER);
        lblIngreseElNombre.setForeground(Color.WHITE);
        lblIngreseElNombre.setBackground(Color.BLACK); 
        lblIngreseElNombre.setOpaque(true); 
        lblIngreseElNombre.setBounds(98, 114, 242, 14);
        contentPane.add(lblIngreseElNombre);
        
        JLabel lblIngreseSuContrasea = new JLabel("Ingrese su contraseña",0);
        lblIngreseSuContrasea.setBackground(Color.BLACK); 
        lblIngreseSuContrasea.setOpaque(true); 
        lblIngreseSuContrasea.setForeground(new Color(255, 255, 255));
        lblIngreseSuContrasea.setBackground(new Color(0, 0, 0));
        lblIngreseSuContrasea.setBounds(98, 197, 242, 14);
        contentPane.add(lblIngreseSuContrasea);
        
        JButton btnNewButton = new JButton("Login");
        btnNewButton.setBounds(149, 278, 139, 40);
        contentPane.add(btnNewButton);
        
        textField_4 = new JTextField();
        textField_4.setBounds(98, 128, 242, 31);
        contentPane.add(textField_4);
        textField_4.setColumns(10);
        
        textField_5 = new JTextField();
        textField_5.setColumns(10);
        textField_5.setBounds(98, 211, 242, 31);
        contentPane.add(textField_5);
        
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu mnInicio = new JMenu("Inicio");
        menuBar.add(mnInicio);
        
        JMenu mnLogin = new JMenu("Login");
        menuBar.add(mnLogin);
        
        JMenu mnRegistro = new JMenu("Registro");
        menuBar.add(mnRegistro);
        
        JMenu mnCarga = new JMenu("Carga");
        menuBar.add(mnCarga);
        
        JMenu mnAyuda = new JMenu("Ayuda");
        menuBar.add(mnAyuda);
        

        
    	
    	
    }
    
    /*
     * 
    public Registro() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 610);
        contentPane = new JPanel();
        contentPane.setBackground(new Color(128, 0, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Registrarse");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
        lblNewLabel.setForeground(new Color(255, 255, 0));
        lblNewLabel.setBounds(142, 61, 163, 46);
        contentPane.add(lblNewLabel);

        JLabel lblIngresaTuNombre = new JLabel("Ingresa tu nombre");
        lblIngresaTuNombre.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblIngresaTuNombre.setForeground(new Color(255, 255, 255));
        lblIngresaTuNombre.setBounds(62, 142, 129, 14);
        contentPane.add(lblIngresaTuNombre);

        JLabel lblIngresaTuApellido = new JLabel("Ingresa tu apellido");
        lblIngresaTuApellido.setForeground(Color.WHITE);
        lblIngresaTuApellido.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblIngresaTuApellido.setBounds(226, 142, 107, 14);
        contentPane.add(lblIngresaTuApellido);

        JLabel lblCorre = new JLabel("Correo electrónico");
        lblCorre.setForeground(Color.WHITE);
        lblCorre.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblCorre.setBounds(92, 207, 143, 14);
        contentPane.add(lblCorre);

        JLabel lblContrasea = new JLabel("Contraseña");
        lblContrasea.setForeground(Color.WHITE);
        lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblContrasea.setBounds(92, 270, 73, 14);
        contentPane.add(lblContrasea);

        JLabel lblConfirmarContrasea = new JLabel("Confirmar contraseña");
        lblConfirmarContrasea.setForeground(Color.WHITE);
        lblConfirmarContrasea.setFont(new Font("Tahoma", Font.PLAIN, 12));
        lblConfirmarContrasea.setBounds(92, 327, 172, 14);
        contentPane.add(lblConfirmarContrasea);

        JCheckBox chckbxNewCheckBox = new JCheckBox("Acepto los términos y condiciones");
        chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 12));
        chckbxNewCheckBox.setOpaque(false);
        chckbxNewCheckBox.setForeground(new Color(255, 255, 255));
        chckbxNewCheckBox.setBounds(116, 429, 217, 23);
        contentPane.add(chckbxNewCheckBox);

        //Boton
        JButton btnNewButton = new JButton("Registrarse");
        btnNewButton.setFocusPainted(false);
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               if(Arrays.equals(password.getPassword(), password2.getPassword()) && chckbxNewCheckBox.isSelected()==true && textField.getText()!=""&& textField_2.getText()!=""&& textField_1.getText()!="") {
            	   JOptionPane.showMessageDialog(null, "Registro terminado", "Atención", JOptionPane.INFORMATION_MESSAGE);
               }
            	            	
            }
        });
        btnNewButton.setBackground(new Color(255, 128, 64));
        btnNewButton.setBounds(153, 487, 124, 23);
        contentPane.add(btnNewButton);

        textField = new JTextField();
        textField.setBounds(62, 163, 143, 24);
        contentPane.add(textField);
        textField.setColumns(10);

        textField_2 = new JTextField();
        textField_2.setColumns(10);
        textField_2.setBounds(92, 223, 241, 24);
        contentPane.add(textField_2);

        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(226, 163, 143, 24);
        contentPane.add(textField_1);

        password = new JPasswordField();
        password.setColumns(10);
        password.setBounds(92, 283, 241, 24);
        contentPane.add(password);

        password2 = new JPasswordField ();
        password2.setColumns(10);
        password2.setBounds(92, 342, 241, 24);
        contentPane.add(password2);
        
        

      
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu mnUsuarios = new JMenu("Usuarios");
        menuBar.add(mnUsuarios);

        JMenuItem mntmLogin = new JMenuItem("Login");
        mntmLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        mnUsuarios.add(mntmLogin);

        JMenuItem mntmRegistrar = new JMenuItem("Registrar");
        mntmRegistrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                
            }
        });
        mnUsuarios.add(mntmRegistrar);
    }*/
    
    
}
