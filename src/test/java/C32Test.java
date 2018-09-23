import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class C32Test  {
    @Test
    public void mATest(){
        String param1="param1";
        String param2="param2";
        String expected_result="param1-param2";
        C32 c32_to_test = new C32();
        assertEquals(c32_to_test.mA(param1,param2),expected_result);
    }

}