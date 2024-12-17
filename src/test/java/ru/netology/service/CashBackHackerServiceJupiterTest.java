package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CashBackHackerServiceJupiterTest {
    CashBackHackerService service = new CashBackHackerService();

    @Test
    public void remainLowerLimit() {
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);

        Assertions.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void remainUpLowerLimit() {
        int amount = 1;
        int expected = 999;
        int actual = service.remain(amount);

        Assertions.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void remainMiddleLimit() {
        int amount = 500;
        int expected = 500;
        int actual = service.remain(amount);

        Assertions.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void remainLowUpperLimit() {
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);

        Assertions.assertEquals(actual, expected);
    }

    @org.junit.Test
    public void remainUpperLimit() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        Assertions.assertEquals(actual, expected);
    }
}