package Arraylist;

import java.util.ArrayList;

public class Ejercicio1 {
    public static void main(String[] args) {
     ArrayList <String> listaPalabras = new ArrayList();
        listaPalabras.add("Buenas");
        listaPalabras.add("Tardes");
        listaPalabras.add("como");
        listaPalabras.add("estas");
        listaPalabras.add("?");
        listaPalabras.add("espero");
        listaPalabras.add("que");
        listaPalabras.add("muy");
        listaPalabras.add("bien");
        listaPalabras.add("gracias.");

        for (String item:listaPalabras) {
            System.out.printf(item + "\t");
        }


    }
}
