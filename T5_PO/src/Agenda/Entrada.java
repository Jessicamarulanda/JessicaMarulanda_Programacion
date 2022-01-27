package Agenda;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner entradaEnteclado = new Scanner(System.in);
        Agenda agenda = new Agenda();
     String  nombre, dni, apellido;
     int telefono;
     int opcion;
     do {
         System.out.println("1) Agregar a Persona a la agenda");
         System.out.println("2) Borrar a Persona con su DNI");
         System.out.println("3) Editar a Persna con su DNI");
         System.out.println("4) Buscar a Persona a la agenda por su DNI");
         System.out.println("5) Listar a personas de la agenda");
         System.out.println("6) Salir");
         opcion = entradaEnteclado.nextInt();
         switch (opcion){
             case 1:
                 System.out.println("Ingrese el nombre");
                 nombre = entradaEnteclado.next();
                 System.out.println("Ingrese su DNI");
                 dni = entradaEnteclado.next();
                 System.out.println("Ingrese su telefono");
                 telefono = entradaEnteclado.nextInt();
                     Persona persona = new Persona(nombre, dni, telefono);
                     agenda.agregarPersona(persona);
                 break;

             case 2 :
                 String respuesta = null;
                 System.out.println("Ingrese su DNI");
                 respuesta = entradaEnteclado.next();
                 agenda.borrarPersona(respuesta);
                 break;
             case 3:
                 respuesta = null;
                 System.out.println("Ingrese su DNI");
                 respuesta = entradaEnteclado.next();
                 System.out.println("Ingrese nombre");
                 nombre = entradaEnteclado.next();
                 System.out.println("Ingrese telefono");
                 telefono = entradaEnteclado.nextInt();
                 agenda.editarP(respuesta,nombre,telefono);
                 break;

             case 4:
                 respuesta = null;
                 System.out.println("Ingrese su DNI");
                 respuesta = entradaEnteclado.next();
                 agenda.buscarP(respuesta);
                 break;
             case 5:
                 agenda.listarPer();
                 break;
         }

     }while(opcion != 6);

    }
}
