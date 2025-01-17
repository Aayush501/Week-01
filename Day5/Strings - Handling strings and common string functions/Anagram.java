import java.util.Scanner;

public class Anagram {
	
	public static boolean checkAnagram(String string1, String string2) {
		int[] frequency = new int[256]; // frequency array to store the frequencies of characters
		// frequency array complies with ASCII character codes
		
		// iterating through string 1
		for(int i=0; i<string1.length(); i++) {
			frequency[string1.charAt(i)]++;
		}
		
		// iterating through string 2
		for(int i=0; i<string2.length(); i++) {
			frequency[string2.charAt(i)]--;
		}
		
		// iterating through frequency array
		for(int i=0; i<256; i++) {
			if (frequency [i] > 0){
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in); // object of scanner class
		
		// taking string inputs
		String string1 = input.next();
		String string2 = input.next();
		
		// checking if both strings are anagrams
		if(checkAnagram(string1, string2)){
			System.out.println("both strings are anagrams");
		} else {
			System.out.println("both strings are not anagrams");
		}
		
		input.close();
	}
}