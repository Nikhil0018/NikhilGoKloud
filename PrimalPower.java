/*
------------- EXPLANATION --------------

Problem : Find the primal power of an array

Approach :
1. Input an array from the user
2. Take a counter and initialize it to 0, to count the number of prime numbers in the array
3. Loop through all the elements of the array
4. If the element is prime, increase the counter
5. To find a number is prime or not, we iterate through 2 to n/2, and check if it is divisible by any one of the integers in range
6. Return the counter variable (Primal Power)

Time Complexity : O(n^2)

Space Complexity : O(1)

*/

import java.util.Arrays;

class PrimalPower {

    private static int sizeOfArray;
    private static int[] integerArray;

    public static void main(String[] args) {
        
        PrimalPower primalPower = new PrimalPower();
        primalPower.inputArray();

        System.out.println("\nArray = " + Arrays.toString(integerArray));
        System.out.print("\nPrimal power of the array : " + primalPower.findPrimalPower());

    }

    private void inputArray(){

        System.out.println("\nEnter size of the array : ");
        // input size of array
        sizeOfArray = InputIntegerArray.inputSizeOfArray();

        System.out.println("\nEnter "+ sizeOfArray +" elements of the array : ");
        // call inputArray function to get user input
        integerArray = InputIntegerArray.inputArray(sizeOfArray);

    }

    private int findPrimalPower(){

        int primalPower = 0;

        for(int i=0; i<sizeOfArray ; ++i){

            if(isPrime(integerArray[i])){
                ++primalPower;
            }

        }

        return primalPower;

    }

    private boolean isPrime(int num){

        if(num<2){

            return false;
        
        }else{

            if( num == 2 || num == 3 ){
                return true;
            }else{

                for( int i=2 ; i<=num/2 ; ++i){
                    if( num%i == 0 )
                        return false;
                }

            }

        }
        
        return true;

    }

}
