    public class Gallina {
    // 1. Atributos
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    // 2. Constructor
    public Gallina(int idGallina, int edadInicial) {
        this.idGallina = idGallina;
        this.edad = edadInicial;
        this.huevosPuestos = 0; // al inicio ninguna gallina puso huevos
    }

    // 3. Método para poner huevo
    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println("La gallina " + idGallina + " puso un huevo.");
    }

    // 4. Método para envejecer
    public void envejecer() {
        edad++;
        System.out.println("La gallina " + idGallina + " ha envejecido. Ahora tiene " + edad + " años.");
    }

    // 5. Mostrar estado de la gallina
    public void mostrarEstado() {
        System.out.println("Gallina " + idGallina + " -> Edad: " + edad + " años, Huevos puestos: " + huevosPuestos);
    }

    // 6. Método main para probar
    public static void main(String[] args) {
        // Crear dos gallinas
        Gallina g1 = new Gallina(1, 2); // gallina 1 con 2 años
        Gallina g2 = new Gallina(2, 1); // gallina 2 con 1 año

        // Simular acciones
        g1.envejecer();
        g1.ponerHuevo();
        g1.ponerHuevo();

        g2.envejecer();
        g2.ponerHuevo();

        // Mostrar estado final
        System.out.println("\n--- Estado Final de las Gallinas ---");
        g1.mostrarEstado();
        g2.mostrarEstado();
    }
} 
