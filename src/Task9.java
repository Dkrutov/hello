import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //количество обедов.
        int n = scanner.nextInt();
        //стоимость обедов
        int[] lunch = new int[n];
        for (int i = 0; i < n; i++) {
            lunch[i] = scanner.nextInt();
        }
        int count = 0;
        Map<Integer, Integer> number = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (lunch[i] > 100) {
                if (i == n - 1) {
                    break;
                }
                count++;
                number.put(count, i + 1);
            }


        }
        int size = number.size();
        for (int j = size; j > 0 ; j--) {
            int max = 0;
            int num = 0;
            for (int i = number.get(j); i < n ; i++) {
                if (lunch[i] > max & lunch[i] < 100) {
                    max = lunch[i];
                    num = i;
                }
            }
            if (max == 0) {
                for (int i = number.get(j); i < n ; i++) {
                    if (lunch[i] > max) {
                        max = lunch[i];
                        num = i;
                    }
                }
            }
            lunch[num] = 0;
        }


//        for (int i = 0; i < n; i++) {
//            System.out.println("lunch " + lunch[i]);
//        }




        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + lunch[i];

        }
        System.out.println(sum);
    }
}
