import java.util.Scanner;

public class MatrixOperations 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter dimensions of the matrices (rows and columns): ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        
        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        
        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                matrix1[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                matrix2[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("Addition:");
        printMatrix(addMatrices(matrix1, matrix2));
        
        System.out.println("Subtraction:");
        printMatrix(subtractMatrices(matrix1, matrix2));
        
        System.out.println("Multiplication:");
        printMatrix(multiplyMatrices(matrix1, matrix2, rows, cols));
        
        scanner.close();
    }
    
    public static int[][] addMatrices(int[][] a, int[][] b) 
    {
        int rows = a.length, cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }
    
    public static int[][] subtractMatrices(int[][] a, int[][] b) 
    {
        int rows = a.length, cols = a[0].length;
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }
    
    public static int[][] multiplyMatrices(int[][] a, int[][] b, int rows, int cols) 
    {
        int[][] result = new int[rows][cols];
        for (int i = 0; i < rows; i++) 
        {
            for (int j = 0; j < cols; j++) 
            {
                for (int k = 0; k < cols; k++) 
                {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        
        return result;
    }
    
    public static void printMatrix(int[][] matrix) 
    {
        for (int[] row : matrix) 
        {
            for (int elem : row) 
            {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
