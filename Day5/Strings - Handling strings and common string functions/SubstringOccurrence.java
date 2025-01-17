import java.util.Scanner;

public class SubstringOccurrence {

    public static int countOccurrence (String sentence, String word) {
        int noOfOccurrences = 0; // integer variable to store the result

        // iterating through the sentence
        for(int i=0; i<=sentence.length()-word.length(); i++) {
            String subString = sentence.substring(i, i + word.length());
            if(subString.equals(word)){ // if substring matches the word
                noOfOccurrences++;
            }
        }

        return noOfOccurrences;
    }

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in); // object of scanner class

        // taking input for the sentence and also the word whose occurrence is to be counted
        String sentence = input.nextLine();
        String word = input.next();

        // replacing the word
        int noOfOccurrences = countOccurrence(sentence, word);

        System.out.println("number of occurrences of " + word + " is: " + noOfOccurrences);

        input.close();
    }
}