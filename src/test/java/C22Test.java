import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class C22Test {
    @Test
    public void testma(){
        C22 c22_a_probar = new C22();
        String param1="param1";
        String param2="param2";
        assertEquals(c22_a_probar.mA(param1, param2), "param1 param2");
    }
}
