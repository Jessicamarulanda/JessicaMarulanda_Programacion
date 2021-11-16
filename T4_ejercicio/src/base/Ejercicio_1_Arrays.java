package base;

public class Ejercicio_1_Arrays {
    public static void main (String [] args) {
        int [] numeroAleatorios = new int [5];
        for (int i = 0 ; i< numeroAleatorios.length; i++){
            numeroAleatorios [i] = (int) Math.floor(Math.random() * (50 - 10 + 1)) + 10;
            System.out.println("El numero Aleatorio es:" + numeroAleatorios[i]);
        }
    }
}
