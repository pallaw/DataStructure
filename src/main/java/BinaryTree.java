public class BinaryTree {

    private Node root;

    public void insert(int nodeValue) {
        Node newNode = new Node(nodeValue);

        if (isEmpty()) {
            root = newNode;
            return;
        }

        Node current = root;

        while (true) {
            if (nodeValue < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = newNode;
                    break;
                }
                current = current.leftChild;
                continue;
            }

            if (nodeValue > current.value) {
                if (current.rightChild == null) {
                    current.rightChild = newNode;
                    break;
                }
                current = current.rightChild;
            }
        }

    }

    private boolean isEmpty() {
        return root == null;
    }

    public boolean find(int targetValue) {
        Node current = root;

        while (current != null) {
            if (targetValue < current.value) {
                current = current.leftChild;
            } else if (targetValue > current.value) {
                current = current.rightChild;
            } else {
                return true;
            }
        }
        return false;
    }

    private class Node {
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return "Node = " + value;
        }
    }

}
