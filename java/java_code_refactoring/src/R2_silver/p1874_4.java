package R2_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class p1874_4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(st.nextToken());
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken());
			list.add(num);
		}

		int point = 0;
		int prev = 0;
		boolean flag = true;
		for (int i = 0; i < n; i++) {
			int cur = list.get(i);

			if (point < cur) {
				for (int j = point; j < cur; j++) {
					sb.append("+").append("\n");
				}
				sb.append("-").append("\n");
				point = cur;
			} else {
				if (prev > cur) {
					sb.append("-").append("\n");

				} else {

					
					flag = false;
					break;
				}
			}

			prev = cur;
		}

		System.out.print(flag ? sb : "NO");

	}
}

// 현규형 코드 왜 안되는지?!
