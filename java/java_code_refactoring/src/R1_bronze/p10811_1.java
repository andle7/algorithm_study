package R1_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10811_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        
        int[] arr = new int[N];
        
        for(int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        
        for(int k = 0; k < M; k++) {
            input = br.readLine().split(" ");
            int left = Integer.parseInt(input[0]) - 1;
            int right = Integer.parseInt(input[1]) - 1;
            
            while(left < right) {
                int tmp = arr[left];
                arr[left++] = arr[right];
                arr[right--] = tmp;
            }
        }
        
        br.close();
       
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(arr[i]);
            sb.append(" ");
        }
        
        sb.setLength(sb.length() - 1);
        
        System.out.println(sb.toString());
    }
}

// StringBuilder 사용