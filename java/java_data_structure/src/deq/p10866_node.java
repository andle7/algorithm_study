package deq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p10866_node {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque deq = new Deque();

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");

            switch (input[0]) {
                case "push_front":
                    deq.push_front(Integer.parseInt(input[1]));
                    break;
                case "push_back":
                    deq.push_back(Integer.parseInt(input[1]));
                    break;
                case "pop_front":
                    System.out.println(deq.pop_front());
                    break;
                case "pop_back":
                    System.out.println(deq.pop_back());
                    break;
                case "size":
                    System.out.println(deq.size());
                    break;
                case "empty":
                    System.out.println(deq.empty());
                    break;
                case "front":
                    System.out.println(deq.front());
                    break;
                case "back":
                    System.out.println(deq.back());
                    break;
            }
        }
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
