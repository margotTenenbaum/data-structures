package dataStructures;

public class Queue {
    private static class QNode {
        private int data;
        private QNode next;
        private QNode(int data) {
            this.data = data;
        }
    }

    private QNode head;
    private QNode tail;

    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void add(int data) {
        QNode newNode = new QNode(data);
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = newNode;
        }
    }
}