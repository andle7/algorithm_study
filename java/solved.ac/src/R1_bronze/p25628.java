package R1_bronze;

import java.util.Scanner;

public class p25628 {    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(Math.max(0, Math.min(a / 2, b)));
        
        in.close();
    }
}
