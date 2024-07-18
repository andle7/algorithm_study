package R2_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class p1874_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        int last = 1;
        boolean possible = true;

        for (int i = 0; i < n; i++) {
            StringTokenizer token = new StringTokenizer(br.readLine());
            int input = Integer.parseInt(token.nextToken());

            if (input >= last) {
                for (int j = last; j <= input; j++) {
                    list.add(j);
                    sb.append('+').append('\n');
                }
                last = input + 1;
            }

            if (!list.isEmpty() && list.get(list.size() - 1) == input) {
                list.remove(list.size() - 1);
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

// ArrayList<>로 풀기
