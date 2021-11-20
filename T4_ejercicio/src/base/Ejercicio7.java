package base;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main (String[] args ) {
        Scanner entradaTeclado = new Scanner(System.in);
        String[] conjunto = new String[2];
        int aleatoria = 0;
        int respuesta = 0 ;
        for (int i = 0; i < conjunto.length; i++) {
            System.out.printf("Ingrese la palabra a guardar: %n");
         conjunto[i] = entradaTeclado.nextLine();
    }
        System.out.printf("MENÚ: %n 1: Ver todas las palabras %n 2:Obtener una palabra al azar %n 3:Ver número de letras %n 4:Ver media de letras %n 5 Palabras con más letras %n 6: Palabras con menos letras %n Ingrese la opción deseada %n");
        respuesta = entradaTeclado.nextInt();
        switch (respuesta){
            case 1 :
                System.out.println("Todas las palabras del array son:");
                  for (int i = 0; i< conjunto.length; i++){
                      System.out.println(conjunto[i]);
                  }
                break;
            case 2:
                aleatoria = (int) (Math.random() * conjunto.length) + 1 ;
                System.out.println(conjunto[aleatoria]);
                break;
                case 3:
                    int sumaLetras = 0;
                    for (String i:conjunto) {
                        sumaLetras = sumaLetras + i.length();
                    }
                    System.out.println(sumaLetras);
                    break;
            case 4 :
                break;
            default:
                System.out.println("otra");
                break;
        }






    }
}
