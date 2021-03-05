/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import datos.PersonaDAO;
import domain.Persona;
import java.util.List;

/**
 *
 * @author Diana
 */
public class ManejoPersonas {

    public static void main(String[] args) {
        PersonaDAO personaDAO = new PersonaDAO();
    
        Persona personaConsultar = new Persona();
        personaConsultar.setId_persona(2);
        // Recuperación de información a través de otro objeto
        personaConsultar=personaDAO.query(personaConsultar);
        System.out.println("persona:" + personaConsultar.toString()); 
        System.out.println("ID:" + personaConsultar.getId_persona()); 
        System.out.println("nombre:" + personaConsultar.getNombre());
        System.out.println("apellido:" + personaConsultar.getApellido());         
        System.out.println("correo:" + personaConsultar.getEmail()); 
        System.out.println("telefono:" + personaConsultar.getTelefono());         
 
        
    }

}
