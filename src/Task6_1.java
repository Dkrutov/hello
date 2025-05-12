import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }


        List<Integer> list = new ArrayList<>();
        for (int arr : array) {
            list.add(arr);
        }
        int maxMinus;
        int a ;

        int sum = 0;

        while (list.size()>1) {

            a = 0;

            maxMinus = 0;
            for (int i = 0; i <= list.size()-2; i++) {
                int c = Math.abs(list.get(i)-list.get(i+1));
                if ( c > maxMinus) {
                    maxMinus = c;
                    a = i;


                }
            }
            list.remove(a);
            list.remove(a);
            sum = sum + maxMinus;
        }

        System.out.println(sum);

    }

}
