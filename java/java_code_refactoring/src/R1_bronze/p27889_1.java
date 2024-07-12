package R1_bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class p27889_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		switch(input) {
			case "NLCS":
				System.out.println("North London Collegiate School");
				break;
			case "BHA":
				System.out.println("Branksome Hall Asia");
				break;
			case "KIS":
				System.out.println("Korea International School");
				break;
			case "SJA":
				System.out.println("St. Johnsbury Academy");
				break;
		}	
	}
}
