import java.util.Scanner;

public class Task4_2 {
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
                    int k = j + 1;
                    int i = j - 1;
                    int needed = 2 * array[j] - array[k];
                    if (needed == array[i]) {
                        found = true;
                        break;
                    }
                }
                if (found) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
