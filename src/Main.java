
import Figuras.Circulo;
import Figuras.Figura;
import Figuras.Rectangulo;
import Personas.Estudiante;
import Personas.Jugador;
import Personas.Persona;
import Personas.Profesor;
import Vehiculos.Bicicleta;
import Vehiculos.Carro;
import Vehiculos.Vehiculo;


public class Main {
    public static void main(String[] args) {


        //Ejercicio 1, Clases hijas Circulo y Rectangulo que derivan de la clase base Figuras y realizan polimorfismo.
        Figura c1 = new Circulo(22);
        Figura r1 = new Rectangulo(23,2);

        System.out.println(c1.calcularArea());
        System.out.println(r1.calcularArea());


        //Ejercicio 2, Clase Estudiante y Profesor que Heredan de la Clase base Persona.
        Persona e1 = new Estudiante("Geronimo");
        Persona t1 = new Profesor("Jhon");


        e1.presentarse();
        t1.presentarse();


        //Ejercicio 3, mal uso de polimorfismo

        Persona p1 = new Jugador("Keiner");

        //p1.jugar();
        p1.presentarse();


        //Ejercicio 4, Clase Carro y Bicicleta que heredan el metodo de la Clase padre Vehiculo.


         Vehiculo Ford = new Carro();
         Vehiculo Bmx = new Bicicleta();

         Ford.mover();
         Bmx.mover();



    }
}