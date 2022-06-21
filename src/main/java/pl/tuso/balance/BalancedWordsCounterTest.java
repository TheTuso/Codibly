package pl.tuso.balance;

import org.junit.Assert;
import org.junit.Test;

public class BalancedWordsCounterTest {
    private final BalancedWordsCounter balancedWordsCounter = new BalancedWordsCounter();

    @Test
    public void testNormalInput() {
        Assert.assertEquals(28, this.balancedWordsCounter.count("aabbabcccba"));
    }

    @Test
    public void testEmptyInput() {
        Assert.assertEquals(0, this.balancedWordsCounter.count(""));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testOtherCharactersThanLetters() {
        this.balancedWordsCounter.count("abababa1");
    }

    @Test(expected = NullPointerException.class)
    public void testNullImput() {
        this.balancedWordsCounter.count(null);
    }
}
