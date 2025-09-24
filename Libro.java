    public class Libro {
    // 1. Atributos privados
    private String titulo;
    private String autor;
    private int añoPublicacion;

    // 2. Constructor
    public Libro(String titulo, String autor, int añoPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.setAñoPublicacion(añoPublicacion); // usamos setter para validar
    }

    // 3. Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    // 4. Setter con validación para añoPublicacion
    public void setAñoPublicacion(int año) {
        if (año > 0 && año <= 2025) {
            this.añoPublicacion = año;
        } else {
            System.out.println("Año de publicación inválido: " + año);
        }
    }

    // 5. Método main para probar la clase
    public static void main(String[] args) {
        // 1. Crear un libro
        Libro libro1 = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943);

        // 2. Intentar modificar con un año inválido
        libro1.setAñoPublicacion(3000);  // fuera de rango, no debería cambiar

        // 3. Intentar modificar con un año válido
        libro1.setAñoPublicacion(2020);  // correcto, debería actualizar

        // 4. Mostrar la información final
        System.out.println("Título: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Año de publicación: " + libro1.getAñoPublicacion());
    }
}
