package R3_gold;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import java.io.IOException;

public class p17298 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			Integer num = Integer.parseInt(st.nextToken());
			arr[i] = num;
		}

		for (int i = 0; i < n; i++) {
			int cur = arr[i];
			for (int j = i; j < n; j++) {

				if (cur < arr[j]) {
					sb.append(arr[j]).append(" ");
					break;
				}

				if (j == n - 1) {
					sb.append(-1).append(" ");
				}

			}
		}

		System.out.println(sb);
	}
}