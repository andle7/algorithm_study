package level_0;

public class p더_크게_합치기 {
	 public int solution(int a, int b) {
	        int answer = 0;
	        
	        if(Integer.parseInt(String.valueOf(a) + String.valueOf(b)) > Integer.parseInt(String.valueOf(b) + String.valueOf(a))){
	             answer = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
	        }else{
	            answer = Integer.parseInt(String.valueOf(b) + String.valueOf(a));
	        }
	       
	        
	        return answer;
	    }
}
