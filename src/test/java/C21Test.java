import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class C21Test {
    @Test
    public void prueba_m1(){
        C21 claseC21aprobar = new C21();
        assertEquals(claseC21aprobar.m1(),"response1-C2");
    }
    @Test
    public void prueba_m2(){
        C21 claseC21aprobar = new C21();
        assertEquals(claseC21aprobar.m2(),"response2-C2");
    }
}
