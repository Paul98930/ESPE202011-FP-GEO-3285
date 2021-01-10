package excersice_03_chemestry;
import java.util.Scanner;
public class Excersice_03_Chemestry {

public static void main(String[] args) {

     System.out.println("************************");
   System.out.println("*EXCERSICE III CHEMESTRY*");
   System.out.println("************************");
   System.out.println("");
   System.out.println("");

     Scanner chemestry_02 = new Scanner(System.in);
     String name_chemestry_02_formula = " ";
     short num_one = 0, num_two = 0;
     float solution_diluted = 0;
 
     System.out.println("Calculate the solution diluted of HNO3, with a density of 250gr/cc and 89% by weight, with 480 grams of solute and 350 grams of solvent. ");
     System.out.println("");

     System.out.println("In this problem only sum the solvent and solute, I don not consider the density, because the solution dilted in Chemestry is the both sum. ");
     System.out.println("");
 
     System.out.println("What is the diluted solute formula? ");
     name_chemestry_02_formula = chemestry_02.nextLine();
     System.out.println("");  
     
     System.out.println("What is the solvent formula? ");
     name_chemestry_02_formula = chemestry_02.nextLine();
     System.out.println(""); 

     System.out.println("What is the number_one?: ");
     num_one = chemestry_02.nextShort();
     System.out.println("");
     
     System.out.println("What is the number_two?: ");
     num_two = chemestry_02.nextShort();
     System.out.println("");
        
     solution_diluted = (num_one + num_two);
     System.out.println("The solute is: " + solution_diluted);
     System.out.println(""); 
   }
 }
