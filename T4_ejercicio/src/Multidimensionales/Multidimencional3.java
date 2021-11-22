package Multidimensionales;

public class Multidimencional3 {
    public static void main(String[] args) {
        Object[][] alumnos = new Object[3][5];
        alumnos[0][0] = "Jessica";
        alumnos[0][1] = 6;
        alumnos[0][2] = 12;
        alumnos[0][3] = 7;
        alumnos[0][4] = false;

        alumnos[1][0] = "Pedro";
        alumnos[1][1] = 4;
        alumnos[1][2] = 7;
        alumnos[1][3] = 9;
        alumnos[1][4] = true;

        alumnos[2][0] = "Jose";
        alumnos[2][1] = 7;
        alumnos[2][2] = 1;
        alumnos[2][3] = 2;
        alumnos[2][4] = true;
        for (int i = 0; i < alumnos.length; i++) {
            double media = 0.0;
            boolean convalidadas = false;
            int suspensa = 0;
            int sumanota = 0;
            int nota = 0;
            for (int j = 1; j < alumnos[i].length; j++) {

                if (j == 0) {
                    System.out.println(alumnos[i][j] + "\t");
                } else {
                    if (j > 0 && j < alumnos.length - 1) {
                        System.out.println(alumnos[i][j]);
                        nota = (int) alumnos[i][j];
                        sumanota = sumanota + (int) alumnos[i][j];
                    }
                    if (nota < 5) {
                        suspensa++;
                    }
                    if (j == alumnos.length - 1) {
                        //System.out.println(alumnos[i][j]);
                        convalidadas = (boolean) alumnos[i][j];
                    }
                }
                media = sumanota / alumnos[i].length;
                System.out.println("Tiene una media de \t" + media + "y tiene \t" + suspensa + "suspensas \t" + "y tiene convalidado? \t" + convalidadas);

            }

            System.out.printf("%n");
        }



    }
}
