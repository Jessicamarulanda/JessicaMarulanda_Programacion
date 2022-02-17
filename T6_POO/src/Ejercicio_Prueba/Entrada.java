package Ejercicio_Prueba;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Concesionario  concesionario = new Concesionario();
      Deportivo deportivo = new Deportivo("15454","68764",254,64,2);
      concesionario.agregarCoche(deportivo);
      Suv suv = new Suv("14526b","57899",12,85,true);
      concesionario.agregarCoche(suv);
      suv.mostrarDatos();
      deportivo.mostrarDatos();
      concesionario.borrarCoche(suv);
      concesionario.clasificar();



    }
}
