package R1_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10101 {
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 세 번의 readLine()을 통해 각도를 읽어들임
		int A = Integer.parseInt(br.readLine().trim());
		int B = Integer.parseInt(br.readLine().trim());
		int C = Integer.parseInt(br.readLine().trim());
		
		int sum = A + B + C;
		
		if(sum != 180) {
			System.out.println("Error");
		} else {
			if(A == B && B == C) {
				System.out.println("Equilateral");
			} else if(A == B || B == C || A == C) {
				System.out.println("Isosceles");
			} else {
				System.out.println("Scalene");
			}
		}
	}
}
