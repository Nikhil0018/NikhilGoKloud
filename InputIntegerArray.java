/*
------------- EXPLANATION --------------

This is just a helper class to take an input array.

It's functions:

    1. inputSizeOfArray():
        - Returns size of array, after taking input from user
    
    2. inputArray(int):
        - Returns a 1D array after taking input from user. Here, the size of array is passed as an argument


*/

import java.util.Scanner;

public class InputIntegerArray {

    private static Scanner scanner = new Scanner(System.in);

    public static int inputSizeOfArray(){
        return scanner.nextInt();
    }

    public static int[] inputArray( int sizeOfArray ){

        // make an array of given size
        int[] intArray = new int[sizeOfArray];

        // Flush out any remaining input
        scanner.nextLine();

        // initialize the array by traversing through for loop
        for (int i=0; i < sizeOfArray ; ++i){
            intArray[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return intArray;

    }
    
}
