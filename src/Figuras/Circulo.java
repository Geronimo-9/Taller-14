package Figuras;

public class Circulo extends Figura{
    protected double pi;
    protected double radio;


    public Circulo(double radio){
        this.pi = 3.14;
        this.radio = radio;


    }

    @Override
    public double calcularArea() {
        return pi*Math.pow(radio,2);
    }

    @Override
    public void detalles() {
        System.out.println("Area del circulo: "+calcularArea());
    }

}
