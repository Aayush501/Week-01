import java.util.Scanner; // importing scanner class

// definition of RemoveSpecificCharacter class
public class RemoveSpecificCharacter {
    public static  void  main(String[] args){
        Scanner sc = new Scanner(System.in); // object of scanner class

        // created a String variable text and taking input for that
        String text = sc.nextLine();
        // created a char variable remove to store the character to be removed from text
        char remove = sc.next().charAt(0);
        StringBuilder newText = new StringBuilder(); // to store the text after removing the character

        // traversing the string text
        for (int i = 0; i < text.length(); i++) { // iteration through text
            if (text.charAt(i) != remove) {
                newText.append(text.charAt(i));
            }
        }

        // displaying the output
        System.out.println("text: " + text + "\nafter removing " + remove + " text becomes: " + newText);
    }
}
