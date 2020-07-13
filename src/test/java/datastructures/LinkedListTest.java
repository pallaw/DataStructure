package datastructures;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.*;


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

    @Test
    void indexOf_notFound_throwIllegalArgumentException() {
        assertEquals(-1, linkedList.indexOf(10));
    }

    @Test
    void indexOf_found_returnItem() {

        linkedList.addLast(10);
        linkedList.addLast(20);
        linkedList.addLast(30);
        linkedList.addLast(40);
        linkedList.addLast(50);

        assertEquals(0, linkedList.indexOf(10));
        assertEquals(2, linkedList.indexOf(30));
        assertEquals(4, linkedList.indexOf(50));

    }

    @Test
    void contains_found_returnTrue() {
        linkedList.addLast(10);
        assertTrue(linkedList.contains(10));
    }

    @Test
    void contains_notFound_returnFalse() {
        assertFalse(linkedList.contains(10));
    }
}
