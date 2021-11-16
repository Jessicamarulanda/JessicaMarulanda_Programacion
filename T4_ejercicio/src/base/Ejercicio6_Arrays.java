package base;

import java.util.Scanner;

public class Ejercicio6_Arrays {
    public static void main (String [] args){
        Scanner entradaTeclado = new Scanner(System.in);
        int respuesta = 0;
        System.out.println("Introduce la longitud de las arrays");
        respuesta = entradaTeclado.nextInt();
        int[] array= new int[respuesta];
        for (int i = 0; i < array.length; i++){
            System.out.println("Introduce el valor del  array");
            array[i]= entradaTeclado.nextInt();
        }
        System.out.println("El orden sumandole una posición");
        for (int i = 0 ; i < array.length ; i++){
            if ( i == 0){
                System.out.printf(array[array.length-1]+ ", \t");
            }else{
            System.out.printf(array[i-1] + ", \t") ;
        }
            }

    }
}

