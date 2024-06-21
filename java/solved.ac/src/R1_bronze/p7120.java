package R1_bronze;

import java.util.Scanner;

public class p7120 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String st = in.nextLine();
        String result = removeDuplicates(st);
        System.out.println(result);
    }
    
    public static String removeDuplicates(String str) {
        StringBuilder sb = new StringBuilder();
        char lastChar = '\0';
        
        for (char ch : str.toCharArray()) {
            if (ch != lastChar) {
                sb.append(ch);
                lastChar = ch;
            }
        }
        
        return sb.toString();
    }
}
