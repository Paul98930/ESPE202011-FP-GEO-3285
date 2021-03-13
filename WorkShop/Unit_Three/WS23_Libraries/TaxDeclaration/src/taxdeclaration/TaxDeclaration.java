
package taxdeclaration;

import java.util.Scanner;

public class TaxDeclaration {

    public static void main(String[] args) {
        float price; 
        float totalPrice; 
        float ivaValue;
        final float ivaPercentage = 12; 
        
        Scanner input = new Scanner(System.in); 
        
        
        System.out.println("--Paul Escobar Taxes--");  
        System.out.println("IVA-->");
        System.out.println("Enter the price of your products");
        price = input.nextFloat(); 
        
        ivaValue = BasicTax.computeIva(price, ivaPercentage); 
        totalPrice = price + ivaValue; 
        
        System.out.println("total price-->"  + totalPrice);
        
    }
    
    
}
