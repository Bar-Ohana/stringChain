package stringCahin.stringCahin;
import org.junit.Test;
import static org.junit.Assert.*;

public class CUnitTest {
    @Test
    public void testCWithStub() {
        // יוצרים סטאב של D
        DStub stub = new DStub();
        // יוצרים את C עם הסטאב
        C c = new C(stub);

        // קוראים ל־C — לא לסטאב!
        String result = c.process("");

        // מאמתים את הפלט
        assertEquals("L", result);
    }
}