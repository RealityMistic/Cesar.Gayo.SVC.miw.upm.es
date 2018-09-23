import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class C51Test {
    @Test
    public void prueba_m1(){
        C51 claseC51aprobar = new C51();
        assertEquals(claseC51aprobar.m1(),"response1-C51");
    }
    @Test
    public void prueba_m2(){
        C51 claseC51aprobar = new C51();
        assertEquals(claseC51aprobar.m2(),"response2-C51");
    }
}
