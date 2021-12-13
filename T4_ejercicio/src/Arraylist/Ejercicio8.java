package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entradaTeclado =  new Scanner(System.in);
        Object [] coche1 = new Object[]{"Mercedes","c220", 250, "Murcia", 45.2};
        Object [] coche2 = new Object[]{"Audi","A5", 520};
        Object [] coche3 = new Object[]{"VW","Arteon", 180, "España"};
        ArrayList<Object[]> lista = new ArrayList<>();
        String respuesta = null;
        lista.add(coche1);
        lista.add(coche2);
        lista.add(coche3);
        lista.add(new Object[] {"For","Focus", 150});
        lista.add(new Object[] {"For","Focus", 54});
        lista.add(new Object[] {"Mercedes","fiesta", 650});
        lista.add(new Object[] {"Audi","B5", 203});
        lista.add(new Object[] {"VW","C5", 532});

        System.out.println("Ingrese el Marca del coche");
        respuesta = entradaTeclado.next();

        switch (respuesta){
            case "Mercedes":
                for (Object[] coche:lista) {
                    if (coche[0] == "Mercedes"){
                        for(int i= 0 ; i < coche.length; i++)
                        System.out.println(coche[i]);
                    }
                    System.out.println();
                }
                break;
            case "Audi":
                for (Object[] coche:lista) {
                    if (coche[0] == "Audi"){
                        for(int i= 0 ; i < coche.length; i++)
                            System.out.println(coche[i]);
                    }
                    System.out.println();
                }
                break;
            case "For":
                for (Object[] coche:lista) {
                    if (coche[0] == "For"){
                        for(int i= 0 ; i < coche.length; i++)
                            System.out.println(coche[i]);
                    }
                    System.out.println();
                }
                break;
            case "VM":
                for (Object[] coche:lista) {
                    if (coche[0] == "VM"){
                        for(int i= 0 ; i < coche.length; i++)
                            System.out.println(coche[i]);
                    }
                    System.out.println();
                }
                break;
        }


    }
}
