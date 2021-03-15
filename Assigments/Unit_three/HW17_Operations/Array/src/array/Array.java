
package array;

import ec.edu.espe.matrixoperation.BasicMatrixOperation;
import java.util.Scanner;

public class Array {

    public static void main(String[] args) {

             
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the numbers by m");
        int m = in.nextInt();
        System.out.println("Enter the numbers by n");
        int n = in.nextInt();
        System.out.println("Enter the numbers by p");
        int p = in.nextInt();

        int U[][] = new int[m][n];
        int V[][] = new int[n][p];
        int W[][] = new int[m][p];

        
        BasicMatrixOperation.printMatrixMultiplicationBanner();
        BasicMatrixOperation.computeMatrixMultiplication(m, n, U, p, V, W);
        BasicMatrixOperation.showMatrix(W, p, p);
        
    }

}