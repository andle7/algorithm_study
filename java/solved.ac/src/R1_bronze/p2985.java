package R1_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2985 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		int A = Integer.parseInt(input[0]);
		int B = Integer.parseInt(input[1]);
		int C = Integer.parseInt(input[2]);
		
		if(A+B == C) {
			System.out.println(A+"+"+B+"="+C);
		}else if(B+C == A) {
			System.out.println(A+"="+B+"+"+C);
		}else if(A-B == C) {
			System.out.println(A+"-"+B+"="+C);
		}else if(B-C == A) {
			System.out.println(A+"="+B+"-"+C);
		}else if(A*B == C) {
			System.out.println(A+"*"+B+"="+C);
		}else if(B*C == A) {
			System.out.println(A+"="+B+"*"+C);			
		}else if(A/B == C) {
			System.out.println(A+"/"+B+"="+C);
		}else if(B/C == A) {
			System.out.println(A+"="+B+"/"+C);
		}
	}
}