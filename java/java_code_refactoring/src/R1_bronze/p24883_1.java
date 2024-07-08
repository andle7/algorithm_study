package R1_bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class p24883_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		switch(input) {
			case "N":
			    System.out.println("Naver D2");
			    break;
			case "n":
				System.out.println("Naver D2");
				break;
			default :
				System.out.println("Naver Whale");
				break;
		}
	}
}
