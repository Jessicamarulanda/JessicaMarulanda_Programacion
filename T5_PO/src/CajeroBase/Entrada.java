package CajeroBase;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        int respuesta = 0;
    Banco banco = new Banco("Santander","1548797k",5);
    Banco banco2 = new Banco("BBVA","797896546Y",10);
    do{
        System.out.println("Introduce el banco que desea operar");
        System.out.println("1) BBVA");
        System.out.println("2) Santander");
        System.out.println("3) Salir");
        respuesta = entradaTeclado.nextInt();
        switch (respuesta)
        {
            case 1 :
                 
                break;

        }
    }while(respuesta != 3 );
    }
}
