public class MatrixMultiplication {
    public static void main(String[] args) {
        // First matrix (3x3)
        int A[][] = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Second matrix (3x3)
        int B[][] = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        // Result matrix
        int C[][] = new int[A.length][B[0].length];

        // Multiplication
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                C[i][j] = 0;
                for (int k = 0; k < B.length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Print result (comma-separated)
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                if (j < C[0].length - 1)
                    System.out.print(C[i][j] + ",");
                else
                    System.out.print(C[i][j]);
            }
            System.out.println();
        }
    }
}
