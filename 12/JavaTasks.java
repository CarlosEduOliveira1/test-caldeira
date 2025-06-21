import java.util.ArrayList;

public class JavaTasks {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        tasks.add("Estudar java");
        tasks.add("Fazer exercícios");
        tasks.add("Revisar cõdigo");

        for (String task : tasks) {
            if (task.contains("java")) {
                System.out.println("Tarefa de programação: " + task);
            }
        }
    }
}
