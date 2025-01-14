package R1_bronze;

import java.util.Scanner;

public class p32384 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < N; i++) {
            result.append("LoveisKoreaUniversity");
            if (i < N - 1) {
                result.append(" ");
            }
        }

        System.out.println(result);

        in.close();
    }
}
