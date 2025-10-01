package Personas;

public class Jugador extends Persona {

    public Jugador(String nombre){
        super(nombre);
    }


    public void jugar(){
        System.out.println(nombre+": Estoy listo, ¡A jugar >:D!");
    }

    @Override
    public void presentarse() {
        super.presentarse();
    } //Metodo que sobreescribe de manera innecesaria de la clase padre debido a que el comportamiento es el mismo.
}
