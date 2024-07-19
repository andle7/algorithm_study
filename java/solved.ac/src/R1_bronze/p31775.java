package R1_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p31775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
        boolean k = false;
        boolean l = false;
        boolean p = false;
        
        String[] input = new String[3];
        for(int i = 0; i<3; i++) {
            input[i] = br.readLine();
           
            if (input[i].startsWith("k")) k = true;
            if (input[i].startsWith("l")) l = true;
            if (input[i].startsWith("p")) p = true;
        }
        
        if (k && l && p) {
        	System.out.println("GLOBAL");
        } else {
        	System.out.println("PONIX");
        }
    }
}
