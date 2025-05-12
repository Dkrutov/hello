import java.util.*;

public class Task3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Set<Integer> a = new HashSet<>();
        for (int num : arr) {
            while (num > 0 && a.contains(num)) {
                num /= 2;
            }
            a.add(num);
        }

        System.out.println(a.size());
    }

}
