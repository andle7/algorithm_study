package R3_gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1377 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N + 2];

        for (int i = 1; i <= N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        boolean changed = false;
        for (int i = 1; i <= N + 1; i++) {
            changed = false;
            for (int j = 1; j <= N - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    changed = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!changed) {
                System.out.println(i);
                break;
            }
        }
    }
}

// 시간초과
// 시간 복잡도 O(N^2)

/* 
public class Main {
    public static void main(String[] args) {
        int N = 5; 
        int[] arr = new int[N + 2];

       
        int[] hardcodedValues = {10, 1, 5, 2, 3};

       
        for (int i = 1; i <= N; i++) {
            arr[i] = hardcodedValues[i - 1];
        }

    
        boolean changed;
        for (int i = 1; i <= N + 1; i++) {
            changed = false;
            for (int j = 1; j <= N - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    changed = true;
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!changed) {
                System.out.println(i);
                break;
            }
        }
    }
}

*/