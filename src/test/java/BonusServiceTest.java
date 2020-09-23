import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 100060;
        boolean registered = true;
        long expected = 30;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateNotRegisteredAndUnderLimit() {
        BonusService service = new BonusService();
        long amount = 100060;
        boolean registered = false;
        long expected = 10;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);

    }
    @org.junit.jupiter.api.Test
    void shouldCalculateRegisteredAndLimit() {
        BonusService service = new BonusService();
        long amount = 1000600;
        boolean registered = false;
        long expected = 100;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateRegisteredAndExpected() {
        BonusService service = new BonusService();
        long amount = 1000600;
        boolean registered = true;
        long expected = 300;

        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
}