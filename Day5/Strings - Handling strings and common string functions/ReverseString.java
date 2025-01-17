import java.util.Scanner; // importing scanner class

// definition of ReverseString class
public class ReverseString {
    public static  void  main(String[] args){
        Scanner sc = new Scanner(System.in); // object of scanner class

        // created a String variable text and taking input for that
        String text = sc.nextLine();
        StringBuilder reverseText = new StringBuilder(); // to store the reverse of text

        // reversing the string text
        for (int i = text.length()-1; i >= 0; i--) { // iteration through text
            reverseText.append(text.charAt(i));
        }

        // displaying the output
        System.out.println("text: " + text + "\nreverse: " + reverseText);
    }
}
