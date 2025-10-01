package Personas;

public abstract class Persona {

    protected String nombre;

    protected Persona(String nombre){
        this.nombre = nombre;
    }


    public void presentarse(){
        System.out.println("Bienvenido");
    }
}


