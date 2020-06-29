package DynamicArray;

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
}
