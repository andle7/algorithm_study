package R1_bronze;

import java.util.Scanner;

public class p3009 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = 0, y = 0;

        for (int i = 0; i < 3; i++) {
            x ^= in.nextInt();  // XOR 연산으로 중복 제거
            y ^= in.nextInt();  // XOR 연산으로 중복 제거
        }

        in.close();
        System.out.println(x + " " + y);
    }
}
