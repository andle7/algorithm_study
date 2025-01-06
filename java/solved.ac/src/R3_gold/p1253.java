package R3_gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p1253 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int ans = 0;

        for (int i = 0; i < N; i++) {
            if (isGood(arr, i)) ans++;
        }

        System.out.println(ans);
        br.close();
    }

    private static boolean isGood(int[] arr, int targetIndex) {
        int target = arr[targetIndex];
        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (left == targetIndex) {
                left++;
                continue;
            }
            if (right == targetIndex) {
                right--;
                continue;
            }

            int sum = arr[left] + arr[right];

            if (sum == target) return true;
            if (sum < target) left++;
            else right--;
        }

        return false;
    }
}
