package R2_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1874_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        int current = 1;
        int[] stack = new int[n];
        int top = -1;
        boolean possible = true;

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(br.readLine());

            if (input >= current) {
                while (current <= input) {
                    stack[++top] = current++;
                    sb.append('+').append('\n');
                }
                stack[top--] = 0;
                sb.append('-').append('\n');
            } else {
                if (stack[top] == input) {
                    stack[top--] = 0;
                    sb.append('-').append('\n');
                } else {
                    possible = false;
                    break;
                }
            }
        }

        if (possible) {
            System.out.println(sb.toString());
        } else {
            System.out.println("NO");
        }
    }
}

// 자료구조 없이 풀기
