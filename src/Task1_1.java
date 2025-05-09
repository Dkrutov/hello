import java.util.Scanner;

public class Task1_1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        boolean b = false;

        for (int c = 0; c < 4; c++) {
            String d = "";
            for (int e = 0; e < 4; e++) {
                if (e != c) {
                    d += a.charAt(e);
                }
            }

            boolean f = true;
            for (int g = 0, h = 2; g < h; g++, h--) {
                if (d.charAt(g) != d.charAt(h)) {
                    f = false;
                    break;
                }
            }

            if (f) {
                b = true;
                break;
            }
        }

        System.out.println(b ? "YES" : "NO");
    }




}
