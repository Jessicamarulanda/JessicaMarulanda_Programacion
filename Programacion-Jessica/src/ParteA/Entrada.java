package ParteA;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
   Scanner entradaTeclado = new Scanner(System.in);
   String nombre,dni;
   Juego juego = new Juego();
   boolean encontrada;
   int saldo;
   int cantidadCar;
   int respuesta;
   System.out.println("1)Crear un jugador");
   System.out.println("2)Comprar un Carton");
   System.out.println("3)Iniciar juego");
   System.out.println("4)salir");
   respuesta = entradaTeclado.nextInt();
   switch (respuesta)
   {
       case 1:
            encontrada = false;
            System.out.println("Ingrese el DIN");
            dni = entradaTeclado.next();
            System.out.println("Ingrese el Nombre");
            nombre = entradaTeclado.next();
            System.out.println("Ingrese saldo Inicial");
            saldo = entradaTeclado.nextInt();
            System.out.println("Ingrese la cantidad de cartones");
            cantidadCar = entradaTeclado.nextInt();
           for (Jugador item: juego.getLista()) {
               if(dni.equalsIgnoreCase(item.getDni())){
                   encontrada = true;
                   System.out.println("Persona ya existe en el juego");
                   System.out.println();
                   break;

               }
           }

           if(!encontrada){
               Jugador jugador = new Jugador(dni, nombre, saldo);
               juego.agregarJugador(jugador);
               System.out.println("Persona añadida al Juego");
               System.out.println();
           }
           break;

           case 2:
               encontrada = false;
               System.out.println("Ingrese el dni");
               dni = entradaTeclado.next();
               System.out.println("Ingrese la cantidad de cartones");
               cantidadCar = entradaTeclado.nextInt();
               for (Jugador item: juego.getLista()) {
                   if(dni.equalsIgnoreCase(item.getDni())){
                       encontrada = true;
                       System.out.println("Persona encontrada");
                       System.out.println();
                       for(int i = 0; i < cantidadCar; i++)
                       {
                           Carton carton = new Carton();
                           item.getCartones().add(carton);
                       }
                      break;
                   }
               }
               break;

       case 3:

          
           break;

   }




    }
}
