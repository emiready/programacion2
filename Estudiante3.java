package estudiante3;
public class Estudiante3 {
    
    String nombre;
    String apellido;
    String  curso;
    int calificacion;
    
public void mostrarInfo() {
        // Aca mostramos informacion de los alumnos
        System.out.println("Nombre Completo: " + nombre + " " + apellido 
                           + " || Curso: " + curso 
                           + " || Calificación: " + calificacion );
    }

public void subirCalificacion() {
        // Aca subimos las calificaciones de los alumnos
        calificacion++;
    }

public void bajarCalificacion() {
        // Aca bajamos las notas de los alumnos
        calificacion--;
    }
 // Método main para probar
    public static void main(String[] args) {
        Estudiante3 alumno = new Estudiante3();
        alumno.nombre = "Emiliano";
        alumno.apellido = "Alvarez";
        alumno.curso = "Programación II";
        alumno.calificacion = 9;

        alumno.mostrarInfo();
        alumno.subirCalificacion();
        alumno.mostrarInfo();
        alumno.bajarCalificacion();
        alumno.mostrarInfo();
    }
}
