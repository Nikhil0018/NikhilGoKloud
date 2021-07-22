/*
------------- EXPLANATION --------------

Problem : Find the sum of 2 matrices

Approach :
1. Input two 2D arrays from the user
2. Take a counter and initialize it to 0, to count the number of prime numbers in the array
3. Make a temporary 2D array with same number of rows and columns as the 2 arrays, to store the resultant sum of 2 matrices
4. Make a nested loop and iterate over all elements of the temporary 2D array
5. Add integers of the two matrix and store in the temporary matrix
6. Print the temporary matrix

Time Complexity : O(n^2)

Space Complexity : O(1)

*/

import java.util.Scanner;

public class MatrixSum {

    private static int rows;
    private static int columns;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        // Input the rows and columns of the matrix
        inputRowsAndColumns();

        // Input 2 matrices
        System.out.println("\nEnter the elements of the 1st matrix (A) : ");
        int [][] A = inputMatrix();
        System.out.println("\nEnter the elements of the 2nd matrix (B) : ");
        int [][] B = inputMatrix();

        // Print Both matrices A and B
        System.out.println("\nMatrix A : ");
        printMatrix(A);
        System.out.println("\nMatrix B : ");
        printMatrix(B);

        // Calculate sum of matrices A and B
        int [][] C = sumOfMatrices(A, B);

        System.out.println("\nSum of matrices A and B : ");

        // Print resultant matrix C
        printMatrix(C);
        

    }

    private static void printMatrix(int[][] matrix){

        for( int i = 0; i < rows; ++i){
            for (int j=0; j < columns; ++j){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    private static int[][] sumOfMatrices(int[][] A, int[][] B) {
        
        int [][] tempMatrix = new int [rows][columns];

        for (int i = 0; i < rows; ++i)
            for (int j = 0; j < columns; ++j)
                tempMatrix[i][j] = A[i][j] + B[i][j];

        return tempMatrix;

    }

    private static void inputRowsAndColumns() {

        System.out.println("\nEnter number of rows in matrix: ");
        rows = scanner.nextInt();
        System.out.println("\nEnter number of columns in matrix: ");
        columns = scanner.nextInt();

        // Flush out the newline at end
        scanner.nextLine();

    }

    public static int[][] inputMatrix(){


        int [][] tempMatrix = new int [rows][columns];
        
        // Input the matrix using nested for loops
        for (int i = 0; i < rows; ++i)
            for (int j = 0; j < columns; ++j)
                tempMatrix[i][j] = scanner.nextInt();
        
        // Return the inputMatrix
        return tempMatrix;
                

    }
    
}
