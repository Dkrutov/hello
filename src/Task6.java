import java.util.*;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //количество учеников в шеренге.
        int n = scanner.nextInt();
        //рост учеников
        int[] highStudent = new int[n];
        for (int i=0; i < n; i++) {
            highStudent[i] = scanner.nextInt();
        }

        //вычисление

        List<Integer> evenHighStudent = new ArrayList<>();
        List<Integer> oddHighStudent = new ArrayList<>();

        for (int i=0; i < n; i++) {
            int a = highStudent[i] % 2;
            int b = ((i + 1)) % 2;
            if (b == 1) {
                if (a == 0) {
                    oddHighStudent.add(i + 1);
                }
            } else if (b == 0) {
                if (a == 1) {
                    evenHighStudent.add(i + 1);
                }
            }
        }


        if (evenHighStudent.size() == 1 && oddHighStudent.size() == 1) {
            System.out.println(evenHighStudent.get(0) + " " + oddHighStudent.get(0));
        } else {
            System.out.println("-1 -1");
        }

        }
}


