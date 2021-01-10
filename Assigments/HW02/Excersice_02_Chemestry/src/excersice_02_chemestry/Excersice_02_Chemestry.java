package excersice_02_chemestry;
import java.util.Scanner; 

public class Excersice_02_Chemestry {
   
public static void main(String[] args) {

      System.out.println("************************");
      System.out.println("*EXCERSICE II CHEMESTRY*");
      System.out.println("************************");
      System.out.println("");
      System.out.println("");

     Scanner chemestry = new Scanner(System.in);
     String name_chemestry_formula = " ";
     float number_one = 0, number_two = 0, number_three = 0;
     float solution;
 
     System.out.println("Calculate the mass of the Na2SO4 solute, if there is 15 grams of 88% H20 and 12% of the solute. ");
     System.out.println();


     System.out.println("What is the solute formula? ");
     name_chemestry_formula = chemestry.nextLine();
     System.out.println("");  
     
     System.out.println("What is the solvent formula? ");
     name_chemestry_formula = chemestry.nextLine();
     System.out.println(""); 
     
     System.out.println("What is the number_one?: ");
     number_one = chemestry.nextFloat();
     System.out.println("");
     
     System.out.println("What is the number_two?: ");
     number_two = chemestry.nextFloat();
     System.out.println("");
        
     System.out.println("What is the number_three?: ");
     number_three = chemestry.nextFloat();
     System.out.println("");

     solution = (number_one * number_two) / (number_three); 
     System.out.println("The solute is: " + solution);
     System.out.println(""); 
   
     
    }
    
}
