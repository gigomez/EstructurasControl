/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.etructuras_control;

/**
 *
 * @author gloir
 */
public class Etructuras_Control {

    public static void main(String[] args) {
        
        
        int numeroIf = -5;
        int numeroWhile= 3;
     
        
        if (numeroIf <=0)
        {
            System.out.println("El numero es negativo");
        }else
        {
            System.out.println("El numero es positivo");
        }
        
        /*2*/
        
        while(numeroWhile<3)
        {
            numeroWhile++;
            System.out.println(+numeroWhile);
        
        }
        
        /*3*/
        
        do{
            numeroWhile ++;
            System.out.println("do while"+numeroWhile);
            
        }while(numeroWhile ==3);
            
        
        
        for(int numeroFor = 0; numeroFor<=3; numeroFor++)
        {
            
            System.out.println(numeroFor);
            
        }
        
        String estacion = "VERANO";
        
        switch (estacion) {
            
            case "VERANO":
                System.out.println("verano");  
                break;
            case"INVIERNO":
                 System.out.println("verano");
                break;
            case "OTOÑO":
                System.out.println("verano");  
                break;
            case"PRIMAVERA":
                 System.out.println("verano");
                break;
            default:
            System.out.println(estacion);
        }
        
        
    }
}
