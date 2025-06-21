import book.Book;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Teste";

        System.out.println(book.status());
        book.borrow();
        System.out.println(book.status());
    }
}
