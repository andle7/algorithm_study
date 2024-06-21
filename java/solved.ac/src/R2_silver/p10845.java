package R2_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class p10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> que = new LinkedList<>();
        int input = -1;

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":
                    input = Integer.parseInt(st.nextToken());
                    que.add(input);
                    break;

                case "pop":
                    sb.append(que.isEmpty() ? -1 : que.poll()).append("\n");
                    break;

                case "size":
                    sb.append(que.size()).append("\n");
                    break;

                case "empty":
                    sb.append(que.isEmpty() ? 1 : 0).append("\n");
                    break;

                case "front":
                    sb.append(que.isEmpty() ? -1 : que.peek()).append("\n");
                    break;

                case "back":
                    sb.append(que.isEmpty() ? -1 : input).append("\n");
                    break;
            }
        }

        br.close();
        System.out.println(sb.toString());
    }
}
