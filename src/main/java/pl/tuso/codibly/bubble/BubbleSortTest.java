package pl.tuso.codibly.bubble;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class BubbleSortTest {
    private final BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void testIntegersSort() {
        Assert.assertEquals(Arrays.asList(1, 3, 4, 5, 6, 8,  8), this.bubbleSort.sort(Arrays.asList(1, 4, 5, 6, 8, 3, 8)));
    }

    @Test
    public void testDecimalSort() {
        Assert.assertEquals(Arrays.asList(-9.3, 0.1, 0.2, 4D, 5D, 9D), this.bubbleSort.sort(Arrays.asList(-9.3, 0.2, 4D, 0.1, 5D, 9D)));
    }

    @Test
    public void testEmptySort() {
        Assert.assertEquals(Arrays.asList(), this.bubbleSort.sort(Arrays.asList()));
    }

    @Test
    public void testNullElementSort() {
        Assert.assertEquals(Arrays.asList(5.0001), this.bubbleSort.sort(Arrays.asList(null, 5.0001)));
    }

    @Test(expected = RuntimeException.class)
    public void testNullSort() {
        this.bubbleSort.sort(null);
    }
}
