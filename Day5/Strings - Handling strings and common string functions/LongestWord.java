import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // object of scanner class

        // taking a sentence input
        String text = sc.nextLine();

        // iterating through the text to find the longest word in the string
        String longestWord = "";
        String temp = ""; // temp : temporary word to compare with the longestWord string which is going to be the answer
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i) != ' ' && i != text.length()-1) {
                temp = temp.concat(text.charAt(i) + "");
            } else {
                if (i == text.length()-1) {
                    temp = temp.concat(text.charAt(i) + "");
                }
                if (temp.length() > longestWord.length()) {
                    longestWord = temp;
                }
                temp = "";
            }
        }

        // displaying the output
        System.out.println("longest word: " + longestWord);
    }
}
