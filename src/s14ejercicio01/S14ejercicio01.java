/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s14ejercicio01;

/**
 *
 * @author alumno
 */
public class S14ejercicio01 {
 
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona persona = 
                new Persona( "John", "12 Bell Street",
                             "3473339999", "john12@email.com");
        
        Estudiante estudiante = new Estudiante("Mary", "100 Town Ave", "514646464", "mary100@email.com", Estudiante.FRESHMAN);
        
        Empleado empleado = new Empleado("Mike", "34 West Street", "61899931", "mike80@email.com", 910, 60000);
        
        Profesor profesor = new Profesor("Sue", "28 Well Street", "4113333346", "sue28@email.com", 101, 50000, "4pm a 6pm", "Profesor");
        
        Administrativo administrativo = new Administrativo("Tom", "90 Country Road", "20300000000", "tomcat@email.com", 12, 65000, "Asistente Ejecutivo");

        System.out.println("\nPERSONA");
        System.out.println(persona.toString());        
        
        System.out.println("\nESTUDIANTE");
        System.out.println(estudiante.toString());
        
        System.out.println("\nEMPLEADO");
        System.out.println(empleado.toString());
        
        System.out.println("\nPROFESOR");
        System.out.println(profesor.toString());
        
        System.out.println("\nADMINISTRATIVO");
        System.out.println(administrativo.toString());
        
    }
    
}
