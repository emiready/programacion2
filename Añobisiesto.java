/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package añobisiesto;
import  java.util.Scanner;
        
        
/**
 *
 * @author emili
 */
public class Añobisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int bisiesto;
        
        
        System.out.println("Hola, por favor ingrese el año para el calculo: ");
        
        bisiesto = input.nextInt();
        input.nextLine(); 
        
        if (bisiesto % 4 == 0 & bisiesto % 100 != 0) { 
            
            System.out.println( bisiesto + " es un año bisiesto.");
            
        }
        else {
            
            System.out.println( " no es un año bisiesto.");
            
        }
    

      
       
       
           
               
               






    }
    
}
