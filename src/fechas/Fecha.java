/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fechas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author CX
 */
public class Fecha {
    private String f1;
    private String f2;
    private String dia;
    private String mes;
    
    public Fecha() {
    }
    
    public void recibirFecha(String fecha){
        setF1(fecha);
    }
    
    public void recibirFecha2(String fecha2){
        setF2(fecha2);
    }
    
    public void separarFecha() {
        setDia(getF1().substring(0,2));
        setMes(getF1().substring(3,5));
    }
    
    public Date crearHoy(){
        Date hoy=new Date();
        return hoy;
    }
    
    public long devolverDiferenciaDeDias(){
        long cont;
        cont=((pasarStringADate(getF2()).getTime()-pasarStringADate(getF1()).getTime())/(24*60*60*1000));
        return cont;
    }
    
    public long devolverEdadEnSemanas(){
        long cont;
        cont=((crearHoy().getTime()-pasarStringADate(getF1()).getTime())/(24*60*60*1000)/7);
        return cont;
    }
    
    public long devolverCantidadDomingos(){
        long cont;
        cont=((pasarStringADate(getF2()).getTime()-pasarStringADate(getF1()).getTime())/(24*60*60*1000)/7);
        return cont;
    }
    
    public Date pasarStringADate(String fecha){
        SimpleDateFormat formato=new SimpleDateFormat("dd/MM/yyyy");
        try{
            Date fechaDevuelta=formato.parse(fecha);
            return fechaDevuelta;
        }
        catch(ParseException e){
            System.out.println("No se puede formatear");
            return null;
        }
    }
    
    
    public String devolverEstacion(){
        String estacion="";
        int op,aux;
        separarFecha();
        op=Integer.parseInt(getMes());
        aux=Integer.parseInt(getDia());
        switch (op){
            case 1: {estacion="Verano";
                break;
            }
            case 2: {estacion="Verano";
                break;
            }
            case 3: {
                    if(aux<21)
                        estacion="Verano";
                    else{
                        if(aux>=21)
                            estacion="Otoño";
                    }
                    break;
                    }
            case 4: {estacion="Otoño";
                break;
            }
            case 5: {estacion="Otoño";
                break;
            }
            case 6:{
                   if(aux<21)
                       estacion="Otoño";
                   else{
                       if(aux>=21)
                           estacion="Invierno";
                   }
                   break;
            }
            case 7: {estacion="Invierno";
                break;
            }
            case 8: {estacion="Invierno";
                break;
            }
            case 9:{
                   if(aux<21)
                       estacion="Invierno";
                   else{
                       if(aux>=21)
                           estacion="Primavera";
                   }
                   break;
            }
            case 10: {estacion="Primavera";
                break;
            }
            case 11: {estacion="Primavera";
                break;
            }
            case 12:{
                   if(aux<21)
                       estacion="Primavera";
                   else{
                       if(aux>=21)
                           estacion="Verano";
                   }
                   break;
            }
        }
        return estacion;
    }
    
    public void sumarDiasAFecha(){
        String MES[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        String DIA[] = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
        Calendar calendario = Calendar.getInstance();
        Date fechacam=pasarStringADate(getF1());
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechacam); 
        calendar.add(Calendar.DAY_OF_YEAR, 100);  
        System.out.println(DIA[calendar.get(Calendar.DAY_OF_WEEK)-1]+", "+calendar.get(Calendar.DAY_OF_MONTH)+" de "+MES[calendar.get(Calendar.MONTH)]+" de "+calendar.get(Calendar.YEAR));
}
  
    
    /**
     * @return the f1
     */
    public String getF1() {
        return f1;
    }

    /**
     * @param f1 the f1 to set
     */
    public void setF1(String f1) {
        this.f1 = f1;
    }

    /**
     * @return the f2
     */
    public String getF2() {
        return f2;
    }

    /**
     * @param f2 the f2 to set
     */
    public void setF2(String f2) {
        this.f2 = f2;
    }

    /**
     * @return the dia
     */
    public String getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     * @return the mes
     */
    public String getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(String mes) {
        this.mes = mes;
    }
    
    
}
