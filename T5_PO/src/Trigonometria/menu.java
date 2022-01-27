package Trigonometria;

import java.util.Scanner;

public class menu {
    public static void main (String [] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        int opcion = 0;
        int base = 0;
        int altura = 0;
        double radio = 0;
        do {
            System.out.println("1)Trabajar con Triángulos");
            System.out.println("2)Trabajar con Círculos");
            System.out.println("3)Trabajar con Cuadrados");
            opcion = entradaTeclado.nextInt();
            switch (opcion) {
                case 1:
                    String respuesta;
                    System.out.println("Introcuce la base");
                    base = entradaTeclado.nextInt();
                    System.out.println("Introcuce la Altura");
                    altura = entradaTeclado.nextInt();
                    Triangulo triangulo1 = new Triangulo(base, altura);
                        System.out.println("Que operación quieres hacer:");
                        System.out.println("A)Calcular área");
                        System.out.println("B)Mostrar Datos");
                        respuesta = entradaTeclado.next();
                        if (respuesta.equalsIgnoreCase("A")) {
                            triangulo1.calcularArea();
                        } else if (respuesta.equalsIgnoreCase("B")) {
                            triangulo1.mostrasDatos();
                        } else {
                            System.out.println("La opción incada es incorrecta");
                        }
                        System.out.println("Pulse enter para continuar");
                        entradaTeclado.nextLine();
                    break;
                case 2:
                    int respuesta2;
                    System.out.println("Introcuce El radio");
                    radio = entradaTeclado.nextDouble();
                    Circulo circulo1 = new Circulo(radio);
                    do {
                        System.out.println("Que operación quieres hacer:");
                        System.out.println("1)Calcular área");
                        System.out.println("2)Calcular Diámetro");
                        System.out.println("3)Mostrar Datos");
                        respuesta2 = entradaTeclado.nextInt();
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
                    } while (respuesta2 > 3);
                    System.out.println("Pulse enter para continuar");
                    entradaTeclado.nextLine();
                    break;

                case 3:
                    int respuesta1;
                    System.out.println("Introcuce la base");
                    base = entradaTeclado.nextInt();
                    System.out.println("Introcuce la Altura");
                    altura = entradaTeclado.nextInt();
                    Cuadrado cuadrado = new Cuadrado(base, altura);
                    do {
                        System.out.println("Que operación desea hacer");
                        System.out.println("Calcurar area");
                        System.out.println("Calcular perimetro");
                        System.out.println("Mostrar datos");
                        respuesta1 = entradaTeclado.nextInt();
                        switch (respuesta1) {
                            case 1:
                                System.out.println("el area del cuadrado es:" + cuadrado.calcularAera());
                                break;
                            case 2:
                                System.out.println("El perímetro del cuadrado es" + cuadrado.perimetroCua());
                                break;
                            case 3:
                                System.out.println("Los datos del cuadrado son");
                                cuadrado.mostrasDatos();
                                break;
                        }
                    } while (respuesta1 > 3);
                    System.out.println("Pulse enter para continuar");
                    entradaTeclado.next();

                    break;

                default:
                    System.out.println("Opción no correcta");
                    break;
            }

        } while (opcion != 4);
    }
}
