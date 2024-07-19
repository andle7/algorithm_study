package R1_bronze;

import java.util.Scanner;

public class p2998 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        String st = in.next();
        in.close();
        
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
