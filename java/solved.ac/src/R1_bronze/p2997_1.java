package R1_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class p2997_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[3];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(arr);
        
        int diff1 = arr[1] - arr[0];
        int diff2 = arr[2] - arr[1];
        
        System.out.println(diff1 == diff2 ? arr[2] + diff1 : (diff1 < diff2 ? arr[1] + diff1 : arr[0] + diff2));
    }
}
