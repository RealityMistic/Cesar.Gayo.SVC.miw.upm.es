import org.junit.Test;

import static org.junit.Assert.*;

public class C52Test {
@Test
    public void mB_a_probar(){
        C52 c52_a_probar=new C52();
        String param1="param1";
        String param2="param2";
        String expected_result="param1*param2";
        assertEquals(expected_result, c52_a_probar.mB(param1, param2) );
    }
}