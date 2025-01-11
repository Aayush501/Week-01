// importing Scanner class for input
import java.util.Scanner;

public class ArrayDimensionConversion {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in); // object of scanner class
		
		// Take input for rows and columns
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        // Create a 2D array 
        int[][] matrix = new int[rows][columns];
		
		// taking inputs for matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Create a 1D array to copy the elements
        int[] array = new int[rows * columns];
        int index = 0;

        // Copy elements from the 2D array to the 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index++] = matrix[i][j];
            }
        }

        System.out.print("The elements of the 1D array are: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
		sc.close(); // closing the scanner object
	}
}