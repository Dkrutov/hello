import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        // Считываем входные данные
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int[] floor = new int[n];
        for (int i = 0; i < n; i ++) {
            floor[i] = scanner.nextInt();
        }
        int nOut = scanner.nextInt();

        // Вычисляем
        if ((floor[nOut-1] - floor[0]) <= t || (floor[n-1]-floor[nOut-1]) <= t ) {
            System.out.println(floor[n-1]-floor[0]);
        } else {
            if ((floor[n-1] - floor[nOut-1]) <= (floor[nOut-1] - floor[0])) {
                System.out.println((floor[n-1]-floor[nOut-1]) + ((floor[n-1])-(floor[0])));
            } else {
                System.out.println((floor[nOut-1] - floor[0]) + floor[n-1]-floor[0]);
            }
        }
    }
}
