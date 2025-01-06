package R2_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p1697 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        if (N == K) {
            System.out.println(0);
            return;
        }

        int[] count = new int[100001];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(N);
        count[N] = 1;

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            for (int next : new int[]{curr - 1, curr + 1, curr * 2}) {
                if (next == K) {
                    System.out.println(count[curr]);
                    return;
                }
                if (next >= 0 && next < count.length && count[next] == 0) {
                    queue.add(next);
                    count[next] = count[curr] + 1;
                }
            }
        }
    }
}

