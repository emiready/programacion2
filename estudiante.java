package estudiante3;

public class Estudiante3 {

    public static void main(String[] args) {
        // Crear un objeto de tipo Estudiante
        Estudiante e1 = new Estudiante("Juan", "Pérez", "Programación II", 7);

        // Mostrar información inicial
        e1.mostrarInfo();

        // Subir calificación
        e1.subirCalificacion(2);

        // Bajar calificación
        e1.bajarCalificacion(1);

        // Mostrar información final
        e1.mostrarInfo();
    }
}
