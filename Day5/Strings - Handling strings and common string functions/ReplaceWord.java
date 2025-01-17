import java.util.Scanner;

public class ReplaceWord {
	
	public static String replace (String sentence, String replaceWhat, String replaceWith) {
		String newSentence = "";
		
		// iterating through the sentence
		for(int i=0; i<=sentence.length()-replaceWhat.length(); i++) {
			String subString = sentence.substring(i, i + replaceWhat.length());
			if(subString.equals(replaceWhat)){
				newSentence += replaceWith;
				if(i+replaceWhat.length() < sentence.length()) {
					String newSubString = sentence.substring(i + replaceWhat.length(), sentence.length());
					newSentence += newSubString;
				}
				break;
			}
			else {
				newSentence += sentence.charAt(i);
			}
		}
		
		return newSentence;
	}
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in); // object of scanner class
		
		String sentence = input.nextLine();
		String replaceWhat = input.next();
		String replaceWith = input.next();
		
		// replacing the word
		String newSentence = replace(sentence, replaceWhat, replaceWith);
		
		System.out.println("new sentence: " + newSentence);
		
		input.close();
	}
}