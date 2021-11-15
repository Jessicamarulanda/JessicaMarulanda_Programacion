package base;

public class Ejecicio6 {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        int modificaciones = 0 ;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 30) + 1;
        }
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 6) {
                numeros[i] = 8;
                modificaciones ++;
            } else if (numeros[i] == 7) {
                numeros[i] = 15;
                modificaciones ++;
            } else if (numeros[i] == 20) {
                numeros[i] = 10;
                modificaciones ++;
            }
        }
        System.out.println("El total de modificaciones es:" + modificaciones);
    }
}
