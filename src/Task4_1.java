import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task4_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int count = 0;

        // Перебираем все возможные подотрезки длиной >=3
        for (int l = 0; l < n; l++) {
            for (int r = l + 2; r < n; r++) {
                boolean found = false;
                // Проверяем все возможные j (средние элементы)
                for (int j = l + 1; j < r; j++) {
                    // Ищем a[i] + a[k] = 2 * a[j], где i < j < k
                    // Перебираем все k > j в подотрезке [l..r]
                    for (int k = j + 1; k <= r; k++) {
                        int needed = 2 * array[j] - array[k];
                        // Ищем needed среди элементов от l до j-1
                        for (int i = l; i < j; i++) {
                            if (array[i] == needed) {
                                found = true;
                                break;
                            }
                        }
                        if (found) break;
                    }
                    if (found) break;
                }
                if (found) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
