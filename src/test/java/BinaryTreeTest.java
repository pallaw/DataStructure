import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    private BinaryTree binaryTree;

    @BeforeEach
    void setUp() {
        binaryTree = new BinaryTree();
    }

    @Test
    @DisplayName("When initialize")
    void initTest() {
        assertNotNull(binaryTree);
    }

    @AfterEach
    void tearDown() {
        binaryTree = null;
    }

    @Nested
    @DisplayName("When Insert")
    class Insert {

        @Test
        @DisplayName("first node")
        void insertFirstItem() {

            binaryTree.insert(10);

            assertEquals(1, binaryTree.size(), "Size should be 1 for 1st value");
            assertTrue(binaryTree.find(10), "Couldn't find the inserted value");
        }

        @Test
        @DisplayName("multiple nodes")
        void insertMultipleItem() {
            binaryTree.insert(10);
            binaryTree.insert(6);
            assertTrue(binaryTree.find(10), "Couldn't find the inserted value 10");
            assertTrue(binaryTree.find(6), "Couldn't find the inserted value 6");
            assertEquals(2, binaryTree.size(), "Size should be 1 for 1st value");
            assertEquals(1, binaryTree.height(), "Size should be 1 for 1st value");
        }

        @Test
        @DisplayName("multiple nodes")
        void insertItem() {

        }

    }
}