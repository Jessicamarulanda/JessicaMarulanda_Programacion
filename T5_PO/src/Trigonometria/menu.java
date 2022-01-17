package Trigonometria;

import java.util.Scanner;

public class menu {
    public static void main (String [] args){
        Scanner entradaTeclado = new Scanner(System.in);
        int opcion = 0;
        int base= 0;
        int altura = 0;
        double radio = 0;
        System.out.println("1)Trabajar con Triángulos");
        System.out.println("2)Trabajar con Círculos");
        System.out.println("3)Trabajar con Cuadrados");
        opcion = entradaTeclado.nextInt();
        switch (opcion){
            case 1 :
                String respuesta;
                System.out.println("Introcuce la base");
                base = entradaTeclado.nextInt();
                System.out.println("Introcuce la Altura");
                altura = entradaTeclado.nextInt();
                Triangulo triangulo1 = new Triangulo(base,altura);
                    System.out.println("Que operación quieres hacer:");
                    System.out.println("A)Calcular área");
                    System.out.println("B)Mostrar Datos");
                    System.out.println("C)Salir");
                    respuesta = entradaTeclado.next();
                    if (respuesta.equalsIgnoreCase("A")) {
                        triangulo1.calcularArea();
                    } else if (respuesta.equalsIgnoreCase("B")) {
                        triangulo1.mostrasDatos();
                    } else {
                        System.out.println("La opción incada es incorrecta");
                    }
                break;
            case 2:
                char respuesta2;
                System.out.println("Introcuce El radio");
                radio = entradaTeclado.nextDouble();
                Circulo circulo1 = new Circulo(radio);
                    System.out.println("Que operación quieres hacer:");
                    System.out.println("A)Calcular área");
                    System.out.println("B)Calcular Diámetro");
                    System.out.println("C)Mostrar Datos");
                    respuesta2 = entradaTeclado.next().charAt(0);
                    switch (respuesta2) {
                        case 'A':
                            circulo1.calcularArea();
                            break;
                        case 'B':
                            circulo1.calcularDiametro();
                            break;
                        case 'C':
                            circulo1.mostrasDatos();
                            break;
                        default:
                            System.out.println("Opción incorrecta");
                            break;
                    }
                break;
        }

    }
}
