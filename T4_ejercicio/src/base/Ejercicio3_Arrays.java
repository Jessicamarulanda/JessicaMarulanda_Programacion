package base;

import java.util.Scanner;

public class Ejercicio3_Arrays {
    public static void main (String []args){
        Scanner entradaTeclado = new Scanner (System.in);
        int [] numero = new int [5];
        int multiplicacion = 0;
        int suma = 0;
        double media = 0.0 ;
        for (int i = 0; i < numero.length; i++){
            System.out.println("Ingrese el valor a guardar");
            numero[i] = entradaTeclado.nextInt();
            numero[i] = numero[i] * 2;
            suma = suma + numero[i];
        }
        media = suma/ numero.length;
        System.out.println("La suma total es:" + suma);
        System.out.println("La media total es:" + media);

    }
}
