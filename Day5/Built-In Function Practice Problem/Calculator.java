import java.util.Scanner;

public class Calculator {
    public  static  void add(int first, int second) {
        // created an integer sum to store the sum of numbers
        int sum = first + second;
        System.out.println(first + " + " + second + " = " + sum);
    }

    public  static  void subtract(int first, int second) {
        // created an integer difference to store the difference of numbers
        int difference = first - second;
        System.out.println(first + " - " + second + " = " + difference);
    }

    public  static  void multiply(int first, int second) {
        // created an integer mul to store the multiplication of numbers
        int mul = first * second;
        System.out.println(first + " * " + second + " = " + mul);
    }

    public  static  void divide(int first, int second) {
        // created an integer div to store the division of numbers
        int div = first / second;
        System.out.println(first + " / " + second + " = " + div);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // object of scanner class

        // created two integer variables and taking input for them
        int first = sc.nextInt();
        int second = sc.nextInt();

        // prompting to user which operation is to be performed
        System.out.println("choose :\n1 -> addition\n2 -> subtraction\n3 -> multiplication\n4 -> division");
        // taking input for user's choice
        int choice = sc.nextInt();

        switch (choice) {
            case 1 :
                add(first, second);
                break;
            case 2 :
                subtract(first, second);
                break;
            case 3 :
                multiply(first, second);
                break;
            case 4 :
                divide(first, second);
                break;
        }
    }
}
