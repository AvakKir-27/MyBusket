public class Busket {
    private String items = "";

    private int totalPrice = 0;

    private int limit = 1_000_000;

    public Busket() {
        this.items = "Список товаров:";
        System.out.println("Товары: " + items);
    }

    public Busket(int limit) {
        this();
        this.limit = limit;
    }

    public Busket(String items, int totalPrice) {
        this();
        add(items, totalPrice);
    }

    public void add(String name, int price) {
        if (totalPrice + price > limit) {
            return;
        } else if (containItem(name)) {
            return;
        } else if(items.isEmpty()) {
            items += name + " - " + price + " руб.";
            totalPrice += price;
        } else {
            items += "\n" + name + " - " + price + " руб.";
            totalPrice += price;
        }
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста!");
        } else {
            System.out.println(items);
            System.out.println("Стоимость данной корзине равна: " + getTotalPrice());
        }
    }

    public boolean containItem(String name) {
        if(items.contains(name)) {
            return true;
        }
        return false;
        // return items.contains(name);
    }
    public int getTotalPrice() {
        return totalPrice;
    }

}