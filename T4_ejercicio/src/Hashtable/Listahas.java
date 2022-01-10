package Hashtable;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Listahas {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        String respuesta = null;
        int contador = 0;
        String matricula= null;
       Hashtable <String,Object> listaCoche = new Hashtable();
        listaCoche.put("RH5876",new Object[]{"RH5876","201","VW","3000"});
        listaCoche.put("AV56678",new Object[]{"AV56678","A5","Mercedes","5221"});
        listaCoche.put("XH5647",new Object[]{"XH5647","Fiesta","ford","65424"});
         Enumeration<Object> elementos = listaCoche.elements();
         Enumeration<String> listaClaves = listaCoche.keys();
        /* while(listaClaves.hasMoreElements()){
           String clave=listaClaves.nextElement();
           Object[] elemento = (Object[]) listaCoche.get(clave);
           for(int i = 0; i < elemento.length; i++)
               System.out.println(elemento[i]);
               System.out.println();
         }*/

         while (elementos.hasMoreElements()){
             Object[] elemento2 = (Object[]) elementos.nextElement();
             for (Object item:elemento2) {
                 System.out.println(item);
             }
             System.out.println();
         }
    }
}

