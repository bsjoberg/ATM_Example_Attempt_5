package nicebank;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MoneyTest {

    @Test
    public void testConstructorWithString() {
        Money money = new Money("$200.10");
        assertEquals(200, money.dollars());
        assertEquals(10, money.cents());
    }

    @Test
    public void addMoneyOver100Cents() {
        Money money = new Money(100, 0);
        assertEquals(new Money("$101.50"), money.add(new Money(0, 150)));
    }

    @Test
    public void addMoneyOver200Cents() {
        Money money = new Money(20, 0);
        assertEquals(new Money(22, 10), money.add(new Money(0, 210)));
    }

    @Test
    public void convertToString() {
        Money money = new Money(80, 10);
        assertEquals("$80.10", money.toString());
    }

    @Test
    public void twoMoneysEqual() {
        Money firstMoney = new Money("$83.45");
        Money secondMoney = new Money(83, 45);
        assertEquals(firstMoney, secondMoney);
    }

    @Test
    public void twoMoneysNotEqualCents() {
        Money firstMoney = new Money("12.55");
        Money secondMoney = new Money(12, 22);
        assertNotEquals(firstMoney, secondMoney);
    }

    @Test
    public void twoMoneysNotEqualsDollars() {
        Money firstMoney = new Money("13.12");
        Money secondMoney = new Money(12, 12);
        assertNotEquals(firstMoney, secondMoney);
    }

    @Test
    public void shouldNotBeEqualOneMoneyOneNot() {
        Money firstMoney = new Money("$20.12");
        String moneyString = "$20.12";
        assertNotEquals(firstMoney, moneyString);
    }
}