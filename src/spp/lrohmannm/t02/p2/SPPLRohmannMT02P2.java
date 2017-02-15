/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.lrohmannm.t02.p2;
import java.util.Scanner;
/**
 *
 * @author Lisdy Nadine Rohmann Martínez
 * 513659
 * IIS
 */
public class SPPLRohmannMT02P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Lisdy Nadine Rohmann Martínez
        //513659
        //Carrera: IIS
        
        //Declaración de variables
        double valinf, valsup; 
        Scanner Sc= new Scanner (System.in);
    
        System.out.println("Favor de introducir un número entero");
        valinf = Sc.nextDouble();
        
        System.out.println("Favor de introducir un número mayor al número introducido anteriormente:");
        valsup = Sc.nextDouble();
        
       
        
       while(valinf <= valsup){
           if (valinf % 2 == 0){
        System.out.println(valinf + " =  Es número par");
    }
           else if(valinf % 3==0){
               System.out.println(valinf+ " = Número es divisible entre 3");
            }
           else if(valinf % 5==0){
               System.out.println(valinf+ " = Número es divisible entre 5");
            }
           else if (valinf % 3==0 && valinf % 5==0){
           System.out.println(valinf+ " = Número es divisible entre 3 y 5");
       }
           
           else{
               System.out.println(valinf);
           }
           valinf++;
        
        
        
            
    }
    
}
}
