package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        int respuesta = 0;
        ArrayList<Object[]> lista = new ArrayList<>();
        do {
        System.out.printf(" 1:Añadir Coche %n 2:Lista Coche %n 3:Buscar Coche %n 4:Mostrar Coste %n 5:Eliminar Coche %n 6:Vaciar Garaje");
        respuesta = entradaTeclado.nextInt();
            switch (respuesta) {
                case 1:
                    if(lista.size() <=10) {
                        Object[] coche = new Object[4];
                        System.out.println("Ingrese Marca del coche");
                        coche[0] = entradaTeclado.next();
                        System.out.println("Ingrese Modelo del coche");
                        coche[1] = entradaTeclado.next();
                        System.out.println("Ingrese Coste del coche");
                        coche[2] = entradaTeclado.nextInt();
                        System.out.println("Ingrese la Matricula del coche");
                        coche[3] = entradaTeclado.next();
                        lista.add(coche);
                        System.out.println("Coche registrado");
                    }else{
                        System.out.println("Plazas completas");
                    }
                    break;
                case 2:
                    if (lista.size()>0){
                        for ( Object[] coche : lista ) {
                            System.out.println("Marca: "+coche[0]
                                    +"\tModelo: "+coche[1]
                                    +"\tMatricula: " +coche[2]
                                    +"\tCoste: "+coche[3]);
                        }
                    } else {
                        System.out.println("No hay coches en el garaje");
                    }
                    break;
                case 3:
                    String respuesta2 = null;
                    System.out.println("Ingrese la Matricula del coche a buscar");
                    respuesta2 = entradaTeclado.next();
                    for (Object[] item : lista) {
                        if (item[3] == respuesta2) {
                            System.out.println(item);
                        }
                    }
                    break;
                case 4:
                    int suma = 0;
                    for (int i = 0; i < lista.size(); i++) {
                        Object[] sumacoste = lista.get(i);
                        for (int j = 0; j < sumacoste.length; j++) {
                            if (j == 2) {
                                suma += (int) (sumacoste[j]);
                            }
                        }
                    }
                    System.out.println("La suma de los costes de los coches es: " + suma);
                    break;
                case 5:
                    String respuesta3 = null;
                    System.out.println("Ingrese la Matricula del coche a buscar");
                    respuesta3 = entradaTeclado.next();
                   boolean encontrado = false;
                   for(int i=0; i< lista.size();i++) {
                       if(lista.get(i)[3].toString().equalsIgnoreCase(respuesta3)){
                           encontrado=true;
                           lista.remove(i);
                           System.out.println("Coche borrado");
                           break;
                       }
                   }
                   if(!encontrado){
                       System.out.println("Coche no encontrado");
                   }
                    break;
                case 6:
                    lista.clear();
                    System.out.println("lista vaciada");
                    break;
            }
        }while(respuesta >= 1 && respuesta <= 6);
    }
}
