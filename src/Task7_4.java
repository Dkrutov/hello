import java.util.*;

public class Task7_4 {
    static final int MOD = 998244353;

    // Функция для нахождения всех делителей числа
    static List<Integer> getDivisors(int num) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i * i <= num; ++i) {
            if (num % i == 0) {
                divisors.add(i);
                if (i != num / i)
                    divisors.add(num / i);
            }
        }
        return divisors;
    }

    // Основной метод
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            a[i] = scanner.nextInt();
        }

        Map<Integer, List<int[]>>[] dp = new Map[n];
        for (int i = 0; i < n; i++) dp[i] = new HashMap<>();

        for (int b1 = 1; b1 <= 1000; b1++) {
            dp[0].computeIfAbsent(1, k -> new ArrayList<>()).add(new int[]{b1, b1});
        }

        for (int i = 1; i < n; i++) {
            for (Map.Entry<Integer, List<int[]>> entry : dp[i - 1].entrySet()) {
                int gcd = entry.getKey();
                for (int[] prev : entry.getValue()) {
                    int prod = prev[0], last = prev[1];

                    for (int d : getDivisors(a[i - 1])) {
                        int x = d, y = a[i - 1] / d;
                        if (gcd(x, y) != 1) continue;

                        int next = last * y;
                        if (next > 1000) continue;

                        int newGCD = gcd(gcd, next);
                        int newProd = (int)((1L * prod * next) % MOD);

                        dp[i].computeIfAbsent(newGCD, k -> new ArrayList<>()).add(new int[]{newProd, next});
                    }
                }
            }
        }

        long result = 0;
        if (dp[n - 1].containsKey(1)) {
            for (int[] pair : dp[n - 1].get(1)) {
                result = (result + pair[0]) % MOD;
            }
        }

        System.out.println(result);
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}