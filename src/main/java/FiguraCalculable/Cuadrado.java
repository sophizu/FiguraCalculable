package FiguraCalculable;

/**
 * Created with IntelliJ IDEA.
 * User: usuario1
 * Date: 8/08/13
 * Time: 10:30 AM
 * To change this template use File | Settings | File Templates.
 */
public class Cuadrado extends Figura {
    public double lado;
    private double area;
    @Override
    public double perimetro() {
        return (4 * lado);
    }

    @Override
    public double area() {
        return lado * lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
