package R1_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2711 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine().trim());
		
		String[][] arr = new String[N][2];
		
		for(int i = 0; i<N; i++) {
			String[] input = br.readLine().split(" ");
			arr[i][0] = input[0];
			arr[i][1] = input[1];
			
			int indexToRemove = Integer.parseInt(arr[i][0]) - 1;
		    arr[i][1] = arr[i][1].substring(0, indexToRemove) + arr[i][1].substring(indexToRemove + 1);             
			System.out.println(arr[i][1]);
		}	
		
		br.close();
	}
}
