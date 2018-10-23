/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_4;

import java.util.Scanner;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Boletin2_4 {
public static Scanner sca = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Integer cantDin,num100,num20,num5,num1;
    
    cantDin        = pedirNumero( "la Cantidad");
    num100 = cantDin/100;
    cantDin = cantDin%100;
    num20 = cantDin/20;
    cantDin = cantDin%20;
    num5 = cantDin/5;
    num1 = cantDin%5;
    
    System.out.println("la cantidad de billetes de 100€ es :"+ num100);
    System.out.println("la cantidad de billetes de 20€  es :"+ num20);
    System.out.println("la cantidad de billetes de 5€   es :"+ num5);
    System.out.println("la cantidad de billetes de 1€   es :"+ num1);
    }
    
    
    
    
    
    
     public static Integer pedirNumero(String nombreDato){
    Integer res;
        do {
    System.out.print("Introduzca "+ nombreDato+": ");
    res = comprobarNum( sca.nextLine());
    System.out.println();
    }while(res == null);  // pedira el dato hasta que e introduzca un numero valido.
    return res;
    
    
    }
     public static  Integer comprobarNum(String numero){
         Integer x ;
        try{   // lo parseo y si no es un numero valido asigna a x el valor de nulo.
           x = Integer.parseInt(numero); 
        }catch(Exception ex){
            x=null;
            
     }
      
            
            
            return x;
      
        
        



}    
}
