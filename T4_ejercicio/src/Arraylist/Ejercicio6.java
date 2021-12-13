package Arraylist;

import java.util.ArrayList;

public class Ejercicio6 {
    public static void main(String[] args) {
        Object [] coche1 = new Object[]{"Mercedes","c220", 250, "Murcia", 45.2};
        Object [] coche2 = new Object[]{"Audi","A5", 520};
        Object [] coche3 = new Object[]{"VW","Arteon", 180, "España"};
        ArrayList <Object[]> lista = new ArrayList<>();
        lista.add(coche1);
        lista.add(coche2);
        lista.add(coche3);
        lista.add(new Object[] {"for","Focus", 150});
       /* for(int i = 0; i < lista.size(); i ++){
            Object[] cocheActual = lista.get(i);
          for (int j = 0; j < cocheActual.length; j++){
              System.out.println(cocheActual[j]);
          }
          System.out.println( );

        }*/

        for (Object[] coche:lista) {
            for (Object item: coche) {
                System.out.println(item + "\t");
            }
            System.out.println( );
        }
    }
}
