package base;

public class Ejercico2 {
    public static void main(String[] args) {
        int [] numero = new int[30];
        int suma  = 0 ;
        double media = 0;
        int  suma2 = 0 ;
        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random() * 10) + 1;
            suma = suma + numero[i];
        }
        media =  (double)suma /(double) numero.length;
         System.out.printf("La suma de los números es %d %n", suma);
        System.out.printf("La Media de los números es %d %n", media);
        for (int item :numero) {
            suma2 = suma2 + item;
        }
        System.out.printf("la suma de los numeros es %d%n", suma);
    }
}

