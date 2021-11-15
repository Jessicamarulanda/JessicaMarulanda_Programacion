package base;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Ejecicio4 {
    public static void main (String [] args){
        int[] numeros = new int [20];
        int [] cuadrado  = new int [20];
        int [] cubo = new int [20];
        for (int i = 0;  i < numeros.length; i ++ ){
            numeros[i] = (int) (Math.random() * 100) + 1;
        }
        for (int i = 0 ; i < cuadrado.length; i ++){
            cuadrado [i] =(int)Math.pow(numeros[i],2);
        }
        for (int i = 0 ; i  < cubo.length; i++){
            cubo [i] =(int)Math.pow(numeros[i],3);
        }
        for (int i = 0; i < numeros.length; i++){
            System.out.printf("El numero aleatorio es %d \t El cuadrado es %d \t El cubo %d %n", numeros[i],cuadrado[i],cubo[i]);


        }
    }
}
