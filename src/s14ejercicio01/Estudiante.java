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
public class Estudiante 
                extends Persona {
    
    private int estado;
    public final static int FRESHMAN = 1; 
    public final static int SOPHOMORE = 3; 
    public final static int JUNIOR = 2; 
    public final static int SENIOR = 4; 

    public Estudiante(String name, String direccion, String telefono, String email, int estado) {
        super(name, direccion, telefono, email);
        this.estado = estado;
    }

    public String getEstado() {
        switch (estado) {
            case 1: return "freshman";
            case 2: return "sophomore";
            case 3: return "junior";
            case 4: return "senior";                                
            default: return "Desconocido";                
        }        
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nEstado=" + getEstado();
    }
    
    
    
    
    
    
    
    
}
