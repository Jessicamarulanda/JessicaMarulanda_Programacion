package Hashtable;

import java.util.Hashtable;
import java.util.Scanner;

public class Listahas {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        String respuesta = null;
       Hashtable <String,Object[]> listaCoche = new Hashtable();
        listaCoche.put("AV56678",new Object[]{"AV56678","A5","Mercedes","5221"});
        listaCoche.put("XH5647",new Object[]{"XH5647","Fiesta","ford","65424"});
        listaCoche.put("RH5876",new Object[]{"RH5876","201","VW","3000"});
        System.out.println("Ingerese la matricula a buscar");
        respuesta = entradaTeclado.next();
        Object [] coche = listaCoche.get(respuesta);
        if(coche != null){
            for (Object item:coche) {
                System.out.println(item + "\t");
            }
        }else{
            System.out.println("No esta en la lista");
        }
    }
}

