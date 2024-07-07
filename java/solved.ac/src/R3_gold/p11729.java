package R3_gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p11729 {
    
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int totalMoves = (1 << n) - 1;
        System.out.println(totalMoves);
        
 
        moveDisks(n, 1, 3, 2);
        System.out.println(sb.toString());
        
    }

    private static void moveDisks(int n, int from, int to, int tmp) {
        if (n == 1) {
            sb.append(from).append(" ").append(to).append("\n");
        } else {
            moveDisks(n - 1, from, tmp, to);
            sb.append(from).append(" ").append(to).append("\n");
            moveDisks(n - 1, tmp, to, from);
        }
    }
}

