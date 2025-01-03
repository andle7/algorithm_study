package R2_silver;

import java.util.Scanner;

public class p2622 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        
        int cnt = 0;
        for (int a = 1; a <= N / 3; a++) {
            for (int b = a; b <= (N - a) / 2; b++) {
                int c = N - a - b;
                if (b > c) break;
                if (a + b > c) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}

