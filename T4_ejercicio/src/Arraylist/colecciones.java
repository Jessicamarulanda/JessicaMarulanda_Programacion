package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

public class colecciones {
    public static void main (String [] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        int respuesta = 5;
        String modificacion = "";
        ArrayList listaCosas = new ArrayList();
        listaCosas.add(5);
        listaCosas.add("Jessica");
        listaCosas.add(5);
        listaCosas.add(true);
        listaCosas.add(0.9);
        listaCosas.add("Hola");
        listaCosas.add(5);
        listaCosas.add(34567);
        listaCosas.add(5);
        int tamanio = listaCosas.size();
        int posicion = 0;
        System.out.println(tamanio);
        System.out.println(listaCosas);
        System.out.println();
       /* for (int i = 0; i < listaCosas.size(); i ++){
            String palabra = String.valueOf(listaCosas.get(i));
            System.out.println((i+1) + "- " + palabra);
        }

        for ( int i = 0; i< listaCosas.size(); i++){
            if (listaCosas.get(i).equals("Hola")){
                System.out.println("Has encontrado la palabra y es: " +  listaCosas.get(i));
                System.out.println("La posoción de la palabra es " + i);
            }
        }*/
        System.out.println();
       /* do{
        System.out.println("Ingerese la palabra a buscar");
        respuesta = entradaTeclado.next();
            posicion = listaCosas.indexOf(respuesta);
             if (posicion >-1){
                 System.out.println("Palabra encontrada");
                 System.out.println("La posicióin es:  " + posicion);
                 System.out.println("Ingerese la palabra que desea agregar en la posicion encontrada");
                 respuesta = entradaTeclado.next();
                 modificacion = String.valueOf(listaCosas.set(posicion,respuesta));
                 System.out.println("la modificacion se hizo en la posicion  " + posicion + " y se guardo " + respuesta);
             }else{
                 System.out.println("Palabra no encontrada se agregara a la lista");
                 listaCosas.add(respuesta);
             }
             System.out.println(listaCosas);
        }while( posicion == -1);*/
       /*System.out.println("Antes  de modificar el tamanño de El arraylist es: " + listaCosas.size());
        for (int i = 0; i < listaCosas.size(); i++ ) {
            if (listaCosas.get(i) instanceof Integer)
            if(((int)listaCosas.get(i) ) == respuesta) {
               listaCosas.remove(i);
            }
        }
        System.out.println("despues de modificar el tamanño de El arraylist es: " + listaCosas.size());*/

        listaCosas.removeIf(new Predicate() {
            @Override
            public boolean test(Object o) {
                return o.equals(5);
            }
        });
        System.out.println(listaCosas);
    }
}
