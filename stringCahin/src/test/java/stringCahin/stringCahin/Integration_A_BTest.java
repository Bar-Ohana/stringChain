package stringCahin.stringCahin;
import org.junit.Test;
import static org.junit.Assert.*;

public class Integration_A_BTest {

    @Test
    public void testIntegration_AtoB_withCStub() {

        CStub cStub = new CStub();
        B realB   = new B(cStub);
        A realA   = new A(realB);

        // Act – הפעלת המערכת
        String result = realA.process("");


        assertEquals("HE", result);
    }

    @Test
    public void testIntegration_AtoB2_withCStub() {

        CStub cStub = new CStub();
        B realB   = new B(cStub);
        A realA   = new A(realB);

        // Act – הפעלת המערכת
        String result = realA.process("thank");


        assertEquals("thankHE", result);
    }
}