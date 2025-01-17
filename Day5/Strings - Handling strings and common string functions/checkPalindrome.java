import java.util.Scanner; // importing scanner class

// definition of checkPalindrome class
public class checkPalindrome {
    public static  void  main(String[] args){
        Scanner sc = new Scanner(System.in); // object of scanner class

        // created a String variable text and taking input for that
        String text = sc.nextLine();
        StringBuilder reverseText = new StringBuilder(); // to store the reverse of text

        // reversing the string text
        for (int i = text.length()-1; i >= 0; i--) { // iteration through text
            reverseText.append(text.charAt(i));
        }

        // checking if text and reverse of text are same or not
        // text id palindrome if reverse of it is same as text
        String reverseTextReplica = new String(reverseText); // replica of reverse text since reverseText is StringBuilder object
        if (text.equals(reverseTextReplica)) {
            System.out.println(text + " is palindrome");
        }
    }
}
