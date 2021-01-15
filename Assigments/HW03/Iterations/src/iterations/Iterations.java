
package iterations;

import java.util.Scanner;

public class Iterations {   
public static void main(String[] args) {
        
System.out.println("******************************************************************************************"); 
  System.out.println("*Hi, Edison Lascano, PhD. My name's Paul Escobar in this case I show you my homework code*"); 
  System.out.println("******************************************************************************************");
  System.out.println("");

  System.out.println("-Count the since number one until eighteen? Use While iteration-. ");
  System.out.println("------------------------------------------------------------------");
  System.out.println("");

  Scanner enter = new Scanner(System.in);
  int x = 1;
  System.out.println(" What's the first number");
  int number = enter.nextInt();

  while(x<=number){
    System.out.print( x + ","); 
    x+= 1;
   
  }
   System.out.println("");
   System.out.println("");
   System.out.println("************************");
   System.out.println("*Do a multiply. Use for*");
   System.out.println("************************");
   System.out.println("");
 
    int number_one = 18, mult= 1;
    int top = 20; 
    for(int multiplier = 1; multiplier <= 20; multiplier ++){

    System.out.println(number_one + " multiply to " +multiplier+ " the product is: "+ number_one*multiplier); 

  }
   System.out.println("");
   System.out.println("");
   System.out.println("*******************************************************"); 
   System.out.println("*How many numbers there are between 0 and 200? Use for*");
   System.out.println("*******************************************************");
   System.out.println("");

   int first_number = 0;

      for(int h = 0; h <= 200; h++){
      if(h % 4 == 0){
      first_number++;
      System.out.println(h + " , ");
     
    }
   }
  } 
 }
