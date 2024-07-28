package R1_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class p17288_1 {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        br.close();

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
