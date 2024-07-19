package stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p10828_No_data_structure {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());

        int[] stack = new int[N];
        int top = -1;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            switch (input) {
                case "push":
                    stack[++top] = Integer.parseInt(st.nextToken());
                    break;

                case "pop":
                    if (top == -1) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(stack[top--]).append("\n");
                    }
                    break;

                case "size":
                    sb.append(top + 1).append("\n");
                    break;

                case "empty":
                    if (top == -1) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;

                case "top":
                    if (top == -1) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(stack[top]).append("\n");
                    }
                    break;
            }
        }

        br.close();
        System.out.println(sb.toString());
    }
}
