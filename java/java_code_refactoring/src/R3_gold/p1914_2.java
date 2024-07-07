package R3_gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class p1914_2 {
    
    private static int moveCount = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        System.out.println((1 << n) - 1);
        
        if (n <= 20) {
        	
            moveDisks(n, 1, 3, 2);
        }
    }

    private static void moveDisks(int n, int from, int to, int tmp) {
        Deque<Move> stack = new ArrayDeque<>();
        stack.push(new Move(n, from, to, tmp));

        while (!stack.isEmpty()) {
            Move move = stack.pop();
            n = move.n;
            from = move.from;
            to = move.to;
            tmp = move.tmp;

            if (n == 1) {
                moveCount++;
                System.out.println(from + " " + to);
            } else {
                stack.push(new Move(n - 1, tmp, to, from));
                stack.push(new Move(1, from, to, tmp));
                stack.push(new Move(n - 1, from, tmp, to));
            }
        }
    }

    static class Move {
        int n, from, to, tmp;

        Move(int n, int from, int to, int tmp) {
            this.n = n;
            this.from = from;
            this.to = to;
            this.tmp = tmp;
        }
    }
}

// 틀렸다고 나옴...