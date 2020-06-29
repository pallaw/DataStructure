public class BinaryTree {

    private Node root;
    private int size;

    public void insert(int nodeValue) {
        Node newNode = new Node(nodeValue);

        if (isEmpty()) {
            root = newNode;
            incrementSize();
            return;
        }

        Node current = root;

        while (true) {
            if (nodeValue < current.value) {
                if (current.leftChild == null) {
                    current.leftChild = newNode;
                    incrementSize();
                    break;
                }
                current = current.leftChild;
                continue;
            }

            if (nodeValue > current.value) {
                if (current.rightChild == null) {
                    current.rightChild = newNode;
                    incrementSize();
                    break;
                }
                current = current.rightChild;
            }
        }

    }

    private void incrementSize() {
        size++;
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

    public void traversPreOrder() {
        traversPreOrder(root);
    }

    private void traversPreOrder(Node root) {
        if (root == null)
            return;

        System.out.print(root.value + ", ");
        traversPreOrder(root.leftChild);
        traversPreOrder(root.rightChild);
    }

    public void traversInOrder() {
        traversInOrder(root);
    }

    private void traversInOrder(Node root) {
        if (root == null)
            return;

        traversInOrder(root.leftChild);
        System.out.print(root.value + ", ");
        traversInOrder(root.rightChild);
    }

    public void traversPostOrder() {
        traversPostOrder(root);
    }

    private void traversPostOrder(Node root) {
        if (root == null)
            return;

        traversPostOrder(root.leftChild);
        traversPostOrder(root.rightChild);
        System.out.print(root.value + ", ");
    }

    public int height() {
        return height(root);
    }

    private int height(Node root) {
        if (root == null)
            return -1;

        if (null == root.leftChild && null == root.rightChild)
            return 0;

        return 1 + Math.max(height(root.leftChild), height(root.rightChild));
    }

    @Override
    public String toString() {
        return root.toString();
    }

    public int size() {
        return size;
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
            return String.valueOf(value);
        }
    }

}
