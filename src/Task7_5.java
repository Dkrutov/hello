import java.util.Scanner;

public class Task7_5 {
    static final int MOD = 998244353;
    static int totalSum = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n-1];
        for (int i = 0; i < n-1; i++) {
            a[i] = sc.nextInt();
        }

        generateSequences(n, a, new int[n], 0);
        System.out.println(totalSum);
    }

    static void generateSequences(int n, int[] a, int[] b, int pos) {
        if (pos == n) {
            if (checkConditions(b, a)) {
                long product = 1;
                for (int num : b) {
                    product = (product * num) % MOD;
                }
                totalSum = (totalSum + (int)product) % MOD;
            }
            return;
        }

        if (pos == 0) {
            // Для первого элемента перебираем возможные значения
            for (int i = 1; i <= 1000; i++) {
                b[pos] = i;
                generateSequences(n, a, b, pos + 1);
            }
        } else {
            // Генерируем пары (p,q) для a[pos-1] на лету
            int num = a[pos-1];
            for (int p = 1; p <= num; p++) {
                if (num % p == 0) {
                    int q = num / p;
                    if (gcd(p, q) == 1) {
                        if (b[pos-1] % p == 0) {
                            b[pos] = b[pos-1] * q / p;
                            generateSequences(n, a, b, pos + 1);
                        }
                    }
                }
            }
        }
    }

    static boolean checkConditions(int[] b, int[] a) {
        for (int i = 0; i < a.length; i++) {
            int g = gcd(b[i], b[i+1]);
            int p = b[i] / g;
            int q = b[i+1] / g;
            if (p * q != a[i]) {
                return false;
            }
        }

        int overallGcd = b[0];
        for (int num : b) {
            overallGcd = gcd(overallGcd, num);
            if (overallGcd == 1) break;
        }
        return overallGcd == 1;
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
