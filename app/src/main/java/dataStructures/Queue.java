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

    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        } else {
            return false;
        }
    }
}