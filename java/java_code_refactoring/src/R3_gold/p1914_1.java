package R3_gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1914_1 {
    
    private static int moveCount = 0;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
         
        moveDisks(n, 1, 3, 2);
        
        System.out.println(moveCount);
        System.out.println(sb.toString());
    }

    private static void moveDisks(int n, int from, int to, int tmp) {
        if (n == 0) {
            return;
        }
        
        moveDisks(n - 1, from, tmp, to);
        
        sb.append(from).append(" ").append(to).append("\n");
        moveCount++;
        
        moveDisks(n - 1, tmp, to, from);
    }
}

// 통과 안됨
// 메모리 초과