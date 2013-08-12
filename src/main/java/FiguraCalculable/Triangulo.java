package FiguraCalculable;

/**
 * Created with IntelliJ IDEA.
 * User: usuario1
 * Date: 8/08/13
 * Time: 10:29 AM
 * To change this template use File | Settings | File Templates.
 */
public class Triangulo extends Figura {

   private double base;
    private double altura;
    private double lado;
    double lado1;
    double lado2;
    double lado3;




    @Override
    public double perimetro() {
        return lado+lado+lado;


    }

    @Override
    public double area() {
        return (base * altura ) /2;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}
