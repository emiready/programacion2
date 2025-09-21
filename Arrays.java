package arrays ;
public class Arrays {
 
    public static void main(String[] args) {
            
       // a. Declare e inicialice un array con los precios de algunos productos. 
       double [] precios = {1.50, 23, 50 , 65 , 78.90 , 100} ;
          
       // b. Muestre los valores originales de los precios.       
        for (int i = 0; i < precios.length ; i++) {
         
        System.out.println("Los precios de las bebidas son:  " + precios[i]);   
        }
    
       // c. Modifique el precio de un producto específico. 
       precios[2] = 450.0; 
       
       // d. Muestre los valores modificado
       for (int i = 0; i < precios.length ; i++) {
         
       System.out.println("Los precios de las bebidas son:  " + precios[i]);   
        }
    }
}
