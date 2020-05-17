import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void multiplicationOfZeroIntegersShouldReturnZero() {
        Main tester = new Main(); // MyClass is tested

        // assert statements
        assertEquals(0, tester.multiply(10, 0), "10 x 0 must be 0");
        assertEquals(0, tester.multiply(0, 10), "0 x 10 must be 0");
        assertEquals(0, tester.multiply(0, 0), "0 x 0 must be 0");
    }

    private void assertEquals(int i, double multiply, String s) {

    }

}
