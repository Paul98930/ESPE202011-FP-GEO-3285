
package excersice_01_analytic_geometry;
import java.util.Scanner; 

public class Excersice_01_Analytic_Geometry {

public static void main(String[] args) {
    
   Scanner in = new Scanner(System.in); 
   String problem = " ";
   int number_sides = 0, number_one_formula = 0, number_two_formula = 0; 
   int diagonals = 0;

   System.out.println("*************************************************************************************************************************************************************************");
   System.out.println("*Hi Edison Lascano, PhD. My name is Paul Escobar in this oportunity I will present my excersices those are: Analytic Geometry, and for the last two excersice, Chemestry* ");
   System.out.println("*************************************************************************************************************************************************************************");
   System.out.println("");
   System.out.println("");

     System.out.println("Calculate the diagonals of a regular decagon poligon. ");
     System.out.println();

     System.out.println("What is the number polygon's sides?: ");
     number_sides = in.nextInt();
     System.out.println(""); 

     System.out.println("What is the number_one_formula?: ");
     number_one_formula = in.nextInt();
     System.out.println(""); 
     
     System.out.println("What is the number_two_formula?: ");
     number_two_formula = in.nextInt();
     System.out.println(""); 

     diagonals =  (number_sides * (number_sides - number_one_formula)) / (number_two_formula); 

      System.out.println("The diagonals of polygon is: " + diagonals);
      System.out.println();    
    }
    
}
