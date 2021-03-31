import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class SwapNumberTest {
    @Test
    void shouldReturnZeroForSortedArray() {
        SwapNumber swaps = new SwapNumber(new ArrayList<Integer>(Arrays.asList(1,2,3)));
        int numberOfSwaps = swaps.SwapNumbers();

        assertThat(numberOfSwaps, is(equalTo(0)));
    }

    @Test
    void shouldReturnOneIfThereIsOnlyOneSwap() {
        SwapNumber swaps = new SwapNumber(new ArrayList<Integer>(Arrays.asList(2,1,3)));
        int numberOfSwaps = swaps.SwapNumbers();

        assertThat(numberOfSwaps, is(equalTo(1)));
    }

    @Test
    void shouldReturnMinimumNumberOfSwapsForAnyArray() {
        SwapNumber swaps = new SwapNumber(new ArrayList<Integer>(Arrays.asList(7,1,3,2,4,5,6)));
        int numberOfSwaps = swaps.SwapNumbers();

        assertThat(numberOfSwaps, is(equalTo(5)));
    }
}
