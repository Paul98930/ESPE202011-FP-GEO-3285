package switch_case;

public class Switch_case {

    public static void main(String[] args) {
    
System.out.println("*************************************************************************************************");  
   System.out.println("*Hi Edison Lascano, PhD. In this oportunity I'll show my excersice with the structure swith case*"); 
   System.out.println("*************************************************************************************************"); 
   System.out.println("");
   
int day = 3;
        String dayType;
        String dayString;
         
        switch (day){
        
            case 1:  dayString = "Monday";
                     break;
            case 2:  dayString = "Tuesday";
                     break;
            case 3:  dayString = "Wednesday";
                     break;
            case 4:  dayString = "Thursday";
                     break;
            case 5:  dayString = "Friday";
                     break;
            case 6:  dayString = "Saturday";
                     break;
            case 7:  dayString = "Sunday";
                     break;
            default: dayString = "Wrong day, this day there is not.";
        }
         
        switch (day) {
        
          
         
            case 1:  
            case 2:
            case 3:
            case 4:
            case 5:
                dayType = "Laborable_day";
                break;
            case 6:
            case 7:
                dayType = "Weekend"; 
                break;
                 
            default: dayType= "The day is invalid";
        }
         
        System.out.println(dayString+" is a "+ dayType);
    }
}
