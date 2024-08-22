package R1_bronze;

import java.util.Scanner;

public class p28444 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int h = in.nextInt();
        int i = in.nextInt();
        int a = in.nextInt();
        int r = in.nextInt();
        int c = in.nextInt();
        
        System.out.println(h * i - a * r * c);
        
        in.close();
    }
}
