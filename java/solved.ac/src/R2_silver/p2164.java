package R2_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class p2164 {

	public static void main(String[] args) throws IOException {
		Queue<Integer> que = new LinkedList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		for (int i = 1; i < n + 1; i++) {
			que.offer(i);
		}

		for (int i = 1; i < n; i++) {
			que.poll();
			que.offer(que.poll());
		}

		System.out.println(que.peek());

		br.close();

	}

}
