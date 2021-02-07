
package recursion;
import java.util.Scanner; 
public class Recursion {
    public static void main(String[] args){
        
        System.out.println("**********************************************************************************************************");
        System.out.println("*Hi Edison Lascano, PhD. In this oportunity I'll show my excersice of the number factorial with recursion*");
        System.out.println("**********************************************************************************************************");
        System.out.println("");

        Scanner in = new Scanner(System.in);
        System.out.print("Introduce the number for the factorial excersice: ");
        int number_one = in.nextInt();
        in.close();

        System.out.println("\nThe factorial of " + number_one + " is: " + factorial(number_one));
    }

    public static int factorial(int number_one) {
        if (number_one == 0) {
            return 1;
        } else {
            return number_one * factorial(number_one - 1);
        }
    }
}
