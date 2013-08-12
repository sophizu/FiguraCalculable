package FiguraCalculable;

import junit.framework.Assert;

/**
 * Created with IntelliJ IDEA.
 * User: usuario1
 * Date: 11/08/13
 * Time: 09:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class CuadradoTest {
    @org.junit.Test
    public void testPerimetro() throws Exception {
        Cuadrado e= new Cuadrado();
        e.lado= 3.0;

        Assert.assertEquals(12.0,e.perimetro());


    }

    @org.junit.Test
    public void testArea() throws Exception {

        Cuadrado e =new Cuadrado();
        e.lado=3.0;

        Assert.assertEquals(9,e.area());


    }
}
