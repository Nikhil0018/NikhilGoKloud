/*
------------- EXPLANATION --------------

Problem : Find Max integer from an array

Approach :
1. Input a sorted array from the user
2. As the array is already sorted, the last element of the array would be the maximum one
3. So, return the last element of the array

Time Complexity : O(n)
Space Complexity : O(1)
*/

import java.util.Arrays;

public class MaxInteger {
   
    private static int sizeOfArray;
    private static int[] integerArray;


    public static void main(String[] args){

        MaxInteger maxInteger = new MaxInteger();
        maxInteger.inputArray();

        System.out.println("\nArray = " + Arrays.toString(integerArray));
        System.out.print("\nMaximum integer of the array : ");

        // call function to get max Integer of the array
        System.out.println(maxInteger.maxInteger());

    }

    public int maxInteger(){

        return integerArray[sizeOfArray-1];

    }    
    
    public void inputArray(){

        System.out.println("\nEnter size of the array : ");
        // input size of array
        sizeOfArray = InputIntegerArray.inputSizeOfArray();

        System.out.println("\nEnter "+ sizeOfArray +" elements of the array : ");
        // call inputArray function to get user input
        // this array is a sorted one as described in the question
        integerArray = InputIntegerArray.inputArray(sizeOfArray);

    }
}
