package FiguraCalculable;

import junit.framework.Assert;

/**
 * Created with IntelliJ IDEA.
 * User: usuario1
 * Date: 8/08/13
 * Time: 10:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class CirculoTest {

    public void testGetRadio() throws Exception {
     Circulo y=new Circulo();

    }


    public void testPerimetro() throws Exception {
        Circulo y=new Circulo();

         y.radio=3;
        Assert.assertEquals(18.84, y.perimetro());

    }

    public void testArea() throws Exception {
        Circulo y= new Circulo();
        y.radio=4;

        Assert.assertEquals(50.26,y.area());

    }
}
