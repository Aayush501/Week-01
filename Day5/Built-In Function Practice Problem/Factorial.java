import java.util.Scanner;

public class Factorial {

    public static int findFactorial(int number) {
        if (number <= 1) return number;
        return number * findFactorial(number-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // object of scanner class

        // taking an integer input
        int number = sc.nextInt();

        // finding the factorial of a number
        int factorial = findFactorial(number);

        // displaying the output
        System.out.println("factorial of " + number + ": " + factorial);
    }
}
