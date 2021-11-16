package base;

import java.util.Scanner;

public class Ejercicio5_Arrays {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        int respuesta = 0;
        System.out.println("Introduce la longitud de las arrays");
        respuesta = entradaTeclado.nextInt();
        int[] array1 = new int[respuesta];
        int[] array2 = new int[respuesta];
        int[] array3 = new int[respuesta];
        for (int i = 0; i < array1.length ; i ++) {
            System.out.println("Introduce el valor del primer array");
            array1 [i]= entradaTeclado.nextInt();
            System.out.println("Introduce el valor del segundo array");
            array2 [i]= entradaTeclado.nextInt();
        }
        for ( int i = 0 ; i < array1.length; i++) {
            array3[i]= array1[i] + array2[i];
            System.out.println( "El valor de el tercer array es en la pocición" + " " + i + ": " + array3[i]);
        }



    }
}
