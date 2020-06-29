package datastructures;

import datastructures.DynamicArray;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DynamicArrayTest {

    private DynamicArray _dynamicArray;

    @BeforeEach
    void setUp() {
        _dynamicArray = new DynamicArray(5);
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 3, 5, 10})
    void insert_called_sizeShouldBeEqualToNumberOfItemInserted(int number) {

        for (int i = 1; i <= number; i++) {
            _dynamicArray.insert(i);
        }
        assertEquals(number, _dynamicArray.size());
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 4000})
    void itemAt_indexNotFound_throwIllegalArgumentException(int index) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            _dynamicArray.itemAt(index);
        });
    }

    @Test
    void itemAt_indexFound_returnItem() {
        int expectedValue = 500;
        _dynamicArray.insert(expectedValue);
        assertEquals(expectedValue, _dynamicArray.itemAt(0));
    }

    @Nested
    class RemoveAt {

        @ParameterizedTest
        @ValueSource(ints = {-1, 4000})
        void remove_indexNotFound_throwItemNotFoundException(int index) {
            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                _dynamicArray.removeAt(index);
            });
        }

        @Test
        void remove_IndexFound_removeAndShiftItem() {

            int firstNumber = 50;
            int secondNumber = 60;
            int removedIndex = 0;

            _dynamicArray.insert(firstNumber);
            _dynamicArray.insert(secondNumber);
            _dynamicArray.removeAt(removedIndex);

            Assertions.assertThrows(IllegalArgumentException.class, () -> {
                _dynamicArray.itemAt(1);
            });
        }
    }
}
