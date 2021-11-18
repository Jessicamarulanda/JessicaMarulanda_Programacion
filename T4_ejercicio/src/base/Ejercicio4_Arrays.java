package base;

import java.util.Scanner;

public class Ejercicio4_Arrays {
    public static void main (String [] args){
        Scanner entradaTeclado =  new Scanner(System.in);
        int respuesta = 0;
        int numeromax = -99999;
        int numeroMini = 99999;
        System.out.println("Intruduce la longitud deseada");
        respuesta = entradaTeclado.nextInt();
        int [] numerosLong = new int [respuesta];
        for (int i = 0; i < numerosLong.length; i++){
            System.out.println("Introduce el número a guardar");
            numerosLong[i]=entradaTeclado.nextInt();
            if (numerosLong[i]>numeromax){
                numeromax = numerosLong [i];
            }else if (numerosLong[i]<numeroMini){
                numeroMini = numerosLong [i];
            }
        }
        System.out.println("El numero maximo es :" + numeromax);
        System.out.println("El numero minimo es :" + numeroMini);


    }
}
