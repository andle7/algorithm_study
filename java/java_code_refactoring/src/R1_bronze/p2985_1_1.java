package R1_bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class p2985_1_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] input = br.readLine().split(" ");
		int A = Integer.parseInt(input[0]);
		int B = Integer.parseInt(input[1]);
		int C = Integer.parseInt(input[2]);
		
		String[] operators = {"+", "-", "*", "/"};
		for (String op : operators) {
			if (calculate(A, B, op) == C) {
				System.out.println(A + op + B + "=" + C);
				return;
			}
			if (calculate(B, C, op) == A) {
				System.out.println(A + "=" + B + op + C);
				return;
			}
		}
	}

	public static int calculate(int x, int y, String op) {
		int result = 0;
		switch (op) {
			case "+": 
				result = x + y;
				break;
			case "-": 
				result = x - y;
				break;
			case "*": 
				result = x * y;
				break;
			case "/": 
				result =  y != 0 ? x / y : Integer.MAX_VALUE; 
				break;
		}
		return result;
	}
}
