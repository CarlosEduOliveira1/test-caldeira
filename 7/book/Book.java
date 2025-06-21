package book;

public class Book {
    public String title;
    public boolean borrow;

    public void borrow() {
        borrow = true;
    }

    public String status() {
        if (borrow) {
            return "Indisponível";
        }

        return "Disponível";
    }
}
