import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

    @Test
    void testEmptyArray() {
        Integer[] arr = new Integer[0];
        Integer[] sorted = BubbleSort.sort(arr);
        assertEquals(0, sorted.length);
    }

    @Test
    void testSingleElement() {
        Integer[] arr = {1};
        Integer[] sorted = BubbleSort.sort(arr);
        assertArrayEquals(new Integer[]{1}, sorted);
    }

    @Test
    void testSortedArray() {
        Integer[] arr = {1, 2, 3, 4, 5};
        Integer[] sorted = BubbleSort.sort(arr);
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, sorted);
    }

    @Test
    void testReverseArray() {
        Integer[] arr = {5, 4, 3, 2, 1};
        Integer[] sorted = BubbleSort.sort(arr); 
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, sorted);
    }

    @Test
    void testDuplicateElements() {
        Integer[] arr = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3};
        Integer[] sorted = BubbleSort.sort(arr);
        assertArrayEquals(new Integer[]{1, 1, 2, 3, 3, 4, 5, 5, 6, 9}, sorted);
    }

    @Test
    void testNullElements() {
        assertThrows(NullPointerException.class, () -> {
            BubbleSort.sort(null);
        });
    }

    @Test
    void testStrings() {
        String[] arr = {"banana", "apple", "cherry", "date"};
        String[] sorted = BubbleSort.sort(arr);
        assertArrayEquals(new String[]{"apple", "banana", "cherry", "date"}, sorted);
    }
}