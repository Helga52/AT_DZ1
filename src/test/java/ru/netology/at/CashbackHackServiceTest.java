package ru.netology.at;

//import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void shouldIfAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void shouldIfAmountIs1001() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1001;
        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void shouldIfAmountIs999() {
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void shouldIfAmountIs0() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void shouldIfAmountIs1() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    public void shouldIfAmountIs450() {
        CashbackHackService service = new CashbackHackService();
        int amount = 450;
        int actual = service.remain(amount);
        int expected = 550;

        assertEquals(actual, expected);

    }

}