import java.util.Scanner;

public class TopTwoLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // object of scanner class
		
		// created an integer variable, number, and taking input for that 
        int number = scanner.nextInt();
	
		// created two variables, and an array
        final int MAX_DIGITS = 10;
        int[] digits = new int[MAX_DIGITS];
        int index = 0;

        // extract digits and store them in the array
        while (number != 0 && index < MAX_DIGITS) {
            digits[index] = number % 10;
            number /= 10;
            index++;
        }

        // variables to store the largest and second largest digits
        int largest = -1;
        int secondLargest = -1;

        // find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display the results 
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        scanner.close(); // closing the Scanner object
    }
}
