package Personas;

public class Estudiante extends Persona{



    public Estudiante(String nombre){
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
        System.out.println("Soy el estudiante: "+nombre);
    }


}
