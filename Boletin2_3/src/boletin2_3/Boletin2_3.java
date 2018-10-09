/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_3;

import java.util.Scanner;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Boletin2_3 {
public static Scanner sca = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer bill100,bill20,bill5,mon1,dinFin;
        bill100 = pedirNumero( "el numero de billetes de 100€ que tienes: ");
        bill20 = pedirNumero( "el numero de billetes de 20€ que tienes: ");
        bill5 = pedirNumero( "el numero de billetes de 5€ que tienes: ");
        mon1 = pedirNumero( "el numero de monedas de 1 € que tienes: ");
        dinFin = bill100*100+bill20*20+bill5*5+mon1;
        System.out.println("El total es: "+dinFin+ " €.");
        
        
        
        
        
        // TODO code application logic here
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
