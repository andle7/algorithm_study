package R3_gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1914_3 {
    
    private static long moveCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        System.out.println((1 << n) - 1);
        
        if (n <= 20) {
            moveDisks(n, 1, 3, 2);
        }
    }

    private static void moveDisks(int n, int from, int to, int tmp) {
        if (n == 1) {
            moveCount++;
            System.out.println(from + " " + to);
        } else {
            moveDisks(n - 1, from, tmp, to);
            moveCount++;
            System.out.println(from + " " + to);
            moveDisks(n - 1, tmp, to, from);
        }
    }
}


// 안됨.