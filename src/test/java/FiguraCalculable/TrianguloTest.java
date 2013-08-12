package FiguraCalculable;

import junit.framework.Assert;
import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: usuario1
 * Date: 11/08/13
 * Time: 09:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class TrianguloTest {
    @Test
    public void testPerimetro() throws Exception {
        Triangulo o= new Triangulo();

        o.lado1=2;
        o.lado2=3;
        o.lado3=5;

        Assert.assertEquals(10,o.perimetro());

    }

    @Test
    public void testArea() throws Exception {

        Triangulo o=new Triangulo();
        o.lado1=2;
        o.lado2=3;
        o.lado3=7;

        Assert.assertEquals(3,o.area());


    }
}
