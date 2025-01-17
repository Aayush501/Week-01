import java.util.Scanner;

public class StringComparison {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in); // object of scanner class

        // taking two string inputs
        String string1 = input.next();
        String string2 = input.next();

        // comparing both string lexicographically
        int i = 0, j=0;
        boolean check = true; // it checks if we got the answer through loop or not
        for ( ; i<string1.length() && j<string2.length(); i++, j++) { // i is iterator for string1 and j is iterator for string2
            if (string1.charAt(i) < string2.charAt(j)) {
                System.out.println(string1 + " comes before " + string2 + " in lexicographical order");
                check = false;
                break;
            } else if (string1.charAt(i) > string2.charAt(j)) {
                System.out.println(string2 + " comes before " + string1 + " in lexicographical order");
                check = false;
                break;
            }
        }

        // if we did not get the answer by the loop
        if (check) {
            if (i >= string1.length()) {
                System.out.println(string1 + " comes before " + string2 + " in lexicographical order");
            } else {
                System.out.println(string2 + " comes before " + string1 + " in lexicographical order");
            }
        }

        input.close();
    }
}
