
package ru.netology;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {


    @org.junit.Test
    public void ShouldReturnAmountJunit() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 2000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(expected,actual);

    }

    @org.junit.Test
    public void ShouldReturnAmountJunit2() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 700;
        int actual = cashbackHackService.remain(amount);
        int expected = 300;

        assertEquals(expected, actual);

    }


}
