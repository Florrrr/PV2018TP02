/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pv2018tp2cruzfvelasques;

import java.util.Scanner;

/**
 *
 * @author CX
 */
public class PV2018TP2CruzFVelasques {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punto1 p1=new Punto1();
        Punto2 p2=new Punto2();
        Punto3 p3=new Punto3();
        switch(mostrarMenu()){
            case 1:{
                p1.elegirOpcion();
                break;
            }
            case 2:{
                p2.elegirOpcion();
                break;
            }
            case 3:{
                p3.sumarFecha();
                break;
            }
            case 4:{
                System.out.println("Fin Programa");
                break;
            }
            default:{
                System.out.println("Opcion Incorrecta");
                break;
            }
        }
    }
    
    public static int mostrarMenu(){
        Scanner in=new Scanner(System.in);
        int op;
        System.out.println("...Menu...");
        System.out.println("Punto 1");
        System.out.println("Punto 2");
        System.out.println("Punto 3");
        System.out.println("4.Salir");
        return(op=in.nextInt());
    }
}
