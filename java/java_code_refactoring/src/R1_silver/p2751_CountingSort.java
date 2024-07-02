package R1_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2751_CountingSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[2000001];
        
        for (int i = 0; i < N; i++) {
            arr[Integer.parseInt(br.readLine()) + 1000000]++;
        }
        
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] > 0) {
                sb.append(i - 1000000).append('\n');
                arr[i]--;
            }
        }
        
        System.out.print(sb);
    }
}

// 이렇게 CountingSort로 해야 빠름