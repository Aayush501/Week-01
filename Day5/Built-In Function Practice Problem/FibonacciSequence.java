import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // object of scanner class

        // taking an integer input from user
        int number = sc.nextInt();

        // generating fibonacci sequence
        int first = 0, second = 1, sum = 0; // initial members of the sequence
        System.out.print(first + " " + second + " ");
        for (int i=3; i<=number; i++) {
            sum = first + second;
            System.out.print(sum + " ");
            first = second;
            second = sum;
        }
    }
}
