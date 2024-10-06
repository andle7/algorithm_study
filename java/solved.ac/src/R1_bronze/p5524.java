package R1_bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p5524 {
    public static void main(String[] args) throws Exception {
    	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          int n = Integer.parseInt(br.readLine());
          StringBuilder sb = new StringBuilder();
          
          while (n-->0) {
              String cur = br.readLine();
              sb.append(cur.toLowerCase()).append('\n');
          }
          
          System.out.print(sb);
    }
}