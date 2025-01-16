package R1_bronze;

import java.util.Scanner;

public class p4714 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        while (true) {
            if (!in.hasNextDouble()) {
                break;
            }
            
            double earthWeight = in.nextDouble();
            
            if (earthWeight < 0) {
                break;
            }
            
            double moonWeight = earthWeight * 0.167;
            
            System.out.printf(
                "Objects weighing %.2f on Earth will weigh %.2f on the moon.%n",
                earthWeight, moonWeight
            );
        }
        
        in.close();
    }
}
