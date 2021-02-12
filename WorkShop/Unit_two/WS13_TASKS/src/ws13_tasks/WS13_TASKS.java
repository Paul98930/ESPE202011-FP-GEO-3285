
package ws13_tasks;
import java.util.Scanner;
public class WS13_TASKS {

    public static void main(String[] args) {
      // Calculate the Romboide area
      
        System.out.println("");
        System.out.println("");
        System.out.println("***************************");
        System.out.println("*THE problem ROMBOIDE AREA*");
        System.out.println("***************************");
      
        Scanner in = new Scanner(System.in);
      String requirements = ""; 
      
      float base = 0.00F; 
      float height = 0.00F; 
      float area = 0.00F; 
            
        
        System.out.println("What's your requirement?");
        requirements = in.nextLine();
        System.out.println("What's the base?");
        base = in.nextInt();
        System.out.println("Enter --> the height");
        height = in.nextInt();
        
        
        area = ((float)base)*((float)height);
        System.out.println("The solution of this problem is: " + area);
        
        System.out.println("");
        System.out.println("");
        System.out.println("***************************");
        System.out.println("*THE problem with distance*");
        System.out.println("***************************");
        
        int velocity = 0; 
        int time = 0; 
        int distance = 0; 
        
        System.out.println("What's the velocity?");
        velocity = in.nextInt();
        System.out.println("What's the time");
        time = in.nextInt();
        
        distance = (velocity) * (distance); 
        System.out.println("The solution is: " + distance);
        
        System.out.println("");
        System.out.println("");
        System.out.println("***************************");
        System.out.println("*THE problem with velocity*");
        System.out.println("***************************");
        
        int velocity1 = 0; 
        int time1 = 0; 
        int distance1 = 0; 
        
        System.out.println("What's the distance");
        distance1= in.nextInt();
        System.out.println("What's the time?");
        time1 = in.nextInt();
        
        
        velocity1 = (distance) / (time); 
        System.out.println("The solution is: " + velocity1);
        
        
    } 
    
}
