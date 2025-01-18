import java.util.Scanner; // importing scanner class

// definition of Palindrome class
public class Palindrome {

    public static String takeInput() {
        Scanner sc = new Scanner(System.in); // object of scanner clas

        // created a String variable text and taking input for that
        return sc.nextLine();
    }

    public static boolean palindromeChecker(String text) {
        StringBuilder reverseText = new StringBuilder(); // to store the reverse of text

        // reversing the string text
        for (int i = text.length()-1; i >= 0; i--) { // iteration through text
            reverseText.append(text.charAt(i));
        }

        String reverseTextReplica = new String(reverseText); // replica of reverse text since reverseText is StringBuilder object
        return text.equals(reverseTextReplica);
    }

    public static void displayResult(boolean checker, String text){
        if (checker) {
            System.out.println(text + " is palindrome");
        }
    }

    public static  void  main(String[] args){

        // calling the input function to take a string input
        String input = takeInput();

        // calling the palindromeChecker function to check if the input string is a palindrome or not
        boolean checker = palindromeChecker(input);

        // displaying the result
        displayResult(checker, input);
    }
}
