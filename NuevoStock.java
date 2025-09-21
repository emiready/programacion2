package nuevostock;
import java.util.Scanner;

public class NuevoStock {

    // Método que calcula el nuevo stock
    public static int calcularNuevoStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        int nuevoStock = stockActual + cantidadRecibida - cantidadVendida;
        return nuevoStock;
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el stock actual: ");
        int stockActual = input.nextInt();

        System.out.println("Ingrese la cantidad vendida: ");
        int cantidadVendida = input.nextInt();

        System.out.println("Ingrese la cantidad recibida: ");
        int cantidadRecibida = input.nextInt();

        // Llamada al método y guardado del resultado
        int resultado = calcularNuevoStock(stockActual, cantidadVendida, cantidadRecibida);

        // Mostrar el nuevo stock
        System.out.println("El nuevo stock es: " + resultado);
    }
}


   