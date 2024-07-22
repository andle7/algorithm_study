package R3_gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class p25556_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        Stack<Integer>[] stacks = new Stack[] {
                new Stack<>(), new Stack<>(), new Stack<>(), new Stack<>()
        };

        boolean flag = true;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            boolean placed = false;

            for (Stack<Integer> stack : stacks) {
                if (stack.isEmpty() || stack.peek() <= num) {
                    stack.push(num);
                    placed = true;
                    break;
                }
            }

            if (!placed) {
                flag = false;
                break;
            }
        }

        System.out.println(flag ? "YES" : "NO");
    }
}

