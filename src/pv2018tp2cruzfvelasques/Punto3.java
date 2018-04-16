/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pv2018tp2cruzfvelasques;

import fechas.Fecha;
import java.util.Scanner;

/**
 *
 * @author CX
 */
public class Punto3 {

    private String fecha;
    
    public Punto3() {
    }
    
    public void sumarFecha(){
        Scanner in=new Scanner(System.in);
        Fecha unaFecha=new Fecha();
        System.out.println("Se sumara 100 dias a la fecha dada");
        System.out.println("Ingrese fecha: ");
        setFecha(in.nextLine());
        unaFecha.recibirFecha(getFecha());
        unaFecha.sumarDiasAFecha();
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
