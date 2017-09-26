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
public class Administrativo 
                extends Empleado {
    
    private String cargo;

    public Administrativo( String name, String direccion, String telefono, String email, int oficina, double sueldo, String cargo) {
        super(name, direccion, telefono, email, oficina, sueldo);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nCargo: " + cargo;
    }
    
    
    
    
    
    
    
    
    
}
