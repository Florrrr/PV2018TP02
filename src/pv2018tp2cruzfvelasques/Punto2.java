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
public class Punto2 {
    private int op;
    private String fecha;
    private String fecha2;

    public Punto2() {
    }
    
    public void elegirOpcion(){
        Scanner in=new Scanner(System.in);
        Scanner fech=new Scanner(System.in);
        Scanner fecha2=new Scanner(System.in);
        Fecha unaFecha=new Fecha();
        System.out.println("...Opciones...");
        System.out.println("1.Mostrar años de vida en semanas");
        System.out.println("2.Devolver la estacion de una fecha");
        System.out.println("3.Mostrar cantidad de domingos entre dos fechas");
        System.out.println("4.Devolver diferencia de dias entre dos fechas");
        System.out.println("5.Salir");
        System.out.println("Elegir opcion: ");
        setOp(in.nextInt());
        System.out.println("Ingrese fecha: ");
        setFecha(fech.nextLine());
        unaFecha.recibirFecha(getFecha());
        switch(getOp()){
            case 1:{
                System.out.println("Tiene "+unaFecha.devolverEdadEnSemanas()+" semanas de vida");
                break;
            }
            case 2:{
                System.out.println("La estacion de la fecha "+getFecha()+" es "+unaFecha.devolverEstacion());
                break;
            }
            case 3:{
                System.out.println("Ingrese fecha 2: ");
                setFecha2(fecha2.nextLine());
                unaFecha.recibirFecha2(getFecha2());
                System.out.println("Hay "+unaFecha.devolverCantidadDomingos()+" domingos entre "+getFecha()+" y "+getFecha2());
                break;
            }
            case 4:{
                System.out.println("Ingrese fecha 2: ");
                setFecha2(fecha2.nextLine());
                unaFecha.recibirFecha2(getFecha2());
                System.out.println("La diferencia de dias entre "+getFecha()+" y "+getFecha2()+" es de "+unaFecha.devolverDiferenciaDeDias()+" dias");
                break;
            }
            case 5:{
                System.out.println("Fin Programa");
                break;
            }
            default:{
                System.out.println("Opcion Incorrecta");
                break;
            }
        }
        
    }
    /**
     * @return the op
     */
    public int getOp() {
        return op;
    }

    /**
     * @param op the op to set
     */
    public void setOp(int op) {
        this.op = op;
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

    /**
     * @return the fecha2
     */
    public String getFecha2() {
        return fecha2;
    }

    /**
     * @param fecha2 the fecha2 to set
     */
    public void setFecha2(String fecha2) {
        this.fecha2 = fecha2;
    }
    
}
