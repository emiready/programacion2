
package sumapares;

import java.util.Scanner;

public class SumaPares {


    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
        
         
        int numero;
        int suma = 0 ;
        System.out.println("Ingrese un numero por favor: (con el 0, se detiene");
        numero = input.nextInt(); // Esta es la primera lectura de un numero con el ciclo, y se lo envia al while para evaluar que no sea 0, caso n
        
        while   (numero !=0 ) {    //cuando el numero sea diferente de 0
            
           if (numero % 2 == 0){ //teniendo en cuenta que el numero sea par
               suma += numero; //lo acumulo en la variable suma , sumandolo al anterior 
               System.out.println("El numero par ingresado es: " + numero);
        } else {
               System.out.println("El numero impar ingresado es " + numero);
           
           }
        numero = input.nextInt(); //Pedir el siguiente numero hasta tanto llegue la clausula de finalizacion de ciclo.
    }
                System.out.println("El numero impar ingresado es " + suma);
    }
}   
        
        
   
