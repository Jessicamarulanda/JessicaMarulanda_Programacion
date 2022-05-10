import controller.JsonController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        JsonController controller = new JsonController();
        int resultado;
        String genero;
        System.out.println("Ingrese el número de Usuario");
        resultado = entradaTeclado.nextInt();
        System.out.println("Ingrese el genero");
        genero = entradaTeclado.next();
        controller.lecturaUser(resultado,genero);


    }
}
