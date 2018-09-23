import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class C31Test  {
    @Test
    public void m1Test(){
        C31 c31_to_test = new C31();
        int testparam1, testparam2;
        testparam1 = 5;
        testparam2 = 3;
        assertEquals(c31_to_test.m1(testparam1, testparam2), 15);
        }
    @Test
    public void m2Test(){
        C31 c31_to_test = new C31();
        float testparam1, testparam2;
        testparam1 = 5.2f;
        testparam2 = 3;
        float expected_float =15.6f;
        assertEquals(c31_to_test.m2(testparam1, testparam2), expected_float, 0.002f);
    }
}