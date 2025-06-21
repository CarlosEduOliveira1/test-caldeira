public class StudyPlatraform {
    public static void main(String[] args) {
        int grade = 7;
        int weight = 2;
        double average = (grade * weight + 6 * 3) / 5;

        if (average >= 7.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Revisar conteúdo");
        }
    }
}
