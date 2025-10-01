package Personas;

public class Profesor extends Persona {

    public Profesor(String nombre){
        super(nombre);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void presentarse() {
        System.out.println("Soy el Mejor tutor del planeta: "+nombre);
    }



}
