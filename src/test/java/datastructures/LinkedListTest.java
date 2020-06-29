package datastructures;

import datastructures.LinkedList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LinkedListTest {
    private LinkedList linkedList;

    @BeforeEach
    void setUp() {
        linkedList = new LinkedList();
    }

    @Test
    void addLast_empty_assignFirstAndLastNode() {

        int expectedValue = 10;

        linkedList.addLast(expectedValue);

        assertEquals(expectedValue, linkedList.getFirst());
        assertEquals(expectedValue, linkedList.getLast());
    }

    @Test
    void addLast_notEmpty_replaceLastNode() {
        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);

        int expectedLastValue = 40;
        linkedList.addLast(expectedLastValue);

        assertEquals(expectedLastValue, linkedList.getLast());
    }

    @Test
    void addFirst_empty_assignFirstAndLastValue() {
        int expectedValue = 10;

        linkedList.addFirst(expectedValue);

        assertEquals(expectedValue, linkedList.getFirst());
    }

    @Test
    void addFirst_NonEmpty_replaceFirstNode() {
        int expectedValue = 40;

        linkedList.addFirst(10);
        linkedList.addFirst(20);
        linkedList.addFirst(30);
        linkedList.addFirst(expectedValue);

        assertEquals(expectedValue, linkedList.getFirst());
    }
}
