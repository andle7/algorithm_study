package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class p10828 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine().trim());
		
		Stack<Integer> sk = new Stack<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String input = st.nextToken();
			switch(input) {
			    case "push":
			    	sk.add(Integer.parseInt(st.nextToken()));
			    	break;
			    
			    case "pop":
			    	if(sk.isEmpty()) {
			    		sb.append(-1).append("\n");
			    	}else {
			    		sb.append(sk.pop()).append("\n");
			    	}
			    	break;
			    	
			    case "size":
			    	sb.append(sk.size()).append("\n");
			    	break;
			    	
			    case "empty":
			    	if(sk.isEmpty()) {
			    		sb.append(1).append("\n");
			    	}else {
			    		sb.append(0).append("\n");
			    	}
			    	break;
			    	
			    case "top":
			    	if(sk.isEmpty()) {
			    		sb.append(-1).append("\n");
			    	}else {
			    		sb.append(sk.peek()).append("\n");
			    	}
			    	break;
			}
		}
		
		br.close();
		System.out.println(sb.toString());
	}
}
