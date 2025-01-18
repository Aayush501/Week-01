import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // taking two date inputs in dd-MM-yyyy format
        String firstDateInput = scanner.nextLine();
        String secondDateInput = scanner.nextLine();

        // date formatter for input parsing
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        // parsing the input dates
        LocalDate firstDate = LocalDate.parse(firstDateInput, formatter);
        LocalDate secondDate = LocalDate.parse(secondDateInput, formatter);

        // comparing the dates
        if (firstDate.isBefore(secondDate)) {
            System.out.println("The first date is before the second date.");
        } else if (firstDate.isAfter(secondDate)) {
            System.out.println("The first date is after the second date.");
        } else if (firstDate.isEqual(secondDate)) {
            System.out.println("The first date is the same as the second date.");
        }
    }
}
