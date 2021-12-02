import java.util.Scanner;

public class Ejercicio1_Examen {
    public static void main (String [] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        int respuesta = 0;
        int columnas = 0;
        int correr = 0;
        int[] tamanoArray = null;

        do {
            System.out.printf("MENU:  %n 1:INICIAR ARRAY %n 2: GUARDAR NUMEROS ALEATORIOS %n " +
                    "3: LISTA MAYORES DE 10 %n 4:ROTAR NÚMEROS A LA IZQUIERDA  %n 5: LISTA TODOS ARRAYS %n Ingerese su opción %n");
            respuesta = entradaTeclado.nextInt();
            switch (respuesta) {
                case 1:
                    System.out.println(" Ingrese la cantidad de columnas de la array");
                    columnas = entradaTeclado.nextInt();
                    if (columnas < 1) {
                        System.out.println("No esta disponible es opción vuelva a intentarlo");
                    }else {
                        tamanoArray = new int[columnas];
                    }
                    break;
                case 2:
                    if (columnas <= 0) {
                        System.out.println("la longitud es cero o negativa por favor vuelva a ingresar");
                    }
                    for (int i = 0; i < tamanoArray.length; i++) {
                        tamanoArray[i] = (int) (Math.random() * 100 + 1);
                        System.out.printf(tamanoArray[i] + "\t" + "%n");
                    }
                    break;
                case 3:
                    if (columnas == 0) {
                        System.out.println("la longitud es cero o negativa por favor vuelva a ingresar");
                    }
                    System.out.printf("los números de la array mayores de 10 son : %n");
                    for (int i = 0; i < tamanoArray.length; i++) {
                        if (tamanoArray[i] >= 10) {
                            System.out.printf(tamanoArray[i] + "%n");
                        }
                    }
                    break;

                case 4:
                    if (columnas == 0) {
                        System.out.println("la longitud es cero o negativa por favor vuelva a ingresar");
                    }
                    correr = tamanoArray[0];
                    for (int i = 0; i < tamanoArray.length-1; i++) {

                     System.out.println(tamanoArray[i+1]);
                     System.out.printf("%n");
                    }
                    tamanoArray[tamanoArray.length-1] = correr ;
                    System.out.print(tamanoArray[tamanoArray.length-1]);
                    break;
                case 5:
                    if (columnas == 0) {
                        System.out.println("la longitud es cero o negativa por favor vuelva a ingresar");
                    }
                    System.out.printf("Lista de todos los elementos de la array %n");
                    for (int i = 0; i < tamanoArray.length; i++) {
                        System.out.print(tamanoArray[i]);
                        System.out.println( );
                    }
                    break;
                default:
                    System.out.println("Opcion no valida vuelve a intertarlo");
                    break;

            }

        }while (respuesta > 0  && respuesta <= 5 );
    }
}
