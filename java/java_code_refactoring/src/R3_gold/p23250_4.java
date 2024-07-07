package R3_gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p23250_4 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        long K = Long.parseLong(input[1]);

        long totalMoves = (1L << N) - 1;
        moveDisk(N, 1, 3, 2, K, totalMoves);
    }

    private static void moveDisk(int n, int from, int to, int tmp, long k, long totalMoves) {
        if (k <= 0) return;

        if (n == 1) {
            if (k <= totalMoves) {
                System.out.println(from + " " + to);
            }
            return;
        }

        long movesMinus = (1L << (n - 1)) - 1;
        if (k <= movesMinus) {
            moveDisk(n - 1, from, tmp, to, k, movesMinus);
        } else {
            long kremainMoves = k - movesMinus;
            if (kremainMoves == 1) {
                System.out.println(from + " " + to);
                return;
            }
            moveDisk(n - 1, tmp, to, from, kremainMoves - 1, movesMinus);
        }
    }
}
