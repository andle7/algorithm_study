package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p10828_node {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        
        Stack stack = new Stack();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String input = st.nextToken();
            
            switch (input) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    stack.push(num);
                    break;
                
                case "pop":
                    sb.append(stack.pop()).append("\n");
                    break;
                    
                case "size":
                    sb.append(stack.size()).append("\n");
                    break;
                    
                case "empty":
                    sb.append(stack.empty()).append("\n");
                    break;
                    
                case "top":
                    sb.append(stack.peek()).append("\n");
                    break;
            }
        }
        
        br.close();
        System.out.print(sb.toString());
    }
}

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Stack {
    private Node top;
    
    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
    
    public int pop() {
        if (isEmpty()) {
            return -1;
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }
    
    public int size() {
        int count = 0;
        Node current = top;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
    
    public int empty() {
        return top == null ? 1 : 0;
    }
    
    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return top.data;
    }
    
    public boolean isEmpty() {
        return top == null;
    }
}