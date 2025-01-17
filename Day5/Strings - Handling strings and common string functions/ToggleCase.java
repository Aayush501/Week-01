import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // object of scanner class

        // taking input for the text
        String text = input.next();
        String toggleText = ""; // for storing the result

        // iterating through the text to toggle the case of the text
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 97) {
                toggleText = toggleText.concat((char)(text.charAt(i) - 32) + "");
            } else {
                toggleText = toggleText.concat((char)(text.charAt(i) + 32) + "");
            }
        }

        // displaying the result
        System.out.println("toggled case text: " + toggleText);
    }
}
