package R1_bronze;

import java.util.Scanner;
import java.util.Stack;

public class p17288 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        in.close();

        Stack<Character> stack = new Stack<>();
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(s.charAt(i));
            } else {
                if (s.charAt(i) - stack.peek() == 1) {
                    stack.push(s.charAt(i));
                } else {
                    if (stack.size() == 3) {
                        ans += 1;
                    }
                    stack.clear();
                    stack.push(s.charAt(i));
                }
            }
        }

        if (stack.size() == 3) {
            ans += 1;
        }

        System.out.println(ans);
    }
}
