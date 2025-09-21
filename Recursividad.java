 public class ImpresionRecursiva {

    // Método recursivo para imprimir un array desde un índice dado
    public static void imprimirArray(double[] array, int indice) {
        if (indice >= array.length) { // caso base
            return;
        }
        System.out.println("Producto " + indice + ": " + array[indice]);
        imprimirArray(array, indice + 1); // paso recursivo
    }

    public static void main(String[] args) {
        // a) Declarar e inicializar un array con precios
        double[] precios = {100.0, 200.0, 300.0, 400.0};

        // b) Mostrar los valores originales recursivamente
        System.out.println("Precios originales:");
        imprimirArray(precios, 0);

        // c) Modificar el precio de un producto específico
        precios[2] = 350.0;

        // d) Mostrar los valores modificados recursivamente
        System.out.println("\nPrecios modificados:");
        imprimirArray(precios, 0);
    }
}
