import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class C12Test  {
    @Test
    public void mATest(){
        C12 c12_to_test = new C12();
        String param1 = "param1";
        String param2 = "param2";
        String expected_result = "param1.param2";
        assertEquals(c12_to_test.mA(param1, param2),expected_result);
    }
}
