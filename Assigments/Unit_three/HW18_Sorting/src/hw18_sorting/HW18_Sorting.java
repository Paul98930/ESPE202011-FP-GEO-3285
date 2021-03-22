
package hw18_sorting;

import java.util.Arrays;
import java.util.Scanner;

public class HW18_Sorting {

    public static void main(String[] args) {

        System.out.println("******************************************************************************************");
        System.out.println("*Hi, Edison Lascano, PhD. My name's Paul Escobar in this case I show you my homework code*");
        System.out.println("******************************************************************************************");
        System.out.println("");

        System.out.println("");
        System.out.println("");
        System.out.println("*******************");
        System.out.println("*Secuential Search*");
        System.out.println("*******************");

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the size of the array");

        int[] elements = {2, 6, 7, 8, 9, 10};
        int elementSearching, position;

        System.out.println("elementSearching: ");
        elementSearching = in.nextInt();

        position = search(elements, elementSearching);

        System.out.println("The element is in the position: " + position);

        System.out.println("");
        System.out.println("");
        System.out.println("***************");
        System.out.println("*Binary Search*");
        System.out.println("***************");

        int[] arr = {2, 6, 7, 15, 198, 56, 80, 90};
        int place, elementSearch = 198;

        Arrays.sort(arr);

        place = Arrays.binarySearch(arr, elementSearch);

        System.out.println("The element is in the position: " + position);
    }

    public int binarySearch(int elements[], int left, int right, int x) {

        int place = -1;
        if (right >= left) {
            int mid = left + (right - left) / 2;

            if (elements[mid] == x) {
                return mid;
            }
            int[] arr = null;
            if (elements[mid] > x) {
                return binarySearch(arr, left, mid - 1, x);
            }
            return binarySearch(elements, mid + 1, right, x);
        }
        return place;
    }

    public static int search(int elements[], int x) {

        int position = -1;
        int n = elements.length;
        for (int i = 0; i < n; i++) {
            if (elements[i] == x) {
                return i;
            }
        }
        return position;

    }
}

        