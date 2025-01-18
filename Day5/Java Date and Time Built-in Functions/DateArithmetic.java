import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // taking date input in dd-MM-yyyy format
        String inputDate = scanner.nextLine();

        // parsing input date using DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(inputDate, formatter);

        // adding 7 days to this day
        date = date.plusDays(7);

        // adding 1 month to the result
        date = date.plusMonths(1);

        // adding 2 years to the result
        date = date.plusYears(2);

        // subtracting 3 weeks from the result
        date = date.minusWeeks(3);

        // displaying the final date
        System.out.println(date);
    }
}