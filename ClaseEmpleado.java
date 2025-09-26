package claseempleado;
public class Empleado {
    private int id;             // Identificador único del empleado
    private String nombre;      // Nombre completo
    private String puesto;      // Cargo que desempeña
    private double salario;     // Salario actual

    // Atributos estáticos (compartidos por TODOS los empleados)
    private static int totalEmpleados = 0;   // contador de empleados creados
    private static int ultimoId = 0;         // genera IDs automáticos

    // Constante para salario por defecto (buena práctica)
    private static final double SALARIO_POR_DEFECTO = 50000.0;
    // Constructores
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;

        // Si el ID ingresado manualmente es mayor al último generado,
        // actualizamos ultimoId para evitar duplicados en el futuro.
        if (id > Empleado.ultimoId) {
            Empleado.ultimoId = id;
        }

        totalEmpleados++; // cada vez que se crea un objeto, aumenta el contador
    }

     // Constructor sobrecargado: solo recibe nombre y puesto.
    public Empleado(String nombre, String puesto) {
        Empleado.ultimoId++;         // incrementa el ID automático
        this.id = Empleado.ultimoId; // asigna el nuevo valor al empleado
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = SALARIO_POR_DEFECTO; // salario por defecto

        totalEmpleados++;
    }


    // ========================
    // Métodos de negocio
   
    public void aumentarPorcentaje(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }

    /**
     * Aumenta el salario en una cantidad fija.
     */
    public void aumentarMonto(double cantidadFija) {
        this.salario += cantidadFija;
    }

    /**
     * Sobrescribe el método toString.
     * Devuelve un texto legible con los datos del empleado.
     */
    @Override
    public String toString() {
        return String.format("Empleado {ID=%d, Nombre='%s', Puesto='%s', Salario=%.2f}",
                id, nombre, puesto, salario);
    }

/**
     * Devuelve cuántos empleados se han creado en total.
     */
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        // Validación: no permitir IDs negativos
        if (id <= 0) {
            throw new IllegalArgumentException("El ID debe ser mayor que 0");
        }
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        if (puesto == null || puesto.isEmpty()) {
            throw new IllegalArgumentException("El puesto no puede estar vacío");
        }
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario < 0) {
            throw new IllegalArgumentException("El salario no puede ser negativo");
        }
        this.salario = salario;
    }
}

/**
 * Clase de prueba para la clase Empleado.
 * Contiene el método main que ejecuta ejemplos prácticos.
 */
public class ClaseEmpleado {
    public static void main(String[] args) {

        // Crear empleados con el constructor completo
        Empleado e1 = new Empleado(1, "Juan Pérez", "Gerente", 120000);

        // Crear empleados con el constructor reducido
        Empleado e2 = new Empleado("María López", "Analista");
        Empleado e3 = new Empleado("Carlos Ruiz", "Desarrollador");

        // Aumentos de salario
        e2.aumentarPorcentaje(10.0);   // aumenta un 10% (de 50.000 a 55.000)
        e3.aumentarMonto(5000);        // aumenta $5000 (de 50.000 a 55.000)

        // Imprimir información (toString se invoca automáticamente)
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        // Mostrar total de empleados creados
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
}
