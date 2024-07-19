package stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class p10828_ArrayList {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        
        ArrayList<Integer> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            switch (input) {
                case "push":
                    list.add(Integer.parseInt(st.nextToken()));
                    break;
                
                case "pop":
                    if (list.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(list.remove(list.size() - 1)).append("\n");
                    }
                    break;
                    
                case "size":
                    sb.append(list.size()).append("\n");
                    break;
                    
                case "empty":
                    if (list.isEmpty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;
                    
                case "top":
                    if (list.isEmpty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(list.get(list.size() - 1)).append("\n");
                    }
                    break;
            }
        }
        
        br.close();
        System.out.println(sb.toString());
    }
}
