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
public class Empleado 
                extends Persona {
    
    private int oficina;
    private double sueldo;
    private MiFecha fechaIngreso;

    public Empleado(String name, String direccion, String telefono, String email, int oficina, double sueldo) {
        super(name, direccion, telefono, email);
        this.oficina = oficina;
        this.sueldo = sueldo;
        this.fechaIngreso = new MiFecha();
    }
    
    
    public int getOficina() {
        return oficina;
    }

    public void setOficina(int oficina) {
        this.oficina = oficina;
    }

    public String getSueldo() {
        return String.format("%.2f", sueldo);
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getFechaIngreso() {        
        return fechaIngreso.getDia()+ "/" + 
                fechaIngreso.getMes() + "/" +
                fechaIngreso.getAño();
    }

    public void setFechaIngreso() {
        this.fechaIngreso = new MiFecha();
    }

    @Override
    public String toString() {
        return super.toString() + 
                "\nOficina=" + oficina + 
                "\nSueldo=" + getSueldo() + 
                "\nFecha Ingreso=" + getFechaIngreso() + '}';
    }
    
    
    
    
           
    
    
    
    
    
}
