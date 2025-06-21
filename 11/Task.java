import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task implements Comparable<Task> {
    String title;
    
    public Task(String title) {
        this.title = title;
    }

    public int compareTo(Task other) {
        return this.title.compareTo(other.title);
    }

    @Override
    public String toString() {
        return title;
    }

    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Estudar"));
        tasks.add(new Task("Almoçar"));
        tasks.add(new Task("Dormir"));
        Collections.sort(tasks);
        System.out.println(tasks);
    }
}
