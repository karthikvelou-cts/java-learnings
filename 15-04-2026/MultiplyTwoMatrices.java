import java.lang.*;
import java.util.*;

class MultiplyTwoMatrices {
    public static void main(String[] args) {
        // Create two 2D arrays (matrices)
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrixB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        // Create a result matrix to store the product
        int[][] resultMatrix = new int[matrixA.length][matrixB[0].length];

        // Multiply the two matrices
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                resultMatrix[i][j] = 0; // Initialize the result element
                for (int k = 0; k < matrixA[0].length; k++) {
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}