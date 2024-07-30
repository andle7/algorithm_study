package R2_silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Arrays;

public class p1654 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		int[] arr = new int[K];
		for(int i = 0; i < K; i++)
			arr[i] = Integer.parseInt(br.readLine());
		
		Arrays.sort(arr);
		
		
		long right = arr[K-1];
		long left = 1;
		long cnt;
		long half;
		
		while(left<=right) {
			cnt = 0;
			half=(left+right)/2;
			
			
			for(int i = 0; i < K; i++)
				cnt += arr[i]/half;
			
			if(cnt < N)
				right = half - 1;
			else
				left = half + 1;
			
			
		}
		
 		System.out.println(right);
		
	}
}
