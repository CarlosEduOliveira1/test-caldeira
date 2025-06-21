import java.time.LocalTime;

public class VerifyDeliver {
    public static void main(String[] args) {
        LocalTime deliver = LocalTime.of(23, 0);
        LocalTime limit = LocalTime.of(22, 59); 
    
        if (!deliver.isBefore(limit)) {
            System.out.println("Entrega fora do horário");
        } else {
            System.out.println("Tarefa enviada com sucesso");
        }
    }
}
