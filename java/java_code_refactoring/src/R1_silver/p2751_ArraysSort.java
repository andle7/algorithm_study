package R1_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class p2751_ArraysSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(numbers);
        
        for (int num : numbers) {
            sb.append(num).append('\n');
        }
        
        System.out.print(sb);
    }
}


// 이렇게 만들면 속도가 많이 느림.