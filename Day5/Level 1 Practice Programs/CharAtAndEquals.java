import java.util.Scanner;

public class CharAtAndEquals {
	
	public static boolean compareString(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}
		
		for(int i=0; i<str1.length(); i++){
			if(str1.charAt(i) != str2.charAt(i)){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		String str1 = input.next();
		String str2 = input.next();
		
		// using inbuilt method to check if strings are equal
		boolean ansUsingEquals = str1.equals(str2);
		
		// using CharAt method to check if strings are equal
		boolean ansUsingCharAt = compareString(str1, str2);
		
		// Comparing both the answer
		System.out.println("Answer got after using .equals method " + ansUsingEquals + " answer got after using .charAt method " + ansUsingCharAt + " Both answers are equal");
		
		input.close();
	}
}