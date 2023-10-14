package ru.netology.at;

import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldIfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        Assert.assertEquals(expected, actual);

    }


    @org.junit.Test
    public void shouldIfAmountIs1001() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;

        Assert.assertEquals(actual, expected);

    }

    @org.junit.Test
    public void shouldIfAmountIs999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;

        Assert.assertEquals(actual, expected);

    }

    @org.junit.Test
    public void shouldIfAmountIs0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        Assert.assertEquals(actual, expected);

    }

    @org.junit.Test
    public void shouldIfAmountIs1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;

        Assert.assertEquals(actual, expected);

    }

    @org.junit.Test
    public void shouldIfAmountIs450() {
        CashbackHackService service = new CashbackHackService();
        int amount = 450;
        int actual = service.remain(amount);
        int expected = 550;

        Assert.assertEquals(actual, expected);

    }

}