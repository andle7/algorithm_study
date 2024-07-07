package R3_gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class p23250 {
    
    private static StringBuilder sb = new StringBuilder();
    private static List<String> moves = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        
        int totalMoves = (1 << N) - 1;
        
        moveDisks(N, 1, 3, 2);
        
        String[] movesArray = sb.toString().trim().split("\n");
        for (String move : movesArray) {
            moves.add(move);
        }
        
        int K = Integer.parseInt(input[1]);
       
        if (K >= 1 && K <= totalMoves) {
            String move = moves.get(K - 1);
            System.out.println(move);
        }
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

