package R1_bronze;

import java.util.Scanner;
import java.math.BigInteger;

public class p30664 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		BigInteger a = in.nextBigInteger();
		while (a.compareTo(BigInteger.valueOf(0)) != 0) {
			if (a.remainder(BigInteger.valueOf(42)).compareTo(BigInteger.valueOf(0)) == 0) {
				System.out.println("PREMIADO");
			} else {
				System.out.println("TENTE NOVAMENTE");
			}
			a = in.nextBigInteger();
		}
		in.close();
	}
}