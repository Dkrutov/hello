import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Считываем входные данные
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // Вычисляем
        double b = Math.log(n)/Math.log(2);
        int minCuts = (int) Math.ceil(b);

        // Выводим результат
        System.out.println(minCuts);

    }
}
