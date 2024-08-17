package R2_silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class p1966 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int numDocs = Integer.parseInt(st.nextToken());
            int targetIndex = Integer.parseInt(st.nextToken());
            
            LinkedList<int[]> queue = new LinkedList<>();
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b) -> b - a);

            st = new StringTokenizer(br.readLine());

            for (int i = 0; i < numDocs; i++) {
                int priority = Integer.parseInt(st.nextToken());
                queue.offer(new int[] { i, priority });
                priorityQueue.offer(priority);
            }

            int printCount = 0;
            
            while (!queue.isEmpty()) {
                
                int[] currentDoc = queue.poll();

                if (currentDoc[1] == priorityQueue.peek()) {
                    priorityQueue.poll();
                    printCount++;
                    if (currentDoc[0] == targetIndex) {
                        sb.append(printCount).append('\n');
                        break;
                    }
                } else {
                    queue.offer(currentDoc);
                }
            }
        }
        System.out.println(sb);
    }
}
