public class Arrays {
    public static void main(String[] args) {
        int[] numero = new int[15];
        int[] numeroDos = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int numeroPares = 0;
        int numeroImpares = 0;
        int longitudArray = numeroDos.length;
        Object[] cosas = {1, "Hola", numero};
        System.out.println(longitudArray);
        System.out.println(numeroDos[9]);
        for (int i = 0; i < longitudArray; i++) {
            System.out.println(numeroDos[i]);
        }
        numeroDos[7] = 88;
        System.out.println("Modificación");
        for (int i = 0; i < longitudArray; i++) {
            System.out.println(numeroDos[i]);
        }

        for (int i = 0; i < numero.length; i++) {
            numero[i] = (int) (Math.random() * 50) + 1;
            System.out.println("El número Aleatorio es : " + numero[i]);
            if ((numero[i] % 2) == 0) {
                numeroPares++;
            } else {
                numeroImpares++;
            }
        }
        System.out.println("La cantidad de números Pares son : " + numeroPares);
        System.out.println("La cantidad de números Impares son : " + numeroImpares);
    }
}
