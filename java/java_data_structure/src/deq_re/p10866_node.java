package deq_re;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p10866_node {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        Deque deq = new Deque();

        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push_front":
                    deq.push_front(Integer.parseInt(st.nextToken()));
                    break;
                case "push_back":
                    deq.push_back(Integer.parseInt(st.nextToken()));
                    break;
                case "pop_front":
                    sb.append(deq.pop_front()).append("\n");
                    break;
                case "pop_back":
                    sb.append(deq.pop_back()).append("\n");
                    break;
                case "size":
                    sb.append(deq.size()).append("\n");
                    break;
                case "empty":
                    sb.append(deq.empty()).append("\n");
                    break;
                case "front":
                    sb.append(deq.front()).append("\n");
                    break;
                case "back":
                    sb.append(deq.back()).append("\n");
                    break;
            }
        }

        System.out.print(sb);
        br.close();
    }
}

class Deque {
    private Node front;
    private Node back;
    private int size;

    public Deque() {
        front = null;
        back = null;
        size = 0;
    }

    public void push_front(int value) {
        Node newNode = new Node(value);
        if (size == 0) {
            front = back = newNode;
        } else {
            newNode.next = front;
            front.prev = newNode;
            front = newNode;
        }
        size++;
    }

    public void push_back(int value) {
        Node newNode = new Node(value);
        if (size == 0) {
            front = back = newNode;
        } else {
            newNode.prev = back;
            back.next = newNode;
            back = newNode;
        }
        size++;
    }

    public int pop_front() {
        if (size == 0) {
            return -1;
        }
        int value = front.value;
        front = front.next;
        if (front != null) {
            front.prev = null;
        } else {
            back = null;
        }
        size--;
        return value;
    }

    public int pop_back() {
        if (size == 0) {
            return -1;
        }
        int value = back.value;
        back = back.prev;
        if (back != null) {
            back.next = null;
        } else {
            front = null;
        }
        size--;
        return value;
    }

    public int size() {
        return size;
    }

    public int empty() {
        return size == 0 ? 1 : 0;
    }

    public int front() {
        return size == 0 ? -1 : front.value;
    }

    public int back() {
        return size == 0 ? -1 : back.value;
    }
}

class Node {
    int value;
    Node next;
    Node prev;

    public Node(int value) {
        this.value = value;
    }
}

// C언어 스타일로 노드를 직접 이어주는 코드
// 알고리즘이 어떤지 알기 위해서는 이 방법대로 코드를 짤 수 있으면 좋을 수 있음.
