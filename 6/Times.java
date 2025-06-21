import java.util.ArrayList;

public class Times {
    public static void main(String[] args) {
        ArrayList<String> times = new ArrayList<>();

        times.add("08:00");
        times.add("10:00");
        times.add("12:00");
        times.remove(1);
        times.add("14:00");
        
        System.out.println(times.get(1));
    }
}
