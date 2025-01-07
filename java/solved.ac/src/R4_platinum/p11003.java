package R4_platinum;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class p11003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        Deque<int[]> deque = new LinkedList<>();

        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(st.nextToken());

            while (!deque.isEmpty() && deque.getLast()[1] > value) {
                deque.pollLast();
            }
            deque.addLast(new int[]{i, value});

            if (deque.getFirst()[0] <= i - L) {
                deque.pollFirst();
            }

            bw.write(deque.getFirst()[1] + " ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
