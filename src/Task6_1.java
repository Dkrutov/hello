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

        //решение
        List<Integer> list = new ArrayList<>();
        for (int arr : array) {
            list.add(arr);
        }
        int maxMinus;
        int a ;
//        int b ;
        int sum = 0;

        while (list.size()>1) {
//            System.out.println(list);
            a = 0;
//            b = 0;
            maxMinus = 0;
            for (int i = 0; i <= list.size()-2; i++) {
//                System.out.println(2);
                int c = Math.abs(list.get(i)-list.get(i+1));
                if ( c > maxMinus) {
                    maxMinus = c;
                    a = i;
//                    b = i+1;
//                    System.out.println("a " + a);
//                    System.out.println("b " + b);

                }
            }
            list.remove(a);
            list.remove(a);
//            System.out.println(list);
            sum = sum + maxMinus;
        }

        System.out.println(sum);

    }

}
