
package basicoperators;

public class BasicOperators {
    public static void main(String[] args) {
        int sum;
    int addend_1;
    int addend_2; 

    int minuend;
    int subtrahend;
    int difference; 
    
    minuend = -23;
    subtrahend = -6;
    
    System.out.println("the difference of " + minuend + " - " + subtrahend +(minuend - subtrahend) );  
    
    addend_1 = 5;
    addend_2 = 18;
    
    sum = addend_1 + addend_2; 
    
        System.out.println("The adition of " + addend_1 + " + " + addend_2 + sum);
    
        ++sum; 
        System.out.println("sum is equal to --> " + sum);
        
        sum++;
        System.out.println("sum is equal to --> " + sum);
        
        System.out.println("adding one to sum " + (sum++));
        System.out.println("adding one to sum " + (++sum)); 
        
        int multiplying = 15;
        int multiplier = 20; 
        int product = 0;
        
        product = multiplying * multiplier; 
        System.out.println("The value of product is: " + product);
        
        int dividend = 12; 
        int divider = 4; 
        int quotient = 0;
        
        quotient = dividend / divider;
        System.out.println("The value of quotient is: " + quotient);   

        int number_one = 20;
        int number_two = 3; 
        int residue = 0; 
        
        residue = number_one % number_two;
        System.out.println("The value of residue is: " + residue);
    }
    
}
