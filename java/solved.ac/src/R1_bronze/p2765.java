package R1_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2765 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tripCount = 1;

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double diameter = Double.parseDouble(st.nextToken());
            double revolutions = Double.parseDouble(st.nextToken());
            double timeInSeconds = Double.parseDouble(st.nextToken());

            if (revolutions == 0) break;

            double timeInHours = timeInSeconds / 3600;
            double distance = (diameter * Math.PI * revolutions) / 12 / 5280;
            double speed = distance / timeInHours;

            System.out.printf("Trip #%d: %.2f %.2f%n", tripCount++, distance, speed);
        }
    }
}
