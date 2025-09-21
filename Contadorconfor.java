package contadorconfor;
import java.util.Scanner;
public class Contadorconfor {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in); //Con scanner leemos lo que ingresa el usuario.   
        
    int numero;
    int cont_positivo = 0;
    int cont_negativo = 0 ;
    int cont_ceros = 0 ;
    
         System.out.println("Ingrese un numero por favor: (10 numeros en total");
          // Esta es la primera lectura de un numero con el ciclo, y se lo envia al while para evaluar que no sea 0, caso n    //  ingresar 10 números enteros 
       // contar  cuántos son positivos, negativos y cuántos son ceros.
        for (int i = 0; i < 10; i++)    {
            numero = input.nextInt();
            
            if (numero > 0) { cont_positivo = cont_positivo +1;
            } 
            else if (numero < 0) { cont_negativo = cont_negativo +1;
            }
            else { cont_ceros = cont_ceros +1;
            }
           
         }  
        
        System.out.println("Total de numeros positivos ingresados: " + cont_positivo);
        System.out.println("Total de numeros negativos ingresados: " + cont_negativo);
        System.out.println("Total de ceros ingresados: " + cont_ceros);
        
    }
}
