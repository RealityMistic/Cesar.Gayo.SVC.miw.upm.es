import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class C11Test  {
    @Test
    public void m1Test() {
        C11 C11toTest = new C11();
        String response1tested = C11toTest.m1();
        assertEquals(response1tested, "response1");
    }
    @Test
    public void m2Test() {
        C11 C11toTest = new C11();
        String response2tested = C11toTest.m2();
       assertEquals(response2tested, "response2");
    }
}
