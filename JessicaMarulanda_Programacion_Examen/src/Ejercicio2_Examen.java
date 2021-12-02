import java.util.Scanner;

public class Ejercicio2_Examen {
    public static void main (String [] args){
        Scanner entratadaTeclado = new Scanner(System.in);
        final double REFRESCO = 1.20;
        final double CAFE = 1;
        final double BOCADILLO = 3.20;
        final double MENU = 9.50;
        int cantidadCafe = 0;
        int cantidadBocadillo = 0;
        int cantidadRefresco = 0;
        int cantidadMenu = 0 ;
        double precioTotal = 0;
        double precioPersona = 0;
        int respuesta = 0;
        do{
        System.out.printf(" %n 1:Pedir cafe %n 2:Pedir refresco %n 3: Pedir bocadillo %n 4: Pedir menú %n 5: sacar cuenta %n Introduce una opción %n");
        respuesta = entratadaTeclado.nextInt();
        switch (respuesta) {
            case 1:
                System.out.printf("Introduce la Cantidad de cafés %n");
                if(respuesta <= 0 ){
                    System.out.println("El valor Ingresado no es valido %n");
                }
                respuesta = entratadaTeclado.nextInt();
                cantidadCafe = cantidadCafe + respuesta;
                break;
            case 2:
                if(respuesta <= 0 ){
                    System.out.println("El valor Ingresado no es valido %n");
                }
                System.out.printf("Introduce la Cantidad de refrescos %n");
                respuesta = entratadaTeclado.nextInt();
                cantidadRefresco = cantidadRefresco + respuesta;
                break;
            case 3:
                if(respuesta <= 0 ){
                    System.out.println("El valor Ingresado no es valido %n");
                }
                System.out.printf("Introduce la Cantidad de Bocadillos %n");
                respuesta = entratadaTeclado.nextInt();
                cantidadBocadillo = cantidadBocadillo + respuesta;
                break;
            case 4:
                if(respuesta <= 0 ){
                    System.out.println("El valor Ingresado no es valido %n");
                }
                System.out.printf("Introduce la Cantidad de menús %n");
                respuesta = entratadaTeclado.nextInt();
                cantidadMenu = cantidadMenu + respuesta;
                break;

            case 5:
                System.out.printf("Introducer el número de comensales %n");
                respuesta = entratadaTeclado.nextInt();
                precioTotal = (double) ((cantidadBocadillo * BOCADILLO)+ (cantidadCafe * CAFE)+ (cantidadMenu * MENU) + (cantidadRefresco * REFRESCO));
                precioPersona =  precioTotal /(double) (respuesta);
                System.out.printf(" %nºBocadillos: %d %n ºRefrescos: %d %n ºMenús: %d %n ºCafés: %d %n ºPreciototal: %2f %n ºPrecio por persona: %2f %n", cantidadBocadillo, cantidadRefresco, cantidadMenu, cantidadCafe, precioTotal, precioPersona);
                break;
        }
        }while(respuesta > 0 && respuesta <= 4);




    }
}
