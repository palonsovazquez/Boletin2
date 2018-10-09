/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bolentin2_2;

import java.util.Scanner;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Bolentin2_2 {
public static Scanner sca = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Double gradosCent,gradosFah,gradosKel;
        
        gradosCent = pedirNumero("los grados Centigrados");
        if(gradosCent <= -273.15){
        System.out.println("Revisa tus libros de fisica, esa temperatura es imposible");
        
        }
        gradosFah = (gradosCent *9/5 +32);
        gradosKel = gradosCent + 273.15;
        System.out.println("Grados Fahrenheit = "+ gradosFah);
        System.out.println("Grados Kelvin     = "+ gradosKel);
    }
    public static Double pedirNumero(String nombreDato){
    Double res;
        do {
    System.out.print("Introduzca "+ nombreDato+": ");
    res = comprobarNum( sca.nextLine());
    System.out.println();
    }while(res == null);  // pedira el dato hasta que e introduzca un numero valido.
    return res;
    
    
    }
     public static  Double comprobarNum(String numero){
         Double x ;
        try{   // lo parseo y si no es un numero valido asigna a x el valor de nulo.
           x =  Double.parseDouble(numero); 
        }catch(Exception ex){
            x=null;
            
     }
      
            
            
            return x;
      
        
        



}    
}
