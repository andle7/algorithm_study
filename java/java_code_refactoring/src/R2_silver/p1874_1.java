package R2_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class p1874_1 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int last = 1;
        boolean possible = true;

        for (int i = 0; i < n; i++) {
        	StringTokenizer token = new StringTokenizer(br.readLine());
            int input = Integer.parseInt(token.nextToken());

            if (input >= last) {
               
                for (int j = last; j <= input; j++) {
                    st.push(j);
                    sb.append('+').append('\n');
                }
                last = input + 1;
            }

            if (!st.isEmpty() && st.peek() == input) {
                st.pop();
                sb.append('-').append('\n');
            } else {
             
                possible = false;
                break;
            }
        }

        if (possible) {
            System.out.println(sb.toString());
        } else {
            System.out.println("NO");
        }
    }
}

// 스택으로 풀기