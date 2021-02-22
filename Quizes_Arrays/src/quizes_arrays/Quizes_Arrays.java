
package quizes_arrays;

import java.util.Scanner;

public class Quizes_Arrays {

    public static void main(String[] args) {
        
        System.out.println("********************************************************************************************************************");
        System.out.println("*Hi, Edison Lascano, PhD. My name's Paul Escobar in this case I show you my quiz code. Students with average grades*");
        System.out.println("********************************************************************************************************************");
        System.out.println("");
        
        int length = 0;
        Scanner introduce = new Scanner(System.in);

        System.out.print("How many students are in the class");
        length = introduce.nextInt();

        int numbers[] = new int[length];

        for (int i = 0; i < numbers.length; i++) {                      
            System.out.print("Please give me the grade of the student " + (i + 1));
            numbers[i] = introduce.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("[" + numbers[i] + "]");
        }
        
        
    }
    
}
