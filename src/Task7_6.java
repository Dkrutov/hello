import java.util.Scanner;

public class Task7_6 {
    static final int MOD = 998244353;
    static int sum = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n-1];
        for (int i = 0; i < n-1; i++) {
            a[i] = scanner.nextInt();
        }

        generateB(n, a, new int[n], 0);
        System.out.println(sum);
    }

    static void generateB(int n, int[] a, int[] b, int pos) {
        if (pos == n) {
            if (check(b, a)) {
                long product = 1;
                for (int num : b) {
                    product = (product * num) % MOD;
                }
                sum = (sum + (int)product) % MOD;
            }
            return;
        }

        if (pos == 0) {
            for (int i = 1; i <= 1000; i++) {
                b[pos] = i;
                generateB(n, a, b, pos + 1);
            }
        } else {
            int num = a[pos-1];
            for (int p = 1; p <= num; p++) {
                if (num % p == 0) {
                    int q = num / p;
                    if (nod(p, q) == 1) {
                        generateB(n, a, b, pos + 1);
                    }
                }
            }
        }
    }

    static boolean check(int[] b, int[] a) {
        for (int i = 0; i < a.length; i++) {
            int g = nod(b[i], b[i+1]);
            int p = b[i] / g;
            int q = b[i+1] / g;
            if (p * q != a[i]) {
                return false;
            }
        }
        return true;
    }

    static int nod(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
