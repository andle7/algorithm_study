package R2_silver;

import java.util.Scanner;

public class p11728 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        int M = in.nextInt();
        
        int[] A = new int[N];
        int[] B = new int[M];
        
        for (int i = 0; i < N; i++) {
            A[i] = in.nextInt();
        }
        
        for (int i = 0; i < M; i++) {
            B[i] = in.nextInt();
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
        for (int x = 0; x < C.length; x++) {
            System.out.print(C[x] + " ");
        }
        
        // 스캐너 닫기
        in.close();
    }
}


// 시간 초과
// java_code_refactoring 에 시간 초과 개선을 시킨 코드가 있음.