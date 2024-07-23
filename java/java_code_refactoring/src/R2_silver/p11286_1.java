package R2_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class p11286_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        
        PriorityQueue<Integer> que = new PriorityQueue<>((o1, o2) -> {
            int a = Math.abs(o1);
            int b = Math.abs(o2);
            if (a == b)
                return Integer.compare(o1, o2);
            return Integer.compare(a, b);
        });
        
        for (int i = 0; i < N; i++) {
            int req = Integer.parseInt(br.readLine());
            if (req == 0) {
                if (que.isEmpty()) {
                    sb.append("0\n");
                } else {
                    sb.append(que.poll()).append("\n");
                }
            } else {
                que.add(req);
            }
        }
        
        System.out.print(sb.toString());
    }
}

