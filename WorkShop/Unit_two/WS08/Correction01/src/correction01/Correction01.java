
package correction01;

import java.util.Scanner;

public class Correction01 {

    public static void main(String[] args) {
      int multiplicand=0, multiplier=1, product=0, stop=12;
         product=0; 
  
    do{
         System.out.println("Enter the table that you must study"); 
           System.out.println(" 0 (zero) to exit --> "); 
         Scanner input = new Scanner(System.in); 
         multiplicand = input.nextInt();
      
                  if(multiplicand==0){
                  }
                  System.out.println("Studying the Table of --> " + multiplicand + "<--"); 
                  for( multiplier=1; multiplier<=stop; multiplier++){
             product = multiplicand * multiplier; 
             System.out.println(multiplicand + " x " + multiplier + " = " + product);
   }
   
   multiplier = 1;
   
  } while (multiplicand != 0);
    System.out.println("Good bye");
 }

}    
  
       
