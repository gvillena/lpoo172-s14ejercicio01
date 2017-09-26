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
public class Profesor 
                extends Empleado {
    
    private String horasOficina;
    private String rango;

    public Profesor(String name, String direccion, String telefono, String email, 
                        int oficina, double sueldo, String horasOficina, String rango) {
        super(name, direccion, telefono, email, oficina, sueldo);
        this.horasOficina = horasOficina;
        this.rango = rango;        
    }

    public String getHorasOficina() {
        return horasOficina;
    }

    public void setHorasOficina(String horasOficina) {
        this.horasOficina = horasOficina;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    @Override
    public String toString() {
        return super.toString() + 
               "\nHora Oficina: " + horasOficina + 
               "\nRango: " + rango;
    }
    
    
    
}
