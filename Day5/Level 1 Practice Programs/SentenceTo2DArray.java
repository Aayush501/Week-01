import java.util.Scanner;

public class  SentenceTo2DArray {
	
	public static int countWords(String sentence) {
		// iterating through sentence to count the number of words
		int noOfWords = 0;
		for (int i=0; i<sentence.length(); i++) {
			if(sentence.charAt(i) == ' ' || i == sentence.length()-1) {
				noOfWords++;
			}
		}
		return noOfWords;
	}
	
	public static String [][] getSentenceAs2DArray(String sentence) {
		int noOfWords = countWords(sentence);
		String [][] sentence2D = new String [noOfWords][2];
		
		// iterating through sentence to extract the words
		String temporary = "";
		int sentence2DIterator = 0;
		for (int i=0; i<sentence.length(); i++) {
			if(sentence.charAt(i) != ' ' && i != sentence.length()-1) {
				temporary += sentence.charAt(i);
			} else if(i == sentence.length()-1) {
				temporary += sentence.charAt(i);
				sentence2D [sentence2DIterator][0] = temporary;
				sentence2D [sentence2DIterator][1] = temporary.length() + "";
				temporary = "";
				sentence2DIterator++;
			} else {
				sentence2D [sentence2DIterator][0] = temporary;
				sentence2D [sentence2DIterator][1] = temporary.length() + "";
				temporary = "";
				sentence2DIterator++;
			}
		}
		return sentence2D;
	}
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in); // object of scanner class
		
		String sentence = input.nextLine(); // taking a sentence input 		
		
		String[][] sentence2D = getSentenceAs2DArray(sentence);
		
		// printing the output
		for (int i=0; i<sentence2D.length; i++){
			System.out.println(sentence2D[i][0] + " " + sentence2D[i][1]);
		}
	}
}