import controller.ControllerBD;
import model.Alumno;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ControllerBD controllerBD = new ControllerBD();
        Scanner entradaTeclado = new Scanner(System.in);
        String nombre, apellido;
        int edad;
        int opcion = 0;
        System.out.println("1)Agregar ALUMNO");
        System.out.println("2)Modificar ALUMNO");
        System.out.println("3)Borrar ALUMNO");
        opcion = entradaTeclado.nextInt();
        switch (opcion){
            case 1:
                do {
                    System.out.println("Introduce el nombre del alumno");
                    nombre = entradaTeclado.next();
                    System.out.println("Introduce el Apellido del alumno");
                    apellido = entradaTeclado.next();
                    System.out.println("Introduce el Edad del alumno");
                    edad = entradaTeclado.nextInt();
                    Alumno alumno = new Alumno(nombre, apellido, edad);
                    controllerBD.insertarAlumno(alumno);
                    System.out.println("Desea guardar otro alumno 1(si)/0(no)");
                    opcion = entradaTeclado.nextInt();
                } while (opcion != 0);
                break;

            case 2:
                System.out.println("Introduce el nombre del alumno que desea modificar ");
                nombre = entradaTeclado.next();
                System.out.println("Introduce la edad del alumno que desea modificar");
                edad = entradaTeclado.nextInt();
                controllerBD.modificarAlumno(nombre,edad);
                break;

        }
    }
}
