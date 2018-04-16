/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadenas;

/**
 *
 * @author CX
 */
public class Cadena {
    private String cad;
    private char car;
    
    public Cadena() {
    }

    public void recibirCadena(String c){
        setCad(c);
    }
    
    public void recibirCaracter(char c){
        setCar(c);
    }
    
    public int contarVocal(){
        int cont,contA=0;
        for (cont=getCad().length()-1;cont>=0;cont--){
           switch (getCad().charAt(cont)){
               case 'a':{
                   contA++;
                   break;
               }
               case 'e':{
                   contA++;
                   break;
               
               }
               case 'i':{
                   contA++;
                   break;
               }
               case 'o':{
                   contA++;
                   break;
               }
               case 'u': {
                   contA++;
                   break;
               }
               case 'A':{
                   contA++;
                   break;
               }
               case 'E':{
                   contA++;
                   break;
               
               }
               case 'I':{
                   contA++;
                   break;
               }
               case 'O':{
                   contA++;
                   break;
               }
               case 'U': {
                   contA++;
                   break;
               }
           }
           
           
       }
          return contA;
    }
    
    public String invertirCadena(){
        String inv="";
        for(int i=getCad().length()-1;i>=0;i--){
            inv=inv+getCad().charAt(i);
        }
        return inv;
    }
    public int contarCaracter(){
        int cont,i=0;
        for(cont=getCad().length()-1;cont>=0;cont--){
            if(getCar()==getCad().charAt(cont))
                i++;
        }
        return i;
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

    /**
     * @return the car
     */
    public char getCar() {
        return car;
    }

    /**
     * @param car the car to set
     */
    public void setCar(char car) {
        this.car = car;
    }

    
}
