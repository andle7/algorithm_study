package R1_silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class p11728_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] A = new int[N];
        int[] B = new int[M];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }
        
        // 두 배열을 병합하면서 정렬된 배열 C 생성
        int[] C = new int[N + M];
        int i = 0, j = 0, k = 0;
        
        while (i < N && j < M) {
            if (A[i] <= B[j]) {
                C[k++] = A[i++];
            } else {
                C[k++] = B[j++];
            }
        }
        
        // 남은 요소들 추가
        while (i < N) {
            C[k++] = A[i++];
        }
        
        while (j < M) {
            C[k++] = B[j++];
        }
        
        // 정렬된 배열 C 출력
        StringBuilder sb = new StringBuilder();
        for (int x = 0; x < C.length; x++) {
            sb.append(C[x]).append(" ");
        }
        
        System.out.println(sb.toString().trim());
        
        br.close();
    }
}
