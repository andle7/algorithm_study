package R2_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class p10866 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		Deque<Integer> deq = new LinkedList<>();
		
		for(int i = 0; i<N; i++) {
			
			String[] input = br.readLine().split(" "); 
			
			switch (input[0]) {
			
				case "push_front":
						deq.addFirst(Integer.parseInt(input[1]));
						break;
					
				case "push_back": 
						deq.addLast(Integer.parseInt(input[1]));
						break;
						
				case "pop_front":
						if(deq.isEmpty()) {
							System.out.println(-1);
						}else {
							System.out.println(deq.pollFirst());
						}
						break;
						
				case "pop_back":
						if(deq.isEmpty()) {
							System.out.println(-1);
						}else {
							System.out.println(deq.pollLast());
						}
						break;
						
				case "size":
						System.out.println(deq.size());
						break;
						
				case "empty":
						if(deq.isEmpty()) {
							System.out.println(1);
						}else {
							System.out.println(0);						
						}
						break;
					
				case "front":
						if(deq.isEmpty()) {
							System.out.println(-1);
						}else {
							System.out.println(deq.peekFirst());
						}
						break;
				case "back":
						if(deq.isEmpty()) {
							System.out.println(-1);
						}else {
							System.out.println(deq.peekLast());
						}
						break;
			}			
		}
		
	}
}
