package base;

public class Ejercicio7_Arrays {
    public static void main (String [] args){
        int [] numerosA = {1,5,8,9,0,4,7,6,3,8};
        int suma = 0 ;
        int resta =0;
        int multiplicacion = 0 ;
        int variableAletoria = 0;
        int posicion = -1;
        int variableSuma = 0;
        System.out.printf("Los números Asugnados son: %n");
        for (int i = 0 ; i < numerosA.length; i++) {
            System.out.printf(numerosA[i] + "," + " " + "\t");
        }
        for(int i = 0 ; i< numerosA.length; i++){
            posicion ++;
            if ((numerosA[i] % 2) == 0) {
                System.out.printf("%n El numero en la posición" + " " +  posicion + " " + "es par , summar 1 %n");
                System.out.printf( "valor actual:" + numerosA[i] +"%n" );
                suma = numerosA[i] + 1;
                System.out.printf( "valor actualizado:" +suma+"\t" );

                if (suma < 5){
                    System.out.printf("%n El numero en la posición" + " " + posicion + " " +"es menor que 5  , multiplicar por 2 %n");
                    System.out.printf( "valor actual:" + suma +"%n" );
                    multiplicacion = suma * 2;
                    System.out.printf("valor actualizado:"+multiplicacion);
                }
                System.out.printf("%n El numero en la posición" + " " + posicion + " " + "se le asignará un numero aleatorio 5 y -5 %n");
                System.out.printf( "valor actual:" + suma +"%n" );
                variableAletoria= (int) ((Math.random()* (10 + 1))-5);
                System.out.printf( "valor de variable Aleatoria:" + variableAletoria +"%n" );
                variableSuma= suma + variableAletoria;
                System.out.printf("valor actualizado:"+ variableSuma + "\t %n" );
            }else if ((numerosA[i] % 2) != 0){
                System.out.printf("%n El numero en la posición" + " " + posicion + " " + "es impar , restar 1%n");
                System.out.printf( "valor actual:" + numerosA[i] +"%n" );
                resta = numerosA[i] - 1;
               System.out.printf("valor actualizado:"+ resta+ "\t" );
                if (resta < 5){
                    System.out.printf("%n El numero en la posición" + " " + posicion + " " +"es menor que 5  , multiplicar por 2 %n");
                    System.out.printf( "valor actual:" + resta +"%n" );
                    multiplicacion = resta * 2;
                    System.out.printf("valor actualizado:"+multiplicacion);

                }
                System.out.printf("%n El numero en la posición" + " " + posicion + " " + "se le asignará un numero aleatorio 5 y -5 %n");
                System.out.printf( "valor actual:" + resta +"%n" );
                variableAletoria= (int) ((Math.random()* (10 + 1))-5);
                System.out.printf( "valor de variable Aleatoria:" + variableAletoria +"%n" );
                variableSuma= resta + variableAletoria;
                System.out.printf("valor actualizado:"+ variableSuma + "\t %n" );
            }


        }
    }
}
