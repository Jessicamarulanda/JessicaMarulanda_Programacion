package Arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Ejercicip2 {
    public static void main(String[] args) {
        ArrayList <Integer> listaNumeros = new ArrayList<>();
        int suma = 0;
        double media = 0.0;
        int maximo = 0;
        int minimo = 999999999;
        for (int i = 0 ; i <= 10; i++){
            listaNumeros.add((int) (Math.random() * 100 + 1));
        }
        for (int item : listaNumeros) {
            suma =  suma + item;
        }
        media = suma / listaNumeros.size();
        System.out.println("la suma de todos los números de el Arraylits es: " + suma);
        System.out.println("la media de todos los números de el Arraylits es: " + media);

        for (int i = 0; i < listaNumeros.size(); i++){
            if(listaNumeros.get(i) > maximo ){
                maximo = listaNumeros.get(i);
            }
            if (listaNumeros.get(i) < minimo){
                minimo = listaNumeros.get(i);
            }
        }
         System.out.println( Collections.max(listaNumeros));
        System.out.println( Collections.min(listaNumeros));
        System.out.println("El número máximo es: " + maximo);
         System.out.println("El número minimo es: " + minimo);

    }
}
