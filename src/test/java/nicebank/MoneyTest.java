package nicebank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoneyTest {

    @Test
    public void testConstructorWithString() {
        Money money = new Money("$200.10");
        assertEquals(200, money.dollars());
        assertEquals(10, money.cents());
    }
}
