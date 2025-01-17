import java.util.Scanner;

public class MostFrequentCharacter {
    public  static  void  main(String [] args) {
        Scanner sc = new Scanner(System.in); // object of scanner class

        // created a String variable text and taking input for that
        String text = sc.nextLine();

        // iterating the text to find the most frequent character of text
        int[] frequency = new int[256]; // frequency array to store the frequencies of characters
        // frequency array complies with ASCII character codes
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                frequency[text.charAt(i)]++;
            }
        }

        // iterating through frequency to find the most frequent character
        int frequencyOfMostFrequent = 0;
        char mostFrequent = ' ';
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > frequencyOfMostFrequent) {
                mostFrequent = (char) i;
                frequencyOfMostFrequent = frequency[i];
            }
        }

        // displaying the output
        System.out.println("Most frequent character: '" + mostFrequent + "'");
    }
}
