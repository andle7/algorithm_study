package R1_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10870 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		System.out.println(fibonaci(N));
		
		
	}
	
	static int fibonaci(int N) {
		if(N == 0) 
			return 0;
		if(N == 1)
			return 1;
		
		return fibonaci(N - 1) + fibonaci(N -2);
	}

}
