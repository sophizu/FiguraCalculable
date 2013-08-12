package FiguraCalculable;

/**
 * Created with IntelliJ IDEA.
 * User: usuario1
 * Date: 8/08/13
 * Time: 10:29 AM
 * To change this template use File | Settings | File Templates.
 */
public class Circulo extends Figura {

    public double radio;
    private double perimetro;



    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    @Override
    public double perimetro() {
        return 3.1416 * (2 *radio);
    }

    @Override
    public double area() {
        return 3.1416 * (radio * radio);
    }
}
