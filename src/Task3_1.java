import java.util.*;

public class Task3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        List<Integer> a = new ArrayList<>();
        for (int num : arr) {
            while (true) {
                if (!a.contains(num)) {
                    a.add(num);
                    if (num == 0) break;
                    num /= 2;
                } else {
                    break;
                }
            }
        }

        System.out.println(a.size());
    }
}
