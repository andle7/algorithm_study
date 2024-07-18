package R2_silver;

import java.util.Scanner;
import java.util.Stack;

public class p1874 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int last = 1;

        boolean possible = true;

        for (int i = 0; i < n; i++) {
            int input = in.nextInt();

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