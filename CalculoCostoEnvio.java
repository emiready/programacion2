package calculoCostoEnvio;
import java.util.Scanner;

public class CalculoCostoEnvio {

    // Método que calcula el costo de envío
    public static double calcularCostoEnvio(double peso, double costozonaN) {
        double costoEnvioN = peso * costozonaN;
        return costoEnvioN;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Ingreso de datos
        System.out.println("Ingrese el peso del paquete: ");
        double peso = input.nextDouble();

        System.out.println("Ingrese el costo por kg de la zona: ");
        double costozonaN = input.nextDouble();

        // Llamada al método (sin poner 'double' en la llamada)
        double costoEnvioN = calcularCostoEnvio(peso, costozonaN);

        // Mostrar resultado
        System.out.println("El costo de envío es: " + costoEnvioN);

        input.close();
    }
}
