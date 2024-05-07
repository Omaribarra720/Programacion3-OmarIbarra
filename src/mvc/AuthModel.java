package mvc;

import java.io.File;

import javax.swing.JOptionPane;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AuthModel {
	public AuthModel() {
		
		
		
	}
	public boolean login(String username,String password) {
		
		
		
		
		ObjectMapper objectMapper = new ObjectMapper(); 
        JsonNode jsonNode;
        
		try {
			
			jsonNode = objectMapper.readTree(new File("src/Archivos/Usuario.json"));
			String nombre = jsonNode.get("nombre").asText(); 
            String contraseña = jsonNode.get("contraseña").asText(); 
                  
            /*
		    String nombreIngresado = fieldNombre.getText();
		    char[] contraseñaIngresada = fieldContraseña.getPassword();
		    String contraseñaIngresadaString = new String(contraseñaIngresada);
		    */
		    
		    if (username.equals(nombre) && password.equals(contraseña)) {
		      
		        return true;
		        
		    } else {
		       
		    	return false;


		    }
                           
           
			
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			 System.out.println("Error al leer el archivo JSON");
			 return false;
		} 
		/*
		if(username.equals("admin") && password.equals("123"))
			
			
			return true;
		
		
		return false;
		*/
	}
	

}