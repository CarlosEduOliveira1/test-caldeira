public class Item {
    String name;
    int quantity;

    public Item(String name) {
        this.name = name;
        this.quantity = 1;
    }

    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public static void main(String[] args) {
        Item x = new Item("Caderno");
        Item y = new Item("Caderno", 3);

        System.out.println(x.quantity + y.quantity);
    }
}
