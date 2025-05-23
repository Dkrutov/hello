import java.util.Scanner;

public class Task4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int count = 0;

        for (int l = 0; l < n; l++) {
            for (int r = l + 2; r < n; r++) {
                boolean found = false;
                for (int j = l + 1; j < r; j++) {
                    for (int k = j + 1; k <= r; k++) {
                        int needed = 2 * array[j] - array[k];
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
