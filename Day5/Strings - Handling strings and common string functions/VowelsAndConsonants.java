import java.util.Scanner; // importing scanner class

// definition of VowelsAndConsonants class
public class VowelsAndConsonants {
    public static  void  main(String[] args){
        Scanner sc = new Scanner(System.in); // object of scanner class

        // created a String variable text and taking input for that
        String text = sc.nextLine();

        // finding vowels and consonants in text
        int vowels = 0, consonants = 0; // variable to store count of vowels, and consonants
        for (int i = 0; i < text.length(); i++) { // iteration through text
            if (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u') {
                vowels++;
            } else if (text.charAt(i) == 'A' || text.charAt(i) == 'E' || text.charAt(i) == 'I' || text.charAt(i) == 'O' || text.charAt(i) == 'U') {
                vowels++;
            } else if (text.charAt(i) != ' '){
                consonants++;
            }
        }

        // displaying the output
        System.out.println("count of vowels: " + vowels + " count of consonants: " + consonants);
    }
}
