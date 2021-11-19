package Multidimensionales;

public class Multidimencional1 {
    public static void main (String [] argas){
        int [][] arraymultidimencionales = new int [3][3];
        arraymultidimencionales[0][0] = 7;
        arraymultidimencionales[1][2] = 6;
        arraymultidimencionales[2][1] = 8;
        for (int i = 0; i< arraymultidimencionales.length; i++){
            for (int j=0; j < arraymultidimencionales[i].length;j++){
                System.out.printf(arraymultidimencionales[i][j] + "\t");
            }
            System.out.printf("%n");
        }
    }
}
