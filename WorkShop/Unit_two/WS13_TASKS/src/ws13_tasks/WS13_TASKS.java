
package ws13_tasks;

import java.util.Scanner;

public class WS13_TASKS {

    public static void main(String[] args) {

        printRomboidBanner();

        Scanner in = showTheArea();
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
        area = computeRomboidArea(base, height);
        System.out.println("The solution of this problem is: " + area);

        System.out.println("");
        System.out.println("");
        System.out.println("***************************");
        System.out.println("*THE problem with distance*");
        System.out.println("***************************");

        int velocity = 0;
        int time = 0;
        int distance = 0;

        distance = calculateTheDistance(distance, velocity);

        System.out.println("");
        System.out.println("");
        System.out.println("***************************");
        System.out.println("*THE problem with velocity*");
        System.out.println("***************************");

        int velocity1 = 0;
        int time1 = 0;
        int distance1 = 0;

        System.out.println("What's the distance");
        distance1 = in.nextInt();
        System.out.println("What's the time?");
        time = in.nextInt();
        System.out.println("The solution is: " + distance);

        calculateTheVelocity(distance, time);
        System.out.println("The solution is: " + velocity1);

    }

    public static float computeRomboidArea(float base, float height) {
        float area;
        area = ((float) base) * ((float) height);
        return area;
    }

    public static void printRomboidBanner() {
        // Calculate the Romboide area

        System.out.println("");
        System.out.println("");
        System.out.println("***************************");
        System.out.println("*THE problem ROMBOIDE AREA*");
        System.out.println("***************************");
    }

    public static void calculateTheVelocity(int distance, int time) {
        int velocity1;
        velocity1 = (distance) / (time);

    }

    public static int calculateTheDistance(int distance, int velocity) {
        distance = (velocity) * (distance);

        return distance;
    }

    public static Scanner showTheArea() {
        Scanner in = new Scanner(System.in);
        String requirements = "";
        float base = 0.00F;
        float height = 0.00F;
        float area = 0.00F;

        return in;
    }

}
