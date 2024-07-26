package R3_gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class p1377_1 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];

        for (int i = 0; i < N; i++) {
            arr[i][0] = Integer.parseInt(br.readLine());
            arr[i][1] = i;
        }

        Arrays.sort(arr, Comparator.comparingInt(o -> o[0]));

        int maxMove = 0;
        for (int i = 0; i < N; i++) {
            maxMove = Math.max(maxMove, arr[i][1] - i);
        }

        System.out.println(maxMove + 1);
    }
}

// 시간 복잡도 해결함.

// 시간 복잡도 O(1)

/*

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class p1377_1 {
    public static void main(String[] args) throws IOException {
 
        int N = 5;
        int[][] arr = new int[N][2];

   
        int[] hardcodedValues = {10, 1, 5, 2, 3};

        for (int i = 0; i < N; i++) {
            arr[i][0] = hardcodedValues[i];
            arr[i][1] = i;
        }

        Arrays.sort(arr, Comparator.comparingInt(o -> o[0]));

        int maxMove = 0;
        for (int i = 0; i < N; i++) {
            maxMove = Math.max(maxMove, arr[i][1] - i);
        }

        System.out.println(maxMove + 1);
    }
}


 */
