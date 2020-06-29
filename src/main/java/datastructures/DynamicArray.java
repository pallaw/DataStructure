package datastructures;

public class DynamicArray {

    private static final int DEFAULT_CAPACITY = 16;
    private int[] list;
    private int capacity;
    private int size;

    public DynamicArray(int capacity) {
        this.capacity = (capacity < 1) ? DEFAULT_CAPACITY : capacity;
        list = new int[capacity];
    }

    public DynamicArray() {
        this(DEFAULT_CAPACITY);
    }

    public int size() {
        return size;
    }

    public void insert(int value) {
        if (size == capacity) {
            capacity = capacity * 2;
        }

        int[] temp = list;
        list = new int[capacity];
        for (int i = 0; i < size; i++) {
            list[i] = temp[i];
        }

        list[size++] = value;
    }

    public void removeAt(int index) throws IllegalArgumentException {
        if (isIndexValid(index))
            throw new IllegalArgumentException("Index out of bound");

        for (int i = index; i < size; i++) {
            list[i] = list[i + 1];
        }

        size--;
    }

    public int itemAt(int index) throws IllegalArgumentException {
        if (isIndexValid(index))
            throw new IllegalArgumentException("Index out of bound");

        return list[index];
    }

    private boolean isIndexValid(int index) {
        return index < 0 || index >= size;
    }
}
