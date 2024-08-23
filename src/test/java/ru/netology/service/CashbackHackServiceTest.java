package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void ifPurchaseBelowCondition() {

        int actual = service.remain(-500);
        int expected = 1_500;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ifPurchaseIsInCondition() {

        int actual = service.remain(1_400);
        int expected = 600;

        Assert.assertEquals(actual,expected);
    }
    @Test
    public void ifPurchaseZero() {

        int actual = service.remain(0);
        int expected = 1_000;

        Assert.assertEquals(actual, expected);
    }
    @Test
    public void ifPurchaseEqualCondition() {

        int actual = service.remain(1_000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }
}