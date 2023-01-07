package pl.tuso.codibly.balanced;

import org.junit.Assert;
import org.junit.Test;

public class BalancedWordsCounterTest {
    private final BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();

    @Test
    public void testNormalInput(){
        Assert.assertEquals(28, this.balancedWordsCounter.count("aabbabcccba"));
    }

    @Test
    public void testEmptyInput() {
        Assert.assertEquals(0, this.balancedWordsCounter.count(""));
    }

    @Test(expected = RuntimeException.class)
    public void testWrongInput() {
        this.balancedWordsCounter.count("abababa1");
    }

    @Test(expected = RuntimeException.class)
    public void testNullInput() {
        this.balancedWordsCounter.count(null);
    }
}
