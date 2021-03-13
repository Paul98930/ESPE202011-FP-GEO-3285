
package modularcalculate;

import java.util.Scanner;
import utils.BasicOperation;


public class ModularCalculate {

    public static void main(String[] args) {
      
      
      float operand1; 
      float operand2; 
      float result; 
      
      Scanner input = new Scanner(System.in); 
      
        System.out.println("--ADITION--");
        System.out.println("Enter two numbers -->");
        operand1 = input.nextFloat();
        operand2 = input.nextFloat(); 
      
        System.out.println("--ADITION--"); 
        result = BasicOperation.addTwoNumbers(operand1, operand2); 
        System.out.println(operand1 + "+" + operand2 + "+" + result);
        
        System.out.println("---SUBTRACTION---");
        result = BasicOperation.sbtractTwoNumbers(operand1, operand2); 
        System.out.println(operand1 + "+" + operand2 + "=" + result);
        
    }
    
}
