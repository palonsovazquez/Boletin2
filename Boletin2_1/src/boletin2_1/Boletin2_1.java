/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_1;


import java.util.Scanner;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Boletin2_1 {
public static Scanner sca = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double precioOrg, precioFin, porcentaje ;
        
        do{
        precioOrg = pedirNumero("el precio original");
        precioFin = pedirNumero("el precio Final");
        }while(precioOrg < precioFin ||0== precioOrg );
        System.out.println("Precio Original: "+ precioOrg);
        System.out.println("Precio Final   : "+ precioFin);
        porcentaje = 100 -100*precioFin/precioOrg;
        System.out.println("Descuento      : "+porcentaje + " %");
        
        
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
