package Arraylist;

import java.util.ArrayList;

public class Ejercicio4 {
    public static void main(String[] args) {
        ArrayList <Integer> array1 = new ArrayList<>();
        ArrayList <Integer> array2 = new ArrayList<>();
        int iguales = 0;

        for (int i =  0 ;  i <= 20; i++){
            array1.add( (int) (Math.random()* 20 + 1));
            array2.add( (int) (Math.random()* 20 + 1));
        }
        for (int i = 0; i < array1.size(); i ++ ){
            if(array1.get(i) == array2.get(i)){
                iguales++;
            }
        }
        System.out.println("La cantidadd de numeros iguales es: " + iguales);
     }
}
