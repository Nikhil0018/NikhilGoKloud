/*
------------- EXPLANATION --------------

Problem : Find the duplicate integer in an array

Approach :
1. Input an array from the user
2. Take a HashSet variable
3. Loop through all the elements of the array
4. Check if the element is already present in the set, then return this element as duplicate one.
5. Else add it to HashSet and continue with loop until all elements traversed

Time Complexity : O(n)

Space Complexity : O(1)

*/

import java.util.Arrays;
import java.util.HashSet;

public class DuplicateInteger {

    private static int sizeOfArray;
    private static int[] integerArray;

    public static void main(String[] args){

        DuplicateInteger duplicateInteger = new DuplicateInteger();
        duplicateInteger.inputArray();

        System.out.println("\nArray = " + Arrays.toString(integerArray));
        System.out.print("\nDuplicate integer of the array : ");

        // Call the function to find duplicate integer of array and print it
        System.out.println(duplicateInteger.findDuplicateInteger());

    }

    public void inputArray(){

        System.out.println("\nEnter size of the array : ");
        // input size of array
        sizeOfArray = InputIntegerArray.inputSizeOfArray();

        System.out.println("\nEnter "+ sizeOfArray +" elements of the array : ");
        // call inputArray function to get user input
        integerArray = InputIntegerArray.inputArray(sizeOfArray);

    }

    private int findDuplicateInteger(){

        HashSet<Integer> set = new HashSet<>();
        for(int i=0 ; i<sizeOfArray; ++i){
            if(set.contains(integerArray[i])){
                return integerArray[i];
            }
            set.add(integerArray[i]);
        }
        return 0;
    }
    
}
