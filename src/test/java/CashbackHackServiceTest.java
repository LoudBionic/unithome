
import org.junit.jupiter.api.Test;
import ru.netology.service.CashbackHackService;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class CashbackHackServiceTest {

    @Test
    void ShouldReturnAmount() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;


        int actual = cashbackHackService.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);

    }

}
