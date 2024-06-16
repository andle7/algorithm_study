package R1_bronze;

import java.util.Scanner;

public class p1110 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		int NN = -1;;
		
		int cnt = 0;
		
		int tmp = N;
	
		while(true) {
			
			if(N==NN)
			   break;
			
			NN = tmp%10*10 + (tmp/10+tmp%10)%10;
			cnt++;
			
			tmp = NN;
			
		}
		
		
		System.out.println(cnt);
		
		in.close();
	}
}
