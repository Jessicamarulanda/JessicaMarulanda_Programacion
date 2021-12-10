package Arraylist;

import java.util.ArrayList;

public class Ejercicio3 {
    public static void main(String[] args) {
        ArrayList <String> companeros = new ArrayList();
        int companeroAletorio = 0;
        companeros.add("Jose Alejandro");
        companeros.add("kay");
        companeros.add("Daniel Arquero");
        companeros.add("coca");
        companeros.add("Fernando");
        companeros.add("Andrea");
        companeros.add("Patricia");
        companeros.add("Jorge P");
        companeros.add("Jorge H");
        companeros.add("Nicolas");
        companeros.add("Angel");
        companeros.add("Cristina");
        companeros.add("Daniel Martin");
        companeros.add("Mario");
        companeros.add("Jessica");
        companeros.add("Luismi");
        companeros.add("Sergio");
        companeros.add("Adrian");
        companeros.add("Marcos");
        companeros.add("Alvaro");
         companeroAletorio =  (int) (Math.random() * companeros.size());

         System.out.println(companeros.get(companeroAletorio));

    }
}
