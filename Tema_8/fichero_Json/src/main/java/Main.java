import controller.JSONController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        JSONController controller = new JSONController();
        String nombre;
        int curso;
        //controller.pasarStringJSON();
        //controller.leerFicheroJSON();
       /* System.out.println("Ingrese el ciclo que desea ver");
        nombre = entradaTeclado.next();
        System.out.println("Ingrese el CURSO que desea ver");
         curso = entradaTeclado.nextInt();
        controller.leerAsignatura(nombre,curso);*/
        controller.lecturaJSONAPI();

    }

}
