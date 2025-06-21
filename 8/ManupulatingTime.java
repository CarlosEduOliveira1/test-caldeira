import java.time.LocalDate;

public class ManupulatingTime {
    public static void main(String[] args) {
        LocalDate today = LocalDate.of(2025, 6, 9);
        LocalDate maxTime = today.plusDays(10);
        System.out.println(maxTime);
    }
}
