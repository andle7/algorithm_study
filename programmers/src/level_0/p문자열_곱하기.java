package level_0;

public class p문자열_곱하기 {
	public String solution(String my_string, int k) {
        String answer = "";
        
        for(int i = 0; i<k; i++){
           answer += my_string;
        }
        
        return answer;
    }
}
