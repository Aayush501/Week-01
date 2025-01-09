import java.util.Scanner;

class TravelComputation {
   
   public static void main(String[] args) {
	   
	  Scanner input = new Scanner(System.in); // Object of scanner class
      
      // Created variables fromCity, viaCity and toCity, and taking input for them
      String fromCity = input.next(), viaCity = input.next(), toCity = input.next();

      // Created two variables distanceFromToVia and distanceViaToFinalCity, and taking inputs for them
      int distanceFromToVia = input.nextInt();
	  int distanceViaToFinalCity = input.nextInt();

      // Created a variable timeFromToVia and timeViaToFinalCity, and taking inputs for them
      int timeFromToVia = input.nextInt();
	  int timeViaToFinalCity = input.nextInt();

      // Created a variable totalDistance to indicate the total distance
      double totalDistance = distanceFromToVia + distanceViaToFinalCity;

      // Created a variable totalTime to indicate the total time taken to
      // travel from fromCity to toCity in minutes
      int totalTime = timeFromToVia + timeViaToFinalCity;


      // Print the travel details
      System.out.println("The Total Distance travelled from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");
   }
}
