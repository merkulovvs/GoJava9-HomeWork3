import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.Scanner;

public class GoJava9HomeWork3 {

    public static void main(String[] args) {

        //Ask user to enter the array size
        System.out.println("Please enter the array size: ");
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();

        //Ask user to enter the values of the array elements
        System.out.println("Please enter the array values: ");
        int[] array = new int[arraySize];
        for (int i=0; i < arraySize; i++) {
            array[i] = scanner.nextInt();
        }

        for (int element:array) {
            System.out.print(element + " ");
        }
        System.out.println();

        //Find and display the lowest number in the array
        int min = array[0];
        for (int i = 1; i < array.length; i++){
            if(array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("The lowest number in the array is: " + min);

        //Find and display the highest number in the array
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }

        System.out.println("The highest number in the array is: " + max);

        //Find how many times number 5 is repeated in the array
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 5){
                count++;
            }
        }

        System.out.println("There are " + count + " fives in the array");

        //Sort the array
        Arrays.sort(array);
        System.out.println("Sorted array: \n" + Arrays.toString(array));

    }
}
