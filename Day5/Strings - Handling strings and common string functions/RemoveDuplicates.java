import java.util.Scanner; // importing scanner class

// definition of RemoveDuplicates class
public class RemoveDuplicates {
    public static  void  main(String[] args){
        Scanner sc = new Scanner(System.in); // object of scanner class

        // created a String variable text and taking input for that
        String text = sc.nextLine();

        // creating an array to store the duplicate characters count
        int[] duplicates = new int[256]; // comply with ASCII characters

        // iterating through text to remove duplicates from it
        StringBuilder unique = new StringBuilder(); // to store the string with only unique characters
        for (int i = 0; i < text.length(); i++) {
            if (duplicates[text.charAt(i)] == 0) {
                unique.append(text.charAt(i));
                duplicates[text.charAt(i)]++;
            }
        }

        // printing the output
        System.out.println("text with duplicate characters: " + text + "\ntext with only unique characters: " + unique);
    }
}
