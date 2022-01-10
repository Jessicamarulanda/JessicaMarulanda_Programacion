package Hashtable;

import java.util.*;

public class EjercicioPersonas {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        int respuesta = 0;
        Hashtable <String,Object[]> listaPersona = new Hashtable();
        do {
            System.out.printf(" 1:Agregar persona %n 2:Buscar persona %n 3:Borrar personsa %n 4:Listar persona");
            respuesta = entradaTeclado.nextInt();
            switch (respuesta) {
                case 1:
                    Object[] persona = new Object[4];
                    System.out.println("Ingrese el Nombre");
                    persona[0] = entradaTeclado.next();
                    System.out.println("Ingrese Apellido");
                    persona[1] = entradaTeclado.next();
                    System.out.println("Ingrese Telefono");
                    persona[2] = entradaTeclado.nextInt();
                    System.out.println("Ingrese el DNI");
                    persona[3] = entradaTeclado.next();
                    if(listaPersona.containsKey(persona[3])){
                        Object[] datos = listaPersona.get(persona[3]);
                        System.out.println("La persona ya esta registrada y sus datos son:");
                        for (Object item:datos) {
                            System.out.println(item);
                        }
                    }else {
                        listaPersona.put((String) persona[3], persona);
                        System.out.println("Persona agregada con exito");
                    }
                    break;
                case 2:
                    String respuesta2 = null;
                    System.out.println("Ingrese el DNI de la persona  a buscar");
                    respuesta2 = entradaTeclado.next();
                    Object[] datos = listaPersona.get(respuesta2);
                        for (Object item:datos) {
                            System.out.println(item);
                        }

                    break;
                case 3:
                    System.out.println("Ingrese el DNI de la persona  a Eliminar");
                    respuesta2 = entradaTeclado.next();
                    listaPersona.remove(respuesta2);
                    System.out.println("Persona borrada con exito");
                    break;
                case 4:
                    Enumeration<Object[]> elementos = listaPersona.elements();
                    while (elementos.hasMoreElements()){
                        Object[] elemento2 = (Object[]) elementos.nextElement();
                        for (Object item:elemento2) {
                            System.out.println(item);
                        }
                        System.out.println();
                    }
                    break;
            }

        }while(respuesta != 5);
    }
}
