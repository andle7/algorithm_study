package que;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p10845_node {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Queue que = new Queue();
        int input = -1;

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":
                    input = Integer.parseInt(st.nextToken());
                    que.push(input);
                    break;

                case "pop":
                    sb.append(que.pop()).append("\n");
                    break;

                case "size":
                    sb.append(que.size()).append("\n");
                    break;

                case "empty":
                    sb.append(que.empty()).append("\n");
                    break;

                case "front":
                    sb.append(que.front()).append("\n");
                    break;

                case "back":
                    sb.append(que.back()).append("\n");
                    break;
            }
        }

        br.close();
        System.out.println(sb.toString());
    }
}

class Queue {
    private Node front;
    private Node rear;
    private int size;

    Queue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    void push(int data) {
        Node newNode = new Node(data);
        if (rear != null) {
            rear.next = newNode;
        }
        rear = newNode;
        if (front == null) {
            front = rear;
        }
        size++;
    }

    int pop() {
        if (front == null) {
            return -1;
        }
        int data = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return data;
    }

    int size() {
        return size;
    }

    int empty() {
        return (front == null) ? 1 : 0;
    }

    int front() {
        return (front == null) ? -1 : front.data;
    }

    int back() {
        return (rear == null) ? -1 : rear.data;
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

