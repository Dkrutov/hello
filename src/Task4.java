import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //количество чисел на бумажке
        int n = scanner.nextInt();
        //ограничение на число операций
        int k = scanner.nextInt();
        //чисела на бумажке
        int[] countList = new int[n];
        for (int i=0; i < n; i++) {
            countList[i] = scanner.nextInt();
        }

        //вычисление
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = countList[i] + sum;
        }
        int sumAfter = 0;


        //вывод



    }
}
