package R3_gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class p1914_4 {
    
    private static BigInteger moveCount = BigInteger.ZERO;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        BigInteger totalMoves = (BigInteger.ONE.shiftLeft(n)).subtract(BigInteger.ONE);
        System.out.println(totalMoves);
        
        if (n <= 20) {
            moveDisks(n, 1, 3, 2);
        }
    }

    private static void moveDisks(int n, int from, int to, int tmp) {
        if (n == 1) {
            moveCount = moveCount.add(BigInteger.ONE);
            System.out.println(from + " " + to);
        } else {
            moveDisks(n - 1, from, tmp, to);
            moveCount = moveCount.add(BigInteger.ONE);
            System.out.println(from + " " + to);
            moveDisks(n - 1, tmp, to, from);
        }
    }
}

// 해결완료
// 드디어 됨.