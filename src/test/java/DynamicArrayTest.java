import DynamicArray.DynamicArray;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInstance;
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
    @ValueSource(ints = {0, 1, 3, 5,10})
    void insert_called_sizeShouldBeEqualToNumberOfItemInserted(int number) {

        for (int i = 1; i <= number; i++) {
            _dynamicArray.insert(i);
        }
        assertEquals(number, _dynamicArray.size());
    }

}
