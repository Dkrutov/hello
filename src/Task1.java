import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Считываем входные данные
        int A = scanner.nextInt(); // Абонентская плата
        int B = scanner.nextInt(); // Включено мегабайт в тариф
        int C = scanner.nextInt(); // Стоимость каждого лишнего мегабайта
        int D = scanner.nextInt(); // Сколько мегабайт Костя планирует потратить

        // Вычисляем итоговую стоимость
        int totalCost;
        if (D <= B) {
            totalCost = A;
        } else {
            totalCost = A + (D - B) * C;
        }

        // Выводим результат
        System.out.println(totalCost);
    }
    }

