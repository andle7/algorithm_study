package level_0;

public class p공배수 {
	public int solution(int number, int n, int m) {
        int answer = 0;
        
        if(number % n == 0 && number % m == 0){
            answer = 1;
        }else{
            answer = 0;
        }
        
        
        return answer;
    }
}
