package stringCahin.stringCahin;
import org.junit.Test;
import static org.junit.Assert.*;

public class BUnitTest {
    @Test
    public void testCWithStub() {
        // יוצרים סטאב של D
        CStub stub = new CStub();
        // יוצרים את C עם הסטאב
        B b = new B(stub);

        // קוראים ל־C — לא לסטאב!
        String result = b.process("B");

        // מאמתים את הפלט
        assertEquals("BE", result);
    }
}
