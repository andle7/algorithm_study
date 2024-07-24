package R1_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p27294 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int t = Integer.parseInt(st.nextToken());
		int s = Integer.parseInt(st.nextToken());

		if (s == 0 && 12 <= t && t <= 16) {
			System.out.println("320");
		} else {
			System.out.println("280");
		}
		
		br.close();
	}
}