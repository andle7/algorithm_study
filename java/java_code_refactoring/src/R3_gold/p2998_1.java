package R3_gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p2998_1 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st = br.readLine();
        br.close();
        
        while (st.length() % 3 != 0) {
            st = "0" + st;
        }
        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < st.length(); i += 3) {
            int octalValue = (st.charAt(i) - '0') * 4 
                           + (st.charAt(i + 1) - '0') * 2 
                           + (st.charAt(i + 2) - '0');
            result.append(octalValue);
        }
        
        System.out.println(result);
    }
}
