import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //количество учеников в шеренге.
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int min = Math.min(Math.min(a, b), c);
        int max = Math.max(Math.max(a, b), c);
        int mid = a + b + c - min - max;

        int count = 0;

        for (int i = 1; i < 100000; i++) {
            int sum = 0;
            sum = i * min + 1;
            if (sum <= n ) {
                count++;
            } else {
                break;
            }
        }

        for (int i = 1; i < 100000; i++) {
            int sum = 0;
            sum = i * max + 1;
            if (sum <= n ) {
                count++;
            } else {
                break;
            }
        }

        for (int i = 1; i < 100000; i++) {
            int sum = 0;
            sum = i * mid + 1;
            if (sum <= n ) {
                count++;
            } else {
                break;
            }
        }

        for (int i = 1; i < 100000; i++) {
            int sum = 0;
            sum = i * max + 1;
            if (sum <= n ) {
                count++;
            } else {
                for (int j = 1; j < 100000; j++) {
                    sum = j * mid + sum;
                    if (sum <= n ) {
                        count++;
                    } else {
                        for (int k = 1; k < 100000; k++) {
                            sum = k * min + sum;
                            if (sum <= n ) {
                                count++;
                            } else {
                                break;
                            }
                        }
                    }
                }
            }
        }

        for (int i = 1; i < 100000; i++) {
            int sum = 0;
            sum = i * max + 1;
            if (sum <= n ) {
                count++;
            } else {
                for (int j = 1; j < 100000; j++) {
                    sum = j * mid + sum;
                    if (sum <= n ) {
                        count++;
                    } else {
                        break;
                    }
                }
            }
        }

        for (int i = 1; i < 100000; i++) {
            int sum = 0;
            sum = i * max + 1;
            if (sum <= n ) {
                count++;
            } else {
                for (int j = 1; j < 100000; j++) {
                    sum = j * mid + sum;
                    if (sum <= n ) {
                        count++;
                    } else {
                        break;
                    }
                }
            }
        }




    }
}
