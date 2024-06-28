package level_0;

import java.util.Scanner;

public class p대소문자_바꿔서_출력하기 {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        
        for(int i = 0; i < a.length(); i++){
          if(a.charAt(i) == a.toUpperCase().charAt(i)){
              System.out.print(a.toLowerCase().charAt(i));
          }else{
              System.out.print(a.toUpperCase().charAt(i));
          }
            
        }
    }
}
