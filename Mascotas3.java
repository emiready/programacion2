package mascotas3;
public class Mascotas3 {

    private String nombre; 
    private String especie; 
    private int edad ;
    
    public void mostrarInfo() {
        
         System.out.println("Nombre: " + nombre + " "  
                           + " || Especie: " + especie 
                           + " || Edad: " + edad );
    }
    
    
    public void cumplirAnios() {
        
        edad++;  
    } 

    public static void main(String[] args) {
        // TODO code application logic here
        Mascotas3 mascota = new Mascotas3();
        mascota.nombre = "Kika";
        mascota.especie = "Mestiza";
        mascota.edad = 4 ;
       

        mascota.mostrarInfo();
        mascota.cumplirAnios();
        mascota.mostrarInfo();
        mascota.mostrarInfo();
        mascota.cumplirAnios();
        
    }
    
}
