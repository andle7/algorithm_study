package R1_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p11365_1 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringBuilder sb = new StringBuilder();

		while (true) {

			String input = br.readLine().trim();

			if (input.equals("END")) {
				break;
			}

			for (int i = input.length() - 1; i > -1; i--) {
				sb.append(input.charAt(i));
			}

			System.out.println(sb.toString());

			sb.setLength(0);
		}
	}
}
