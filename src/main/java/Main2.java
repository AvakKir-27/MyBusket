public class Main2 {
    public static void main(String[] args) {
        Busket myBusket = new Busket();
        myBusket.add("1 кг индейки", 700);
        myBusket.add("2 кг конфет", 600);
        myBusket.add("Связка бананов", 200);
        myBusket.add("1л молока", 100);
        myBusket.add("2 кг конфет", 600);
        myBusket.add("500г орехов", 500);
        myBusket.add("Связка бананов", 200);
        myBusket.print("Содержание корзины: ");
        myBusket.clear();
        myBusket.print("Содержание корзины: ");

        System.out.println();

        Busket petyaBusket = new Busket(5000);
        petyaBusket.add("Микроволновка", 3500);
        petyaBusket.add("Клавиатура", 2500);
        petyaBusket.print("Содержание корзины:");

        System.out.println();

        Busket mashaBusket = new Busket("Стол",10_000);
        mashaBusket.print("Содержание корзины:");
    }
}