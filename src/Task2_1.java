import java.util.Scanner;

public class Task2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arrayBranch = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arrayBranch[i][j] = scanner.nextInt();
            }
        }
        int q = scanner.nextInt();
        int[][] arrayQuery = new int[q][2];
        for (int i = 0; i < q; i++) {
            for (int j = 0; j < 2; j++) {
                arrayQuery[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < q; i++) {
                int t = arrayQuery[i][0];
                int d = arrayQuery[i][1];
                int a = arrayBranch[t-1][0];
                int b = arrayBranch[t-1][1];
                int result = timeUntilTrain(a,b,d);
                System.out.println(result);
        }

    }

    public static int timeUntilTrain(int start, int interval, int wait) {
        int time = start;
        while (time < wait) {
            time = time + interval ;
        }
        return time;

    }
}
