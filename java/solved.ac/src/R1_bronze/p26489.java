package R1_bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p26489{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String line;
        int result = 0;
        
        while((line = br.readLine()) != null) {	
            result += 1;
        }
        
        System.out.println(result);
    }    
}
