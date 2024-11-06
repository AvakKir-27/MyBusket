public class Busket {
    private static String items = "";

    public static void main(String[] args) {

        add("1 кг индейки", 700);
        add("2 кг конфет", 600);
        add("Связка бананов", 200);
        add("1л молока", 100);
        add("500г орехов", 500);
        print("Содержание корзины: ");
        clear();
        print("Содержание корзины: ");
    }

    public static void add(String name, int price) {
        if(items.isEmpty()) {
            items += name + " - " + price + " руб.";
        } else {
            items += "\n" + name + " - " + price + " руб.";
        }
    }

    public static void clear() {
        items = "";
    }

    public static void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста!");
        } else {
            System.out.println(items);
        }
    }
}