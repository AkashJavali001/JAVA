package allprg;
import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the order of the matrices
        System.out.print("Enter the order N of the matrices: ");
        int n = scanner.nextInt();

        // Input matrices and perform addition
        int[][] matrix1 = inputMatrix(n, "first");
        int[][] matrix2 = inputMatrix(n, "second");
        int[][] resultMatrix = addMatrices(matrix1, matrix2);

        // Display the result matrix
        System.out.println("Sum of the matrices is:");
        displayMatrix(resultMatrix);

        scanner.close();
    }

    // Function to input a matrix from the user
    private static int[][] inputMatrix(int n, String ordinal) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter elements of the " + ordinal + " matrix:");
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Enter element at position (" + (i + 1) + "," + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    // Function to add two matrices
    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int n = matrix1.length;
        int[][] resultMatrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return resultMatrix;
    }

    // Function to display a matrix
    private static void displayMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
