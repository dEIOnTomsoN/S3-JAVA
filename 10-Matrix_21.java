import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Enter the number of rows for the matrices:");
            int rows = scanner.nextInt();
            System.out.println("Enter the number of columns for the matrices:");
            int columns = scanner.nextInt();

            int[][] matrix1 = inputMatrix("Enter the elements of the first matrix:", rows, columns, scanner);
            int[][] matrix2 = inputMatrix("Enter the elements of the second matrix:", rows, columns, scanner);

            System.out.println("Matrix 1:");
            printMatrix(matrix1);

            System.out.println("Matrix 2:");
            printMatrix(matrix2);

            System.out.println("Choose an operation:");
            System.out.println("1. Add Matrices");
            System.out.println("2. Subtract Matrices");
            System.out.println("3. Transpose Matrix");
            System.out.println("4. Multiply Matrices");
            System.out.println("5. Exit");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    int[][] sumMatrix = addMatrices(matrix1, matrix2);
                    System.out.println("Sum of Matrices:");
                    printMatrix(sumMatrix);
                    break;
                case 2:
                    int[][] diffMatrix = subtractMatrices(matrix1, matrix2);
                    System.out.println("Difference of Matrices:");
                    printMatrix(diffMatrix);
                    break;
                case 3:
                    int[][] transposeMatrix1 = transposeMatrix(matrix1);
                    int[][] transposeMatrix2 = transposeMatrix(matrix2);
                    System.out.println("Transpose of Matrix 1:");
                    printMatrix(transposeMatrix1);
                    System.out.println("Transpose of Matrix 2:");
                    printMatrix(transposeMatrix2);
                    break;
                case 4:
                    if (matrix1[0].length == matrix2.length) {
                        int[][] productMatrix = multiplyMatrices(matrix1, matrix2);
                        System.out.println("Product of Matrices:");
                        printMatrix(productMatrix);
                    } else {
                        System.out.println("Invalid operation. Number of columns in Matrix 1 must be equal to the number of rows in Matrix 2 for multiplication.");
                    }
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a number between 1 and 5.");
            }

        } while (choice != 5);

        scanner.close();
    }

    private static int[][] inputMatrix(String message, int rows, int columns, Scanner scanner) {
        System.out.println(message);
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    private static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }

        return result;
    }

    private static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] result = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[j][i] = matrix[i][j];
            }
        }

        return result;
    }

    private static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix2[0].length;
        int[][] result = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }
}

