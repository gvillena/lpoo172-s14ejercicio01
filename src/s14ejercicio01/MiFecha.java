/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package s14ejercicio01;

import java.util.GregorianCalendar;

/**
 *
 * @author alumno
 */
public class MiFecha {
 
    private int año;
    private int mes;
    private int dia;

    MiFecha() {
        GregorianCalendar calendario = new GregorianCalendar();        
        año = calendario.get(GregorianCalendar.YEAR);
        mes = calendario.get(GregorianCalendar.MONTH);
        dia = calendario.get(GregorianCalendar.DAY_OF_MONTH);        
    }
    
    MiFecha(int año, int mes, int dia) {
        this.año = año;
        this.mes = mes;
        this.dia = dia;
    }
    
    MiFecha(long tiempoTranscurrido) {
        setDate(tiempoTranscurrido);
    }
    
    
    public int getAño() {
        return año;
    }

    public String getMes() {        
        String m = String.valueOf(mes + 1);                
        return (mes < 10 ? "0" + m : m);
    }

    public String getDia() {
        String d = String.valueOf(dia);        
        return (dia < 10 ? "0" + d : d);
    }

    private void setDate(long tiempoTranscurrido) {
        GregorianCalendar calendario = new GregorianCalendar();
        calendario.setTimeInMillis(tiempoTranscurrido);
        año = calendario.get(GregorianCalendar.YEAR);
        mes = calendario.get(GregorianCalendar.MONTH);
        dia = calendario.get(GregorianCalendar.DAY_OF_MONTH);       
    }
    
    
    
}
