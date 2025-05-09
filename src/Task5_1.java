import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task5_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String s = scanner.next();

        int open = 0;
        int close = 0;
        int balance = 0;
        List<Integer> need = new ArrayList<>();
//считаем проблемные скобки
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                open++;
                balance++;
            } else {
                close++;
                balance--;
            }

            if (balance<0) {
                need.add(i);
                balance=0;
            }
        }


        //подсчитываем затрыты
        int cost = 0;
        if ( a > b * 2) {

            if (open != close) {
                int r = Math.abs((open - close) / 2);
                cost += r * b;
            }

            if (!need.isEmpty()) {
                int k = Math.min(need.size(), s.length() - need.size());
                cost += 2 * k * b;
            }

        } else {
            if (open != close) {
                int r = Math.abs((open - close) / 2);
                cost += r * b;
            }

            if (!need.isEmpty()) {
                int k = Math.min(need.size(), s.length() - need.size());
                cost += k * a;
            }
        }
//вывод
        System.out.println(cost);

    }
}
