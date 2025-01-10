package R1_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p32314_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        String[] adapter = br.readLine().split(" ");

        int w = Integer.parseInt(adapter[0]);
        int v = Integer.parseInt(adapter[1]);

        System.out.println(w / v >= a ? 1 : 0);
        
        br.close();
    }
}