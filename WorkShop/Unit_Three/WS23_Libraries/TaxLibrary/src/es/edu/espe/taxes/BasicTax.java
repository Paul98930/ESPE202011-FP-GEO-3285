
package es.edu.espe.taxes;


public class BasicTax {
    
   public static float computeIva(float basePrice, float percentageValue){
     float iva; 
     iva = basePrice * percentageValue / 100; 
     return iva; 
   } 
      
}
