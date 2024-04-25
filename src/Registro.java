import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

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
import java.io.File;
import java.util.Arrays;
import java.awt.event.ActionEvent;

public class Registro extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JTextField textField_2;
    private JTextField textField_1;

   
    private JPasswordField password,password2;
    private JTextField textField_4;
    private JTextField textField_5;
    private JFrame frame;

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
    	
            
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 610);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);
        this.login(frame);
        //this.registro(frame);
        //this.recuperacion(frame);
        
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu mnInicio = new JMenu("Cuenta");
        menuBar.add(mnInicio);
        JMenuItem loginItem = new JMenuItem("Login");
		JMenuItem registroItem = new JMenuItem("Registro");
		JMenuItem recuperacionItem = new JMenuItem("Recuperacio de cuenta");
		
		loginItem.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	frame.remove(contentPane);
        		frame.removeAll();
        		login(frame);
		    	
		    }
		});

		registroItem.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	frame.remove(contentPane);
        		frame.removeAll();
        		registro(frame);
		        
		    }
		});

		recuperacionItem.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	frame.remove(contentPane);
        		frame.removeAll();
        		recuperacion(frame);
		       
		    }
		});
		mnInicio.add(loginItem);
		mnInicio.add(registroItem);
		mnInicio.add(recuperacionItem);
		
        
        JMenu mnUsuarios = new JMenu("Usuarios");
        menuBar.add(mnUsuarios);
        JMenuItem altaItem = new JMenuItem("Alta");
		JMenuItem bajaItem = new JMenuItem("Baja");
		JMenuItem consultarItem = new JMenuItem("Consultar");
		mnUsuarios.add(altaItem);
		mnUsuarios.add(bajaItem);
		mnUsuarios.add(consultarItem);
        
        JMenu mnAyuda = new JMenu("Ayuda");
        menuBar.add(mnAyuda);
        JMenuItem ayuda1Item = new JMenuItem("¿Cómo crear un usuario?");
		JMenuItem ayuda2Item = new JMenuItem("¿Cómo acceder al sistema?");
		JMenuItem ayuda3Item = new JMenuItem("¿Qué pasa si olvidé mi contraseña?");
		mnAyuda.add(ayuda1Item);
		mnAyuda.add(ayuda2Item);
		mnAyuda.add(ayuda3Item);
         	
    }
    private void login(JFrame Frame) {
    	    	
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
        
        JButton btnNewButton = new JButton("Acceder(\"Archivo json \")");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		JOptionPane.showMessageDialog(null, "Registro terminado", "Atención", JOptionPane.INFORMATION_MESSAGE);
        		
        		String nombre=  textField_4.getText();
        		char[] contraseña = password.getPassword();

        	
        		String contrasenia = new String(contraseña);
        		
				Jason json = new Jason( nombre, contrasenia);
				ObjectMapper mapper = new ObjectMapper();
				mapper.enable(SerializationFeature.INDENT_OUTPUT);
				
							
				try {
					
					mapper.writeValue(new File("Usuario.json"), json);
								
					String contenidoJson = mapper.writeValueAsString(json);
			        System.out.println("Contenido del archivo JSON:");
			        System.out.println(contenidoJson);
					
					//System.out.println("Nombre: "+json.getNombre());
					//System.out.println("Apellido: "+json.getApellido());
					
					
									
				}catch(Exception e2){
					
					
				}
				
        		
        		
        		//JOptionPane.showMessageDialog(null, r + "," + g + "," + b, "Inane warning",JOptionPane.ERROR_MESSAGE);
        		
        		
        		
        	}
        });
        btnNewButton.setBounds(98, 276, 242, 40);
        contentPane.add(btnNewButton);
        
        textField_4 = new JTextField();
        textField_4.setBounds(98, 128, 242, 31);
        contentPane.add(textField_4);
        textField_4.setColumns(10);
        
        password = new JPasswordField();
        password.setColumns(10);
        password.setBounds(98, 211, 242, 31);
        contentPane.add(password);
        
        JLabel lblNewLabel_1_1 = new JLabel("¿Olvidó su contraseña?");
        lblNewLabel_1_1.setForeground(new Color(255, 255, 255));
        lblNewLabel_1_1.setBounds(156, 342, 162, 14);
        contentPane.add(lblNewLabel_1_1);
        
        JButton btnNewButton_1 = new JButton("¿Aún no tienes cuenta?");
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		Frame.remove(contentPane);
        		Frame.removeAll();
        		registro(Frame);
        		
        		
        		 
        		//Frame.repaint();
        		//Frame.invalidate();
        		//Frame.revalidate();
        		
        		
        		
        	}
        });
        btnNewButton_1.setBounds(131, 408, 177, 40);
        contentPane.add(btnNewButton_1);
        
       
        
       
        contentPane.repaint();
        contentPane.revalidate();
        
    	  	
    	
    	
    	
    }
         
        public void registro(JFrame Frame) {
            
        	
        	
        	
        	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(100, 100, 450, 610);
            contentPane = new JPanel();
            contentPane.setBackground(new Color(128, 0, 255));
            contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
            setContentPane(contentPane);
            contentPane.setLayout(null);
            
            //Frame.setContentPane(contentPane);
            

            JLabel lblNewLabel = new JLabel("Registrarse");
            lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
            lblNewLabel.setForeground(new Color(255, 255, 0));
            lblNewLabel.setBounds(150, 60, 163, 46);
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
            chckbxNewCheckBox.setBounds(115, 406, 217, 23);
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
            btnNewButton.setBounds(152, 447, 124, 23);
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
            
            JButton btnyaTienesCuenta = new JButton("¿Ya tienes cuenta?");
            btnyaTienesCuenta.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            		Frame.remove(contentPane);
            		Frame.removeAll();
            		login(Frame);
            		
            		            		 
            		Frame.repaint();
            		Frame.invalidate();
            		Frame.revalidate();

            	}
            });
            btnyaTienesCuenta.setFocusPainted(false);
            btnyaTienesCuenta.setBackground(new Color(255, 128, 64));
            btnyaTienesCuenta.setBounds(136, 494, 153, 23);
            contentPane.add(btnyaTienesCuenta);
            
            

            
            contentPane.repaint();
            contentPane.revalidate();
        }
        private void recuperacion(JFrame Frame) {
	    	
        	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(100, 100, 450, 610);
            contentPane = new JPanel();
            contentPane.setBackground(new Color(0, 0, 255));
            contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
            setContentPane(contentPane);
            contentPane.setLayout(null);
            
            JLabel lblNewLabel_1 = new JLabel("Recuperación de cuenta");
            lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
            lblNewLabel_1.setForeground(new Color(255, 255, 255));
            lblNewLabel_1.setBounds(80, 86, 296, 27);
            contentPane.add(lblNewLabel_1);
            
           
            
           
            contentPane.repaint();
            contentPane.revalidate();
            
        	  	
        	
        	
        	
        }
    }