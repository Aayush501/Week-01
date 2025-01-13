public class GeneratingStringOutOfBound {
	
	public static void generateStringOutOfBound(String text){
		System.out.println(text.charAt(text.length())); // exception will arise here
	}
	
	public static void main(String[]args){
		
		String text = "name";
		
		// added an exception prone code
		try{
			generateStringOutOfBound(text);
		}
		// catch exception
		catch(StringIndexOutOfBoundsException e){
			System.out.println("Exception caught : " + e.getMessage());
		}
	}
}