package R1_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class p28113 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int subway;
		
		if(n <= b && b == a) {
			System.out.println("Anything");
		}else if(n <= b && b - a > 0) {
			System.out.println("Bus");
		}else {
			System.out.println("Subway");
		}
		br.close();
	}
}
