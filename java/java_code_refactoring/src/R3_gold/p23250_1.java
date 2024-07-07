package R3_gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p23250_1 {

    private static int count = 0;

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

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