package Figuras;

public class Rectangulo extends Figura{


    protected double largo;
    protected double ancho;


    public Rectangulo(double largo,double ancho){
        setAncho(ancho);
        setLargo(largo);
    }



    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        if(largo >= 0){
            this.largo = largo;
        }
    }


    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        if(ancho >= 0){
            this.ancho = ancho;
        }
    }


    @Override
    public double calcularArea() {
        return largo*ancho;
    }

    @Override
    public void detalles() {
        System.out.println("Area del rectangulo: "+calcularArea());
    }




}
