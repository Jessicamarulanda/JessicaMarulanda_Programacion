package TratamientoPalabras;

public class Bombos {
    public static void main(String[] args) {
        int aleatorio = 0;
        int aleatorio2 = 0;
        String[] bombo1 = {"Barcelona", "PSG", "Bayern", "Manchester City", "Juventus", "RB Leizpzig", "Valencia", "Liverpool"};
        String[] bombo2 = {"Real Madrid", "Tottenham", "Nápoles", "B.Dortmund", "O.Lyon", "Chelsa", "Atalanta", "Atlético de Madrid"};
        int[] equipogenerado = new int[bombo1.length];
        int[] equipogenerado2 = new int[bombo2.length];
            for (int i = 1; i < bombo1.length - 1; i++) {
                aleatorio = (int) (Math.random() * bombo1.length);
                aleatorio2 = (int) (Math.random() * bombo2.length);
                equipogenerado[i] = aleatorio;
                equipogenerado2[i] = aleatorio2;
                do {
                    for (int j = 0; j < equipogenerado.length; j++) {
                        if (aleatorio == equipogenerado[i]) {
                            aleatorio = (int) (Math.random() * bombo1.length);
                        }
                        if (aleatorio2 == equipogenerado2[i]) {
                            aleatorio2 = (int) (Math.random() * bombo2.length);
                        }
                    }
                }while (equipogenerado.length > bombo2.length) ;

                    System.out.println("El" + " " + i + " " + "Partido es entre" + " " + bombo1[aleatorio] + " " + "y" + " " + bombo2[aleatorio2]);


            }
    }
}


