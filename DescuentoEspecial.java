package descuentoespecial;

public class DescuentoEspecial {
    
    // Método que calcula el precio con descuento
    public static double calcularDescuento(double precioBase, double descuentoAplicado) {
        // descuentoAplicado se espera como porcentaje, ej: 0.2 para 20%
        double precioFinal = precioBase * (1 - descuentoAplicado);
        return precioFinal;
    }
    
    public static void main(String[] args) {
        double precioBase = 1000;        // Precio original
        double descuentoAplicado = 0.2;  // 20% de descuento (0.2 equivale a 20%)
        
        double precioFinal = calcularDescuento(precioBase, descuentoAplicado);
        
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
}
