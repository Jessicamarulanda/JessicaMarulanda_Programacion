package TratamientoPalabras;

import java.util.Scanner;

public class ArrayPalabras {
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner (System.in);
        int respuesta = 0;
        int acomulador = 0;
        String palabra = "Esta es un ejemplo";
        String palabraLarga = " ";
        String palabraCorta = "gfbkdskrhglehdfgbkjshljñjl";
do {
    System.out.printf("Menú: %n 1:Palabra más Larga %n 2:Palabra más corta %n 3:Palabra con 4 Letras %n Ingrese su respuesta %n");
        respuesta = entradaTeclado.nextInt();
        String[]palabras = palabra.split(" ");
        switch (respuesta){
            case 1:
                for (String item: palabras) {
                    if (item.length() > palabraLarga.length()){
                        palabraLarga = item;
                    }
                }
                System.out.printf("la palabra más larga es:"  +  palabraLarga + "%n");
                break;
                case 2:
                    for (String item: palabras) {
                        if (item.length() < palabraCorta.length()){
                            palabraCorta = item;
                        }
                    }
                    System.out.printf("la palabra más corta es:"  +  palabraCorta + "%n");
                    break;
            case 3:
                for (String item:palabras) {
                    if (item.length() == 4){
                        acomulador ++;
                    }
                }
                System.out.printf("Las palabras que tiene 4 letras son:" + acomulador + "%n");
                break;

        }
}while (respuesta != 0);
    }
}
