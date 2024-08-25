package R1_bronze;

import java.util.Scanner;
public class p28691 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String a = in.next();
		if(a.equals("M")) {
			System.out.println("MatKor");
		}else if(a.equals("W")) {
			System.out.println("WiCys");
		}else if(a.equals("C")) {
			System.out.println("CyKor");
		}else if(a.equals("A")) {
			System.out.println("AlKor");
		}else if(a.equals("$")) {
			System.out.println("$clear");
		}
		in.close();
	}
}