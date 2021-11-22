package Multidimensionales;

import java.util.Scanner;

public class Multidimencional2 {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);
        int filas;
        int columnas;
        int multidimencional[][];
        int numeroFilas = 0;
        int sumafila1 = 0, sumafilan = 0, sumacolumnas1 = 0, sumacolumnasn = 0;
        System.out.println("Ingrese la cantidad de Filas");
        filas = entradaTeclado.nextInt();
        System.out.println("Ingrese la cantidad de Columnas");
        columnas = entradaTeclado.nextInt();
        multidimencional = new int[filas][columnas];
      for (int i = 0; i < multidimencional.length; i++){
            for (int j = 0 ; j < multidimencional[i].length; j++){
                multidimencional [i][j] = (int)(Math.random() * 20) +1;
                System.out.print(multidimencional[i][j] + "\t");
            }
            System.out.printf("%n");
        }
        System.out.printf("%n");
        for (int i = 0; i < multidimencional.length; i++){
            for (int j = 0 ; j < multidimencional[i].length; j++){
                if (i==0) {
                    sumafila1 = sumafila1 + multidimencional[i][j];
                } if (i == filas - 1) {
                    sumafilan = sumafilan + multidimencional[i][j];
                } if (j == 0){
                    sumacolumnas1 = sumacolumnas1 + multidimencional[i][j];
                }if (j == columnas-1){
                    sumacolumnasn = sumacolumnasn + multidimencional[i][j];
                }
            }
        }

    }
}
