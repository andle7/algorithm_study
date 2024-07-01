package R1_bronze;

import java.util.Scanner;

public class p30030 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int B = in.nextInt();
        
        double A = B / 1.1;
        
        long roundedA = Math.round(A);
        
        System.out.println(roundedA);
        
        in.close();
    }
}
