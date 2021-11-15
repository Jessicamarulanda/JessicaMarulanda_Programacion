package base;

public class Ejecicio7 {
    public static void main (String [] args ) {
        int [] numerosA = {1,5,8,9,0,4,7,6,3,8};
        for (int i = 0 ; i < numerosA.length; i++){
           // System.out.print( numerosA[i] + " " + "," + "\t" );
            if ((numerosA[i] % 2) == 0) {
                numerosA[i] += 1;
            }else if ((numerosA[i] % 2) != 0){
                numerosA[i] -= 1;
            }
            if (numerosA[i]<= 5){
                numerosA [i] *= 2;
            }
           numerosA[i]= numerosA[i] +(int) (Math.random() *5-5 ) + 1;
            System.out.println(numerosA[i]);

        }
    }
}
