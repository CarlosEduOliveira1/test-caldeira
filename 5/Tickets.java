public class Tickets {
    public static void main(String[] args) {
        int priority = 4;
        int urgency = 8;

        if(priority > 3 && urgency >  7) {
            System.out.println("Tarefa crítica");
        } else if (priority > 3 || urgency > 7) {
            System.out.println("Tarefa importante");
        } else {
            System.out.println("Tarefa comum");
        }
    }
}
