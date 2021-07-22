/*
------------- EXPLANATION --------------

Problem : Find the sum of all the integers of an array

Approach :
1. Input an array from the user
2. Take a sum variable and initialize it to 0, to store the sum of integers in the array
3. Loop through all the integers of the array
4. Add sum to current integer and store the result in the sum variable, till loop finishes
5. Return the sum variable

Time Complexity : O(n)

Space Complexity : O(1)

*/

import java.util.*;

public class ArraySum{
    
    private static int sizeOfArray;
    private static int[] integerArray;

    public static void main(String[] args){
        
        // call the input Array function
        ArraySum arraySum = new ArraySum();
        arraySum.inputArray();
        
        System.out.println("\nArray = " + Arrays.toString(integerArray));
        System.out.print("\nSum of all the integers of this array : ");

        // Call the function to calculate the sum of array and print it
        System.out.println(arraySum.sum());

    }

    public void inputArray(){

        System.out.println("\nEnter size of the array : ");
        // input size of array
        sizeOfArray = InputIntegerArray.inputSizeOfArray();

        System.out.println("\nEnter "+ sizeOfArray +" elements of the array : ");
        // call inputArray function to get user input
        integerArray = InputIntegerArray.inputArray(sizeOfArray);

    }

    public int sum(){

        int sumOfIntegers = 0;

        // calculating the sum of all the integers in given array ->
        for (int i = 0; i < sizeOfArray; ++i){
            sumOfIntegers+=integerArray[i];
        }

        // return the calculated sum of array
        return sumOfIntegers;

    }
    
}