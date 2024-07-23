package R2_silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class p2108 {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int[] number = new int[N];
        double sum = 0;
        
        for (int i = 0; i < N; i++) {
            number[i] = Integer.parseInt(br.readLine());
            sum += number[i];
        }
        
        Arrays.sort(number);
        
        System.out.println(Math.round(sum / N));
        
        System.out.println(number[N / 2]);
        
        int[] count = new int[4001];
        int maxCount = 0;
        for (int i = 0; i < N; i++) {
            int index = number[i] < 0 ? number[i] * (-1) + 4000 : number[i];
            count[index]++;
            if (count[index] > maxCount) {
                maxCount = count[index];
            }
        }

        ArrayList<Integer> modeList = new ArrayList<>();
        for (int i = 0; i < count.length; i++) {
            if (count[i] == maxCount) {
                if (i <= 4000) {
                    modeList.add(i);
                } else {
                    modeList.add((i - 4000) * (-1));
                }
            }
        }

        Collections.sort(modeList);
        
        if (modeList.size() == 1) {
            System.out.println(modeList.get(0));
        } else {
            System.out.println(modeList.get(1));
        }
        
        System.out.println(number[N - 1] - number[0]);
    }
}
