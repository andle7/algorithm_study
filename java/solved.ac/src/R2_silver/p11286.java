package R2_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class p11286 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> que = new PriorityQueue<>((o1, o2) -> {
			int a = Math.abs(o1);
			int b = Math.abs(o2);
			if(a == b)
				return o1 > o2 ? 1: -1;
			else
				return a - b;
		});
		for(int i = 0; i<N; i++) {
			int req = Integer.parseInt(br.readLine());
			if(req == 0) {
				if(que.isEmpty())
					System.out.println("0");
				else
					System.out.println(que.poll());
			} else {
				que.add(req);
			}
		}
	}
}
