package calculadoradescuentos;
import java.util.Scanner;
public class CalculadoraDescuentos {

    public static void main(String[] args) {
    
        
        Scanner input = new Scanner(System.in);

        String categoria;
        int precio; 
        
        
        System.out.println("Ingrese el precio para calcular el descuento: ");
        
        precio = input.nextInt();
        input.nextLine(); 
        
        System.out.println("Ingrese la categoria del producto: ");
        
        categoria = input.nextLine();
        input.nextLine(); 
        
        
        if (categoria.equalsIgnoreCase("A")) { 
            
            System.out.println( "El precio es: " + precio);
            System.out.println( "El descuento es del 10 % ");
            System.out.println( "El precio a pagar es: " + precio * 0.90);
        }
        else if (categoria.equalsIgnoreCase("B")) { 
            
            System.out.println( "El precio es: " + precio);
            System.out.println( "El descuento es del 15 % ");
            System.out.println( "El precio a pagar es: " + precio * 0.85);
        }
        
        else if ((categoria.equalsIgnoreCase("C"))) { 
            
            System.out.println( "El precio es: " + precio);
            System.out.println( "El descuento es del 20 % ");
            System.out.println( "El precio a pagar es: " + precio * 0.80);
        }
        
        else { System.out.println( "La opcion elegida no es correcta.");
        
        }
                   
     
    
    }
    
}
