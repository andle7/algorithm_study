package R2_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p1427 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String st = br.readLine();
		int[] arr = new int[st.length()];
		
		for(int i=0; i<st.length(); i++) {
			arr[i] = Integer.parseInt(st.substring(i, i + 1));
		}
		
		for(int i = 0; i < st.length(); i++) {
			int Max = i;
			for(int j = i + 1; j < st.length(); j++) {
				if(arr[j] > arr[Max])
					Max = j;
			}
			if(arr[i] < arr[Max]) {
				int tmp = arr[i];
				arr[i] = arr[Max];
				arr[Max] = tmp;
			}
		}	
		
		for(int i = 0; i < st.length(); i++) {
			System.out.print(arr[i]);
		}
	}
}
