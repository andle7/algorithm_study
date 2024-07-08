package R1_bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class p8370 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int n1 = Integer.parseInt(input[0]);
		int k1 = Integer.parseInt(input[1]);
		int n2 = Integer.parseInt(input[2]);
		int k2 = Integer.parseInt(input[3]);
		
		System.out.println(n1*k1 + n2*k2);

	}
}
