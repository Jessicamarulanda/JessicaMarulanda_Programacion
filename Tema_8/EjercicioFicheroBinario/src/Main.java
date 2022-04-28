import controller.Binarioc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        String nombre,apellido,pass;
        Binarioc controller = new Binarioc();
        controller.agregarUsurio();
        controller.lecturaBiniario();
    }
}