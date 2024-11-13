import java.util.Scanner;
//TODO: авакян кирилл
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите расстояние (км): ");
        double distance = new Scanner(System.in).nextDouble();
        System.out.println("Введите скорость (км/ч): ");
        int speed = new Scanner(System.in).nextInt();
        double _time = distance / speed;
        System.out.println("Ответ: " + (int)_time + " час " + (int)((_time - (int)_time) * 60) + " мин");
    }
}
