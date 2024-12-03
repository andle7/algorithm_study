package R1_bronze;

import java.time.LocalDateTime;
import java.time.Duration;
import java.util.Scanner;

public class p26307 {
    
    public static int correct(int HH, int MM) {
        LocalDateTime startTime = LocalDateTime.of(2022, 1, 1, 9, 0);

        LocalDateTime endTime = LocalDateTime.of(2022, 1, 1, HH, MM);

        Duration consumedTime = Duration.between(startTime, endTime);

        return (int) (consumedTime.getSeconds() / 60);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int HH = in.nextInt();
            int MM = in.nextInt();

            if (HH < 0 || HH > 23 || MM < 0 || MM > 59) {
                return;
            }

            int minutes = correct(HH, MM);
            System.out.println(minutes);
    }
}
