package Daily;

import java.util.LinkedList;
import java.util.List;

/**
 * @program:IntelliJ IDEA
 * @Description
 * @Author:Matinal
 * @Date:2021-07-22 17:20
 */

public class MyStack {
    Node cur;
    class Node{
        private int val;
        private Node next;
        public Node(int val) {
            this.val = val;
        }
    }
    public void push(int v){
        Node node = new Node(v);
        if(this.cur == null){
            this.cur = node;
        }
        node.next = this.cur;
        this.cur = node;
    }
    public int pop() {
        if(isEmpty()){
            throw new RuntimeException("栈为空！");
        }
        int data = this.cur.val;
        this.cur = cur.next;
        return data;
    }
    public int peek() {
        if(isEmpty()){
            throw new RuntimeException("栈为空！");
        }
        return this.cur.val;
    }
    public boolean isEmpty() {
        return cur == null;
    }
    public int size() {
        int size = 0;
        Node head = cur;
        if(head == null){
            return size;
        }
        while(head != null){
            size++;
            head = head.next;
        }
        return size;
    }

    public static void main(String[] args) {
        List<List<Integer>> list = new LinkedList();
    }
}
