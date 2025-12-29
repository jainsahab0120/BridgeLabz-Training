import java.time.*;
import java.util.*;

public class DateArithmetic {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LocalDate inputDate = LocalDate.parse(input.next());

        LocalDate resultDate = inputDate
                .plusDays(7)
                .plusMonths(1)
                .plusYears(2)
                .minusWeeks(3);

        System.out.println(resultDate);
    }
}
