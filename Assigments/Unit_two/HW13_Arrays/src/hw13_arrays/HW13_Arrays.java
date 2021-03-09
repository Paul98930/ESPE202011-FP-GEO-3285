
package hw13_arrays;
import java.util.Scanner;
public class HW13_Arrays {

    public static void main(String[] args) {

        // Topic in Excel Document 
        System.out.println("**********************Autor: Paul Escobar*************************************************");
        System.out.println("******************************************************************************************");
        System.out.println("*Hi, Edison Lascano, PhD. My name's Paul Escobar in this case I show you my homework code*");
        System.out.println("******************************************************************************************");
        System.out.println("");

        int length = 0;
        Scanner introduce = new Scanner(System.in);

        System.out.print("How many numbers would you enter");
        length = introduce.nextInt();

        int numbers[] = new int[length];

        for (int i = 0; i < numbers.length; i++) {                     // Why am I using the length method? Because, I want to choose whatever "índice" number with Scanner metohd. 
            System.out.print("Please give the value #" + (i + 1));
            numbers[i] = introduce.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("[" + numbers[i] + "]");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("****************************");
        System.out.println("*THE CORSES OF THE STUDENTS*");
        System.out.println("****************************");
        System.out.println("");

        Scanner sc = new Scanner(System.in);
        int number_learner, i;
        double summa = 0, median;

        do {
            System.out.print("HOW MANY STUDENTS ARE IN THE CLASE: ");
            number_learner = sc.nextInt();
        } while (number_learner <= 0);

        double[] corses = new double[number_learner];
        for (i = 0; i < corses.length; i++) {
            System.out.print("Learner " + (i + 1) + " Final Corse: ");
            corses[i] = sc.nextDouble();
        }

        for (i = 0; i < corses.length; i++) {
            summa = summa + corses[i];
        }

        median = summa / corses.length;

        System.out.printf("Half corse of the course: %.2f %n", median);

        System.out.println("Roster of the courses: ");
        for (i = 0; i < corses.length; i++) {
            if (corses[i] > median) {
                System.out.println("Number learner " + (i + 1) + " Final Corse: " + corses[i]);
            }
        }

        System.out.println("");
        System.out.println("");
        System.out.println("****************************");
        System.out.println("*THE values of temperatures*");
        System.out.println("****************************");
        System.out.println("");

        Scanner enter = new Scanner(System.in);
        double[] temperatures = new double[5];
        int a;

        for (a = 0; a < temperatures.length; a++) {
            System.out.print("Element " + a + ": ");
            temperatures[a] = sc.nextDouble();
        }

        for (double t : temperatures) {
            System.out.print(t + " ");
        }
        System.out.println();
    }

}
