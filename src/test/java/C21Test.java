public class C21Test {
    @Test
    public void prueba_m1(){
        C21 claseC21aprobar = new C21();
        assertEquals(claseC21aprobar.m1(),"response1");
    }
    @Test
    public void prueba_m2(){
        C21 claseC21aprobar = new C21();
        assertEquals(claseC21aprobar.m1(),"response2-C2");
    }
}
