/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeromayor;
import java.util.Scanner;


/**
 *
 * @author emili
 */
public class NumeroMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 2. Determinar el Mayor de Tres Números. Escribe un programa en Java que 
        //pida al usuario tres números enteros y determine cuál es el mayor. 

        
        Scanner input = new Scanner(System.in); 
        
        int num1 ;
        int num2 ;
        int num3 ;
        
        
       
        System.out.println("Ingrese por favor un numero");
        num1 = input.nextInt() ;
        input.nextLine();
     
        
        
        System.out.println("Ingrese por favor un numero");
        num2 = input.nextInt() ;
        
        
        
        System.out.println("Ingrese por favor un numero");
        num3 = input.nextInt() ;
        
        if (num1>num2 & num1>num3) {
            
            System.out.println("El mayor de los 3 numeros es " + num1);
            
        } else if (num2>num1 & num2>num3) {
            
            System.out.println("El mayor de los 3 numeros es " + num2);
                    
            
        } else {
            
            System.out.println("El mayor de los 3 numeros es " + num3);
        }
        
    }
    
}
