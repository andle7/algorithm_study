package R1_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class p10811_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        
        int[] arr = initializeArray(N);
        
        for (int k = 0; k < M; k++) {
            input = br.readLine().split(" ");
            int left = Integer.parseInt(input[0]) - 1;
            int right = Integer.parseInt(input[1]) - 1;
            
            reverseSubArray(arr, left, right);
        }
        
        br.close();
        
        // 배열을 문자열로 변환하여 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(" ");
            }
        }
        System.out.println(sb.toString());
    }
    
    // 배열 초기화
    private static int[] initializeArray(int N) {
        return IntStream.rangeClosed(1, N).toArray();
    }
    
    // 부분 배열을 뒤집는 함수
    private static void reverseSubArray(int[] arr, int left, int right) {
        while (left < right) {
            int tmp = arr[left];
            arr[left++] = arr[right];
            arr[right--] = tmp;
        }
    }
}

// 함수화 스트림 사용

