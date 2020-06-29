package datastructures;

public class LinkedList {
    private Node first;
    private Node last;

    public void addLast(int value) {
        Node newNode = new Node(value);

        if (isEmpty()) {
            first = last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
    }

    private boolean isEmpty() {
        return null == first;
    }

    public int getLast() {
        return last.value;
    }

    public void addFirst(int item) {

        Node newNode = new Node(item);
        if (isEmpty()) {
            first = last = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
    }

    public int getFirst() {
        return first.value;
    }

    private class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

}
