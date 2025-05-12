import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task7_1 {
    static final int MOD = 998244353;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n-1];
        for (int i = 0; i < n-1; i++) {
            a[i] = sc.nextInt();
        }

        List<List<int[]>> factorPairs = new ArrayList<>();
        for (int num : a) {
            factorPairs.add(getFactorPairs(num));
        }

//        for (int i; i < factorPairs.size(); i++) {
//            System.out.println(factorPairs.get(i));
//        }






//            int totalSum = 712;
//            totalSum = totalSum % MOD;
//            System.out.println(totalSum);
        }
    static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    static List<int[]> getFactorPairs(int num) {
        List<int[]> pairs = new ArrayList<>();
        for (int p = 1; p <= num; p++) {
            if (num % p == 0) {
                int q = num / p;
                if (gcd(p, q) == 1) {
                    pairs.add(new int[]{p, q});
                }
            }
        }
        return pairs;
    }

    }

