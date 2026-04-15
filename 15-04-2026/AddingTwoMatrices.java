import java.lang.*;
import java.util.*;

class AddingTwoMatrices {
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

        // Create a result matrix to store the sum
        int[][] resultMatrix = new int[matrixA.length][matrixA[0].length];

        // Add the two matrices
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}