package Asignatura;

import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        int opcion = 0;
        Alumno alumno = null;
        Profesor profesor = new Profesor();
        do {
            System.out.println("1)Registar Asignatura");
            System.out.println("2)Registar Alumno");
            System.out.println("3)Poner calificacion y  ver media ");
            System.out.println("4)Notas del alumno ");
            opcion = entradaTeclado.nextInt();
            switch (opcion) {
                case 1:
                    int identificador = 0;
                    System.out.println("Ingerese el identifcador de la asigmatura");
                    identificador = entradaTeclado.nextInt();
                    Asignatura asignatura1 = new Asignatura(identificador);
                    System.out.println("Ingerese el identifcador de la asigmatura");
                    identificador = entradaTeclado.nextInt();
                    Asignatura asignatura2 = new Asignatura(identificador);
                    System.out.println("Ingerese el identifcador de la asigmatura");
                    identificador = entradaTeclado.nextInt();
                    Asignatura asignatura3 = new Asignatura(identificador);
                    break;

                case 2:
                    alumno = new Alumno(4,5,6);
                    break;
                case 3:
                    profesor.ponerNotas(alumno);
                    System.out.println("La media del alumno es:" + profesor.calcularNota(alumno));
                    break;

                case 4:
                    profesor.mostrarDatos(alumno);
                   break;
                default:
                    System.out.println("Opción no correcta");
                    break;
            }
        }while(opcion < 5);
    }
}
