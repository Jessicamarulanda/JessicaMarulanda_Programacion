package Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
            Scanner entradaTeclado = new Scanner(System.in);
            int respuesta = 0;
            ArrayList<Object[]> listaPersona = new ArrayList<>();
            do {
                System.out.printf(" 1:Agregar persona %n 2:Buscar persona %n 3:Borrar personsa %n 4:Listar persona");
                respuesta = entradaTeclado.nextInt();
                switch (respuesta) {
                    case 1:
                        boolean encontrado = false;
                        Object[] personaA = new Object[4];
                        System.out.println("Ingrese el Nombre");
                        personaA[0] = entradaTeclado.next();
                        System.out.println("Ingrese Apellido");
                        personaA[1] = entradaTeclado.next();
                        System.out.println("Ingrese Telefono");
                        personaA[2] = entradaTeclado.nextInt();
                        System.out.println("Ingrese el DNI");
                        personaA[3] = entradaTeclado.next();
                        for (int i = 0; i < listaPersona.size(); i++) {
                            if (listaPersona.get(i)[3].toString().equalsIgnoreCase((String) personaA[3])) {
                                encontrado = true;
                                System.out.println("La persona ya esta registrada y sus datos son:" +"Nombre: " + listaPersona.get(i)[0]
                                        + "\tApellido: " + listaPersona.get(i)[1]
                                        + "\tTelefono:" + listaPersona.get(i)[2]
                                        + "\tDNI:" + listaPersona.get(i)[3]);

                                break;
                            }
                        }
                        if (!encontrado) {
                            listaPersona.add(personaA);
                            System.out.println("Persona registrada");
                        }
                        break;
                    case 2:
                        String respuesta2 = null;
                        System.out.println("Ingrese el dni de la perina a buscar");
                        respuesta2 = entradaTeclado.next();
                        for (Object[] item : listaPersona) {
                            if (item[3].equals(respuesta2)) {
                                System.out.println("Nombre: " + item[0]
                                        + "\tApellido: " + item[1]
                                        + "\tTelefono:" + item[2]
                                        + "\tDNI:" + item[3]);
                            }
                        }
                        break;
                    case 3:
                        String respuesta3 = null;
                        System.out.println("Ingrese el DNI");
                        respuesta3 = entradaTeclado.next();
                        boolean encontrado1 = false;
                        for (int i = 0; i < listaPersona.size(); i++) {
                            if (listaPersona.get(i)[3].toString().equalsIgnoreCase(respuesta3)) {
                                encontrado1 = true;
                                listaPersona.remove(i);
                                System.out.println("Persona Borrada");
                                break;
                            }
                        }
                        if (!encontrado1) {
                            System.out.println("Persona no encontrada");
                        }
                        break;
                    case 4:
                        if (listaPersona.size() > 0) {
                            for (Object[] persona : listaPersona) {
                                System.out.println("Nombre: " + persona[0]
                                        + "\tAoellido: " + persona[1]
                                        + "\tTelefono:" + persona[2]
                                        + "\tDNI:" + persona[3]);
                            }
                        } else {
                            System.out.println("No hay personas agragadas");
                        }
                        break;
                    default:
                        System.out.println("Opción no valida");
                        break;
                }
            }while(respuesta !=5);
    }
}
