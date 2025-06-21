public class Notications {
    public static void main(String[] args) {
        int notifications = 0;

        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                notifications += 2;
            } else {
                notifications++;
            }
        }

        System.out.println(notifications);
    }
}
