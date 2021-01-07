/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fundaments.programming.pkg02;

import java.util.Scanner;

public class FundamentsProgramming02 {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter an integrer -- ");
        int num = scanner.nextInt(); 
        if(num % 2 == 0){
        System.out.println("The number entered is even: " + num);
     } else {
        System.out.println("The number entered is odd: " + num);    
     }
    }
  }
