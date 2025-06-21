import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalcWeekDays {
    public static void main(String[] args) {
        LocalDate date =  LocalDate.of(2025, 6, 10);
        int businessDays = 0;

        while (businessDays < 7) {
            date = date.plusDays(1);

            boolean weekend = 
                date.getDayOfWeek() == DayOfWeek.SATURDAY 
                || date.getDayOfWeek() == DayOfWeek.SUNDAY;

            boolean holiday = date.equals(LocalDate.of(2025, 6, 15));

            if (!weekend && !holiday) {
                businessDays++;
            }
        }

        System.out.println(date);
    }    
}
