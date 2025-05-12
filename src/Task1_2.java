import java.util.Scanner;

public class Task1_2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String originalString = scanner.nextLine();
            boolean foundPal = false;

            for (int j = 0; j < 4; j++) {
                String testString = "";
                for (int i = 0; i < 4; i++) {
                    if (i != j) {
                        testString += originalString.charAt(i);
                    }
                }

                boolean isPal = true;
                int left = 0;
                int right = 2;

                while (left < right) {
                    if (testString.charAt(left) != testString.charAt(right)) {
                        isPal = false;
                        break;
                    }
                    left++;
                    right--;
                }

                if (isPal) {
                    foundPal = true;
                    break;
                }
            }

            if (foundPal) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
}
