package validaciondowhile; 
import java.util.Scanner;

public class ValidacionDoWhile {

    public static void main(String[] args) {
        // Escribe un programa que solicite al usuario una nota entre 0 y 10. Si el
        // usuario ingresa un número fuera de este rango, debe seguir pidiéndole la nota
        // hasta que ingrese un valor válido.
        
          Scanner input = new Scanner(System.in);
        int nota;

        do {
            System.out.print("Ingrese una nota entre 0 y 10: ");
            nota = input.nextInt();

            if (nota >= 0 && nota <= 10) {
                System.out.println("Nota guardada correctamente.");
                break; // Sale del bucle si la nota es válida
            } else {
                System.out.println("Error: Nota inválida. Ingrese una nota entre 0 y 10.");
            }

        } while (true);
    
    }
}
