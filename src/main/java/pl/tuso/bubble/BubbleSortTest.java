package pl.tuso.bubble;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BubbleSortTest {
    private final BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void testSortNormal() {
        Assert.assertEquals(List.of(1, 3, 4, 5, 6, 8, 8), this.bubbleSort.sort(List.of(1, 4, 5, 6, 8, 3, 8)));
    }

    @Test
    public void testSortWithDecimal() {
        Assert.assertEquals(List.of(-9.3, 0.1, 0.2, 4, 5, 9), this.bubbleSort.sort(List.of(-9.3, 0.2, 4, 0.1, 5, 9)));
    }

    @Test
    public void testSortWithEmptyList() {
        Assert.assertEquals(List.of(), this.bubbleSort.sort(List.of()));
    }

    @Test
    public void testSortWithNullValue() {
        List list = new ArrayList(); // I didn't use List.of() here, because elements can't be null :(
        list.add(null);
        list.add(5.0001);
        Assert.assertEquals(List.of(5.0001), this.bubbleSort.sort(list));
    }

    @Test(expected = NullPointerException.class)
    public void testSortWithNullList() {
        this.bubbleSort.sort(null);
    }
}
