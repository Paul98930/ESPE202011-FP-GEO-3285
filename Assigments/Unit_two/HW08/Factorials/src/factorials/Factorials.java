
package factorials;

import java.util.Scanner;

public class Factorials {

    public static void main(String[] args) {
        System.out.println("*************************************************************************************************");
        System.out.println("*Hi Edison Lascano, PhD. In this oportunity I'll show my excersice the factorial number*");
        System.out.println("*************************************************************************************************");
        System.out.println("");

        Scanner in = new Scanner(System.in);

        int fact = 1;
        int number = 0;
        int number_one = 15;
        int number_two = -0;
        int number_three = 16;
        int solution = number;

        if (number <= number_one) {
            System.out.println("Enter the number factorial");
            number = in.nextInt();
            while (number != -0) {
                fact *= number;
                number--;
            }

        } else if (number == number_three) {
            System.out.println("Advertence, your number is wrong");
        } else if (number == number_two) {
            System.out.println("Advertence, your number is wrong");
        } else {
            System.out.println("Concluded");
        }

        System.out.println("The factorial in this case " + solution + " is " + fact + "");

    }

}
