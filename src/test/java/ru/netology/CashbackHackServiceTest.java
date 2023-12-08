
package ru.netology;

import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {


    @org.testng.annotations.Test
    void ShouldReturnAmount() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 2000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);

    }

    @org.testng.annotations.Test
    void ShouldReturnAmount2() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 800;
        int actual = cashbackHackService.remain(amount);
        int expected = 200;

        assertEquals(actual, expected);

    }


}
