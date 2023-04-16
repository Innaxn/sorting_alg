import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SorterUseCaseImplTest {


    @Test
    public void testSortMethodWithLargeArray() {
        int[] input = new int[] {100, 2, 33, 24, 50, 17, 60, 90, 80, 70};
        int[] expected = new int[] {2, 17, 24, 33, 50, 60, 70, 80, 90, 100};
        SorterUseCaseImpl.sort(input);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testSortMethodWithArrayOfLengthOne() {
        int[] input = new int[] {1};
        int[] expected = new int[] {1};
        SorterUseCaseImpl.sort(input);
        assertArrayEquals(expected, input);
    }


    @Test
    public void testUnhappyFlowWhenArrayIsEmpty() {

        int[] input = new int[] {};

        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () ->  SorterUseCaseImpl.sort(input)
        );

        assertEquals("Input array cannot be empty", thrown.getMessage());
    }


    @Test
    public void testMaxMethodWithArray() {
        int[] input = new int[] {100, 2, 33, 24, 50, 17, 60, 90, 80, 70};
        int expected = 0;
        int result = SorterUseCaseImpl.max(input, 0, input.length - 1);
        assertEquals(expected, result);
    }


    @Test
    public void testReverseMethodWithSmallArray() {
        int[] input = new int[] {1, 2, 3, 4, 5};
        int[] expected = new int[] {5, 4, 3, 2, 1};
        SorterUseCaseImpl.reverse(input, input.length - 1);
        assertArrayEquals(expected, input);
    }

    @Test
    public void testUnhappyFlowWhenArrayIsEmptyInReverse() {

        int[] input = new int[] {};

        IllegalArgumentException thrown = assertThrows(
                IllegalArgumentException.class,
                () ->  SorterUseCaseImpl.reverse(input, input.length-1)
        );

        assertEquals("Input array cannot be empty", thrown.getMessage());
    }

}