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
public class Persona {
    
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;

    public Persona() {
        this("desconocido", "desconocido", "desconocido", "desconocido" );
    }

    public Persona(String name, 
                    String direccion, 
                    String telefono, 
                    String email) {
        this.nombre = name;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
    }

    public String getNombre() {        
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "\nNombre: " + nombre + 
                "\nDireccion=" + direccion +
                "\nTelefono=" + telefono + 
                "\nEmail=" + email;
    }
    
    
    
    
}
