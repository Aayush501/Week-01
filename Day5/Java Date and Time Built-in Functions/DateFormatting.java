import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateFormatting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // taking date input in dd-MM-yyyy format
        String inputDate = scanner.nextLine();

        // Parsing input date using DateTimeFormatter
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate parsedDate = LocalDate.parse(inputDate, inputFormatter);

        // Formatting the parsed date into different formats
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");

        // Displaying the formatted output
        System.out.println("Date in dd/MM/yyyy format: " + parsedDate.format(formatter1));
        System.out.println("Date in yyyy-MM-dd format: " + parsedDate.format(formatter2));
        System.out.println("Date in EEE, MMM dd, yyyy format: " + parsedDate.format(formatter3));
    }
}