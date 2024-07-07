package R3_gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class p1914 {

    private static int moveCount = 0;
    private static StringBuilder sb = new StringBuilder();
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        for (int i = n; i >= 1; i--) {
            stack1.push(i);
        }
        
        moveDisks(n, stack1, stack3, stack2, 1, 3, 2);
        
        System.out.println(moveCount);
        System.out.println(sb.toString());
    }
    
    private static void moveDisks(int n, Stack<Integer> from, Stack<Integer> to, Stack<Integer> tmp, int fromTower, int toTower, int tmpTower) {
        if (n == 1) {
            moveDisk(from, to, fromTower, toTower);
            return;
        }
        
        moveDisks(n - 1, from, tmp, to, fromTower, tmpTower, toTower);
        
        moveDisk(from, to, fromTower, toTower);
        
        moveDisks(n - 1, tmp, to, from, tmpTower, toTower, fromTower);
    }
    
    private static void moveDisk(Stack<Integer> from, Stack<Integer> to, int fromTower, int toTower) {
        int disk = from.pop();
        to.push(disk);
        moveCount++;
        sb.append(fromTower + " " + toTower + "\n");
    }
}


// 통과 안됨.
// 메모리 초과