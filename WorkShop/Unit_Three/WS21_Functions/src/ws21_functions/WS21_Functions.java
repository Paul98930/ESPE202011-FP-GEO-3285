
package ws21_functions;

import java.util.Scanner;

public class WS21_Functions {

    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        
        System.out.println("Author: Paul Escobar");

        float Kwh = 0.00f;
        float Kwh_one = 0.0f;
        float Kwh_two = 0.00f;
        float burner = 0.00f;

        float solution = 0.00f;

        System.out.println("How many buners have the induction cook ?");
        burner = in.nextFloat();
        System.out.println("What´s the value oh the Kwh by day ? ");
        Kwh = in.nextFloat();

        ComputeKwhDay(Kwh, burner);

        printBannerdiifference();

        int yaguarlocro_industrialcook = 0;
        int yaguarlocro_inductioncook = 0;
        int solution_two = 0;

        System.out.println("What's the time for cook yaguarlocro at industrial cook");
        yaguarlocro_industrialcook = in.nextInt();
        System.out.println("What's the time for cook yaguarlocro at induction cook");
        yaguarlocro_inductioncook = in.nextInt();

        calculateDifferenceTime(yaguarlocro_industrialcook, yaguarlocro_inductioncook);

    }

    public static void calculateDifferenceTime(int yaguarlocro_industrialcook, int yaguarlocro_inductioncook) {
        float solution;
        solution = yaguarlocro_industrialcook - yaguarlocro_inductioncook;
        System.out.println("The diference is: " + solution);
    }

    public static void printBannerdiifference() {
        System.out.println("Timing cook");
        System.out.println("What´s the diference of the time cooking yaguarlocro  ");
    }

    public static void ComputeKwhDay(float Kwh, float burner) {
        float solution;
        solution = ((float) Kwh) * ((float) burner);
        System.out.println("Hi, the Kwh by induction cook is: " + (float) solution);
    }

}

