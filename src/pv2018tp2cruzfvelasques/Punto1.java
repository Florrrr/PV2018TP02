/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pv2018tp2cruzfvelasques;

import cadenas.Cadena;
import java.util.Scanner;

/**
 *
 * @author CX
 */
public class Punto1 {
    private int op;
    private String cad;

    public Punto1() {
    }
    
    public void elegirOpcion(){
        Scanner in=new Scanner(System.in);
        Scanner cd=new Scanner(System.in);
        Scanner car=new Scanner(System.in);
        Cadena unaCadena=new Cadena();
        System.out.println("1.Mostrar cantidad vocales");
        System.out.println("2.Invertir cadena");
        System.out.println("3.Cantidad de veces que se repite un caracter");
        System.out.println("4.Salir");
        System.out.println("Elija opcion: ");
        setOp(in.nextInt());
        System.out.println("Ingrese cadena: ");
        setCad(cd.nextLine());
        unaCadena.recibirCadena(getCad());
        switch(getOp()){
            case 1:{
                System.out.println("La cantidad de vocales de "+getCad()+" tiene "+unaCadena.contarVocal());
                break;
            }
            case 2:{
                System.out.println(getCad()+" inverso "+unaCadena.invertirCadena());
                break;
            }
            case 3:{
                char c;
                System.out.println("Ingrese caracter: ");
                c=car.next().charAt(0);
                unaCadena.recibirCaracter(c);
                System.out.println("En la cadena "+getCad()+" se repite "+unaCadena.contarCaracter()+" el caracter "+c);
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
     * @return the cad
     */
    public String getCad() {
        return cad;
    }

    /**
     * @param cad the cad to set
     */
    public void setCad(String cad) {
        this.cad = cad;
    }
    
}
