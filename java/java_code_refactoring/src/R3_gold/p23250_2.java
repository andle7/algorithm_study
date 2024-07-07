package R3_gold;

import java.util.Scanner;

public class p23250_2 {

    private static int count = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        int K = in.nextInt();

        moveDisks(N, 1, 3, 2, K);
    }

    private static void moveDisks(int n, int from, int to, int tmp, int k) {
        if (n == 1) {
            count++;
            if (count == k) {
                System.out.println(from + " " + to);
            }
        } else {
            moveDisks(n - 1, from, tmp, to, k);
            count++;
            if (count == k) {
                System.out.println(from + " " + to);
                return;
            }
            moveDisks(n - 1, tmp, to, from, k);
        }
    }
}

// NumberFormat 런타임 에러가 왜 생기는지 모르겠음
// 안됨