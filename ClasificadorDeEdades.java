package clasificadordeedades;
import java.util.Scanner;
public class ClasificadorDeEdades {

    public static void main(String[] args) {
        // Menor de 12 -> Niño, Entre de 11 y 17 -> Adolescente  Entre de 18 y 59 -> Adulto +60 -> Adulto Mayor
                
        Scanner input = new Scanner(System.in);

        int edad;
        
        
        System.out.println("Hola, por favor ingrese su edad: ");
        
        edad = input.nextInt();
        input.nextLine(); 
        
        if (edad < 12) { 
            
            System.out.println( "Eres un niño");
            
        }
        else if (edad >11 && edad <18) { 
            
            System.out.println( "Eres un adolescente.");
        }
        
        else if (edad >17 && edad <60) { 
            
            System.out.println( "Eres un adulto.");
        }
        
        else { System.out.println( "Eres un adulto mayor.");
        
        }
            
        
        
        
        
    }
    
}
