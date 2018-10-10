/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_5;

import java.util.Scanner;

/**
 *
 * @author Pablo Alonso Vazquez <pav.vigo@gmail.com>
 */
public class Boletin2_5 {
public static final Double COMISION =0.05d, IRPF =0.18, COSTEKM = 2d; // comision por el total de ventas
public static final Integer DIETAS = 30, RET_SEG_SOCIAL = 36; // cantidad de dinero por dia desplazado.
public static Double sueldoBruto,soldoLiquido,quilometraxe,ventas;
public static Integer diasDesplazados;
public static Scanner sca = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      sueldoBruto =     pedirNumeroDouble   ("o soldo Bruto       ");
      quilometraxe =    pedirNumeroDouble   ("o quilometraxe      ");
      diasDesplazados = pedirNumeroInt      ("os dias Desplazados ");
      ventas =          pedirNumeroDouble   ("as ventas           ");
      
      soldoLiquido = (sueldoBruto +
              COMISION*ventas+  // calculo de la comision por el total de ventas
              quilometraxe*COSTEKM- // desplazamiento
              RET_SEG_SOCIAL+       
              diasDesplazados*DIETAS) // dietras por desplazamiento
              *(1-IRPF);
        
      System.out.printf                     ("O soldo Liquido e: %.2f :", soldoLiquido);
        
        
    }
    public static Double pedirNumeroDouble(String nombreDato){
    Double res;
        do {
    System.out.print("Introduzca "+ nombreDato+": ");
    res = comprobarNumDouble( sca.nextLine());
    System.out.println();
    }while(res == null);  // pedira el dato hasta que e introduzca un numero valido.
    return res;
    
    
    }
     public static  Double comprobarNumDouble(String numero){
         Double x ;
        try{   // lo parseo y si no es un numero valido asigna a x el valor de nulo.
           x =  Double.parseDouble(numero); 
        }catch(Exception ex){
            x=null;
            
     }
      
            
            
            return x;
      
        
        



}    
     
     public static Integer pedirNumeroInt(String nombreDato){
    Integer res;
        do {
    System.out.print("Introduzca "+ nombreDato+": ");
    res = comprobarNumInt( sca.nextLine());
    System.out.println();
    }while(res == null);  // pedira el dato hasta que e introduzca un numero valido.
    return res;
    
    
    }
     
     
     public static  Integer comprobarNumInt(String numero){
         Integer x ;
        try{   // lo parseo y si no es un numero valido asigna a x el valor de nulo.
           x =  Integer.parseInt(numero); 
        }catch(Exception ex){
            x=null;
            
     }
      
            
            
            return x;
      
        
        



}
}
