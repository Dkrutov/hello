import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //ограничения на тесты снизу
        long l = scanner.nextLong();
        //ограничения на тесты сверху
        long r = scanner.nextLong();
        //формируем числа

        long count = 0;
        for (int digit = 1; digit <= 9; digit++) {
            long number = 0;
            for (long lenth = 1; lenth <= 18; lenth++) {
                number = number * 10 + digit;
                if (number > r) {
                    break;
                }
                if (number >= l) {
                    count++;
                }
            }
        }
        //вывод
        System.out.println(count);
    }
}
